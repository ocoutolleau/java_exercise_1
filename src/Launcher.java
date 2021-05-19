import java.util.*;
import java.util.stream.Collectors;

public class Launcher {
    public static void main(String[] args) {
        List<Command> commands = List.of(new Quit(), new Fibo());
        Map<String, Command> commandByName = commands.stream().collect(Collectors.toMap(c -> c.name(), c-> c));

        System.out.println("coucou");

        Scanner scanner = new Scanner(System.in);
        boolean shouldQuit = false;
        do {
            System.out.println("Please, input a command:");
            String userInput = scanner.nextLine();
            Command command = commandByName.get(userInput);

            if (command == null){
                System.out.println("Unknown command");
            } else {
                shouldQuit = command.run(scanner);
            }
        } while (!shouldQuit);
    }
}