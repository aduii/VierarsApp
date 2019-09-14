# MuniApp

## ANTECEDENTES

Uno de los problemas más significativos de las entidades representativas del estado es la forma en la cual se llevan a cabo las interacciones con sus ciudadanos: los agentes burocráticos están efectivamente desconectados de la situación del hombre a pie y actúan, en el mejor escenario, de forma cuestionable. Por otro lado, existen una amplia gama de trámites que factiblemente podrían ser automatizados, pero ante una ausencia de incentivos para realizarlo, es necesario la intervención de un ente privado.

## PROBLEMÁTICA
El problema identificado es la forma ineficiente que poseen las instituciones estatales de comunicarse con los ciudadanos, debido a que los medios que utilizan siguen modelos anticuados e ineficientes, incapaces de proveer una noción de los eventos o noticias más relevantes. Asimismo, Los ciudadanos no cuentan con medios adecuados a través de los cuales notificar eventos significativos sucediendo a su alrededor. A causa de esto, los responsables de velar por la ciudadanía no solucionan los problemas. Hechos como este generan malestar en los ciudadanos al punto de causar desconfianza hacia las instituciones responsables de estos inconvenientes.

## ALCANCE DE LA SOLUCIÓN
Nuestra solución que proponemos para dar solución a la problemática presentada es construir una aplicación en java con una GUI sencilla, con la finalidad de facilitar la comunicación entre los ciudadanos y la municipalidad de cierto distrito del país sobre los diferentes problemas que pueden ocurrir en la ciudad.

## DESCRIPCIÓN DE LA EMPRESA
Somos una empresa enfocada a mejorar el proceso de interacción entre ciudadanos y entidades estatales. Entre los servicios brindados incluiremos una interfaz en la cual se crearán, recibirán y clasificará reportes de cualquier inconveniente. Además, se automatizará el servicio al ciudadano en tareas mundanas con la finalidad de brindar una mejor calidad de vida al ciudadano de a pie.
Personas que conforman el proyecto:

### a)	SCRUM MASTER
Dirigido por Alex Daniel Juep Sifuentes, competente en metodología ágiles y, siempre firme con el equipo de desarrollo y guiándolos para que cumplan con las reglas y procesos de la metodología. Además, trabaja de la mano con Carlos Tarazona.

### b)	PRODUCT OWNER
Dirigido por Carlos Vincent Tarazona Hurtado, quien es el encargado de recolectar toda la información que la institución y las autoridades brindan respecto a la solución que plantean. Además, él establece el cronograma y formaliza las prestaciones en historias para incorporarlos en el Product Backlog. 

## c)	DEVELOPMENT TEAM
Formado por Andy Eulogio Sulluchuco, Diana Regina Navarro Ruíz y Jesús Andrés Zevallos Jacobo, quienes convertirán la idea de negocio en una aplicación funcional y cumplirán con el cronograma propuesto en lo más posible.

## REQUISITOS FUNCIONALES
•	Registrar institución
•	Registrar autoridades
•	Autenticar autoridades
•	Registrar ciudadano
•	Autenticar ciudadano
•	Registrar problema
•	Listar noticias (ciudadanos y autoridades)
•	Mostrar noticias (ciudadanos y autoridades)
•	Compartir ubicación (ciudadanos)
•	Notificar problema registrado (ciudadanos y autoridades)
•	Listar problemas (autoridades)

## REQUISITOS NO FUNCIONALES

### a)	EFICIENCIA
•	El sistema debe ser capaz de procesar n transacciones por segundo.
•	Toda funcionalidad del sistema y transacción deben responder al usuario como máximo en 3 segundos.
•	Los datos modificados en la base de datos deben ser actualizados para todos los usuarios y deben mostrar los cambios como máximo en 3 segundos.
•	El sistema debe manejar fuentes del alfabeto en español e inglés.

### b)	USABILIDAD
•	El tiempo de aprendizaje del sistema por un usuario deberá ser menor a 5 minutos.

### c)	SEGURIDAD LÓGICA Y DE DATOS
•	El sistema debe desarrollarse aplicando patrones de programación
•	Él debe respaldarse cada 24 horas. Los respaldos deben ser almacenados en una localidad segura ubicada en un edificio distinto al que reside el sistema.
•	La aplicación web debe poseer un diseño “Responsive” a fin de garantizar la adecuada visualización en múltiples dispositivos.

## HISTORIAS DE USUARIO
<table>
  <tr>
      <th colspan="2"><b>Historia de usuario</b></th>
  </tr>
  <tr>
      <td><b>Número:</b> RF07</td>
    <td><b>Usuario:</b> Ciudadano</td>
  </tr>
  <tr>
    <td colspan="2"><b>Nombre de historia:</b> Listar noticia</td>
  </tr>
  <tr>
    <td><b>Prioridad en negocio:</b> </td>
    <td><b>Riesgo en desarrollo:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Programador responsable:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Descripción:</b> Como ciudadano quiero listar las noticias que actualemnte estan pasando en mi distrito, además de poder enterarme de los problemas que suceden ahi.<br></td>
  </tr>
  <tr>
    <td colspan="2"><b>Criterios de aceptación:</b> 
    <ul>
    	<li>Dado un ciudadano registrado en la aplicacion cuando inicie sesion podrá ver las noticias de su localidad donde vide y donde está ubicado.</li>
    </ul>
</td>
  </tr>
</table>


<table>
  <tr>
      <th colspan="2"><b>Historia de usuario</b></th>
  </tr>
  <tr>
      <td><b>Número:</b> RF08</td>
    <td><b>Usuario:</b> Mostrar noticias</td>
  </tr>
  <tr>
    <td colspan="2"><b>Nombre de historia:</b> Mostrar noticias</td>
  </tr>
  <tr>
    <td><b>Prioridad en negocio:</b> </td>
    <td><b>Riesgo en desarrollo:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Programador responsable:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Descripción:</b> Como ciudadano quiero ver los detalles de cada noticia que actualmente están pasando en mi distrito.<br></td>
  </tr>
  <tr>
    <td colspan="2"><b>Criterios de aceptación:</b> 
    <ul>
    	<li>Dado un ciudadano registrado cuando este ingrese a la aplicación lo primero que verá son las noticias de su localidad, tanto de donde vive y de donde se encuntra actualmente.</li>
    </ul>
</td>
  </tr>
</table>



<table>
  <tr>
      <th colspan="2"><b>Historia de usuario</b></th>
  </tr>
  <tr>
      <td><b>Número:</b> RF09</td>
    <td><b>Usuario:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Nombre de historia:</b> Recibir notificaciones como ciudadano</td>
  </tr>
  <tr>
    <td><b>Prioridad en negocio:</b> </td>
    <td><b>Riesgo en desarrollo:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Programador responsable:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Descripción:</b> Como ciudadano quiero recibir los problemas urgentes de mi ciudad mediante notificaciones para poder estar preparado y prevenirme.<br></td>
  </tr>
  <tr>
    <td colspan="2"><b>Criterios de aceptación:</b> 
    <ul>
    	<li>Como ciudadano quiero recibir los problemas urgentes de mi ciudad mediante notificaciones para poder estar preparado y prevenirme.</li>
    </ul>
</td>
  </tr>
</table>



<table>
  <tr>
      <th colspan="2"><b>Historia de usuario</b></th>
  </tr>
  <tr>
      <td><b>Número:</b> RF10</td>
    <td><b>Usuario:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Nombre de historia:</b> Como autoridad recibir notificaciones de los problemas</td>
  </tr>
  <tr>
    <td><b>Prioridad en negocio:</b> </td>
    <td><b>Riesgo en desarrollo:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Programador responsable:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Descripción:</b>Como autoridad quiero recibir notificaciones de los problemas que presentan los ciudadanos de mi distrito para poder actuar y tomar decisiones de forma inmediata.<br></td>
  </tr>
  <tr>
    <td colspan="2"><b>Criterios de aceptación:</b> 
    <ul>
    	<li>Dada una autoridad en el sistema cuando se registre en la base de datos un problema entonces la autoridad recibirá una notificación en la aplicación.</li>
    </ul>
</td>
  </tr>
</table>

<table>
  <tr>
      <th colspan="2"><b>Historia de usuario</b></th>
  </tr>
  <tr>
      <td><b>Número:</b> RF11</td>
    <td><b>Usuario:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Nombre de historia:</b> Listar problemas para las autoridades</td>
  </tr>
  <tr>
    <td><b>Prioridad en negocio:</b> </td>
    <td><b>Riesgo en desarrollo:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Programador responsable:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Descripción:</b>Como autoridad puedo ver la lista de los últimos problemas acaecidos en mi localidad.<br></td>
  </tr>
  <tr>
    <td colspan="2"><b>Criterios de aceptación:</b> 
    <ul>
    	<li> Dado una autoridad en el sistema cuando ingrese a la ventana principal de la aplicación entonces podrá ver primero los problemas que los usuarios registraron que estan relacionados a su institución.</li>
    </ul>
</td>
  </tr>
</table>

<table>
  <tr>
      <th colspan="2"><b>Historia de usuario</b></th>
  </tr>
  <tr>
      <td><b>Número:</b> RF12</td>
    <td><b>Usuario:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Nombre de historia:</b> Registrar problema como autoridad</td>
  </tr>
  <tr>
    <td><b>Prioridad en negocio:</b> </td>
    <td><b>Riesgo en desarrollo:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Programador responsable:</b> </td>
  </tr>
  <tr>
    <td colspan="2"><b>Descripción:</b>Como autoridad puedo registrar los problemas que se presentan en un determinado lugar para avisar a los ciudadanos y evitar problemas mayores.<br></td>
  </tr>
  <tr>
    <td colspan="2"><b>Criterios de aceptación:</b> 
    <ul>
    	<li>  Dado una autoridad registrada en el sistema, cuando le de click en el boton de registrar problema entonces se desplegará una ventana para llenar los datos del problema.</li>
        <li>  Dada la ventana de registrar problema cuando la autoridad le de click en aceptar entonces se agregará el problema a la base de datos.</li>
    </ul>
</td>
  </tr>
</table>


## DIAGRAMA DE BASE DE DATOS

![](https://imgur.com/bhq5Bt0.png)

## DIAGRAMA DE CLASES

![](https://imgur.com/xCnd3dL.png)
