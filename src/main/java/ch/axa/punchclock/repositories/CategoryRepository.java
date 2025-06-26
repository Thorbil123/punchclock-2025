package ch.axa.punchclock.repositories;

import ch.axa.punchclock.Models.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {}