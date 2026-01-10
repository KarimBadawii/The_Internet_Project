# The Internet Project

This project is a test automation framework for [The Internet](https://the-internet.herokuapp.com/), a practice website for sharpening automated testing skills.

## Technologies Used

*   **Java**: Programming language.
*   **Selenium WebDriver**: Browser automation tool.
*   **TestNG**: Testing framework.
*   **Maven**: Build automation and dependency management tool.

## Project Structure

*   `src/main/java/Pages`: Contains Page Object Model (POM) classes representing web pages.
*   `src/test/java`: Contains test classes organized by functionality (e.g., login, alerts, dynamic loading).
*   `src/test/java/base`: Contains the `BaseTests` class for setup and teardown procedures.

## How to Run Tests

1.  Ensure you have Java and Maven installed.
2.  Clone the repository.
3.  Open the project in your IDE (IntelliJ IDEA or Android Studio).
4.  Run the tests using the IDE's test runner or via Maven command line:
    ```bash
    mvn test
    ```

## Key Features Tested

*   Form Authentication
*   Hovers
*   Key Presses
*   JavaScript Alerts
*   File Upload
*   Entry Ad
*   Dynamic Loading
*   And more...
