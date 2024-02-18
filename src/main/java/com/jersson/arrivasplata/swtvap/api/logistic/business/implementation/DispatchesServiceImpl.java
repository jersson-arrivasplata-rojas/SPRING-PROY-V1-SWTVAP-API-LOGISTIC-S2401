package com.jersson.arrivasplata.swtvap.api.logistic.business.implementation;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jersson.arrivasplata.swtvap.api.logistic.business.service.DispatchesService;
import com.jersson.arrivasplata.swtvap.api.logistic.exception.CustomException;
import com.jersson.arrivasplata.swtvap.api.logistic.model.Dispatches;
import com.jersson.arrivasplata.swtvap.api.logistic.repository.DispatchesRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DispatchesServiceImpl implements DispatchesService {
    private final DispatchesRepository dispatchesRepository;

    public DispatchesServiceImpl(DispatchesRepository dispatchesRepository) {
        this.dispatchesRepository = dispatchesRepository;
    }

    public Flux<Dispatches> getAllDispatches() {
        return Flux.fromIterable(dispatchesRepository.findAll());
    }

    public Mono<Dispatches> getDispatchesById(Long id) {
        return Mono.just(dispatchesRepository.findById(id)
                .orElseThrow(() -> new CustomException("Dispatches not found with id: " + id)));
    }

    public Mono<Dispatches> createDispatches(Dispatches dispatches) {
        if (dispatches.getOrderId() == null) {
            throw new CustomException("Order id is required.");
        }
        return Mono.just(dispatchesRepository.save(dispatches));
    }

    public Mono<Dispatches> updateDispatches(Dispatches dispatches) {
        if (dispatches.getOrderId() == null) {
            throw new CustomException("Order id is required.");
        }
        return Mono.just(dispatchesRepository.save(dispatches));
    }

    public Mono<Void> deleteDispatchesById(Long id) {
        Optional<Dispatches> dispatches = dispatchesRepository.findById(id);
        if (!dispatches.isPresent()) {
            throw new CustomException("Dispatches not found with id: " + id);
        }
        // Resto de la lógica para eliminar un catalogo
        dispatchesRepository.deleteById(id);
        return Mono.empty();
    }


}
