# dealer-vehicle-management-api
Spring Boot REST API project for managing dealers and vehicles with PostgreSQL


# 🚗 Dealer & Vehicle Management API

A **Spring Boot REST API project** for managing **Dealers** and their **Vehicles**, built with **Spring Boot, JPA, and PostgreSQL**.  
It demonstrates **clean REST design, JPA relationships, and custom queries**.

---

## ✨ Features

- 👤 **Dealer Management** – CRUD APIs for dealers (`id, name, email, subscriptionType`)
- 🚙 **Vehicle Management** – CRUD APIs for vehicles (`id, dealerId, model, price, status`)
- ⭐ **Premium Dealer Vehicles** – Fetch all vehicles belonging to **PREMIUM** dealers
- 🗄️ **Database Integration** – PostgreSQL with auto-generated schema using JPA
- 🧪 **API Testing** – Postman Collection included (Swagger UI compatible)

---

## 🛠️ Tech Stack

- **Java 8+**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Postman / Swagger**

---

## 📌 Sample Endpoints

| HTTP Method | Endpoint                  | Description                          |
|-------------|---------------------------|--------------------------------------|
| `POST`      | `/api/dealers`            | Create a new dealer                  |
| `GET`       | `/api/dealers/{id}`       | Get dealer by ID                     |
| `PUT`       | `/api/dealers/{id}`       | Update dealer                        |
| `DELETE`    | `/api/dealers/{id}`       | Delete dealer                        |
| `POST`      | `/api/vehicles`           | Add a vehicle                        |
| `GET`       | `/api/vehicles/{id}`      | Get vehicle by ID                    |
| `PUT`       | `/api/vehicles/{id}`      | Update vehicle                       |
| `DELETE`    | `/api/vehicles/{id}`      | Delete vehicle                       |
| `GET`       | `/api/vehicles/premium`   | Fetch vehicles of **PREMIUM dealers**|

---

## 🚀 Getting Started

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/dealer-vehicle-management-api.git
cd dealer-vehicle-management-api
