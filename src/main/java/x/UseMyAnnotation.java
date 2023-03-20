package x;

@MyAnnotation(getValue = "anno on class")
public class UseMyAnnotation {

    @MyAnnotation(getValue = "anno on field")
    public String name;

    @MyAnnotation(getValue = "anno on method")
    public void hello(){}

    @MyAnnotation()
    public void defaultMethod(){}

}
