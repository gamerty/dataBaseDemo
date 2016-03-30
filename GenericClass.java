/**
 * Created by AmoGameRTY on 30.03.2016.
 */
public class GenericClass<T> {

    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void showData(T data) {
        System.out.println(data);
    }

}