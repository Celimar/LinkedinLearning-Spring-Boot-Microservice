package br.net.gradual.explorecali.repository;

import br.net.gradual.explorecali.model.TourRating;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(exported = false)
public interface TourRatingRepository extends PagingAndSortingRepository<TourRating, String> {

    List<TourRating> findByTourId(String tourId);
    Page<TourRating> findByTourId(String tourId, Pageable pageable);

    Optional<TourRating> findByTourIdAndCustomerId(String tourId, Integer customerId);

}
