import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    private static final Map<String, Character> MORSE_CODES = Stream.of(new Object[][]{
        {".-", 'a'}, {"-...", 'b'}, {"-.-.", 'c'}, {"-..", 'd'}, {".", 'e'},
        {"..-.", 'f'}, {"--.", 'g'}, {"....", 'h'}, {"..", 'i'}, {".---", 'j'},
        {"-.-", 'k'}, {".-..", 'l'}, {"--", 'm'}, {"-.", 'n'}, {"---", 'o'},
        {".--.", 'p'}, {"--.-", 'q'}, {".-.", 'r'}, {"...", 's'}, {"-", 't'},
        {"..-", 'u'}, {"...-", 'v'}, {".--", 'w'}, {"-..-", 'x'}, {"-.--", 'y'},
        {"--..", 'z'}
    }).collect(Collectors.toUnmodifiableMap(data -> (String) data[0], data -> (Character) data[1]));

    public String solution(String letter) {
        return Stream.of(letter.split(" "))
                     .map(MORSE_CODES::get)
                     .map(String::valueOf)
                     .collect(Collectors.joining());
    }
}
