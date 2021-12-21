package tacos.restclient;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import tacos.domain.Ingredient;

import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IngredientClient {

    RestTemplate rest = new RestTemplate();

    public Ingredient getIngredientById(String ingredientId) {
        Map<String, String> urlVariables = new HashMap<>();
        urlVariables.put("id", ingredientId);
        return rest.getForObject("http://localhost:8080/ingredients/{id}",
                Ingredient.class, urlVariables);
    }

    public ResponseEntity<Ingredient> getIngredientResponseEntityById(String ingredientId) {
        return rest.getForEntity("http://localhost:8080/ingredients/{id}",
                Ingredient.class, ingredientId);
    }

    public List<Ingredient> getAllIngredients() {
        return rest.exchange("http://localhost:8080/ingredients",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<Ingredient>>() {})
                .getBody();
    }

    public void updateIngredient(Ingredient ingredient) {
        rest.put("http://localhost:8080/ingredients/{id}",
                ingredient, ingredient.getId());
    }

    public void deleteIngredient(Ingredient ingredient) {
        rest.delete("http://localhost:8080/ingredients/{id}",
                ingredient.getId());
    }

    public Ingredient createIngredient(Ingredient ingredient) {
        return rest.postForObject("http://localhost:8080/ingredients",
                ingredient, Ingredient.class);
    }

    public URI createIngredientAndReturnLocation(Ingredient ingredient) {
        return rest.postForLocation("http://localhost:8080/ingredients",
                ingredient);
    }

    public ResponseEntity<Ingredient> createIngredientAndReturnResponseEntity(Ingredient ingredient) {
        return rest.postForEntity("http://localhost:8080/ingredients",
                ingredient,
                Ingredient.class);
    }
}
