package com.example.AmruthasFood;

import com.example.AmruthasFood.model.Product;
import com.example.AmruthasFood.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner load(ProductRepository repo) {
        return args -> {

            // ✅ prevent duplicates
            if(repo.count() > 0) return;

            repo.save(new Product("Ariselu", 250));
            repo.save(new Product("Boondi Laddu", 250));
            repo.save(new Product("Nuvvula Laddu", 300));
            repo.save(new Product("Ragi Laddu", 300));
            repo.save(new Product("Jonna Laddu", 300));
            repo.save(new Product("Palli Laddu", 300));
            repo.save(new Product("Besan Laddu", 300));
            repo.save(new Product("Dry Fruit Laddu", 550));
            repo.save(new Product("Millet Laddu", 300));
            repo.save(new Product("Nuvvula Ariselu", 300));
            repo.save(new Product("Minapa Sunnundalu", 300));
            repo.save(new Product("Biyyam Sunnundalu", 300));
            repo.save(new Product("Pesara Sunnundalu", 300));
            repo.save(new Product("Kajjikayalu", 250));
            repo.save(new Product("Bellam Gavvalu", 250));
            repo.save(new Product("Ragi Jantikalu", 300));
            repo.save(new Product("Jonna Jantikalu", 250));
            repo.save(new Product("Millets Murukulu", 250));
            repo.save(new Product("Karam Gavvalu", 250));

        };
    }
}