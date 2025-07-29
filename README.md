# 🤖 CodeAlpha – AI Chatbot (Task 3)

This project is part of my **Java Internship at CodeAlpha**.  
The **AI Chatbot** is a simple, console-based Java program that interacts with users based on predefined responses.

---

## 📌 Project Description

The chatbot:
- Greets the user
- Answers basic questions like name, help, date, and time
- Responds to unknown inputs with default messages
- Exits gracefully when the user types 'bye'

---

## 🛠 Technologies Used

- Java (JDK 17+)
- Visual Studio Code
- OOP Concepts (Classes, Methods)
- Scanner for User Input
- Date & Time API

---

## 🧠 How It Works

- User types a message
- ChatBot reads the input and converts it to lowercase
- Logic inside `getResponse()` matches keywords and responds accordingly
- Runs in a loop until the user says "bye"

---

## 🗂 Project Structure

```bash
|-- ChatBotApp.java   # Main program with loop and input
|-- ChatBot.java      # Contains response logic
|-- README.md
