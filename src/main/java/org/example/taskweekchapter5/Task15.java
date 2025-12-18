package org.example.taskweekchapter5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Task15 {
    public static void main(String[] args) throws IOException {
        List<String> str = Arrays.asList("Привет", "Я учусь Java!");

        String htmlStart = """
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Протокол</title>
</head>
<body>
<h1>Журнал записей</h1>
""";

        String htmlEnd = """
</body>
</html>
""";

        StringBuilder html = new StringBuilder();
        html.append(htmlStart);

        for (String s : str) {
            html.append("<div>").append(s).append("</div>\n");
        }

        html.append(htmlEnd);

        Files.write(Paths.get("log.html"), html.toString().getBytes());
    }
}
