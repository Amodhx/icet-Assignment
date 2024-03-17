import java.util.*;

class Main {
    public static void main(String args[]) {
        System.out.println("==================================================================================== ");
        System.out.println("__          __  _                             _           _ __  __            _  ");
        System.out.println("\\ \\        / / | |                           | |         (_)  \\/  |          | |");
        System.out.println(" \\ \\  /\\  / /| | ___ ___  _ __ ___   ___   | |_ ___     | \\  / | __ _ _ __| | ");
        System.out.println("  \\ \\/  \\/ / _ \\ |/ _/ _ \\| '  '_ \\ / _ \\  | _/ _ \\   | | |\\/| |/ _' | '_| __| ");
        System.out.println("   \\  /\\  /  _/ | (| () | | | | | |  __/  | || () |  | | |  | | (| | |  | | ");
        System.out.println("    \\/  \\/ \\||\\\\/|| || ||\\|   \\\\/   |||  ||\\,||   \\| ");
        System.out.println();
        System.out.println("====================================================================================  ");

        Scanner input = new Scanner(System.in);
        String x, y;
        System.out.print("Enter Customer Phone Number -");
        x = input.nextLine();
        System.out.println();
        System.out.print("Enter Customer Name-");
        y = input.nextLine();
        System.out.println();


        Scanner Qty = new Scanner(System.in);
        int a, b, c, d, e, f, g;

        System.out.print("Basmathi Qty(Kg)-");
        a = input.nextInt();
        System.out.println();

        System.out.print("Dhal Qty(Kg)-");
        b = input.nextInt();
        System.out.println();

        System.out.print("Sugar Qty(Kg)-");
        c = input.nextInt();
        System.out.println();

        System.out.print("Highland Qty(Kg)-");
        d = input.nextInt();
        System.out.println();

        System.out.print("Yoghurt Qty(Kg)-");
        e = input.nextInt();
        System.out.println();

        System.out.print("Flour Qty(Kg)-");
        f = input.nextInt();
        System.out.println();

        System.out.print("Soap Qty(Kg)-");
        g = input.nextInt();
        System.out.println();

        Double j = 250.0;
        Double k = 180.0;
        Double l = 150.0;
        Double m = 1200.0;
        Double n = 50.0;
        Double o = 120.0;
        Double p = 160.0;

        Double q = a * j;
        Double r = b * k;
        Double s = c * l;
        Double t = d * m;
        Double u = e * n;
        Double v = f * o;
        Double w = g * p;

        Double z = q + r + s + t + u + v + w;
        Double h = z * 0.10;
        Double i = z - h;


        System.out.println("+----------------------------------------------------------------------------------+  ");
        System.out.println("|                                                                                  |  ");
        System.out.println("|                         _ __  __            _                                    |  ");
        System.out.println("|                        (_)  \\/  |          | |                                   |  ");
        System.out.println("|                         | \\  / | __ _ _ __| |                                  |  ");
        System.out.println("|                        | | |\\/| |/ ' | '_| __|                                 |  ");
        System.out.println("|                        | | |  | | (| | |  | |                                  |  ");
        System.out.println("|                        |||  ||\\,||   \\_|                                 |  ");
        System.out.println("|                            225,Galle Road,Panadura.                              |  ");
        System.out.println("|                                                                                  |  ");
        System.out.println("+----------------------------------------------------------------------------------+  ");

        System.out.printf("|                                # Tel    : %-27s           |%n", x);
        System.out.printf("|                               # Name   : %-27s           |%n", y);
        System.out.println("+-------------------+------------+---------------------+---------------------------+  ");
        System.out.println("|                   |    Qty     |     Unit Price      |           Price           |  ");
        System.out.println("+----------------------------------------------------------------------------------+  ");
        System.out.println("|                   |            |                     |                           |  ");

        System.out.printf("|    # Basmathi     |      %-6d|        %-7.1f      |         %-8.1f          |%n", a, j, q);

        System.out.println("|                   |            |                     |                           |  ");
        System.out.printf("|    # Dhal         |      %-6d|        %-7.1f      |         %-8.1f          |%n", b, k, r);

        System.out.println("|                   |            |                     |                           |  ");
        System.out.printf("|    # Sugar        |      %-6d|        %-7.1f      |         %-8.1f          |%n", c, l, s);

        System.out.println("|                   |            |                     |                           |  ");
        System.out.printf("|    # Highland     |      %-6d|        %-7.1f      |         %-8.1f          |%n", d, m, t);


        System.out.println("|                   |            |                     |                           |  ");
        System.out.printf("|    # Yoghurt      |      %-6d|        %-7.1f      |         %-8.1f          |%n", e, n, u);

        System.out.println("|                   |            |                     |                           |  ");
        System.out.printf("|    # Flour        |      %-6d|        %-7.1f      |         %-8.1f          |%n", f, o, v);

        System.out.println("|                   |            |                     |                           |  ");
        System.out.printf("|    # Soap         |      %-6d|        %-7.1f      |         %-8.1f          |%n", g, p, w);


        System.out.println("+-------------------+------------+---------------------+---------------------------+  ");
        System.out.printf("|                                |        Total        |          %-8.1f        |%n", z);


        System.out.println("|                                +---------------------+---------------------------+  ");

        System.out.printf("|                                |        Price        |          %-8.1f        |%n", i);

        System.out.printf("|                                |        Discount(10%%)        |          %-8.1f        |%n", i);

        System.out.println("|                                +---------------------+---------------------------+  ");
        System.out.printf("|                                |        Price        |          %-8.1f        |%n", i);

        System.out.println("|--------------------------------+---------------------+---------------------------+  ");

    }
}