public class Main {
    public static void main(String[] args)  {
        StopWatch a = new StopWatch();
        a.start();
        int[] b = new int[100000];

        for (int i = 0; i < 100000 ; i++) {
            b[i] = i;
        }
        for (int i = 0; i <b.length - 1; i++) {
            for (int j = i+1; j < b.length; j++) {
                if(b[i] > b[j]){
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = b[i];
                }
            }
        }
        a.end();
        System.out.println(a.getElapsedTime());
    }
}
