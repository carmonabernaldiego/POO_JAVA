package listaEval2C;

public class ListaSimple<T> {
    private Nodo<T> head;
    private int contador;

    public ListaSimple(){
        head = new Nodo<>(null);
        contador = 0;
    }

    public void add(T data) {
        Nodo<T> temp = new Nodo<>(data);
        Nodo<T> actual = head;
        while (actual.getNext() != null) {
            actual = actual.getNext();
        }
        actual.setNext(temp);
        contador++;
    }

    public T get(int posicion){
        if (posicion < 0){
            return null;
        }
        if (posicion > contador){
            return null;
        }

        Nodo<T> actual = head.getNext();
        for (int i = 0; i < posicion; i++){
            if (actual.getNext() != null) {
                actual = actual.getNext();
            }
        }
        return actual.getData();
    }

    // Implementar contains, regresa la posicion donde
    // encuentre el primer objeto que sea igual
    public int contains(T o) {
        /*if (o == null) {
            for (int i = 0; i < size(); i++) {
                if (get(i) == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size(); i++) {
                if (o.equals(get(i))) {
                    return i;
                }
            }
        }
        return -1;*/

        //null [1, 2, 3, 4, 5] null
        int aux = 0;
        for(int i = 0; i < size(); i++){
            if(o.equals(this.get(i))){
                return aux;
            }

            aux++;
        }
        return -1;
    }

    public int size(){
        return contador;
    }

    public boolean isEmpty(){
        return head.getNext() == null;
    }

    private class Nodo<T>{
        private T data;
        private Nodo next;

        public Nodo(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Nodo getNext() {
            return next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }
    }
}