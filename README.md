# Conversor de Monedas con Java

Bienvenido a mi proyecto de conversor de monedas desarrollado en **Java** como parte del challenge. Esta aplicación permite convertir valores entre distintas monedas utilizando la API de [ExchangeRate-API].

---

##Funcionalidades

✅ Posee un menú interactivo de 6 conversiones fijas y 1 opción para salir.
✅ Cálculos en tiempo real.
✅ Diseño simple
✅ Código sencillo

---

#Interfaz del usuario

Al momento de ejecutar la aplicación, se puede observar el siguiente menú:

![image](https://github.com/user-attachments/assets/ad71cf98-3e08-44ee-8fa2-5732216cb154)

> El usuario selecciona una opción y luego ingresa el monto que desea convertir.

---

##Estrcutura del proyecto

src/
└── com/aluracursos/conversorMonedas/
├── principal/
│ └── Principal.java
├── logica/
│ ├── ConversorApp.java
│ ├── ConversorMonedas.java 
│ └── MenuInteractivo.java
└── models/
└── ExchangeApiResponse.java

![image](https://github.com/user-attachments/assets/93ebf2e6-f741-4e22-a415-cb377bc0e6f8)


En la captura se puede observar como se escoge la primera opción que es USD -> ARS, colocando 1000 USD para convertir a peso argentino que da un resultado de 1139830.00 ARS.

