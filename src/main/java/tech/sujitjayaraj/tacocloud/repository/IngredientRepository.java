package tech.sujitjayaraj.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import tech.sujitjayaraj.tacocloud.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
