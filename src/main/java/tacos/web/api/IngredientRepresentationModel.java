package tacos.web.api;

import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;
import tacos.Ingredient;

@Relation(value = "ingredient", collectionRelation = "ingredients")
public class IngredientRepresentationModel extends RepresentationModel<IngredientRepresentationModel> {

    @Getter
    private String name;

    @Getter
    private Ingredient.Type type;

    public IngredientRepresentationModel(Ingredient ingredient) {
        this.name = ingredient.getName();
        this.type = ingredient.getType();
    }
}
