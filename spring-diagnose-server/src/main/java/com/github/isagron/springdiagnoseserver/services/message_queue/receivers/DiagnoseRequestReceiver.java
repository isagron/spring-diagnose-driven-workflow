package com.github.isagron.springdiagnoseserver.services.message_queue.receivers;

import com.innon.ddw.client.messages.message_def.DiagnoseRequestMessage;
import com.innon.ddw.mq.MessageHandler;
import com.innon.ddw.mq.MessageReceiver;
import org.springframework.stereotype.Component;

@Component
public class DiagnoseRequestReceiver implements MessageReceiver<DiagnoseRequestMessage> {
    @Override
    public void receive(DiagnoseRequestMessage message) {

    }

    @Override
    public MessageHandler getHandler() {
        return null;
    }

    @Override
    public void setMessageHandler(MessageHandler messageHandler) {

    }
}
