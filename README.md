## Objetivo de la entrega

El objetivo de esta entrega es familiarizarnos con IntelliJ IDEA y el lenguaje Java: el manejo del IDE y sus atajos, el uso de repositorios Git (commits, ramas, merge), la conexión del proyecto con un repositorio remoto y el flujo de trabajo de push hacia GitHub.

## Cómo compilar y ejecutar

El proyecto se gestiona con Maven. Para compilarlo y ejecutarlo basta con abrirlo en IntelliJ IDEA y usar la opción **Run** sobre la clase principal **Main**.

## Dependencias y versión de JDK
 
- **Gestor de dependencias:** Maven.
- **JDK:** 27.

## Estructura de la entrega y clases principales
 
El proyecto sigue la estructura estándar de Maven:
```
software/
├── pom.xml
├── .gitignore
├── README.md
└── src/
    └── main/
        └── java/
            └── software/
                ├── Main.java      # Código principal del programa
                └── Person.java    # Clase Person de la kata (nombre, edad, fecha de nacimiento)
```
La clase **Person** fue evolucionando en distintos commits: primero con el nombre, luego con la fecha de nacimiento, después con la edad calculada, eliminando el número mágico **DAYS_PER_YEARS**, y finalmente convertida a **record**.

## Flujo de Git usado
 
El flujo de trabajo seguido fue:
 
1. Creación del proyecto y configuración inicial (`pom.xml`, `.gitignore`).
2. Creación de la rama **develop** para desarrollar la kata paso a paso mediante commits (creación de la clase `Person`, nombre, fecha de nacimiento, edad, eliminación de número mágico, conversión a record).
3. **Merge** de `develop` a `master` una vez terminada la kata.
4. Commits adicionales sobre `master` para la clase `Main` y ajustes finales.
5. **Push** de todos los commits y ramas al repositorio remoto en GitHub.

Ramas del repositorio:
- `master`: versión final integrada de la kata.
- `develop`: desarrollo paso a paso de la kata (repetición principal).
- `repetition-1` y `repetition-2`: repeticiones adicionales de la kata, realizadas antes de **develop** como práctica extra de cara a la grabación del vídeo, mostrando la creación de ramas y commits de forma independiente.

## Cómo clonar y comprobar que compila
 
Para comprobar que el proyecto compila y funciona fuera de la carpeta original:
 
1. Abrir IntelliJ IDEA.
2. En la pantalla de inicio, seleccionar **Clone Repository**.
3. Pegar la URL del repositorio de GitHub creado para esta entrega y cambiar la carpeta destino.
4. Una vez clonado, ejecutar `Main` con **Run** y comprobar que compila sin errores y produce el mismo resultado que la versión original.

## Repetición de la kata
 
Para practicar de cara a la grabación del vídeo, se realizaron dos repeticiones adicionales de la kata, visibles en las ramas `repetition-1` y `repetition-2`. En ellas se repitió el mismo proceso de creación de la clase `Person` paso a paso mediante commits, con el objetivo de afianzar el flujo de creación de ramas, commits y organización del historial en Git antes de la entrega final.

## Evidencias de verificación y pruebas
 
- Se comprobó que el proyecto compila correctamente con Maven sin errores.
- Se ejecutó la clase `Main` desde IntelliJ (Run) verificando que el programa produce la salida esperada.
- Se clonó el repositorio en una carpeta distinta a la original y se repitió la compilación y ejecución, confirmando que el resultado es idéntico.
- Se revisó el historial de commits en GitHub para confirmar que todas las ramas (`master`, `develop`, `repetition-1`, `repetition-2`) están correctamente subidas al remoto.
- Se utilizó el **debugger** de IntelliJ, colocando breakpoints en puntos clave del código (constructor y método que calcula la edad de la persona), para seguir paso a paso la ejecución del programa y verificar el flujo del IDE y el comportamiento correcto de la clase `Person`.

A continuación se muestra la consola tras ejecutar `Main`, confirmando que el programa finaliza correctamente (exit code 0) y que la edad calculada para Lucía es 21, como se esperaba:
 
<img width="623" height="128" alt="captura main kata 1" src="https://github.com/user-attachments/assets/4609f472-3360-42b7-ac31-3a990020fd7b" />


## Atajos de teclado utilizados

Durante el desarrollo de la kata se utilizaron los siguientes atajos de IntelliJ IDEA:

| Atajo | Uso |
|---|---|
| `Alt + Ins` | Crear un nuevo *package*, una nueva clase Java, un nuevo archivo (p. ej. `README.md`), o generar constructor/getter/setter, y también para que el IDE cree automáticamente un método a partir de su uso (p. ej. `toYears`). |
| `Shift + Tab` | Moverse hacia atrás entre los huecos que propone el IDE al generar un método automáticamente (hacia delante se usa `Tab`). |
| `Control + K` | Abrir la ventana de commit para escribir el mensaje del commit. |
| `Control + Enter` | Confirmar y realizar el commit. |
| `Alt + 9` | Abrir la ventana de Git para ver ramas y commits. |
| `Shift + F6` | Renombrar de forma segura un método o variable en todo el código (usado, por ejemplo, al renombrar `birthday`). |
| `Control + Alt + C` o `Refactor` | Extraer un valor como constante (usado para eliminar el número mágico y crear `DAYS_PER_YEAR`). |
| `Alt + Enter` | Mostrar acciones rápidas del IDE, como convertir la clase `Person` en `record`. |

## Vídeo explicativo
 
- Enlace en YouTube: *(poner)*
- Enlace en Drive: *(poner)*


