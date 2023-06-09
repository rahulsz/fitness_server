<!DOCTYPE html>
<html>
<body>
  <h1>Fitness Server</h1>
  <p>This repository contains the backend code for the Fitness application. It provides a RESTful API built using Spring Boot and Hibernate.</p>

  <h2>Prerequisites</h2>
  <ul>
    <li>Java Development Kit (JDK) installed</li>
    <li>MySQL database installed and running</li>
    <li>MySQL connector driver downloaded</li>
  </ul>

  <h2>Setup</h2>
  <ol>
    <li>Clone the repository to your local machine:</li>
  </ol>
  <pre><code>git clone https://github.com/your-username/fitness_server.git</code></pre>
  <p>Replace <code>your-username</code> with your actual GitHub username.</p>
  
  <ol start="2">
    <li>Open the project in your preferred Java IDE.</li>
    <li>Configure the database connection by modifying the following properties in the <code>application.properties</code> file:</li>
  </ol>
  <pre><code>
    spring.datasource.url=jdbc:mysql://localhost:3306/fitness?createDatabaseIfNotExist=true
    spring.datasource.username=root
    spring.datasource.password=123456789
  </code></pre>
  
  <ol start="5">
    <li>Build the project and resolve any dependencies.</li>
    <li>Run the application using the IDE or command-line tools.</li>
  </ol>

  <h2>API Documentation</h2>
  <p>The RESTful API provided by this backend server allows interaction with the following endpoints:</p>
  <ul>
    <li><strong>Endpoint 1:</strong> Description of Endpoint 1.</li>
    <li><strong>Endpoint 2:</strong> Description of Endpoint 2.</li>
    <!-- Add more endpoints as necessary -->
  </ul>
  <p>For detailed documentation and examples of API usage, please refer to the <a href="api-documentation.md">API documentation</a> file.</p>

  <h2>Contributing</h2>
  <p>Contributions are welcome! If you find any bugs or have suggestions for improvement, please open an issue or submit a pull request.</p>

  <h2>License</h2>
  <p>This project is licensed under the <a href="LICENSE">MIT License</a>.</p>
</body>
</html>
