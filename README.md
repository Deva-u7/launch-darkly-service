# LaunchDarklyDemo

The LaunchDarkly demo service using spring boot to showcase the capabilities of the LaunchDarkly feature management platform. It demonstrates integration with the Java SDK and how to utilize feature flags in your code.

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven 3.6 or higher
- LaunchDarkly account

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Deva-u7/launch-darkly-service.git
   cd launch-darkly-service
   ```

2. Configure LaunchDarkly SDK key:
   - Create a `src/main/resources/application.properties` file.
   - Add your LaunchDarkly SDK key:
     ```properties
     launchdarkly.sdk.key=YOUR_SDK_KEY
     ```

## Usage

1. Build the project:
   ```bash
   mvn clean install
   ```

2. Run the application:
   ```bash
   mvn spring-boot:run
   ```

3. Access the application at `http://localhost:8080`.

## Features

- Feature flag management using LaunchDarkly
- Integration with LaunchDarkly Java SDK
- Example feature flags in action
