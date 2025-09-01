# Shopping Cart System 🛒🛍️

This repository contains a simple **Shopping Cart System** implemented in Java, with comprehensive unit tests written using **JUnit**. The project was developed following the principles of **Test-Driven Development (TDD)** to ensure the code is robust and reliable.

---

## Objective

The main objective of this project is to build a functional and testable system that simulates a basic e-commerce shopping cart, allowing users to:

* **Add** new items to the cart.
* **Remove** items from the cart.
* **View** the items currently in the cart.
* **Calculate** the total price of all items.

---

## Core Components

The system is built around two main classes:

1.  **`Item` Class**:
    * A simple model class representing a product.
    * Each item is defined by its `ID`, `name`, and `price`.
    * Includes methods to retrieve these details.

2.  **`ShoppingCart` Class**:
    * Manages a collection of `Item` objects.
    * Contains the core business logic for the system's objective.

---

## Test-Driven Development (TDD) Approach

This project was built following the TDD methodology, which involves a continuous cycle of:

1.  **Writing a Failing Test**: A test is written for a new feature, which initially fails because the feature does not yet exist.
2.  **Writing Minimal Code**: Just enough code is written to make the new test pass.
3.  **Refactoring**: The code is refactored to improve its design and readability without changing its behavior.

This approach ensures that every piece of code is validated by a test, leading to a highly reliable system.

---

## Technologies Used

* **Language:** Java
* **Testing Framework:** JUnit 5
* **IDE (Recommended):** IntelliJ IDEA or VS Code with Java extensions

---

## How to Run the Tests 🧪

To run the unit tests and verify the system's functionality:

1.  **Clone the Repository:**
    ```bash
    git clone [https://github.com/rohith1829/shopping-cart-system.git](https://github.com/rohith1829/shopping-cart-system.git)
    ```
2.  **Navigate to the Project Directory:**
    ```bash
    cd shopping-cart-system
    ```
3.  **Open in your IDE:**
    Import the project into your Java IDE (e.g., IntelliJ IDEA). It should be recognized as a Maven project based on the `pom.xml` file.
4.  **Run Tests:**
    From your IDE, you can run the tests by right-clicking on the `ShoppingCartTest.java` file in the `src/test/java` folder and selecting "Run 'ShoppingCartTest'".

---

## Author

**CHAGALERU ROHITH**
* GitHub: [rohit1829](https://github.com/rohit1829)
