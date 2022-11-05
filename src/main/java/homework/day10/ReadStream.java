package homework.day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadStream {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("stream.txt");
        Stream<String> lineStream = Files.lines(path);
        List<String> lines = lineStream.collect(Collectors.toList());
        Date date = new Date();

        System.out.println(lines.stream().skip(4)
                .filter(x -> x.startsWith("Date log:")).map(x -> x.substring(0, 20)).map(x -> x + " " + date)
                .collect(Collectors.joining("<br>", "", "")));

    }
}
