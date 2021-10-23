using Grpc.Core;
using Helloworld;
using System;

namespace GreeterClient
{
    class Program
    {
        static void Main(string[] args)
        {
            var channel = new Channel("127.0.0.1:50051", ChannelCredentials.Insecure);
            var client = new Greeter.GreeterClient(channel);
            var request = new HelloRequest { Name = "Muneeb" };
            var reply = client.SayHello(request);

            Console.WriteLine("Greeting: " + reply.Message);

            channel.ShutdownAsync().Wait();
            Console.WriteLine("Press any key to exit ...");
            Console.ReadKey();
        }
    }
}
