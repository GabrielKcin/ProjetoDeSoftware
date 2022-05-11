import java.util.Scanner;

public class LimparBuffer
{
    public void clearBuffer(Scanner scanner)
    {
        if (scanner.hasNextLine())
        {
            scanner.nextLine();
        }
    }
}
