package com.github.isagron.springdiagnoseserver.clients;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.innon.ddw.client.management.DdwManagementApi;
import com.innon.ddw.client.management.elements.DdwExecutionRequestRecordDto;
import com.innon.ddw.client.management.elements.MatchableItemDto;
import com.innon.ddw.client.management.elements.WorkflowConfigurationDto;
import com.innon.ddw_common.matcher.Matchable;
import com.innon.ddw_common.matcher.impl.MatchPair;
import org.springframework.stereotype.Service;

@Service
public class DdwManagementClient implements DdwManagementApi {
    @Override
    public MatchableItemDto findMatch(Map<String, String> matchInfo, List<Matchable> candidates) {
        return null;
    }

    @Override
    public Object getObj(String objGetterIdentifier, Object objectGetterInfo) {
        return null;
    }

    @Override
    public MatchPair connectDiagnoseToOperationService(Matchable item1, Matchable item2) {
        return null;
    }

    @Override
    public String exec(Collection<String> diagnoseTopics, String objGetterIdentifier, Object objectGetterInfo, HashMap<String, Object> additionalInfo, WorkflowConfigurationDto configurationProperties) {
        return null;
    }

    @Override
    public DdwExecutionRequestRecordDto getRequestExecutionRecord(String requestId) {
        return null;
    }

    @Override
    public void shutdown() {

    }

    @Override
    public String getWorkflowStageTopic(String requestId) {
        return null;
    }
}
