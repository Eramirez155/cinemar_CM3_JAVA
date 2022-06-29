# Sistema de Gestión de boletería Cinemar 
## Contexto

***Cinemar*** es una empresa que se dedica a proyectar películas esenciales dedicadas al público adolecente.

El cine cuenta con una cantidad de salas con diferentes capacidades (siendo esta capacidad de butacas), tambien dispone de salas 2D como 3D variando el precio de las entradas. 

Cuando un cliente se presenta en ventanilla muestra su tarjeta de descuento, si la tiene, se le efectúa un descuento en el valor de la entrada, sino pueden solicitar una si acudieron al menos 6 veces en 3 meses, en caso contrario el precio de la entrada no tendrá descuento alguno.

Actualmente la tabla de descuento para los que tienen la tarjeta de descuento es la siguiente:

* Lunes y Miercoles: 20%
* Martes y Jueves: 15%
* Viernes, Sabado y Domingo: 10%

siendo modificable según los directivos.

## Problemática 

Los directivos de ***Cinemar*** comentaron a nuestro equipo que no cuentan con un control de los clientes, para realizar reservas de butacas y otorgales descuentos para aquellos que son mas recurrentes de forma automática.

Todo se efectua mediante ventanilla y a mano, lo que provoca que en algunas salas a veces se terminan vendiendo mas entradas que la capacidad de la sala, y perdiendo ventas en funciones por no contar con reservas por páginas web en horarios específicos.


## Solución 

Nos llega desde administración del cine a nuestro equipo de desarrolladores que tenemos que implementar una solución que nos permita lo siguiente.

> **Para el cliente:**
* Registrarse.
* Iniciar Sesión.
* Crear una reserva.
* Modificar una reserva.
* Observar mis reservas.
* Ver el historico de mis entradas.

> **Para la Administración:**
* Ver reservas de todos los clientes.
* Ver reservas de un cliente en Particular
* Crear una sala con la película.
* Modificar una sala.
* Eliminar una sala.
* Modificar descuentos.

> **Troncales**
* Ver Salas

## Consideraciones

* No se venceran las películas, sino que sera por la creación de una sala.
* La reserva implica el pago de la entrada.
* Las reservas solo se pueden modificar simpre y cuando se hagan antes de la función.

# Diagrama UML 
![Clase UML ](https://user-images.githubusercontent.com/107365832/174696711-9089538f-2ac1-45ee-864d-2e1363691e2a.png)
# Ingenieria reversa
![IngenieriaReversa2](https://user-images.githubusercontent.com/107365188/176341389-222d5133-036b-4e22-98f3-c3104d55963c.png)

# Diagrama Entidad Relacion
![Diagrama drawio (1)](https://user-images.githubusercontent.com/107365832/175990785-75b3c6bb-9d63-42fe-9e46-8d01ea35cb38.png)
# Entregables

## Checkpoint 1 (Fecha: 13/06 al 16/03)

1) Elaborar un diagrama de clases proponiendo la solucion.
2) Elaborar otro diagrama de clases mostrando el método de registro de clientes e inicio de sesión.

## Checkpoint 2 (Fecha: 20/06 al 24/06)

1) Elaborar el DER (diagrama de entidad relación) de la solución.

2) Presentar los Script de generacion de esquemas de la base de datos.

## Checkpoint 3 (Fecha:04/7 - 08/07)
1) Presentación grupal del proyecto.
2) Explicación del código.
3) Decisión de diseño.



# Endpoints
## Registro de Cliente

```java
POST / register
```

> Request

```java
{
    name: "Aldo",
    lastname: "Silvestre",
    age: 32,
    email: "aldosilvestre@gmail.com",
    password: "12345678",
    repeat_password: "12345678"
}
```


>Response (HTTPSTATUS **204**)
```java
{ }
```

## Inciar Sesion
```java
{
    POST / login
}
```

> Request

```java
{
    username: "test@usuario.com",
    password: "12345678"
}
```

> Response (HTTPSTATUS **200**)
```java
{
    access_token: "copiar token",
    is_admin: false,
    username: "test@usuario.com"
}
```

> Realizar una reserva

```java
{
    POST /reserves/new
}
```

> Request

```java
{
    nro_sala: 15,
    date: "2022-05-16"
    time: "21:30"
}
```

> Response (HTTPSTATUS **204**)

```java
{ }
```


## Modificar reserva
```java
{
    PATCH / reserves/modify/{nro}
}
```

PathParam (nro): Se enviara el número de reserva a modificar.

> Request
```java
{ 
    new_time: "21:00",
    new_date: "2022-05-23" 
}
```


> Response (HTTPSTATUS **200**)
```java
{ }
```

## Obtener las entradas del cliente

```java
{
    GET / tickets/get
}
```
**QueryParams**: Opcionales de filtros, fecha, pelicula, hora, usuario (en caso de admin), si no se envia nada se traera todo lo que los permisos permitan.

> Response (HTTPSTATUS **200**)
```java
[{
    movie: "ironman",
    time: "22:00",
    date: "20/05/2022"
}, {
    movie: "thor",
    time: "20:30",
    date: "21/06/2022"
}]
```

## Creación Sala

```java
{
    GET / rooms/new
}
```

> Request

```java
{
    movie: "dragon ball",
    time: "22:30"
}
```

> Response (HTTPSTATUS **204**)
```java
{ }
```

## Modificación de Sala

```java
{
    PUT /room/modify
}
```

> Request

```java
{
    nro_room: "123",
    new_movie: "hercules",
    new_time: "21:00"
}
```
> Response (HTTPSTATUS **204**)
```java
{ }
```

## Baja de Sala
```java
{
    DELETE /room/delete/{nro}
}
```
PathParam(nro): Se enviará el número de sala que se eliminará.

> Request
```java
{ }
```

> Response (HTTPSTATUS **204**)
```java
{}
```

## Modificar descuentos

> Request

```java
{
    day: "Lunes",
    new_discount: 0.2
}
```

> Response(HTTPSTATUS **204**)

```java
{ }
```
 
## Ver salas

```java
{
    GET/ rooms/get
}

```

**QueryParams**: Se podra agregar como filtro pelicula, dia y hora.

> Request

```java
{ }
```

> Response(HTTPSTATUS **200**)

```java
[{
    nro: 52,
    date: "2022-06-18",
    movie: "dragon ball, Broly",
    time: "22:30"
},{
    nro: 25,
    date: "2022-06-21",
    movie: "101 dalmatas",
    time: "17:00"
}]
```

## Manejo de Errores

Todos los resultados de las llamadas se recibiran por codigos HTTP mayores al 400, con su respectivo manejo de error. 
