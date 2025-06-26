package ch.axa.punchclock.repositories;

import ch.axa.punchclock.Models.Tag;

import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {}