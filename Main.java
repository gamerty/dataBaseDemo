public class Main {

    public static void main(String[] args) {

        GenericClass<String> s = new GenericClass<>("Ukraine");
        GenericClass<Integer> i = new GenericClass<>(11);
        ObjectClass obj = new ObjectClass(5555.444);

        obj.getType(obj);


//        GenericClass<Object> obj1 = new GenericClass<>("242323");
//        GenericClass<Object> obj2 = new GenericClass<>(11);
//
//        String string;
//        string = obj1.toString();
//        string = obj2.toString();
//        obj2.setData(112.4555);
//        System.out.println(obj2.getData());

    }
}
