package com.sb.SpringBootMay2026.exceptionhandlingTut.controller;


import com.sb.SpringBootMay2026.exceptionhandlingTut.model.Worker;
import com.sb.SpringBootMay2026.exceptionhandlingTut.service.WorkerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private final WorkerService workerService;

    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping("/get")
    public Worker getWorker(@RequestParam("id") int id) {
        return workerService.getThatWorker(id);
    }

}