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
To achieve decoupling between sender and receiver.

Examples:
- Remote Control (same switch used to turn on different appliances)

### Template pattern

A skeleton of algorithm is defined in parent class and child classes needs to implement the steps. This is a special case of Factory pattern.

Examples:
- To buy a product from different sites (Algo is same, steps are different)

### Proxy pattern

Provide a placeholder object instead of actual object to restrict access

Examples:
- Running test cases on different environments and restricting actions e.g. DB manipulation in PROD or STG.

### Execute Around pattern

Provide some actions to be executed before and after the method call.

Examples:
- Frame/Window switch
- Taking screenshots
- Logging

### Decorator pattern

To add additional behaviors to an object dynamically

Examples:
- Role based display of UI components.(Some components are visible to Admin only)