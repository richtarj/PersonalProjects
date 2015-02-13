package CardGameLibrary;
import java.util.Random;

public class Shuffle<T> {
	Random _random = new Random();
	
	//Knuth/Fisher-Yates algorithm taken directly from dotnetperls.com
	public void shuffle(T[] array)
    {
	int n = array.length;
	for (int i = 0; i < n; i++)
	{
	    // nextFloat returns a random number between 0 and 1.
	    // ... It is equivalent to Math.random() in Java.
	    int r = i + (int)(_random.nextFloat() * (n - i));
	    T t = array[r];
	    array[r] = array[i];
	    array[i] = t;
	}
    }

}
