package com.sb.SpringBootMay2026.exceptionhandlingTut.service;


import com.sb.SpringBootMay2026.exceptionhandlingTut.exception.WorkerNotFoundException;
import com.sb.SpringBootMay2026.exceptionhandlingTut.model.Worker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkerService {


    List<Worker> workers = new ArrayList<>();


    public WorkerService() {
        Worker worker1 = new Worker(1, "sai");
        Worker worker2 = new Worker(2, "isha");
        Worker worker3 = new Worker(3, "prashu");
        Worker worker4 = new Worker(4, "srikanth");
        Worker worker5 = new Worker(5, "renuka");

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        workers.add(worker5);
    }

    public Worker getThatWorker(int id) {
        return workers.stream().filter(worker -> worker.getId() == id).findFirst().orElseThrow(() -> new WorkerNotFoundException("Worker with id " + id + " not found"));
    }


}