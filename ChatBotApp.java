import java.util.Scanner;

public class ChatBotApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatBot bot = new ChatBot();

        System.out.println("🤖 Welcome to CodeAlpha Java ChatBot!");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("Bot: " + bot.getResponse(userInput));
                break;
            }

            String response = bot.getResponse(userInput);
            System.out.println("Bot: " + response);
        }

        scanner.close();
    }
}
