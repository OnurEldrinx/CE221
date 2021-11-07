public class GenericMemoryCell <T>{


    public T storedValue;

    public T read(){

        return storedValue;

    }

    public void  write(T x){

        storedValue = x;

    }

}
