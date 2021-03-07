package com.gmgn.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmgn.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
