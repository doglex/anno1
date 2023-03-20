package x;

public @interface MyAnnotationTypes {
    int intValues();
    long longValues();
    String name();
    CityEnum cityNames();
    Class clazz();
    MyAnnotation2  annotation2();
    int [] intValueArray();
    String [] names();
}

@interface MyAnnotation2 {}
enum CityEnum {
    HZ,
    NB,
    SH
}