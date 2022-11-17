# Serenity JUnit Starter Project - Crowdar Challenge

Proyecto que incluye pruebas automaticas de una pagina Login. 
El proyecto incluye el archivo `casosDePrueba` en donde se describen los escenarios.

## Repositorio GitHub

Ingresar a [crowdar-challenge](https://github.com/lucasemanuelherrera/crowdar-challenge) para clonar el repositorio desde GitHub. 

## Ejecutar las pruebas con Maven

Para ejecutar las pruebas debes abrir la consola de comando y ejecutar:

    mvn clean verify

## Ejecutar con Firefox 

Abrir la consola de comando y ejecutar:

    mvn clean verify -Dwebdriver.driver=firefox 

## Reporte de ejecución

El reporte de ejecución se encuentra en el directorio `target/site/serenity/idex.html`, generado luego de cada ejecución del proyecto.
