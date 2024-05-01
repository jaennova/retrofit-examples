**Retrofit Examples: Ejemplos Prácticos de Conexión a APIs en Android**

Este repositorio contiene una serie de proyectos de ejemplo que ilustran el uso de la biblioteca Retrofit en Android para realizar peticiones a diferentes APIs. Los proyectos están organizados de manera progresiva, comenzando con ejemplos básicos y avanzando hacia casos de uso más complejos. 

**Características:**

- **Ejemplos paso a paso**: Cada proyecto proporciona una guía detallada, desde la configuración inicial hasta la implementación completa de la conexión a la API correspondiente.

- **Proyectos modulares**: Cada ejemplo se enfoca en un tema o funcionalidad específica, como solicitudes GET, POST, autenticación, paginación, etc. Esto facilita la comprensión y la referencia de conceptos individuales.

- **Documentación detallada**: Todos los proyectos incluyen comentarios explicativos y guías que te guiarán a través de los pasos de implementación, asegurando una comprensión clara del proceso.

- **Aplicaciones simples y funcionales**: Los proyectos se centran en la funcionalidad y la comprensión del concepto, sin preocuparse por un diseño complejo de la interfaz de usuario. El objetivo principal es brindar ejemplos claros y concisos de cómo utilizar Retrofit para diferentes casos de uso.

Iniciaremos con proyectos sencillos que demuestran cómo realizar solicitudes GET simples a APIs públicas y gratuitas, y mostrar los datos obtenidos en la interfaz de usuario. Ejemplos de estos proyectos iniciales incluyen mostrar una cita aleatoria, un chiste de Chuck Norris, una imagen de un gato, información básica de un Pokémon o un usuario aleatorio.

Luego, avanzaremos a proyectos que trabajan con listas de datos, utilizando un RecyclerView para mostrarlas. También incluiremos navegación a nuevas pantallas para mostrar detalles adicionales, así como proyectos que involucran entrada de datos del usuario, como un convertidor de monedas y una aplicación del clima básica.


**Proyectos Disponibles:**

1. **Mostrar una cita aleatoria**
   - API: Ron Swanson Quotes API (https://github.com/jamesseanwright/ron-swanson-quotes)
   - Realizar una solicitud GET para obtener una cita aleatoria de Ron Swanson.
   - Mostrar la cita en un TextView.

2. **Mostrar un chiste de Chuck Norris**
   - API: Chuck Norris API (https://api.chucknorris.io/)
   - Realizar una solicitud GET para obtener un chiste aleatorio de Chuck Norris.
   - Mostrar el chiste en un TextView.

3. **Mostrar una imagen aleatoria de un gato**
   - API: The Cat API (https://thecatapi.com/)
   - Realizar una solicitud GET para obtener la URL de una imagen aleatoria de un gato.
   - Descargar y mostrar la imagen en un ImageView.

4. **Mostrar información básica de un Pokémon**
   - API: PokéAPI (https://pokeapi.co/)
   - Realizar una solicitud GET para obtener la información básica de un Pokémon específico (nombre, imagen, habilidades).
   - Mostrar la información en TextViews y un ImageView.

5. **Mostrar un usuario aleatorio**
   - API: Random User Generator (https://randomuser.me/)
   - Realizar una solicitud GET para obtener la información de un usuario aleatorio.
   - Mostrar el nombre, correo electrónico y avatar del usuario en TextViews y un ImageView.

6. **Mostrar lista de usuarios aleatorios**
   - API: Random User Generator (https://randomuser.me/)
   - Realizar una solicitud GET para obtener una lista de usuarios aleatorios.
   - Mostrar la lista de usuarios en un RecyclerView, donde cada elemento muestre el nombre, correo electrónico y avatar del usuario.
   - Al hacer clic en un usuario, mostrar más detalles en una nueva pantalla.

7. **Convertidor de monedas**
   - API: Open Exchange Rates API (https://openexchangerates.org/)
   - Realizar una solicitud GET para obtener los tipos de cambio actuales.
   - Permitir al usuario seleccionar la moneda de origen y la moneda de destino.
   - Realizar la conversión de monedas y mostrar el resultado.

8. **Aplicación del clima básica**
   - API: OpenWeatherMap (https://openweathermap.org/api)
   - Permitir al usuario ingresar una ciudad o código postal.
   - Realizar una solicitud GET para obtener el pronóstico del tiempo de la ubicación ingresada.
   - Mostrar información como la temperatura, descripción del clima, humedad, etc.

9. **Mostrar lista de películas populares**
   - API: The Movie Database (https://www.themoviedb.org/documentation/api)
   - Realizar una solicitud GET para obtener una lista de películas populares.
   - Mostrar la lista de películas en un RecyclerView, incluyendo el póster de la película, título y calificación.
   - Al hacer clic en una película, mostrar más detalles en una nueva pantalla.

10. **Aplicación de noticias básica**
    - API: NewsAPI (https://newsapi.org/)
    - Realizar una solicitud GET para obtener noticias de diferentes fuentes.
    - Mostrar una lista de noticias en un RecyclerView, incluyendo el título, fuente y una imagen (si está disponible).
    - Al hacer clic en una noticia, mostrar el contenido completo en una nueva pantalla.

Claro, aquí tienes algunos proyectos con un nivel más de complejidad usando Retrofit en Android:

11. **Aplicación del clima con búsqueda y ubicación**
    - API: OpenWeatherMap (https://openweathermap.org/api)
    - Permitir al usuario buscar el clima por nombre de ciudad o código postal.
    - Obtener y mostrar la ubicación actual del dispositivo en un mapa.
    - Realizar solicitudes GET para obtener el pronóstico del tiempo de la ubicación buscada o actual.
    - Mostrar información detallada del clima, incluyendo temperatura, descripción, viento, humedad, etc.

12. **Aplicación de noticias con búsqueda y categorías**
    - API: NewsAPI (https://newsapi.org/)
    - Permitir al usuario buscar noticias por palabra clave.
    - Mostrar categorías de noticias (deportes, tecnología, entretenimiento, etc.) y permitir al usuario seleccionar una categoría.
    - Realizar solicitudes GET para obtener noticias según la búsqueda o la categoría seleccionada.
    - Implementar paginación para cargar más noticias al hacer scroll.

13. **Aplicación de películas con búsqueda y filtros**
    - API: The Movie Database (https://www.themoviedb.org/documentation/api)
    - Permitir al usuario buscar películas por título.
    - Mostrar filtros para películas populares, mejor calificadas, próximos estrenos, etc.
    - Realizar solicitudes GET para obtener las películas según la búsqueda o los filtros seleccionados.
    - Implementar paginación para cargar más películas al hacer scroll.
    - Mostrar detalles adicionales de una película, como sinopsis, reparto, calificaciones, etc.

14. **Aplicación de autenticación con GitHub**
    - API: GitHub API (https://docs.github.com/en/rest)
    - Implementar la autenticación con GitHub utilizando OAuth2.
    - Obtener y mostrar información del usuario autenticado (nombre, avatar, bio, etc.).
    - Realizar solicitudes GET para obtener la actividad reciente del usuario (repositorios, seguidores, etc.).
    - Permitir al usuario realizar acciones como crear un nuevo repositorio (solicitud POST).

15. **Aplicación de seguimiento de nutrición**
    - API: Nutritionix API (https://developer.nutritionix.com/)
    - Permitir al usuario buscar alimentos por nombre.
    - Realizar solicitudes GET para obtener información nutricional de los alimentos buscados.
    - Permitir al usuario registrar el consumo de un alimento (solicitud POST).
    - Mostrar un resumen del consumo diario de calorías, macronutrientes, etc.

Cada proyecto se centrará en la implementación de Retrofit para realizar las peticiones a la API correspondiente, sin profundizar en la creación de una aplicación completa. El objetivo principal es brindar ejemplos claros y concisos de cómo utilizar Retrofit para diferentes casos de uso, desde los más básicos hasta los más avanzados.
Si deseas explorar características adicionales, como almacenamiento en caché, manejo de errores de red, implementación de patrones de diseño, entre otros, puedes utilizar estos proyectos como punto de partida y expandirlos según tus necesidades.

## Recursos

Aquí hay una lista de recursos para entender mejor la implementación de Retrofit y Corrrutinas

### Youtube

- [Joss Programming](https://www.youtube.com/watch?v=5fyrlA-4msA)
