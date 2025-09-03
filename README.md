Basic Stream Operations

1. How to create a stream from a list?

List<String> list = Arrays.asList("a", "b", "c");
Stream<String> stream = list.stream()

2. How to filter elements in a stream?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream()
    .filter(n -> n % 2 == 0)
    .collect(Collectors.toList());
// Result: [2, 4]

3. How to transform elements using map

List<String> names = Arrays.asList("john", "jane", "doe");
List<String> upperCaseNames = names.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());
// Result: ["JOHN", "JANE", "DOE"]

4. How to sort elements in a stream?

List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
List<Integer> sortedNumbers = numbers.stream()
    .sorted()
    .collect(Collectors.toList());
// Result: [1, 2, 5, 8, 9]

5. How to limit the number of elements?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> limited = numbers.stream()
    .limit(3)
    .collect(Collectors.toList());
// Result: [1, 2, 3]

Intermediate Operations

6. How to skip elements in a stream?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> skipped = numbers.stream()
    .skip(2)
    .collect(Collectors.toList());
// Result: [3, 4, 5]

7. How to remove duplicates using distinct?

List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
List<Integer> distinctNumbers = numbers.stream()
    .distinct()
    .collect(Collectors.toList());
// Result: [1, 2, 3, 4, 5]

8. How to use flatMap to flatten nested collections?

List<List<String>> nestedList = Arrays.asList(
    Arrays.asList("a", "b"),
    Arrays.asList("c", "d")
);
List<String> flatList = nestedList.stream()
    .flatMap(List::stream)
    .collect(Collectors.toList());
// Result: ["a", "b", "c", "d"]

9. How to use peek for debugging?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> result = numbers.stream()
    .peek(n -> System.out.println("Processing: " + n))
    .map(n -> n * 2)
    .collect(Collectors.toList());

10. How to chain multiple operations?

List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
List<String> result = names.stream()
    .filter(name -> name.length() > 3)
    .map(String::toUpperCase)
    .sorted()
    .collect(Collectors.toList());
// Result: ["ALICE", "CHARLIE", "DAVID"]

Terminal Operations

11. How to collect to a list?

List<String> names = Arrays.asList("John", "Jane", "Doe");
List<String> result = names.stream()
    .collect(Collectors.toList());

12. How to collect to a set?

List<String> names = Arrays.asList("John", "Jane", "John");
Set<String> result = names.stream()
    .collect(Collectors.toSet());
// Result: ["John", "Jane"] (no duplicates)

13. How to join strings?

List<String> names = Arrays.asList("John", "Jane", "Doe");
String result = names.stream()
    .collect(Collectors.joining(", "));
// Result: "John, Jane, Doe"

14. How to count elements?

List<String> names = Arrays.asList("John", "Jane", "Doe");
long count = names.stream()
    .count();
// Result: 3

15. How to check if any element matches a condition?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
boolean hasEven = numbers.stream()
    .anyMatch(n -> n % 2 == 0);
// Result: true

16. How to check if all elements match a condition?

List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
boolean allEven = numbers.stream()
    .allMatch(n -> n % 2 == 0);
// Result: true

17. How to check if no elements match a condition?

List<Integer> numbers = Arrays.asList(1, 3, 5, 7);
boolean noneEven = numbers.stream()
    .noneMatch(n -> n % 2 == 0);
// Result: true

18. How to find the first element?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> firstEven = numbers.stream()
    .filter(n -> n % 2 == 0)
    .findFirst();
// Result: Optional[2]

19. How to find any element?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Optional<Integer> anyEven = numbers.stream()
    .filter(n -> n % 2 == 0)
    .findAny();
// Result: Optional[2] or Optional[4] (non-deterministic)

20. How to use forEach?

List<String> names = Arrays.asList("John", "Jane", "Doe");
names.stream()
    .forEach(System.out::println);

Numeric Stream Operations

21. How to calculate sum?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
    .mapToInt(Integer::intValue)
    .sum();
// Result: 15

22. How to find average?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
OptionalDouble average = numbers.stream()
    .mapToInt(Integer::intValue)
    .average();
// Result: OptionalDouble[3.0]

23. How to find maximum value?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
OptionalInt max = numbers.stream()
    .mapToInt(Integer::intValue)
    .max();
// Result: OptionalInt[5]

24. How to find minimum value?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
OptionalInt min = numbers.stream()
    .mapToInt(Integer::intValue)
    .min();
// Result: OptionalInt[1]

25. How to use range?

IntStream.range(1, 5) // 1 to 4 (exclusive)
    .forEach(System.out::println);

Advanced Operations

26. How to group elements?

List<String> names = Arrays.asList("John", "Jane", "Jack", "Diana");
Map<Integer, List<String>> groupedByLength = names.stream()
    .collect(Collectors.groupingBy(String::length));
// Result: {4=["John", "Jane", "Jack"], 5=["Diana"]}

27. How to partition elements?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Map<Boolean, List<Integer>> partitioned = numbers.stream()
    .collect(Collectors.partitioningBy(n -> n % 2 == 0));
// Result: {false=[1, 3, 5], true=[2, 4]}

28. How to create a map from a stream?

List<String> names = Arrays.asList("John", "Jane", "Doe");
Map<String, Integer> nameLengthMap = names.stream()
    .collect(Collectors.toMap(
        Function.identity(), // key
        String::length       // value
    ));
// Result: {John=4, Jane=4, Doe=3}

29. How to use reduce to accumulate values?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
    .reduce(0, Integer::sum);
// Result: 15

30. How to concatenate streams?

Stream<String> stream1 = Stream.of("A", "B", "C");
Stream<String> stream2 = Stream.of("D", "E", "F");
Stream<String> concatenated = Stream.concat(stream1, stream2);
// Result: ["A", "B", "C", "D", "E", "F"]

Specialized Streams

31. How to create a stream from an array?

String[] array = {"a", "b", "c"};
Stream<String> stream = Arrays.stream(array);

32. How to create a stream of primitive values?

IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0);

33. How to generate infinite streams?

Stream<Integer> infiniteStream = Stream.generate(() -> 1)
    .limit(5);
// Result: [1, 1, 1, 1, 1]

34. How to use iterate?

Stream<Integer> numbers = Stream.iterate(0, n -> n + 2)
    .limit(5);
// Result: [0, 2, 4, 6, 8]

35. How to create an empty stream?

Stream<String> emptyStream = Stream.empty();

Collectors

36. How to collect to a specific collection type?

List<String> names = Arrays.asList("John", "Jane", "Doe");
TreeSet<String> treeSet = names.stream()
    .collect(Collectors.toCollection(TreeSet::new));

37. How to calculate summary statistics?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
IntSummaryStatistics stats = numbers.stream()
    .mapToInt(Integer::intValue)
    .summaryStatistics();
// stats: count=5, sum=15, min=1, max=5, average=3.0

38. How to use collectingAndThen?

List<String> names = Arrays.asList("John", "Jane", "Doe");
List<String> unmodifiableList = names.stream()
    .collect(Collectors.collectingAndThen(
        Collectors.toList(),
        Collections::unmodifiableList
    ));

39. How to use mapping collector?

List<String> names = Arrays.asList("John", "Jane", "Doe");
List<Integer> nameLengths = names.stream()
    .collect(Collectors.mapping(
        String::length,
        Collectors.toList()
    ));
// Result: [4, 4, 3]

40. How to use filtering collector?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> evenNumbers = numbers.stream()
    .collect(Collectors.filtering(
        n -> n % 2 == 0,
        Collectors.toList()
    ));
// Result: [2, 4]

Parallel Streams

41. How to create a parallel stream?

List<String> names = Arrays.asList("John", "Jane", "Doe");
Stream<String> parallelStream = names.parallelStream();

42. How to convert between parallel and sequential?

List<String> names = Arrays.asList("John", "Jane", "Doe");
List<String> result = names.stream()
    .parallel()          // Convert to parallel
    .map(String::toUpperCase)
    .sequential()        // Convert back to sequential
    .collect(Collectors.toList());

Error Handling and Best Practices

43. How to handle null values?

List<String> names = Arrays.asList("John", null, "Doe");
List<String> nonNullNames = names.stream()
    .filter(Objects::nonNull)
    .collect(Collectors.toList());
// Result: ["John", "Doe"]

44. How to handle exceptions in streams?

List<String> numbers = Arrays.asList("1", "2", "abc", "4");
List<Integer> parsedNumbers = numbers.stream()
    .map(s -> {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return null;
        }
    })
    .filter(Objects::nonNull)
    .collect(Collectors.toList());
// Result: [1, 2, 4]

45. How to avoid modifying source collection?

List<String> original = Arrays.asList("a", "b", "c");
List<String> modified = original.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());
// original remains unchanged: ["a", "b", "c"]

Real-world Examples

46. How to find the most frequent element?

List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
String mostFrequent = words.stream()
    .collect(Collectors.groupingBy(
        Function.identity(),
        Collectors.counting()
    ))
    .entrySet().stream()
    .max(Map.Entry.comparingByValue())
    .map(Map.Entry::getKey)
    .orElse(null);
// Result: "apple"

47. How to sort map by value?

Map<String, Integer> map = Map.of("John", 25, "Jane", 30, "Doe", 20);
List<Map.Entry<String, Integer>> sorted = map.entrySet().stream()
    .sorted(Map.Entry.comparingByValue())
    .collect(Collectors.toList());
// Result: [Doe=20, John=25, Jane=30]

48. How to find duplicates?

List<String> names = Arrays.asList("John", "Jane", "John", "Doe", "Jane");
Set<String> duplicates = names.stream()
    .filter(name -> Collections.frequency(names, name) > 1)
    .collect(Collectors.toSet());
// Result: ["John", "Jane"]

49. How to reverse a list using streams?

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> reversed = numbers.stream()
    .collect(Collectors.collectingAndThen(
        Collectors.toList(),
        list -> {
            Collections.reverse(list);
            return list;
        }
    ));
// Result: [5, 4, 3, 2, 1]

50. How to find the longest string?

List<String> names = Arrays.asList("John", "Jane", "Christopher", "Doe");
Optional<String> longestName = names.stream()
    .max(Comparator.comparingInt(String::length));
// Result: Optional["Christopher"]
