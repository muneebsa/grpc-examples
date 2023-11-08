
import com.examples.grpc.GreeterGrpc
import com.examples.grpc.HelloRequest
import io.grpc.ManagedChannelBuilder

fun main(args: Array<String>) {
    val channel = ManagedChannelBuilder.forAddress("localhost", 50051)
        .usePlaintext()
        .build()

    val stub = GreeterGrpc.newBlockingStub(channel)

    val request = HelloRequest.newBuilder()
        .setName("World")
        .build()

    val response = stub.sayHello(request)
    println("Response: ${response.message}")

    channel.shutdown()
}