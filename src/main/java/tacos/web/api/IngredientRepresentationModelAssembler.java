package tacos.web.api;

import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import tacos.Ingredient;

public class IngredientRepresentationModelAssembler
        extends RepresentationModelAssemblerSupport<Ingredient, IngredientRepresentationModel> {

    public IngredientRepresentationModelAssembler() {
        super(IngredientRestController.class, IngredientRepresentationModel.class);
    }

    @Override
    protected IngredientRepresentationModel instantiateModel(Ingredient ingredient) {
        return new IngredientRepresentationModel(ingredient);
    }

    @Override
    public IngredientRepresentationModel toModel(Ingredient ingredient) {
        return createModelWithId(ingredient.getId(), ingredient);
    }
}
