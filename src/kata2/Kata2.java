package kata2;
public class Kata2 {
    public static void main(String[] args) {
        /*
        Dado un vector de enteros
        hacer un histograma con las
        ocurrencias de cada número
        */
        int[] array = {2,3,3,3,3,3,3,5,6,7,4,23,2,3,4,2,1,1,2221,1};
        Histogram histogram = new Histogram();
        histogram.fillHistogram(array);
//        histogram.iterateHistogram();
        System.out.println(histogram.maxOcurrences());
        System.out.println(histogram.Ocurrences());
    }
}
