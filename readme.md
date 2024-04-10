Movie Review Application
This full stack development project aims to create a movie review application utilizing MongoDB for the database, Java with Spring Boot for the backend, and React for the frontend. The project emphasizes a separation of concerns between the client and server code to facilitate a loosely coupled architecture, allowing for independent evolution and parallel development of these two parts.

Technologies Used
MongoDB: A NoSQL database used to store movie data and user reviews.
Java: Backend development language.
Spring Boot: A framework used for building and deploying Java-based applications.
React: A JavaScript library for building user interfaces.
Project Overview
The movie review application allows users to:

View a list of movies.
Read reviews for each movie.
Add new movies to the database.
Submit reviews for movies.
The backend, developed with Java and Spring Boot, provides RESTful APIs to interact with the MongoDB database. It handles requests for retrieving movie data and reviews, as well as adding new movies and reviews.

The frontend, built with React, consumes these APIs to display movie information to users and allow them to interact with the application.

Getting Started
To run the project locally, follow these steps:

Prerequisites
Install MongoDB on your system.
Install Java Development Kit (JDK) version 8 or later.
Install Node.js and npm to manage frontend dependencies.
Installation
Clone this repository to your local machine.
Navigate to the backend directory and run ./mvnw spring-boot:run to start the backend server.
Open another terminal window, navigate to the frontend directory, and run npm install to install frontend dependencies.
After the installation is complete, run npm start to start the React development server.
Usage
Once the backend and frontend servers are running, you can access the movie review application by visiting http://localhost:3000 in your web browser.

Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve the project.

License
This project is licensed under the MIT License.