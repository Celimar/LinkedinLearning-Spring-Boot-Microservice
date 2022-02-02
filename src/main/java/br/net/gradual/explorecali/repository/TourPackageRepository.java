package br.net.gradual.explorecali.repository;

import br.net.gradual.explorecali.model.TourPackage;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "packages", path = "packages")
public interface TourPackageRepository extends PagingAndSortingRepository<TourPackage, String> {
    @Override
    @RestResource(exported = false)
    <S extends TourPackage> S save(S entity);

    @Override
    @RestResource(exported = false)
    <S extends TourPackage> Iterable<S> saveAll(Iterable<S> entities);

    @Override
    @RestResource(exported = false)
    void deleteById(String s);

    @Override
    @RestResource(exported = false)
    void delete(TourPackage entity);

    @Override
    @RestResource(exported = false)
    void deleteAllById(Iterable<? extends String> strings);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends TourPackage> entities);

    @Override
    @RestResource(exported = false)
    void deleteAll();

    Optional<TourPackage> findByName(String name);
}
