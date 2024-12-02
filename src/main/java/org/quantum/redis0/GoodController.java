package org.quantum.redis0;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/goods")
@RequiredArgsConstructor
public class GoodController {
    private final GoodService goodService;

    @PostMapping
    public ResponseEntity<Good> createGood(@RequestBody Good good) {
        return ResponseEntity.ok(goodService.saveGood(good));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Good> getGood(@PathVariable String id) {
        Optional<Good> good = goodService.getGoodById(id);
        return good.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<Iterable<Good>> getAllGoods() {
        return ResponseEntity.ok(goodService.getAllGoods());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGood(@PathVariable String id) {
        goodService.deleteGood(id);
        return ResponseEntity.noContent().build();
    }
}
