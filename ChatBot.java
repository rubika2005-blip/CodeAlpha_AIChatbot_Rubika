public class ChatBot {
    public String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hi") || input.contains("hello")) {
            return "Hey there! 👋 How can I help you?";
        } else if (input.contains("your name")) {
            return "I'm CodeAlphaBot 🤖, your Java helper!";
        } else if (input.contains("help")) {
            return "Sure! You can ask me about Java, projects, or internship info.";
        } else if (input.contains("time")) {
            return java.time.LocalTime.now().toString();
        } else if (input.contains("date")) {
            return java.time.LocalDate.now().toString();
        } else if (input.contains("bye")) {
            return "Bye! Take care 🌸";
        } else {
            return "Hmm... I’m still learning! Can you rephrase that?";
        }
    }
}
