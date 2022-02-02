package br.net.gradual.explorecali.service;

import br.net.gradual.explorecali.model.Tour;
import br.net.gradual.explorecali.model.TourPackage;
import br.net.gradual.explorecali.repository.TourPackageRepository;
import br.net.gradual.explorecali.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourPackageService {

    @Autowired
    private TourPackageRepository repository;

    public TourPackage createTourPackage(String code, String name) {
        return repository.findById(code)
                .orElse(repository.save(new TourPackage(code, name)));
    }

    public Iterable<TourPackage> lookup() {
        return repository.findAll();
    }

    public Long total() {
        return repository.count();
    }

}
