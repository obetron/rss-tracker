package com.gelecex.upwork.rsstracker.controller;

import com.gelecex.upwork.rsstracker.model.RssTracker;
import com.gelecex.upwork.rsstracker.repository.RssTrackerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author obetron
 * @date 28.10.2023 - 15:34
 */
@RestController
@RequestMapping("/rsstracker")
public class RssTrackerController {

    private final RssTrackerRepository repository;

    public RssTrackerController(RssTrackerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<RssTracker> findAll() {
        return null;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("{id}")
    public void update(@RequestBody RssTracker rssTracker, @PathVariable String id) {

    }

}
