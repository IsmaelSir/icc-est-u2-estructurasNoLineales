# Árboles Binarios - Ejercicios 1, 2 y 4

Este repositorio contiene implementaciones de ejercicios relacionados con árboles binarios. A continuación se describen los ejercicios y cómo funcionan.

## Ejercicio 1: Insertar en un Árbol Binario (InsertBSTTest)

En este ejercicio, se implementa un **Árbol Binario de Búsqueda (BST)**. La principal funcionalidad del BST es insertar valores en el árbol siguiendo una estructura jerárquica, de acuerdo con las siguientes reglas:

- Los valores menores que el nodo actual se insertan en el subárbol izquierdo.
- Los valores mayores que el nodo actual se insertan en el subárbol derecho.

**Funcionamiento**:
- **Inserción**: El árbol comienza vacío. A medida que se insertan los valores, el árbol se construye siguiendo las reglas de un árbol binario de búsqueda. El proceso de inserción se realiza de manera recursiva, comparando el valor a insertar con el valor del nodo actual.
- **Impresión del árbol**: Después de insertar los valores, el árbol se imprime en un formato estructurado que muestra claramente las relaciones entre nodos, utilizando una representación gráfica del árbol.

## Ejercicio 2: Invertir un Árbol Binario (InvertBinaryTree)

Este ejercicio tiene como objetivo **invertir un árbol binario**, lo que significa que para cada nodo del árbol, se intercambian sus hijos izquierdo y derecho.

**Funcionamiento**:
- **Inserción**: El árbol binario se construye de manera similar al ejercicio 1, insertando los valores en el árbol siguiendo las reglas del árbol binario de búsqueda.
- **Inversión del árbol**: La inversión se realiza recursivamente. Para cada nodo, se intercambian sus hijos izquierdo y derecho. Este proceso se repite para todos los nodos hasta que todo el árbol esté invertido.
- **Recursión**: El algoritmo de inversión utiliza recursión para recorrer todos los nodos y aplicar la inversión a cada uno.

## Ejercicio 4: Obtener la Profundidad de un Árbol Binario (Depth)

Este ejercicio tiene como objetivo calcular la **profundidad máxima** (o altura) de un árbol binario, que corresponde al número máximo de nodos en el camino más largo desde la raíz hasta una hoja.

**Funcionamiento**:
- **Inserción**: Al igual que en los ejercicios anteriores, se insertan los valores en el árbol binario de búsqueda.
- **Cálculo de la profundidad**: Para calcular la profundidad, se utiliza un enfoque recursivo. Para cada nodo, se calcula la profundidad de los subárboles izquierdo y derecho. La profundidad del nodo actual es el valor máximo entre ambas profundidades más uno. La recursión se repite hasta llegar a las hojas del árbol, proporcionando la profundidad total.
- **Recursión**: La función recursiva asegura que todos los nodos sean visitados, y se obtiene la profundidad máxima a partir de las hojas del árbol.

## Uso

1. Clona este repositorio a tu máquina local.
2. Importa las clases en tu proyecto de Java.
3. Ejecuta los métodos según sea necesario para insertar, invertir y obtener la profundidad de los árboles binarios.
4. Observa cómo los resultados cambian al insertar diferentes valores.
