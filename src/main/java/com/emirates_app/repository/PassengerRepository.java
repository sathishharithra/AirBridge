package com.emirates_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emirates_app.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
