**Autor:**  
Robinson Barbecho

# Serenity BDD – SauceDemo E2E

## Descripción del proyecto

Este proyecto implementa una **prueba automatizada end-to-end (E2E)** utilizando **Serenity BDD**, **Cucumber**, **Screenplay Pattern** y **Selenium WebDriver**, con el objetivo de validar el flujo completo de compra en el sitio web [SauceDemo](https://www.saucedemo.com/).

El escenario automatizado cubre las siguientes acciones principales:
1. Acceso a la aplicación web.
2. Inicio de sesión con credenciales válidas.
3. Selección y adición de productos al carrito.
4. Visualización del carrito y confirmación de compra.
5. Validación del mensaje final de confirmación “THANK YOU FOR YOUR ORDER”.

El proyecto se diseñó como ejercicio técnico con el fin de aplicar buenas prácticas de automatización, estructura modular y trazabilidad de resultados mediante reportes generados con Serenity.

---

## Tecnologías utilizadas

| Componente | Versión / Descripción |
|-------------|------------------------|
| **Lenguaje** | Java 11 / 21 compatible |
| **Framework de pruebas** | Serenity BDD 3.7.0 |
| **Motor BDD** | Cucumber 7.11.0 |
| **Patrón de diseño** | Screenplay Pattern |
| **Automatización Web** | Selenium WebDriver 4.21.0 |
| **Gestor de dependencias** | Apache Maven |
| **IDE recomendado** | IntelliJ IDEA Community Edition |
| **Navegador** | Google Chrome (versión estable actual) |

---

## Requisitos previos

Antes de ejecutar el proyecto, asegúrese de cumplir con los siguientes requisitos:

1. **Instalar JDK 21**  
   - Verificar instalación con:  
     ```bash
     java -version
     ```

2. **Instalar Apache Maven (3.8 o superior)**  
   - Verificar instalación con:  
     ```bash
     mvn -version
     ```

3. **Instalar IntelliJ IDEA** (o cualquier IDE con soporte Maven).

4. **Tener instalado Google Chrome** (versión actual).

5. **Configurar variables de entorno** (si aplica):  
   - `JAVA_HOME` apuntando al directorio del JDK.  
   - `MAVEN_HOME` apuntando al directorio de Maven.  
   - Agregar `bin` de ambos al PATH del sistema.

---

## Estructura del proyecto

```
ejercicio 2/
├── pom.xml
├── serenity.properties
├── src/
│   ├── test/
│   │   ├── java/
│   │   │   └── com/example/saucedemo/
│   │   │       ├── runners/
│   │   │       │   └── CucumberTestSuite.java
│   │   │       ├── stepdefinitions/
│   │   │       ├── tasks/
│   │   │       ├── ui/
│   │   │       └── questions/
│   │   └── resources/
│   │       └── features/
│   │           └── compra/
│   │               └── compra_e2e.feature
└── target/
    └── site/
        └── serenity/
            ├── index.html
            └── serenity-summary.html
```

---

## Instalación y configuración

1. **Actualizar dependencias.**  
   Desde IntelliJ o terminal, ejecutar:  
   ```bash
   mvn clean install
   ```

2. **Verificar que el JDK esté correctamente configurado.**  
   En IntelliJ: *File → Project Structure → SDKs → Add JDK 21*.

3. **Archivo de configuración principal:** `serenity.properties`  
   Ejemplo de configuración recomendada:
   ```properties
   webdriver.base.url=https://www.saucedemo.com/
   webdriver.driver=chrome
   headless.mode=false
   chrome.switches=--start-maximized;--incognito;--disable-infobars;--disable-notifications;--disable-save-password-bubble
   serenity.project.name=Serenity BDD - SauceDemo E2E
   serenity.requirements.dir=src/test/resources/features
   serenity.take.screenshots=FOR_FAILURES
   ```

---

## Ejecución de las pruebas

### Opción 1 – Desde IntelliJ IDEA
1. Abrir la clase `CucumberTestSuite.java`.
2. Hacer clic en el ícono **▶ Run 'CucumberTestSuite'**.  
3. Chrome se abrirá automáticamente y ejecutará el flujo completo.  
4. Al finalizar, se generará el reporte Serenity.

### Opción 2 – Desde la línea de comandos
Ejecutar en la raíz del proyecto:
```bash
mvn clean verify
```
Esto compilará, ejecutará las pruebas y generará los reportes.

---

## Visualización del reporte Serenity

Una vez completadas las pruebas, el reporte se genera automáticamente en:

```
target/site/serenity/index.html
```

Si se configuró el plugin `exec-maven-plugin` en el `pom.xml`, el navegador abrirá automáticamente el reporte al finalizar la ejecución.

También puede abrirse manualmente:
```bash
mvn serenity:aggregate
start target/site/serenity/index.html
```

---

## Recomendaciones generales

- Utilizar siempre la misma versión de **Chrome** y **ChromeDriver** que estén alineadas.  
- Ejecutar el comando `mvn clean verify` para limpiar residuos de ejecuciones previas.  
- Evitar caracteres especiales o espacios en los nombres de carpetas del proyecto.  
- Asegurar la codificación UTF-8 para evitar errores en compilación o lectura de archivos.  
- En caso de entornos CI/CD, usar `headless.mode=true` para ejecución sin interfaz gráfica.  
- Mantener actualizadas las versiones de Serenity y Selenium según el stack del proyecto.
