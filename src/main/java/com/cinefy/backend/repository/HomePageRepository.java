package com.cinefy.backend.repository;

import com.cinefy.backend.model.HomePageDomain;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class HomePageRepository implements JpaRepository<HomePageDomain, Integer> {

    @Override
    public <S extends HomePageDomain> S save(S entity) {
        return null;
    }

    @Override
    public Optional<HomePageDomain> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<HomePageDomain> findAll() {
        return null;
    }

    @Override
    public List<HomePageDomain> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<HomePageDomain> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public <S extends HomePageDomain> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(HomePageDomain entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends HomePageDomain> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends HomePageDomain> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends HomePageDomain> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<HomePageDomain> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public HomePageDomain getOne(Integer integer) {
        return null;
    }

    @Override
    public HomePageDomain getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends HomePageDomain> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends HomePageDomain> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<HomePageDomain> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends HomePageDomain> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends HomePageDomain> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends HomePageDomain> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends HomePageDomain> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends HomePageDomain, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
