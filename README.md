## Java - Different Design Patterns for Automation
### Single Responsibility Principle
Not a design pattern but best practice of splitting pages into components for achieving

- High Cohesion
- Low Coupling
- Easy Maintenance and Readability
- Reusability


### Factory Pattern
Creation pattern where the Factory class provides the object based on User input

Examples:
- Multiple browsers support
- Application supports multiple languages (Localization)

### Strategy Pattern
Applicable where the application executes business rules differently based on the user selection.
Same test to behave differently based on user selection.

Examples:
- Different payment options
- Different search methods

### Command pattern
Encapsulate a request/command to be executed as an Object, pass it to Invoker. The Invoker executes the command.
To achieve decoupling between sender and receiver
