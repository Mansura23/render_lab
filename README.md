Product API - Render Deployment

Base URL:
https://render-lab-lbmh.onrender.com

ENDPOINTS

1. Create Product
POST /api

Body:
{
  "name": "iPhone 15",
  "price": 1200,
  "description": "Latest Apple smartphone"
}

2. Get Product by ID
GET /api/{id}

Example:
GET /api/1

3. Get All Products
GET /api

Example Response:
[
  {
    "id": 1,
    "name": "iPhone 15",
    "price": 1200,
    "description": "Latest Apple smartphone"
  },
  {
    "id": 2,
    "name": "Samsung S24",
    "price": 1100,
    "description": "Flagship Android phone"
  },
  {
    "id": 3,
    "name": "MacBook Air M2",
    "price": 1500,
    "description": "Lightweight Apple laptop"
  }
]

TECH STACK
- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Render

FEATURES
- Create product
- Get product by id
- Get all products
- Database integration
- REST API

ENV VARIABLES
SPRING_DATASOURCE_URL=jdbc:postgresql://host:5432/db
SPRING_DATASOURCE_USERNAME=username
SPRING_DATASOURCE_PASSWORD=password
