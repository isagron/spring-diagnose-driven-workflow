package com.github.isagron.springdiagnoseserver.web.controllers;


import com.github.isagron.web.dtos.DiagnoseDecisionResponse;
import com.github.isagron.web.dtos.DiagnoserIdsListResponse;
import com.github.isagron.web.dtos.JudageDiagnoseRecordResultReq;
import com.github.isagron.web.dtos.JudgeInfoForDiagnose;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("diagnsoe/diagnostic")
public class DiagnoseController{

    public DiagnoserIdsListResponse availableDiagnosersForDomain(String diagnoseDomain){
        return null;
    }


    public JudgeInfoForDiagnose isHasAJudge(String diagnoseServiceId) {
        return null;
    }

    public DiagnoseDecisionResponse judge(@Validated JudageDiagnoseRecordResultReq recordResultReq) {
        return null;
    }


}
