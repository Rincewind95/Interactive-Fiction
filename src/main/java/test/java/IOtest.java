package test.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import jline.console.ConsoleReader;
import jline.console.completer.*;
import standard.engine.FinalCompleter;

public class IOtest
{
    public static void usage() {
        System.out.println("Usage: java " + IOtest.class.getName()
                + " [none/simple/files/dictionary [trigger mask]]");
        System.out.println("  none - no completors");
        System.out.println("  simple - a simple completor that comples "
                + "\"foo\", \"bar\", and \"baz\"");
        System.out
                .println("  files - a completor that comples " + "file names");
        System.out.println("  classes - a completor that comples "
                + "java class names");
        System.out
                .println("  trigger - a special word which causes it to assume "
                        + "the next line is a password");
        System.out.println("  mask - is the character to print in place of "
                + "the actual password character");
        System.out.println("  color - colored prompt and feedback");
        System.out.println("\n  E.g - java Example simple su '*'\n"
                + "will use the simple compleator with 'su' triggering\n"
                + "the use of '*' as a password mask.");
    }

    public static void main(String[] args) throws IOException {
        try {
            Character mask = null;
            String trigger = null;
            boolean color = false;

            ConsoleReader reader = new ConsoleReader();

            reader.setPrompt("> ");

            if ((args == null) || (args.length == 0)) {
                usage();

                return;
            }

            List<Completer> completors = new LinkedList<Completer>();

            ArrayList<String> suggestions = new ArrayList<>();
            suggestions.add("test");
            suggestions.add("testing");
            suggestions.add("this is testy");

            completors.add(new FinalCompleter(suggestions));

            if (args.length == 3) {
                mask = args[2].charAt(0);
                trigger = args[1];
            }

            for (Completer c : completors) {
                reader.addCompleter(c);
            }

            String line;
            PrintWriter out = new PrintWriter(reader.getOutput());

            while ((line = reader.readLine()) != null) {
                if (color){
                    out.println("\u001B[33m======>\u001B[0m\"" + line + "\"");

                } else {
                    out.println("======>\"" + line + "\"");
                }
                out.flush();

                // If we input the special word then we will mask
                // the next line.
                if ((trigger != null) && (line.compareTo(trigger) == 0)) {
                    line = reader.readLine("password> ", mask);
                }
                if (line.equalsIgnoreCase("quit") || line.equalsIgnoreCase("exit")) {
                    break;
                }
                if (line.equalsIgnoreCase("cls")) {
                    reader.readCharacter();
                    reader.clearScreen();
                    reader.flush();
                }
            }
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }


}
