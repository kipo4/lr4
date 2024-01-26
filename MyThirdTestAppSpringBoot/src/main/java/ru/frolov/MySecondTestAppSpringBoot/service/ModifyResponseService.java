package ru.frolov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.frolov.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
