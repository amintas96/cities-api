package com.github.amintas96.staties.repositories;

import com.github.amintas96.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
