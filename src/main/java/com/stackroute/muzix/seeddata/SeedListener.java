package com.stackroute.muzix.seeddata;

import com.stackroute.muzix.domain.Track;
import com.stackroute.muzix.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
class SeedData implements ApplicationListener<ContextRefreshedEvent> {
    private TrackRepository trackRepository;

    @Autowired
    public SeedData(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        trackRepository.save(new Track(1, "atadhu", "Good"));
        trackRepository.save(new Track(4, "varsham", "Good"));

    }
}
