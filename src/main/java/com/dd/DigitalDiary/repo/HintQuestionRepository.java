package com.dd.DigitalDiary.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.dd.DigitalDiary.entity.HintQuestion;

@Component
public interface HintQuestionRepository extends JpaRepository<HintQuestion, Integer>{

}
