import java.util.concurrent.TimeUnit;

public class Addition {
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public void add(long a,long b){
        long c=a+b;
        System.out.println("Addition is: "+c);

    }
    public static void main(String[] args){
        long startTime = System.nanoTime();

        
        
        Addition a=new Addition();
        a.add(1232124567,789455612);  
       
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory is megabytes: "
                + bytesToMegabytes(memory));
       
        long endTime = System.nanoTime();
        long execution = (endTime - startTime);
		System.out.println("execution  "+execution+"ns");
        
       }  
    }
    
  

