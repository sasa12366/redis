package org.quantum.redis0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GoodService {
    private final GoodRepository goodRepository;

    public Good saveGood(Good good) {
        return goodRepository.save(good);
    }

    public Optional<Good> getGoodById(String id) {
        return goodRepository.findById(id);
    }

    public Iterable<Good> getAllGoods() {
        return goodRepository.findAll();
    }

    public void deleteGood(String id) {
        goodRepository.deleteById(id);
    }
}
