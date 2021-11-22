package tacos.web.api;

import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import tacos.Taco;

public class TacoRepresentationModelAssembler
        extends RepresentationModelAssemblerSupport<Taco, TacoRepresentationModel> {

    public TacoRepresentationModelAssembler() {
        super(DesignTacoRestController.class, TacoRepresentationModel.class);
    }

    @Override
    protected TacoRepresentationModel instantiateModel(Taco taco) {
        return new TacoRepresentationModel(taco);
    }

    @Override
    public TacoRepresentationModel toModel(Taco taco) {
        return createModelWithId(taco.getId(), taco);
    }
}
