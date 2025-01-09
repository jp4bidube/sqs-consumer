package jp._projects.sqs.consumer;

import io.awspring.cloud.sqs.annotation.SqsListener;
import jp._projects.sqs.consumer.dto.DefaultMesage;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {

    @SqsListener("my-queue")
    public void receiveMessage(DefaultMesage message) {
        System.out.println("Message received: " + message.content());
    }
}
