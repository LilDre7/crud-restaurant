# Restaurant CRUD API

API REST para gestión de restaurantes con Spring Boot y PostgreSQL.

## 🚀 Tecnologías

- Java 17+
- Spring Boot 3.x
- PostgreSQL
- Maven

## ⚙️ Configuración

### Base de Datos

```sql
CREATE DATABASE restaurant_db;
```

### application.properties

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/restaurant_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
```

## 🏃 Ejecutar

```bash
mvn spring-boot:run
```

La API estará en `http://localhost:8080`

## 📡 Endpoints

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/api/restaurants` | Listar todos |
| GET | `/api/restaurants/{id}` | Obtener por ID |
| POST | `/api/restaurants` | Crear |
| PUT | `/api/restaurants/{id}` | Actualizar |
| DELETE | `/api/restaurants/{id}` | Eliminar |

### Ejemplo JSON

```json
{
  "name": "La Bella Italia",
  "address": "Calle Principal 123",
  "phone": "+1234567890",
  "email": "info@restaurant.com",
  "cuisine": "Italiana",
  "capacity": 50
}
```

## 🧪 Testing

Usa Postman para probar los endpoints con la colección incluida en `/postman`.

## 📄 Licencia

Uso libre.
