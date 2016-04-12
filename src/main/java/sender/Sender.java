package sender;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import tikitag.SimpleTikitagClient;

public class Sender {
    MqttClient client;

    public static void main(String[] args) {
        new Sender().doDemo();
    }

    public void doDemo() {
        try {
        	client = new MqttClient("tcp://212.72.74.21:1883", "Sending1");
        	client.connect();
           	//MqttMessage message = new MqttMessage();
            //message.setPayload("A single message from my computer fff".getBytes());
            //client.publish("NomFileAttente", message);
        	
        	MqttMessage message = new MqttMessage();
            message.setPayload("hello Mon gars !\n".getBytes());
        	client.publish("NomFileAttente", message);
        	
    		//SimpleTikitagClient tiki = new SimpleTikitagClient();
    		//tiki.start(client);
    		
        	
            
            /*client.disconnect();
            client.close();*/
        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

}








