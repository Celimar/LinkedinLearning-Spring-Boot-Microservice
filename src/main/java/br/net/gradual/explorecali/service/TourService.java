package br.net.gradual.explorecali.service;

import br.net.gradual.explorecali.model.Difficulty;
import br.net.gradual.explorecali.model.Region;
import br.net.gradual.explorecali.model.Tour;
import br.net.gradual.explorecali.model.TourPackage;
import br.net.gradual.explorecali.repository.TourPackageRepository;
import br.net.gradual.explorecali.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourService {

    @Autowired
    private TourRepository tourRepository;

    @Autowired
    private TourPackageRepository tourPackageRepository;

    public Tour createTour(String title, String description, String blurb,
                           Integer price, String duration, String bullets,
                           String keywords, String tourPackageName,
                           Difficulty difficulty, Region region) {

        TourPackage tourPackage = tourPackageRepository.findByName(tourPackageName)
                .orElseThrow(() ->new RuntimeException("Tour package does not exists!"));

        return tourRepository.save(new Tour(title, description, blurb,
                price, duration, bullets, keywords, tourPackage,
                difficulty, region));
    }

    public long total() {
        return tourRepository.count();
    }
}
