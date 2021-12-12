package com.github.amintas96.countries.repositories;

import com.github.amintas96.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
