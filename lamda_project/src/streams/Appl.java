package streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Appl {
	public static void main(String[] args) {
		
		
		/*IntStream
		 .range(1,10)
		 .forEach(x) -> System.out.println(x));
	System.out.println();
	
	IntStream
	 .range(1,10)
	 skip(5)
	 .forEach(x) -> System.out.println(x));
System.out.println();
*/

// Int stream with sum

int value = IntStream
.range(1, 5)
.sum();
System.out.println(value);

//stream of sorted and find first

Stream.of("Hello", "Bottle", "Africa")
.sorted()
.findFirst();
ifPresent((x) ->System.out.println(x));

//stream from array, sort, filter and print

String[] items = {"car", "computer", "toothpaste", "box", "pencil","tent","door", "toy"};
Streams.of(items)
 
 .sorted().filter(x-> x.startsWith("t"))
 .forEach(x -> System.out.println(x + " "));
 System.out.println();
 
 
 //average of squares of int array
 Arrays.stream(new int[] {1,2,5,78,98})
 .map((x) ->x*x)
 .average()
 .ifPresent(n -> System.out.println(x));
 
 System.out.println();
 
 
 
// streams of list version
List<String>  listOfItems = Arrays.asList{"car", "computer", "toothpaste", "box", "pencil","tent","door", "toy"};
listOfItems.stream()
 .map(x->x.toLowerCase())
 .filter(x ->x.startswith("c"))
 .sorted()
 .forEach(x -> System.out.println(x + " "));
 System.out.println();
 
// accessing the file data
 
 Stream <String> lines = Files.lines(Path.get("File.wordFile.txt"));  // It will throw IO exception
 lines.sorted()
 .filter(l ->l.length() >6 )
 forEach(x -> System.out.println(x+ " "));
 lines.close();
	
 List<String> words = File.lines(Paths.get("File.wordFile.txt"))
		 .filter(x -> x.contains("th"))
		 .collect(Collectors.toList());
 words.forEach(x -> System.out.println(x + " ,"));
 System.out.println();
 
 
 
 Stream<String> rows = File.lines(Paths.get("File/StockdataCsv.txt"));
 int rowCount = (int) rows
		 .map(x -> x.split(","))
		 .filter(x-> x.length>3)
		 .count();
 System.out.println(rowCount + " good rows: ");
 rows.close();
 
 Stream<String> rows = File.lines(Paths.get("File/StockdataCsv.txt"));
 rows.map(x ->x.spilt(","))
 .filter(x -> x.length>3)
 .forEach(x -> System.out.println(x[0].trim() + " "+x[2].trim() + " "+x[3].trim()));
 rows.close();
 
 
 
	}
 
 

 
	}


