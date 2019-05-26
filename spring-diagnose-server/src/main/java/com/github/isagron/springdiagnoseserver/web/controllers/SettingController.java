package com.github.isagron.springdiagnoseserver.web.controllers;

import com.github.isagron.web.dtos.AddMatchInfoReq;
import com.github.isagron.web.dtos.ConfigMatchInfoReq;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("diagnose/settings")
public class SettingController {


    public void setupSubscriptionToDiagnoseRequest(String topicName){

    }

    public String getReportsTopic(){
        return null;
    }

    public void addMatchInfo(AddMatchInfoReq addMatchInfoReq) {

    }

    public void setMatchInfo(ConfigMatchInfoReq configMatchInfoReq) {

    }

}
