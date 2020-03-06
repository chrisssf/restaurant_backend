package com.codeclan.example.restaurantBooking.repositories;

import com.codeclan.example.restaurantBooking.models.EatingPlatform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EatingPlatformRepository extends JpaRepository<EatingPlatform, Long> {
}
