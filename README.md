# quote-api2
Quote API with IP-based rate limiting using Spring Boot
Quote API
A RESTful API built with Spring Boot that returns random inspirational quotes and applies IP-based rate limiting.
Features
Endpoint: GET /api/quote
Returns a random inspirational quote
IP-based rate limiting: 5 requests per minute
Returns HTTP 429 if limit exceeded
Logs IP and status
In-memory rate limiting using Bucket4j
Swagger UI documentation
