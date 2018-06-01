package io.refugeescode.hackboard.controller;


import io.refugeescode.hackboard.domain.Tag;
import io.refugeescode.hackboard.repository.TagsRepository;
import io.refugeescode.hackboard.service.dto.TagDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TagController {

    private TagsRepository tagsRepository;

    public TagController(TagsRepository tagsRepository) {
        this.tagsRepository = tagsRepository;
    }

    public ResponseEntity<Boolean> addTag(@RequestBody TagDto tag) {
        Tag entity = new Tag();
        entity.setTag(tag.getTag());

        tagsRepository.save(entity);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    public ResponseEntity<TagDto> viewTag(@PathVariable("tagId") Long tagId) {
        return new ResponseEntity<TagDto>(
            (MultiValueMap<String, String>) tagsRepository.findOne(tagId),
            HttpStatus.OK
        );
    }

    public ResponseEntity<Boolean> deleteTag(@PathVariable("tagId") Long tagId) {
        tagsRepository.delete(tagId);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    public ResponseEntity<List<TagDto>> showAllTags() {

        return new ResponseEntity<List<TagDto>>(
            (MultiValueMap<String, String>) tagsRepository.findAll().stream().collect(Collectors.toList()),

            HttpStatus.OK
        );

    }
}
