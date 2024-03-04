# 1. Simulador de Dados con Inteligencia Artificial
## Descripción

En este proyecto tenemos una clase llamada `DadoIA` que simula el lanzamiento de un dado. La clase tiene metodos para lanzar el dado y devuelve un numero aleatorio en funcion de las caras del dado. Tenemos tambien un metodo predecir que recibe el numero de caras, y recorre la lista del historial de resultados obteniendo la probabilidad de cada cara y, posteriormente, podemos mostrar el historial de resultados.

En el creamos tres dados, los lanzamos, almacenamos y posteriormente mostramos la probabilidad de que salga un numero en concreto.

# 2. Gestion de Clientes con Recomendaciones de Libros
## Descripción
Para este proyecto, necesitamos la clase Libro, con sus atributos titulo, autor, categoria, donde luego la usaremos para crear una lista de libros interesantes y poder ofrecer recomendaciones al cliente segun sus intereses.

En la clase cliente, definimos los atributos como nombre, apellido, interes, librosInteresantes e historialCompras, que lo usaremos mas adelante a la hora de crear un nuevo cliente para obtener sus datos e intereses y asi, poder ofrecerle recomendaciones de libros.

En la clase GestionClientes pedimos al usuario que cree un nuevo cliente, que introduzca los intereses por los libros que tiene y si ha comprado alguno poder ofrecer recomendaciones similares. Podemos crear los clientes que queramos, y, despues, mostrarlos.

# 3. Micro Guerra de Barcos con Simulacion Ambiental
## Descripción

En este proyecto lo primero que tenemos que hacer es crear una cuadricula de 10x10, donde creamos la cuadricula mostrando una A indicando que hay agua. Dentro de la cuadricula, depositamos un barco, siempre y cuando este dentro de los limites definidos.

En la clase Barco, definimos atributos como tamano, posicion mediante filas y columnas y un boolean para saber si esta golpeado o no. Tenemos un metodo para mover el barco dentor de la cuadricula y lo marca con una B. A esto, le sumamos las situaciones ambientales, por lo que el barco, se podria mover mediante corrientes marinas por lo que tendria la posibilidad de moverse de forma aleatoria por el tablero, siempre en posiciones adyacentes.

Por ultimo, tenemos un metodo booleano para disparar, que marcara con una 'X' si se ha hundido el barco y, sino, nos dira que el disparo ha sido fallido.

En el main lo que hacemos es crear un tablero, un barco y lo movemos cada 2.5s usando un Thread.sleep, y, disparamos para ver si se hunde o no.
    

# 4. Micro Guerra de Barcos con Estategia de IA
## Descripción

