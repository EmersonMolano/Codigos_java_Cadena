# 🏥 Sistema de Gestión Hospitalaria

## Descripción
Sistema de gestión hospitalaria desarrollado en Java que permite administrar conductores, pacientes, ambulancias, clínicas y servicios funerarios.

## 🚀 Funcionalidades

### 1. Gestión de Conductores
- Registro de hasta 10 conductores
- Datos: nombre, apellido, teléfono
- Control de recorridos (máximo 8 por conductor)

### 2. Gestión de Pacientes
- Registro de hasta 100 pacientes
- Datos: nombre, apellido, teléfono, edad, tipo de sangre
- Generación automática de fallecidos aleatorios

### 3. Gestión de Fallecidos
- Registro de hasta 15 fallecidos
- Datos: nombre, causa de muerte

### 4. Gestión de Ambulancias
- 10 ambulancias disponibles (9 normales + 1 carroza)
- Control de kilometraje (máximo 400 km por ambulancia)
- Asignación de conductores y pacientes
- Historial de viajes

### 5. Servicios Funerarios
- Gestión de carroza fúnebre
- Asignación de conductor y fallecido
- Control de recorridos

### 6. Gestión de Clínicas
- 3 clínicas disponibles (C1, C2, C3)
- Distancias predefinidas
- Solicitudes de ambulancia

### 7. Reportes y Estadísticas
- Reporte general del sistema
- Estadísticas rápidas
- Control de eficiencia

## 📋 Estructura del Proyecto

```
hospital/
├── src/main/java/com/mycompany/hospital/
│   ├── Main.java              # Clase principal con menú
│   ├── Datos.java             # Datos compartidos del sistema
│   ├── Conductor.java         # Gestión de conductores
│   ├── Pacientes.java         # Gestión de pacientes
│   ├── Muertos.java           # Gestión de fallecidos
│   ├── Ambulancia.java        # Gestión de ambulancias
│   ├── Funeraria.java         # Gestión de carroza fúnebre
│   ├── Clinica.java           # Gestión de clínicas
│   ├── BuscarConductor.java   # Utilidad de búsqueda
│   ├── Reporte.java           # Generación de reportes
│   └── Utilidades.java        # Funciones de utilidad
```

## 🛠️ Tecnologías Utilizadas

- **Java 8+**
- **Maven** (gestión de dependencias)
- **Scanner** (entrada de datos)
- **Arrays** (estructuras de datos)

## 📦 Instalación y Ejecución

### Prerrequisitos
- Java JDK 8 o superior
- Maven (opcional)

### Pasos de instalación

1. **Clonar el repositorio:**
```bash
git clone [URL_DEL_REPOSITORIO]
cd hospital
```

2. **Compilar el proyecto:**
```bash
mvn compile
```

3. **Ejecutar el programa:**
```bash
mvn exec:java -Dexec.mainClass="com.mycompany.hospital.Main"
```

O directamente:
```bash
java -cp target/classes com.mycompany.hospital.Main
```

## 🎯 Uso del Sistema

### Menú Principal
```
----Menu del Hospital----
1. Conductor-
2. Pacientes-
3. Muerto-s
4. Funeraria-
5. Ambulancia-
6. Clinica-
7. Generar Reporte-
8. Estadísticas Rápidas-
0. Salir
```

### Flujo de Trabajo Recomendado

1. **Registrar conductores** (opción 1)
2. **Registrar pacientes** (opción 2)
3. **Registrar fallecidos** (opción 3)
4. **Asignar ambulancias** (opción 5)
5. **Procesar solicitudes de clínicas** (opción 6)
6. **Gestionar servicios funerarios** (opción 4)
7. **Generar reportes** (opción 7)

## 📊 Características del Sistema

### Límites del Sistema
- **Conductores**: 10 máximo
- **Pacientes**: 100 máximo
- **Fallecidos**: 15 máximo
- **Ambulancias**: 10 (9 normales + 1 carroza)
- **Recorridos por conductor**: 8 máximo
- **Kilometraje por ambulancia**: 400 km máximo

### Validaciones Implementadas
- ✅ Validación de rangos numéricos
- ✅ Verificación de límites del sistema
- ✅ Control de disponibilidad de recursos
- ✅ Validación de entrada de datos
- ✅ Manejo de errores básico

## 🔧 Mejoras Implementadas

### Correcciones Realizadas
1. ✅ Corregido switch case en Main.java
2. ✅ Inicializada variable `distanciasClinica`
3. ✅ Corregido registro de conductores (10 en lugar de 1)
4. ✅ Agregada validación en gestión de fallecidos
5. ✅ Mejorada clase Clinica con procesamiento real
6. ✅ Mejorada clase Ambulancia con validaciones
7. ✅ Creada clase Reporte mejorada
8. ✅ Agregadas estadísticas rápidas

### Nuevas Funcionalidades
- 📊 Sistema de reportes detallado
- 📈 Estadísticas de eficiencia
- 🔍 Búsqueda y validación mejorada
- 📋 Interfaz más amigable con emojis
- ⚡ Estadísticas rápidas en tiempo real

## 👥 Autores

- **Emerson Calet Molano** - Desarrollo principal
- **Familia M.C** - Contribuciones adicionales

## 📝 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor:

1. Fork el proyecto
2. Crea una rama para tu feature (`git checkout -b feature/AmazingFeature`)
3. Commit tus cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abre un Pull Request

## 📞 Soporte

Para soporte técnico o preguntas sobre el proyecto, contacta a:
- **Email**: [tu-email@ejemplo.com]
- **GitHub**: [tu-usuario-github]

---

**¡Gracias por usar el Sistema de Gestión Hospitalaria!** 🏥 