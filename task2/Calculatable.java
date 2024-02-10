package task2;

interface Circle {

    default double lengthCircle( double pi, int r) {
        return ((2 * pi) * r);
    }
    default double areaCircle ( double pi, int r){
            return ((r * r) * pi);
    }

}
interface Rectangle {

    default double perimeterRectangle(int a, int b) {
        return ((a * a) + (b * b));
    }

    default double areaRectangle(int a, int b) {
        return (a * b);
    }
}
interface Triangle {

    default double perimeterTriangle(int a, int b, int c) {
        return (a + b + c);
    }

    default double areaTriangle(int a, int b) {
        return ((a * b) / 2);
    }
}


