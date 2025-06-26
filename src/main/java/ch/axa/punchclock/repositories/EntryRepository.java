package ch.axa.punchclock.repositories;

import ch.axa.punchclock.Models.Entry;

import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<Entry, Long> {}