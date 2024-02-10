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

    default int perimeterRectangle(int a, int b) {
        return ((a * a) + (b * b));
    }

    default int areaRectangle(int a, int b) {
        return (a * b);
    }
}
interface Triangle {

    default int perimeterTriangle(int a, int b, int c) {
        return (a + b + c);
    }

    default int areaTriangle(int a, int b) {
        return ((a * b) / 2);
    }
}


