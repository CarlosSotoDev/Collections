Las **colecciones en Java** son estructuras de datos que permiten almacenar y gestionar grupos de objetos. Java proporciona el **Framework de Colecciones** que incluye una serie de interfaces, clases y métodos para manejar colecciones como listas, conjuntos y mapas, entre otros. El uso de colecciones facilita la manipulación de datos como agregar, eliminar, buscar, ordenar, y otras operaciones comunes de manejo de grupos de objetos.

### Principales interfaces de la API de Colecciones en Java:
1. **List**: Permite almacenar elementos ordenados y permite duplicados.
    - Implementaciones comunes: `ArrayList`, `LinkedList`, `Vector`.
2. **Set**: No permite duplicados y no está ordenado.
    - Implementaciones comunes: `HashSet`, `TreeSet`, `LinkedHashSet`.
3. **Queue**: Se utiliza para almacenar elementos que serán procesados en orden de entrada (FIFO, First In First Out).
    - Implementaciones comunes: `PriorityQueue`, `ArrayDeque`.
4. **Map**: Almacena pares clave-valor, donde las claves son únicas.
    - Implementaciones comunes: `HashMap`, `TreeMap`, `LinkedHashMap`.

## 1. **Listas (List)**

Las **listas** permiten almacenar elementos en un orden específico y permiten duplicados. Cada elemento tiene un índice asociado. Las implementaciones más comunes de `List` son **`ArrayList`** y **`LinkedList`**.

### Implementaciones:

#### **ArrayList**
Un `ArrayList` es una lista basada en un arreglo dinámico que se expande automáticamente cuando se llena. Es eficiente para acceso aleatorio (acceder a un elemento por su índice), pero puede ser más lento para operaciones de inserción y eliminación en el medio de la lista.

##### Principales métodos de `ArrayList`:
1. **`add(E elemento)`**: Agrega un elemento al final de la lista.
2. **`add(int index, E elemento)`**: Inserta un elemento en una posición específica.
3. **`get(int index)`**: Obtiene el elemento en el índice especificado.
4. **`set(int index, E elemento)`**: Reemplaza el elemento en la posición indicada.
5. **`remove(int index)`**: Elimina el elemento en la posición especificada.
6. **`size()`**: Devuelve el número de elementos en la lista.
7. **`contains(Object o)`**: Devuelve `true` si la lista contiene el elemento especificado.

##### Ejemplo de `ArrayList`:
```java
import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        // Agregar elementos
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Naranja");

        // Acceder a un elemento
        System.out.println("Elemento en índice 1: " + lista.get(1));

        // Modificar un elemento
        lista.set(1, "Fresa");

        // Eliminar un elemento
        lista.remove(0);

        // Mostrar lista
        System.out.println("Lista: " + lista);

        // Tamaño de la lista
        System.out.println("Tamaño: " + lista.size());
    }
}
```

#### **LinkedList**
Un `LinkedList` es una lista enlazada doble, donde cada elemento apunta al siguiente y al anterior. Es eficiente para operaciones de inserción y eliminación, pero no es tan eficiente para el acceso aleatorio como el `ArrayList`.

##### Principales métodos de `LinkedList`:
1. **`addFirst(E elemento)`**: Agrega un elemento al principio de la lista.
2. **`addLast(E elemento)`**: Agrega un elemento al final de la lista.
3. **`getFirst()`**: Devuelve el primer elemento de la lista.
4. **`getLast()`**: Devuelve el último elemento de la lista.
5. **`removeFirst()`**: Elimina el primer elemento de la lista.
6. **`removeLast()`**: Elimina el último elemento de la lista.
7. **`size()`**: Devuelve el tamaño de la lista.

##### Ejemplo de `LinkedList`:
```java
import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        // Agregar elementos
        lista.addFirst("Manzana");
        lista.addLast("Banana");
        lista.add("Naranja");

        // Mostrar lista
        System.out.println("Lista: " + lista);

        // Eliminar el primer elemento
        lista.removeFirst();

        // Mostrar lista
        System.out.println("Lista después de eliminar: " + lista);
    }
}
```

---

## 2. **Conjuntos (Set)**

Los **sets** no permiten elementos duplicados. Algunos no garantizan un orden específico, pero otros, como `TreeSet`, mantienen un orden natural de los elementos.

### Implementaciones:

#### **HashSet**
Un `HashSet` es una implementación de `Set` que no mantiene el orden de los elementos, pero es muy eficiente para operaciones de agregar, eliminar y buscar elementos porque utiliza una tabla hash.

##### Principales métodos de `HashSet`:
1. **`add(E elemento)`**: Agrega un elemento al conjunto.
2. **`remove(Object o)`**: Elimina un elemento del conjunto.
3. **`contains(Object o)`**: Verifica si un elemento está en el conjunto.
4. **`size()`**: Devuelve el número de elementos en el conjunto.
5. **`isEmpty()`**: Verifica si el conjunto está vacío.

##### Ejemplo de `HashSet`:
```java
import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<String> conjunto = new HashSet<>();

        // Agregar elementos
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Manzana");  // No se agrega, ya existe

        // Mostrar conjunto
        System.out.println("Conjunto: " + conjunto);

        // Verificar si contiene un elemento
        System.out.println("¿Contiene 'Banana'? " + conjunto.contains("Banana"));

        // Tamaño del conjunto
        System.out.println("Tamaño: " + conjunto.size());
    }
}
```

#### **TreeSet**
Un `TreeSet` es una implementación de `Set` que mantiene los elementos en orden natural o según un comparador. Es más lento que `HashSet` para agregar y eliminar, pero útil cuando el orden de los elementos es importante.

##### Principales métodos de `TreeSet`:
1. **`add(E elemento)`**: Agrega un elemento y lo mantiene ordenado.
2. **`remove(Object o)`**: Elimina un elemento del conjunto.
3. **`first()`**: Devuelve el primer elemento (más bajo) del conjunto.
4. **`last()`**: Devuelve el último elemento (más alto) del conjunto.
5. **`size()`**: Devuelve el número de elementos en el conjunto.

##### Ejemplo de `TreeSet`:
```java
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> conjunto = new TreeSet<>();

        // Agregar elementos
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");

        // Mostrar conjunto ordenado
        System.out.println("Conjunto ordenado: " + conjunto);

        // Obtener el primer y último elemento
        System.out.println("Primer elemento: " + conjunto.first());
        System.out.println("Último elemento: " + conjunto.last());
    }
}
```

---

## 3. **Colas (Queue)**

Las **colas** son estructuras que siguen el principio FIFO (First In, First Out), es decir, el primer elemento que entra es el primero en salir.

### Implementaciones:

#### **PriorityQueue**
Una `PriorityQueue` organiza los elementos en un orden determinado (por su orden natural o basado en un comparador). No garantiza el orden de inserción.

##### Principales métodos de `PriorityQueue`:
1. **`offer(E elemento)`**: Inserta un elemento en la cola (similar a `add`).
2. **`poll()`**: Devuelve y elimina el primer elemento de la cola.
3. **`peek()`**: Devuelve el primer elemento sin eliminarlo.
4. **`isEmpty()`**: Verifica si la cola está vacía.
5. **`size()`**: Devuelve el número de elementos en la cola.

##### Ejemplo de `PriorityQueue`:
```java
import java.util.PriorityQueue;

public class EjemploPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> cola = new PriorityQueue<>();

        // Agregar elementos
        cola.offer(5);
        cola.offer(1);
        cola.offer(3);

        // Mostrar el primer elemento
        System.out.println("Primer elemento: " + cola.peek());

        // Eliminar elementos en orden
        while (!cola.isEmpty()) {
            System.out.println("Eliminando: " + cola.poll());
        }
    }
}
```

#### **ArrayDeque**
`ArrayDeque` es una implementación de una cola de doble extremo que permite agregar y eliminar elementos desde ambos extremos (inicio y fin).

##### Principales métodos de `ArrayDeque`:
1. **`addFirst(E elemento)`**: Inserta un elemento al principio de la cola.
2. **`addLast(E elemento)`**: Inserta un elemento al final de la cola.
3. **`removeFirst()`**: Elimina el primer elemento.
4. **`removeLast()`**: Elimina el último elemento.
5. **`peekFirst()`**: Devuelve el primer elemento sin eliminarlo.
6. **`peekLast()`**: Devuelve el último elemento sin eliminarlo.

##### Ejemplo de `ArrayDeque`:
```java
import java.util.ArrayDeque;

public class EjemploArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Agregar elementos
        deque.addFirst("Primero");
        deque.addLast("Último");

        // Mostrar elementos
        System.out.println("Deque: " + deque);

        // Eliminar primer elemento
        deque.removeFirst();
        System.out.println("Después de eliminar el primero: " + deque);
    }
}


```

---

## 4. **Mapas (Map)**

Los **mapas** almacenan pares clave-valor. Las claves deben ser únicas, aunque los valores pueden repetirse.

### Implementaciones:

#### **HashMap**
Un `HashMap` no mantiene un orden específico para las claves, pero es eficiente para buscar, agregar y eliminar elementos por clave.

##### Principales métodos de `HashMap`:
1. **`put(K clave, V valor)`**: Asocia el valor con la clave especificada.
2. **`get(Object clave)`**: Devuelve el valor asociado con la clave.
3. **`remove(Object clave)`**: Elimina el par clave-valor asociado con la clave.
4. **`containsKey(Object clave)`**: Verifica si existe una clave en el mapa.
5. **`size()`**: Devuelve el número de pares clave-valor.

##### Ejemplo de `HashMap`:
```java
import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();

        // Agregar pares clave-valor
        mapa.put(1, "Manzana");
        mapa.put(2, "Banana");

        // Acceder a un valor por su clave
        System.out.println("Valor de la clave 1: " + mapa.get(1));

        // Verificar si contiene una clave
        System.out.println("¿Contiene la clave 2? " + mapa.containsKey(2));

        // Tamaño del mapa
        System.out.println("Tamaño del mapa: " + mapa.size());
    }
}
```

#### **TreeMap**
Un `TreeMap` mantiene los pares clave-valor en orden basado en las claves.

##### Principales métodos de `TreeMap`:
1. **`put(K clave, V valor)`**: Inserta un par clave-valor y lo mantiene ordenado por clave.
2. **`get(Object clave)`**: Devuelve el valor asociado a la clave.
3. **`firstKey()`**: Devuelve la primera clave en el mapa.
4. **`lastKey()`**: Devuelve la última clave en el mapa.
5. **`size()`**: Devuelve el número de pares clave-valor en el mapa.

##### Ejemplo de `TreeMap`:
```java
import java.util.TreeMap;

public class EjemploTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> mapaOrdenado = new TreeMap<>();

        // Agregar pares clave-valor
        mapaOrdenado.put(3, "Naranja");
        mapaOrdenado.put(1, "Manzana");
        mapaOrdenado.put(2, "Banana");

        // Mostrar mapa ordenado
        System.out.println("TreeMap: " + mapaOrdenado);
    }
}
```

---



## Diferencias entre notaciones:
La diferencia principal entre las dos declaraciones:

1. **`List<String> nombres = new ArrayList<>();`**
2. **`ArrayList<String> nombres = new ArrayList<>();`**

reside en **cómo declaras la variable** y **qué nivel de abstracción** estás utilizando.

### 1. **`List<String> nombres = new ArrayList<>();`**
- Aquí estás declarando la variable `nombres` como una **interfaz** de tipo `List`.
- La instancia real es un `ArrayList`, pero al declarar la variable como `List`, estás **programando hacia una interfaz**.
- **Ventaja**: Si más adelante decides cambiar la implementación de la lista a otra clase que también implemente `List`, como `LinkedList`, solo necesitas cambiar la instancia de la derecha, sin afectar el resto de tu código.
  ```java
  List<String> nombres = new LinkedList<>();
  ```
- Esto te permite una mayor flexibilidad y hace que tu código sea más fácil de mantener y extender.

### 2. **`ArrayList<String> nombres = new ArrayList<>();`**
- En este caso, estás declarando la variable `nombres` directamente como una **clase concreta** (`ArrayList`).
- Estás restringiendo la variable a utilizar solo esa implementación específica de `ArrayList`.
- **Ventaja**: Si estás seguro de que siempre vas a usar `ArrayList` y no necesitas cambiar a otra implementación, esta declaración puede ser más explícita y clara en cuanto a qué tipo de lista estás utilizando.

### Resumen de las diferencias:

| **Característica**                     | **`List<String> nombres`**                       | **`ArrayList<String> nombres`**                   |
|----------------------------------------|--------------------------------------------------|---------------------------------------------------|
| **Tipo de variable**                   | Interfaz genérica `List`                         | Clase concreta `ArrayList`                        |
| **Flexibilidad**                       | Alta (puede cambiar fácilmente la implementación)| Baja (fija a `ArrayList`)                         |
| **Cambio de implementación**           | Fácil (puedes cambiar a cualquier clase que implemente `List`) | Difícil (solo puedes usar `ArrayList` o sus subclases) |
| **Recomendación**                      | Recomendado si puedes necesitar cambiar la implementación | Usado cuando estás seguro de que siempre será `ArrayList` |

### Ejemplo de flexibilidad:
Supongamos que más adelante decides que quieres cambiar la implementación a `LinkedList`. Con la declaración de la interfaz `List`, simplemente haces el siguiente cambio:

```java
List<String> nombres = new LinkedList<>();
```

Pero si usas `ArrayList<String> nombres`, entonces tendrías que cambiar tanto la parte de la declaración de la variable como la inicialización:

```java
import LIstListas.ArrayList;

ArrayList<String> nombres = new LinkedList<>();  // Esto no es válido, causa error.
```

### Conclusión:
- **`List<String> nombres = new ArrayList<>();`** es generalmente la mejor práctica porque te permite ser más flexible y trabajar con diferentes implementaciones de `List` sin tener que cambiar mucho tu código.
- **`ArrayList<String> nombres = new ArrayList<>();`** se usa cuando estás seguro de que no necesitarás cambiar la implementación de la lista y quieres ser explícito sobre la clase concreta que estás utilizando.

Ambas son correctas, pero la primera es más común y flexible.
## Resumen:

- **Listas (List)**: `ArrayList`, `LinkedList` - Almacenan elementos en orden y permiten duplicados.
- **Conjuntos (Set)**: `HashSet`, `TreeSet` - No permiten duplicados, y algunos mantienen un orden.
- **Colas (Queue)**: `PriorityQueue`, `ArrayDeque` - Siguen un principio FIFO o permiten manipulación en ambos extremos.
- **Mapas (Map)**: `HashMap`, `TreeMap` - Almacenan pares clave-valor, donde las claves son únicas.
  La expresión `List<String> nombres = new ArrayList<>();` en Java significa que estás creando una lista de tipo `String` utilizando la implementación de `ArrayList`.

