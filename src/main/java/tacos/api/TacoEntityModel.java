package tacos.api;

import lombok.Getter;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;
import tacos.domain.Taco;

import java.util.Date;

@Relation(value = "taco", collectionRelation = "tacos")
public class TacoEntityModel extends RepresentationModel<TacoEntityModel> {

    private static final IngredientEntityModelAssembler ingredientAssembler
            = new IngredientEntityModelAssembler();

    @Getter
    private final String name;

    @Getter
    private final Date createAt;

    @Getter
    private final CollectionModel<IngredientEntityModel> ingredients;

    public TacoEntityModel(Taco taco) {
        this.name = taco.getName();
        this.createAt = taco.getCreatedAt();
        this.ingredients = ingredientAssembler.toCollectionModel(taco.getIngredients());
    }
}
