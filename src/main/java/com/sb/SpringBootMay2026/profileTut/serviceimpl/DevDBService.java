package com.sb.SpringBootMay2026.profileTut.serviceimpl;

import com.sb.SpringBootMay2026.profileTut.service.DBService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev"})
public class DevDBService implements DBService {

    @Override
    public String connect() {
        return "Connected to DEV database (H2/MySQL local)";
    }
}