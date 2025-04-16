public class Main {

    public static void main(String[] args) throws InterruptedException {
        String[] treeStages = {
                "     |\n     |",
                "     |\n     |\n     |",
                "     |\n     |\n    /|\\",
                "     |\n     |\n   //|\\\\",
                "     |\n    /|\\\n  ///|\\\\\\",
                "    \\ | /\n     \\|/\n     |\n    /|\\\n  ///|\\\\\\",
                "     🌿\n    \\|/\n     |\n    /|\\\n  ///|\\\\\\\n     |"
        };

        int totalDuration = 40_000; // în milisecunde
        int steps = treeStages.length;
        int delay = totalDuration / steps;

        for (int i = 0; i < steps; i++) {
            clearConsole();
            System.out.println(treeStages[i]);
            Thread.sleep(delay);
        }

        // Mesaj final
        clearConsole();
        System.out.println("\n\n Bucurați-vă de copilărie cât mai puteți! \n");
    }

    // Metodă pentru „curățarea” consolei
    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (Exception e) {
            // Dacă nu putem curăța, măcar să facem spațiu
            for (int i = 0; i < 50; ++i) System.out.println();
        }
    }
}