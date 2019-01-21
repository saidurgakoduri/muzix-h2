package com.stackroute.muzix.seeddata;

import com.stackroute.muzix.domain.Track;
import com.stackroute.muzix.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeedRunner implements CommandLineRunner
{
    private TrackRepository trackRepository;
    @Autowired
   public SeedRunner(TrackRepository trackRepository)
{
    this.trackRepository = trackRepository;
}
 @Override
        public void run(String... args) throws Exception {
        Track track1=Track.builder().id(1).name("vaana").comment("superb").build();
            trackRepository.save(track1);
              Track track2=track1.builder().id(2).name("sakhi").comment("awesome").build();
          trackRepository.save(track2);

}
}
