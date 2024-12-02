package org.quantum.redis0;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("Good")
public class Good {
    @Id
    private String id;  // Уникальный идентификатор
    private String name; // Название товара
    private int count;   // Количество
}
