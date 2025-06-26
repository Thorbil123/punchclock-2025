package ch.axa.punchclock.controllers;

import ch.axa.punchclock.Models.Tag;
import ch.axa.punchclock.repositories.TagRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tags")
public class APITagController {

    @Autowired
    private TagRepository tagRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tag create(@RequestBody @Valid Tag tag) {
        return tagRepository.save(tag);
    }

    @GetMapping
    public Iterable<Tag> list() {
        return tagRepository.findAll();
    }

    @GetMapping("/{id}")
    public Tag getById(@PathVariable Long id) {
        return tagRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Tag update(@PathVariable Long id, @RequestBody @Valid Tag tag) {
        tag.setId(id);
        return tagRepository.save(tag);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        tagRepository.deleteById(id);
    }
}
