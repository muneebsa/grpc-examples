package com.examples.grpc;

import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.examples.grpc.GreeterGrpc;
import com.examples.grpc.HelloReply;
import com.examples.grpc.HelloRequest;

public class GreetingClient {

	static Logger LOGGER = (Logger)LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
	
	public static void main(String[] args) {
		LOGGER.setLevel(Level.INFO);
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051).usePlaintext().build();
		GreeterGrpc.GreeterBlockingStub client = GreeterGrpc.newBlockingStub(channel);

		HelloRequest request = HelloRequest.newBuilder().setName("Muneeb").build();
		System.out.println("Invoking remote procedures via gRPC ...");
		HelloReply reply = client.sayHello(request);
		System.out.println("reply: " + reply.getMessage());
	}
}
