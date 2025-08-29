package org.example;

public class Main {
    public static void main(String[] args) {
        ReplyService service = new ReplyService();

        System.out.println(service.reply("hi", ReplyType.FORMAL));
        System.out.println(service.reply("hello", ReplyType.FRIENDLY));
        System.out.println(service.reply("how are you", ReplyType.CONCISE));
        System.out.println(service.reply("i need help", ReplyType.FORMAL));
        System.out.println(service.reply("thanks", ReplyType.FRIENDLY));
        System.out.println(service.reply("bye", ReplyType.CONCISE));
        System.out.println(service.reply("what is your name", ReplyType.FORMAL));
        System.out.println(service.reply("random text", ReplyType.CONCISE));
        System.out.println(service.reply("   ", ReplyType.FRIENDLY)); // blank input
    }
}
