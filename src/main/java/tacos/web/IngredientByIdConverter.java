package tacos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import tacos.Ingredient;
import tacos.data.jpa.IngredientRepository;

import java.util.Optional;

@Component
public class IngredientByIdConverter implements Converter<String, Optional<Ingredient>> {

    private final IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Optional<Ingredient> convert(String id) {
        return ingredientRepo.findById(id);
    }

}