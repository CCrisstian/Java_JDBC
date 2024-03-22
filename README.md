<h1 align="center">SQL</h1>
<p><b>SQL</b> (Structured Query Language) es un lenguaje estándar utilizado para interactuar con sistemas de gestión de bases de datos relacionales (RDBMS por sus siglas en inglés).</p>
<p><b>SQL</b> proporciona un conjunto de comandos y cláusulas que permiten realizar una variedad de operaciones en una base de datos. Estas operaciones incluyen la creación y modificación de esquemas de bases de datos, la inserción, modificación y eliminación de datos, así como la recuperación de datos mediante consultas.</p>

Algunos de los conceptos y características clave de `SQL`:
-  <b>Declarativo</b>: `SQL` es un lenguaje de consulta declarativo, lo que significa que los usuarios describen qué datos desean recuperar o manipular, en lugar de especificar cómo deben realizarse las operaciones. Esto permite a los usuarios enfocarse en los resultados deseados en lugar de los detalles de implementación.
-  <b>Operaciones CRUD</b>: `SQL` permite realizar cuatro operaciones básicas en datos: Create (crear), Read (leer), Update (actualizar) y Delete (eliminar). Estas operaciones se conocen comúnmente como operaciones CRUD y son fundamentales en la gestión de datos.
-  <b>Tipos de datos</b>: `SQL` proporciona una variedad de tipos de datos para representar diferentes tipos de información, como enteros, cadenas de caracteres, fechas, booleanos, entre otros. Estos tipos de datos pueden variar ligeramente según el sistema de gestión de bases de datos utilizado. 
-  <b>Consultas</b>: `SQL` permite realizar consultas complejas para recuperar datos de una o más tablas de una base de datos. Las consultas pueden incluir múltiples condiciones, funciones de agregación, ordenamientos, agrupamientos y uniones entre tablas.
-  <b>Transacciones</b>: `SQL` proporciona soporte para transacciones, que son secuencias de operaciones que se ejecutan como una sola unidad lógica. Esto garantiza la integridad y consistencia de los datos al realizar operaciones complejas que afectan múltiples registros.
-  <b>Seguridad</b>: `SQL` incluye mecanismos para gestionar la seguridad de la base de datos, como la definición de usuarios y roles, así como la asignación de permisos para acceder y manipular datos.

<h2 align="center">'Lenguaje de Definicion de Datos' y 'Lenguaje de Manipulacion de Datos'</h2>
<h3>Lenguaje de Definición de Datos (DDL)</h3>

-  El DDL se utiliza para definir la estructura y las características de la base de datos.
-  Incluye comandos como `CREATE`, `ALTER` y `DROP`, que se utilizan para crear, modificar y eliminar objetos de la base de datos, como tablas, índices, vistas, etc.
-  Permite definir restricciones de integridad como claves primarias, claves foráneas, restricciones únicas, entre otros.
-  Ejemplos de comandos `DDL` incluyen:
    -  `CREATE TABLE` para crear una nueva tabla en la base de datos.
    -  `ALTER TABLE` para modificar la estructura de una tabla existente.
    -  `DROP TABLE` para eliminar una tabla de la base de datos.
 
<h3>Lenguaje de Manipulación de Datos (DML)</h3>

-  El DML se utiliza para manipular los datos almacenados en la base de datos.
-  Incluye comandos como `INSERT`, `SELECT`, `UPDATE` y `DELETE`, que se utilizan para agregar, consultar, actualizar y eliminar datos de la base de datos, respectivamente.
-  Permite realizar consultas complejas para recuperar información específica de la base de datos utilizando la cláusula `SELECT`.
-  Facilita la inserción, actualización y eliminación de datos según sea necesario.
-  Ejemplos de comandos `DML` incluyen:
    -  `INSERT INTO` para agregar nuevos registros a una tabla.
    -  `SELECT` para recuperar datos de una tabla o vistas.
    -  `UPDATE` para modificar datos existentes en una tabla.
    -  `DELETE FROM` para eliminar registros de una tabla.
 
<h1 align="center">MySQL</h1>
<p>MySQL es un sistema de gestión de bases de datos relacional (RDBMS) de código abierto muy popular y ampliamente utilizado en la industria.</p>

Algunas características clave de `MySQL`: 
 -  <b>Esquema Relacional</b>: `MySQL` es una base de datos relacional, lo que significa que organiza los datos en tablas que están relacionadas entre sí mediante claves primarias y foráneas.
 -  <b>Multiplataforma</b>: `MySQL` está disponible para una variedad de plataformas, incluyendo Linux, Windows, macOS y diferentes sistemas Unix.
 -  <b>Multiusuario y Multihilo</b>: `MySQL` es un sistema de base de datos multiusuario y multihilo, lo que significa que puede manejar múltiples conexiones de usuarios simultáneamente y procesar múltiples solicitudes de manera eficiente.
 -  <b>Soporte para Transacciones</b>: `MySQL` ofrece soporte para transacciones ACID (Atomicidad, Consistencia, Aislamiento y Durabilidad), lo que garantiza la integridad y la consistencia de los datos incluso en entornos de múltiples usuarios.
 -  <b>Replicación y Clustering</b>: `MySQL` permite la replicación de datos entre múltiples servidores para mejorar la disponibilidad y la tolerancia a fallos, así como la configuración de clústeres para mejorar la escalabilidad y el rendimiento.
 -  <b>Almacenamiento de Datos</b>: `MySQL` proporciona varios motores de almacenamiento, incluyendo InnoDB (predeterminado), MyISAM, MEMORY, ARCHIVE, entre otros. Cada motor tiene sus propias características y se adapta a diferentes necesidades de almacenamiento y rendimiento.
 -  <b>Soporte para Diversos Lenguajes de Programación</b>: `MySQL` es compatible con una variedad de lenguajes de programación, incluyendo PHP, Java, Python, Ruby, entre otros, lo que facilita su integración con aplicaciones web y de escritorio.
 -  <b>Herramientas de Administración y Monitorización</b>: `MySQL` viene con una variedad de herramientas de administración y monitorización, como MySQL Workbench, MySQL Command-Line Client y MySQL Enterprise Monitor, que facilitan la gestión y el mantenimiento de las bases de datos MySQL.

<h1 align="center">JDBC</h1>
<p><b>JDBC (Java Database Connectivity)</b> es una API (Interfaz de Programación de Aplicaciones) de Java que proporciona un conjunto de clases e interfaces para permitir que las aplicaciones Java se conecten y manipulen bases de datos relacionales.</p>
<p align="center"><img width="700" alt="image" src="https://github.com/CCrisstian/Java_JDBC/assets/111469216/b6c876dc-18ba-41c2-8678-461e9577ebef"></p>

Algunas características clave de `JDBC`:
 -  <b>Conexión a la Base de Datos</b>: `JDBC` proporciona clases para establecer una conexión con una base de datos, como `DriverManager` y `Connection`, permitiendo que las aplicaciones Java interactúen con la base de datos.
 -  <b>Ejecución de Consultas</b>: `JDBC` permite enviar consultas SQL a la base de datos y obtener resultados utilizando objetos como `Statement`, `PreparedStatement` y `CallableStatement`.
 -  <b>Manipulación de Resultados</b>: `JDBC` proporciona clases como `ResultSet` para representar conjuntos de resultados de consultas SQL, lo que permite a las aplicaciones Java procesar y manipular los datos recuperados de la base de datos.
 -  <b>Control de Transacciones</b>: `JDBC` permite a las aplicaciones Java administrar transacciones mediante la utilización de objetos como Connection y métodos como `commit()` y `rollback()`.
 -  <b>Manejo de Excepciones</b>: `JDBC` proporciona manejo de excepciones para errores relacionados con la conexión a la base de datos, la ejecución de consultas y la manipulación de resultados, lo que garantiza una gestión adecuada de posibles errores.
 -  <b>Independencia de la Base de Datos</b>: `JDBC` permite a los desarrolladores escribir código Java independiente de la base de datos subyacente, lo que facilita la portabilidad de las aplicaciones entre diferentes sistemas de gestión de bases de datos (DBMS) sin necesidad de realizar cambios significativos en el código.
 -  <b>Soporte para Diversos Tipos de Bases de Datos</b>: JD`JDBC`BC es compatible con una amplia gama de bases de datos relacionales, incluyendo MySQL, PostgreSQL, Oracle, SQL Server, SQLite, entre otros.

<h2 align="center">'DriverManager'</h2>
<p>La clase <b>DriverManager</b> es parte de la API JDBC (Java Database Connectivity) y se utiliza para administrar un conjunto de controladores de bases de datos. Su principal función es facilitar la conexión de una aplicación Java con una base de datos mediante la carga y gestión de los controladores JDBC necesarios.</p>

Métodos más importantes de la clase `DriverManager`:
-  `registerDriver(Driver driver)`: Registra un controlador de bases de datos con el `DriverManager`. Este método es generalmente utilizado internamente por los controladores JDBC durante su inicialización, por lo que rara vez se llama explícitamente.
-  `getConnection(String url)`: Establece una conexión a la base de datos utilizando la URL de conexión proporcionada. Esta es la forma más básica de obtener una conexión y generalmente se utiliza cuando no se necesitan propiedades adicionales de conexión.
-  `getConnection(String url, Properties info)`: Establece una conexión a la base de datos utilizando la URL de conexión y las propiedades adicionales proporcionadas. Las propiedades pueden incluir el nombre de usuario, la contraseña y otras opciones específicas del controlador.
-  `getConnection(String url, String user, String password)`: Establece una conexión a la base de datos utilizando la URL de conexión, el nombre de usuario y la contraseña proporcionados.
-  `getDrivers()`: Devuelve un Enumeration que contiene los controladores de bases de datos registrados con el `DriverManager`.
-  `deregisterDriver(Driver driver)`: Cancela el registro de un controlador de bases de datos con el `DriverManager`.

<h2 align="center">'Connection'</h2>
<p>La clase <b>Connection</b> es parte de la API JDBC (Java Database Connectivity) y representa una conexión activa a una base de datos. Es responsable de establecer y mantener la comunicación entre una aplicación Java y una base de datos subyacente.</p>

Métodos más importantes de la clase `Connection`:
-  `createStatement()`: Crea un objeto `Statement` que se puede utilizar para enviar consultas SQL simples a la base de datos.
-  `prepareStatement(String sql)`: Crea un objeto `PreparedStatement` que se utiliza para enviar consultas SQL precompiladas a la base de datos. Este método es preferible cuando se necesitan realizar consultas parametrizadas.
-  `prepareCall(String sql)`: Crea un objeto `CallableStatement` que se utiliza para ejecutar procedimientos almacenados o funciones definidos en la base de datos.
-  `close()`: Cierra la conexión con la base de datos. Es importante cerrar la conexión una vez que ya no se necesite para liberar los recursos y evitar posibles fugas de memoria.
-  `commit()`: Confirma la transacción actual. Los cambios realizados en la base de datos dentro de la transacción se vuelven permanentes.
-  `rollback()`: Deshace la transacción actual y revierte los cambios realizados en la base de datos dentro de la transacción.
-  `setAutoCommit(boolean autoCommit)`: Establece si la conexión debe realizar automáticamente la confirmación después de cada operación o si debe administrarse manualmente mediante las llamadas explícitas a `commit()` o `rollback()`.
-  `setTransactionIsolation(int level)`: Establece el nivel de aislamiento de la transacción. Esto determina el grado en que las transacciones concurrentes pueden afectar a otras transacciones en la base de datos.
-  `getMetaData()`: Devuelve un objeto `DatabaseMetaData` que contiene información sobre la base de datos a la que está conectada la conexión.
-  `setReadOnly(boolean readOnly)`: Establece si la conexión debe ser de solo lectura o si se permite realizar modificaciones en la base de datos.
-  `isClosed()`: Devuelve `true` si la conexión está cerrada y `false` si está abierta.
-  `isValid(int timeout)`: Verifica si la conexión sigue siendo válida. Esto puede ser útil para evitar conexiones inactivas o muertas
