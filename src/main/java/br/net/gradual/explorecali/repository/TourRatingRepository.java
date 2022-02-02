package br.net.gradual.explorecali.repository;

import br.net.gradual.explorecali.model.TourRating;
import br.net.gradual.explorecali.model.TourRatingPk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(exported = false)
public interface TourRatingRepository extends PagingAndSortingRepository<TourRating, TourRatingPk> {

    List<TourRating> findByPkTourId(Integer tourId);
    Page<TourRating> findByPkTourId(Integer tourId, Pageable pageable);

    Optional<TourRating> findByPkTourIdAndPkCustomerId(Integer tourId, Integer customerId);

}
