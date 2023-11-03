# Book My Bus

![Book My Bus](https://cdn.discordapp.com/attachments/1128079625818480751/1169323442760335440/bus-tracking-removebg-preview.png?ex=6554fc51&is=65428751&hm=40591e8ff31ec0f9c1dfb0b508486dec8b7694956e5f1edab85428c3d152d70e&)

Book My Bus is a dynamic bus reservation platform offering a suite of features to optimize the booking experience. It enables operators to manage bus information, tailor routes, and directly address user feedback, ensuring a smooth and efficient journey for all passengers.


## Table of Contents
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
- [API Documentation](#api-documentation)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Features
- Add, update, and delete bus details such as name, type, driver information, and more.
- Define routes with departure and arrival locations, distance, and associated buses.
- Manage user feedback for specific buses, including ratings and comments.
- View active, deleted, and user-specific feedbacks.
- Pagination support for viewing a specific number of feedbacks per page.

## Getting Started

To run the Bus Management System on your local machine, follow these steps:

### Prerequisites
- Java Development Kit (JDK) 8 or later
- Maven
- MySQL database

### Installation
1. Clone the repository: git clone https://github.com/Anklet9/BookMyBus.git
2. Navigate to the project directory:
3. Configure the MySQL database:
- Create a new MySQL database named.
- Update the database configuration in `src/main/resources/application.properties` with your MySQL connection details.
4. Build the project:
5. Run the application:

The application should now be running at `http://localhost:8088`.

## Usage
- Access the web application by navigating to `http://localhost:8088` in your web browser.
- Use the provided API endpoints to interact with the system programmatically (refer to API documentation below).

## API Documentation
API documentation provides detailed information about each API endpoint and how to use them. It can be accessed at `http://localhost:8088/swagger-ui.html` when the application is running.

## Contributing
Contributions are welcome! If you'd like to contribute to this project, please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bug fix: `git checkout -b feature-name`.
3. Make your changes and commit them: `git commit -am 'Add some feature'`.
4. Push your changes to the branch: `git push origin feature-name`.
5. Submit a pull request.

## Contact

If you have any questions or need support, please contact us at [anklet.devil09@gmail.com].

Thank you for using the Absolute Minds Library Management System! Happy reading!

## License
This project is licensed under the MIT License. See the `LICENSE` file for more details.

