# grpc-examples

# Java Examples

## How to build and run the examples
Clone this repository and run gRCP server and client projects.
```
git clone https://github.com/muneebsa/grpc-examples.git
WORK_DIR: ~/Dev/grpc
```
It is assumed that you have cloned the repository in your favourite working dir {{WORK-DIR}}.
### Running gRPC Server

#### 1. Import the project into an IDE
Open the below project folder into your favouite IDE.
```
{WORK_DIR}/grpc-examples/java/grpc-greeter-server
```
The below instructions are based on using the IntelliJ IDE. For other IDEs like Eclipse, you may need to adjust the steps/instructions accordingly.

#### 2. Select a compatible JDK
The examples were tested with JDK 1.8. You may try higher version if you like.
![](README/intellij-jdk.png)

#### 3. Compile the gRPC protobuf (proto) file
![](README/intellij-proto-compile.png)

#### 4. Compile the server (java) code
![](README/intellij-java-compile.png)

#### 5. Add generated code to the project
![](README/intellij-modules-grpc-java.png)
![](README/intellij-modules-java.png)

#### 6. Run the server (class)
![](README/intellij-run-server.png)
Once the server run is successfull, you will see the below message in the console.
![](README/intellij-run-server-console.png)

## Running gRPC Client

#### 1. Import the project into an IDE
Open the below project folder into your favouite IDE.
```
{WORK_DIR}/grpc-examples/java/grpc-greeter-client
```
The below instructions are based on using the IntelliJ IDE. For other IDEs like Eclipse, you may need to adjust the steps/instructions accordingly.

#### 2. Setup the project qand compile
Follow the instructions #2 through #5 as outlined in the **Running gRPC Server - Java** section.

#### 3. Run the client (class)
![](README/intellij-run-client.png)
Once the client run is successfull, you will see the below message in the console.
![](README/intellij-run-client-console.png)

