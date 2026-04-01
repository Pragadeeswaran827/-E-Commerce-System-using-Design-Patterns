🛒 E-Commerce System using Design Patterns
A full-featured e-commerce web application built with Python (Flask), demonstrating the practical implementation of six industry-standard software design patterns. This project serves as both a functional online retail platform and a reference implementation for clean, maintainable, pattern-based architecture.

📌 Project Overview
This project showcases how foundational object-oriented design patterns can be applied to solve real architectural challenges in a complex domain like e-commerce. From managing database connections to handling multiple payment methods and real-time notifications, every major system concern is addressed using a recognised pattern.

🎯 Objectives

Build a functional e-commerce system with core retail features
Implement six Gang-of-Four and architectural design patterns
Demonstrate reusability, scalability, and maintainability through patterns
Serve as a learning reference for design pattern implementation in Python


🧩 Design Patterns Implemented
PatternApplication in ProjectSingletonDatabaseManager — single shared DB connection poolFactoryPaymentProcessorFactory — creates payment provider instancesStrategyShippingContext — swappable shipping & discount algorithmsObserverNotificationDispatcher — order event broadcasts to email/SMS/warehouseDecoratorDiscountDecorator — stackable pricing rules on cart itemsMVCFull separation of Models, Views (Jinja2), and Controllers (Blueprints)

⚙️ Tech Stack
LayerTechnologyBackendPython 3.11, Flask 3.0FrontendHTML5, CSS3, Bootstrap 5, JavaScript ES2023DatabasePostgreSQL 16 (primary), Redis 7 (session cache)ORMSQLAlchemy 2.0AuthFlask-Login, bcrypt, JWTPaymentsStripe API, Razorpay (sandbox)DevOpsDocker, Docker Compose, Gunicorn, NginxTestingpytest, coverage.py (82%+ coverage)

🚀 Features

🔐 User registration, login, and role-based access control
🛍️ Product catalog with search, filters, and pagination
🛒 Persistent shopping cart with guest-to-user merge
💳 Multiple payment methods (card, PayPal, UPI)
📦 Order management with status tracking
📧 Automated email & SMS notifications on order events
🧾 Invoice PDF download from user profile
🖥️ Admin dashboard for order and inventory management


🏗️ Project Structure
ecommerce-design-patterns/
├── app/
│   ├── models/          # SQLAlchemy ORM models
│   ├── controllers/     # Flask Blueprint route handlers
│   ├── services/        # Business logic layer
│   ├── patterns/        # Design pattern implementations
│   └── templates/       # Jinja2 HTML templates
├── tests/               # pytest unit & integration tests
├── migrations/          # Alembic DB migration scripts
├── docker-compose.yml
├── requirements.txt
└── README.md

🛠️ Getting Started
bash# Clone the repository
git clone https://github.com/your-username/ecommerce-design-patterns.git
cd ecommerce-design-patterns

# Copy environment config
cp .env.example .env

# Start with Docker
docker compose up --build

# Or run locally
pip install -r requirements.txt
flask db upgrade
flask run
App runs at http://localhost:5000

🧪 Running Tests
bashpytest --cov=app tests/

📄 Report
A full academic project report (PDF/DOCX) is included in the /docs folder, covering system architecture, pattern explanations with code snippets, literature review, and references.

📚 References

Gamma et al. — Design Patterns: Elements of Reusable Object-Oriented Software (1994)
Fowler — Patterns of Enterprise Application Architecture (2002)
Flask Docs: https://flask.palletsprojects.com
SQLAlchemy Docs: https://docs.sqlalchemy.org
