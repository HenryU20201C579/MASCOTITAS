package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mascota;
import com.example.demo.repository.MascotaRepository;

@Service
public class MascotaService implements MascotaRepository{
    
    @Autowired
    private MascotaRepository mascotaRepository;

    public void agregarMascota(Mascota nuevaMascota) {


        mascotaRepository.save(nuevaMascota);
        //listaDeMascotas.add(nuevaMascota);
    }

    @Override
    public void flush() {
        
        throw new UnsupportedOperationException("Unimplemented method 'flush'");
    }

    @Override
    public <S extends Mascota> S saveAndFlush(S entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAndFlush'");
    }

    @Override
    public <S extends Mascota> List<S> saveAllAndFlush(Iterable<S> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAllAndFlush'");
    }

    @Override
    public void deleteAllInBatch(Iterable<Mascota> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> ids) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllByIdInBatch'");
    }

    @Override
    public void deleteAllInBatch() {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllInBatch'");
    }

    @Override
    public Mascota getOne(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getOne'");
    }

    @Override
    public Mascota getById(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Mascota getReferenceById(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getReferenceById'");
    }

    @Override
    public <S extends Mascota> List<S> findAll(Example<S> example) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Mascota> List<S> findAll(Example<S> example, Sort sort) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Mascota> List<S> saveAll(Iterable<S> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'saveAll'");
    }

    @Override
    public List<Mascota> findAll() {
        
        return mascotaRepository.findAll();
    }

    @Override
    public List<Mascota> findAllById(Iterable<Long> ids) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAllById'");
    }

    @Override
    public <S extends Mascota> S save(S entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Mascota> findById(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public boolean existsById(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'existsById'");
    }

    @Override
    public long count() {
        
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public void deleteById(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public void delete(Mascota entity) {
        
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAllById'");
    }

    @Override
    public void deleteAll(Iterable<? extends Mascota> entities) {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public void deleteAll() {
        
        throw new UnsupportedOperationException("Unimplemented method 'deleteAll'");
    }

    @Override
    public List<Mascota> findAll(Sort sort) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Page<Mascota> findAll(Pageable pageable) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Mascota> Optional<S> findOne(Example<S> example) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findOne'");
    }

    @Override
    public <S extends Mascota> Page<S> findAll(Example<S> example, Pageable pageable) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public <S extends Mascota> long count(Example<S> example) {
        
        throw new UnsupportedOperationException("Unimplemented method 'count'");
    }

    @Override
    public <S extends Mascota> boolean exists(Example<S> example) {
        
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public <S extends Mascota, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
        
        throw new UnsupportedOperationException("Unimplemented method 'findBy'");
    }

    
    
}
