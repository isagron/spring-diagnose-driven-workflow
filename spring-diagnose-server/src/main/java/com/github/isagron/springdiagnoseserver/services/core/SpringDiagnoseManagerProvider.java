package com.github.isagron.springdiagnoseserver.services.core;

import com.github.isagron.springdiagnoseserver.services.message_queue.receivers.DiagnoseRequestReceiver;
import com.innon.ddw.client.messages.message_def.DiagnoseRequestMessage;
import com.innon.ddw.diagnose.DiagnoseManager;
import com.innon.ddw.diagnose.DiagnoseServiceProvider;
import com.innon.ddw.mq.MessageHandler;
import com.innon.ddw.mq.MqEntryPoint;
import com.innon.ddw.mq.exceptions.MessageValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SpringDiagnoseManagerProvider implements DiagnoseServiceProvider, MessageHandler<DiagnoseRequestMessage> {

    @Autowired
    private DiagnoseManager diagnoseManager;

    @Autowired
    private DiagnoseRequestReceiver diagnoseRequestReceiver;

    @Autowired
    private MqEntryPoint mqEntryPoint;

    @Value("${diagnose.setting.mq_topic.diagnose_report}")
    private String diagnoseReportSubmitTopicName;

    @Override
    public void setup() {
        /*
        ask the message queue provider to create queue(exchange, depend on the implantation) that the diagnose manager
        will submit diagnose reports
         */

        this.mqEntryPoint.register(this.diagnoseReportSubmitTopicName);
        /*
         * set the this provider as the message handler, to handle request to preform diagnose
         */
        this.diagnoseRequestReceiver.setMessageHandler(this);
    }

    @Override
    public void subscribeToDiagnoseRequestForTopic(String queueTopic) {
        /*
        we set our receiver to handle message recevied for diagnose request topic,
        the MqEntryPoint provide the interface for the message queueing allow abstraction on the
        implementation defined (RabbitMq, kafka, ArrayBlockingQueue)
         */
        this.mqEntryPoint.subscribe(queueTopic, diagnoseRequestReceiver);
    }

    @Override
    public String getDistributionReportTopicName() {
        return this.diagnoseReportSubmitTopicName;
    }

    @Override
    public DiagnoseManager getDiagnoseManager() {
        return this.diagnoseManager;
    }

    @Override
    public void handleMessage(DiagnoseRequestMessage message) {
        //create new Diagnose Record and save the message information

        //preform diagnose according to the request, using the DiagnoseManager

        //save the information of the Diagnose Report

        //send the DiagnoseReport to all subscribers
    }

    @Override
    public void validate(DiagnoseRequestMessage message) throws MessageValidationException {

    }
}
