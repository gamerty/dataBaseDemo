/**
 * Created by AmoGameRTY on 30.03.2016.
 */
public class ObjectClass {

    Object object;

    public ObjectClass(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void showData(Object data) {
        System.out.println(data);
    }

    public void getType(Object object) {
        System.out.println(object);
    }
}
