# Platinum Airlines 🌐

**Your one-stop solution for all flight booking needs** - A modern, full-stack airline booking and management system built with Spring Boot and React.

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.0--SNAPSHOT-6DB33F?style=flat&logo=spring-boot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.0+-005C84?style=flat&logo=mysql&logoColor=white)
![React](https://img.shields.io/badge/React-Planned-61DAFB?style=flat&logo=react&logoColor=white)

## 📋 Overview

Platinum Airlines is a comprehensive flight booking platform that enables users to search for flights, make reservations, manage bookings, and handle passenger information. The system supports multiple authentication methods and provides role-based access control for different user types.

## 🏗️ Architecture

### Backend
- **Framework**: Spring Boot 4.0.0-SNAPSHOT
- **Language**: Java 21
- **Database**: MySQL
- **ORM**: Hibernate/JPA
- **Security**: Spring Security with OAuth2 support

### Frontend
- **Framework**: React
- **UI**: Modern, responsive design
- **API Communication**: RESTful APIs

## 🗄️ Database Schema

The system is built around the following core entities:

### **User Management**
- **User**: Customer accounts with profile information
  - Email & phone authentication
  - OAuth2 integration (Google, Facebook, etc.)
  - Email verification
  - Role-based permissions
  
- **Role**: User roles and permissions (Admin, Customer, Agent, etc.)

### **Flight Management**
- **Airport**: Airport information
  - Name, IATA code
  - City and Country (enum-based)
  
- **Flight**: Flight details
  - Origin and destination airports
  - Departure and arrival times
  - Flight status (Scheduled, Delayed, Cancelled, Completed)
  - Available seats and pricing
  
### **Booking System**
- **Booking**: Flight reservations
  - User association
  - Booking status (Confirmed, Pending, Cancelled)
  - Passenger information
  - Payment details

- **Passenger**: Individual passenger data
  - Personal information
  - Passenger type (Adult, Child, Infant)
  - Travel document details

## 🌟 Key Features

### User Features
- ✅ User registration and authentication (Email/OAuth2)
- ✅ Flight search and filtering
- ✅ Real-time seat availability
- ✅ Booking management
- ✅ Multiple passenger support
- ✅ Booking history and status tracking

### Administrative Features
- ✅ Flight management (Create, Update, Cancel)
- ✅ Airport management
- ✅ User management and role assignment
- ✅ Booking oversight
- ✅ System analytics and reporting

### Technical Features
- ✅ RESTful API architecture
- ✅ JWT-based authentication
- ✅ OAuth2 social login integration
- ✅ Role-based access control (RBAC)
- ✅ Email verification system
- ✅ Secure password encryption
- ✅ Transaction management

## 🚀 Getting Started

### Prerequisites
- Java 21 or higher
- Maven 3.6+
- MySQL 8.0+
- Node.js 18+ (for React frontend)
- npm or yarn

### Backend Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/youssef509/platinum-airlines.git
   cd platinum-airlines
   ```

2. **Configure the database**
   
   Update `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/platinumairline
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. **Build the project**
   ```bash
   ./mvnw clean install
   ```

4. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

The backend API will be available at `http://localhost:8082`

### Frontend Setup
*(Coming soon - React application)*

```bash
cd frontend
npm install
npm start
```

## 📚 API Documentation

The API follows RESTful conventions and will include:

- `/api/auth/*` - Authentication endpoints
- `/api/flights/*` - Flight search and management
- `/api/bookings/*` - Booking operations
- `/api/users/*` - User profile management
- `/api/airports/*` - Airport information

*(Detailed API documentation will be added with Swagger/OpenAPI)*

## 🔐 Authentication Methods

- **Email/Password**: Traditional authentication
- **OAuth2 Providers**: 
  - Google
  - Facebook
  - Other social providers

## 🛠️ Technology Stack

### Backend Technologies

| Technology | Purpose | Version |
|------------|---------|---------|
| ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white) | Application Framework | 4.0.0-SNAPSHOT |
| ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) | Programming Language | 21 |
| ![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white) | Database | 8.0+ |
| ![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white) | ORM Framework | 7.1.6 |
| ![Spring Security](https://img.shields.io/badge/Spring%20Security-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white) | Security & Authentication | Latest |
| ![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white) | Build Tool | 3.6+ |
| ![Lombok](https://img.shields.io/badge/Lombok-BC4521?style=for-the-badge&logo=lombok&logoColor=white) | Code Generation | Latest |

**Additional Backend Libraries:**
- **Spring Data JPA** - Database access and repository pattern
- **ModelMapper** - Object mapping and DTO conversions
- **OAuth2 Client** - Social authentication integration
- **Jakarta Persistence** - JPA specification implementation
- **HikariCP** - High-performance JDBC connection pool

### Frontend Technologies (Planned)

| Technology | Purpose |
|------------|---------|
| ![React](https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB) | UI Framework |
| ![React Router](https://img.shields.io/badge/React_Router-CA4245?style=for-the-badge&logo=react-router&logoColor=white) | Routing |
| ![Axios](https://img.shields.io/badge/Axios-5A29E4?style=for-the-badge&logo=axios&logoColor=white) | HTTP Client |
| ![Redux](https://img.shields.io/badge/Redux-593D88?style=for-the-badge&logo=redux&logoColor=white) | State Management |
| ![Material-UI](https://img.shields.io/badge/Material--UI-0081CB?style=for-the-badge&logo=material-ui&logoColor=white) | Component Library |

### Development Tools

| Tool | Purpose |
|------|---------|
| ![VS Code](https://img.shields.io/badge/VS%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white) | IDE |
| ![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white) | Version Control |
| ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white) | API Testing |

## 📦 Project Structure

```
platinum-airlines/
├── src/
│   ├── main/
│   │   ├── java/com/platinum/platinumAirline/
│   │   │   ├── config/          # Configuration classes
│   │   │   ├── controller/      # REST controllers
│   │   │   ├── entities/        # JPA entities
│   │   │   ├── dtos/           # Data Transfer Objects
│   │   │   ├── enums/          # Enumerations
│   │   │   ├── exceptions/     # Custom exceptions
│   │   │   ├── repo/           # JPA repositories
│   │   │   ├── security/       # Security configuration
│   │   │   └── services/       # Business logic
│   │   └── resources/
│   │       └── application.properties
│   └── test/                    # Unit and integration tests
├── frontend/                    # React application (coming soon)
├── pom.xml
└── README.md
```

## 🎯 Roadmap

- [ ] Complete REST API implementation
- [ ] Implement payment gateway integration
- [ ] Build React frontend
- [ ] Add email notification system
- [ ] Implement flight recommendation engine
- [ ] Add multi-language support
- [ ] Mobile application (iOS/Android)
- [ ] Admin dashboard with analytics
- [ ] Loyalty program system

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 👤 Author

**Youssef Ahmed**
- GitHub: [@youssef509](https://github.com/youssef509)

## 📧 Contact

For questions or support, please open an issue on GitHub.

---

**Note**: This project is currently under active development. Features and documentation will be updated regularly.
