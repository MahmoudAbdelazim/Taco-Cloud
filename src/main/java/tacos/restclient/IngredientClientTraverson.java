package tacos.restclient;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.client.Traverson;
import org.springframework.web.client.RestTemplate;
import tacos.domain.Ingredient;
import tacos.domain.Taco;

import java.net.URI;

public class IngredientClientTraverson {
    Traverson traverson = new Traverson(
            URI.create("http://localhost:8080/api"), MediaTypes.HAL_JSON);

    public Iterable<Ingredient> getAllIngredients() {
        ParameterizedTypeReference<CollectionModel<Ingredient>> ingredientType =
                new ParameterizedTypeReference<CollectionModel<Ingredient>>() {};

        CollectionModel<Ingredient> ingredientRes =
                traverson
                        .follow("ingredients")
                        .toObject(ingredientType);

        return ingredientRes.getContent();
    }

    public Ingredient addIngredient(Ingredient ingredient) {
        String ingredientsUrl = traverson
                .follow("ingredients")
                .asLink()
                .getHref();

        RestTemplate rest = new RestTemplate();
        return rest.postForObject(ingredientsUrl,
                ingredient,
                Ingredient.class);
    }

    public Iterable<Taco> getRecentTacosWithTraverson() {
        ParameterizedTypeReference<CollectionModel<Taco>> tacoType =
                new ParameterizedTypeReference<CollectionModel<Taco>>() {};

        CollectionModel<Taco> tacoRes =
                traverson
                        .follow("tacos")
                        .follow("recents")
                        .toObject(tacoType);

        return tacoRes.getContent();
    }
}
