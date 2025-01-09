# Spring Boot Application with Spring Cloud AWS and LocalStack

This repository contains a Spring Boot application integrated with **Spring Cloud AWS** and **LocalStack**. The application demonstrates how to use AWS services locally, simulating an environment for development and testing without requiring access to the actual AWS cloud.

## Prerequisites

Before starting the project, ensure you have the following installed:

1. **Java 17** or higher
2. **Maven**
3. **Docker** (required to run LocalStack)
4. **LocalStack** (a fully functional local AWS cloud emulator)

### LocalStack Installation

You can install LocalStack using Docker:

```bash
docker run --rm -it -p 4566:4566 -p 4510-4559:4510-4559 localstack/localstack
```

For more installation options, visit the [LocalStack documentation](https://docs.localstack.cloud/).

## Setting Up the Environment

1. Start LocalStack.
2. Create the required SQS queue:

   ```bash
   aws --endpoint-url=http://localhost:4566 sqs create-queue --queue-name my-queue
   ```

3. Verify that the queue has been created:

   ```bash
   aws --endpoint-url=http://localhost:4566 sqs list-queues
   ```

## Running the Application

1. Clone this repository:

   ```bash
   git clone <repository-url>
   cd <repository-folder>
   ```

2. Build the application:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   java -jar target/<your-app-name>.jar
   ```

   Replace `<your-app-name>` with the actual name of the generated JAR file.

4. The application will be available at `http://localhost:8080`.

## Example Screenshot

Below is an example screenshot showing the application setup with LocalStack:

![Example Screenshot](https://via.placeholder.com/800x400.png?text=Example+LocalStack+Setup)

## SQS Message Flow Example

Here is an example of sending and receiving a message in the SQS queue:

![SQS Message Flow](https://via.placeholder.com/800x400.png?text=SQS+Message+Flow+Example)

1. A message is sent to the SQS queue.
2. The application retrieves the message from the queue.
3. The message is processed and logged by the application.

This visualization demonstrates the local flow of messages using LocalStack.

## Notes

- Update the `application.properties` file with the necessary configurations for LocalStack and AWS service endpoints.
- Ensure LocalStack is running before starting the application.

## Contributing

Feel free to fork the repository and submit pull requests. Contributions are always welcome!

## License

This project is licensed under the [MIT License](LICENSE).
