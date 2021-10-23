package com.examples.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GreeterServer {
    private static final int port = 50051;
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(port).addService(new GreeterServiceImpl()).build();
        server.start();
        System.out.println("gRPC server started. port: " + port);
        server.awaitTermination();
    }
}
