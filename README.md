##### The task is to create a solution that runs multiple containers using Docker:

-   **Build the following containers**:
    
    -   A **Java Spring Boot** container (generated using Spring Initializr).
        
    -   A **Prometheus** container with a custom configuration.
        
    -   A **Grafana** container with a custom configuration.
        
-   **Start the containers** using a shell script.
    
-   Extend the Spring Boot application with a **custom metric** that returns a random value between **10 and 50**.
    
-   Make a Grafana dashboard accessible via a URL (e.g., `http://localhost:8080/grafana/`) that displays:
    
    -   **JVM metrics**.
        
    -   The **custom metric** from the Java Spring Boot container.
 
### To Run Shell Script
	sh init.sh
