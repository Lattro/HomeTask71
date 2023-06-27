import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main
{
    public static void main(String[] args)
    {
        File direct1 = new File("D:Games");
        System.out.println(direct1.getName());
        if(direct1.isDirectory())
        {
            System.out.println("Директория");
        }
        else
        {
            System.out.println("Не директория");
        }
        System.out.println("Длина - "+direct1.length());
        System.out.println("Абсолютный путь - "+direct1.getAbsolutePath());
        System.out.println();

        File direct2 = new File("D:Games\\Diablo III");
        System.out.println(direct2.getName());
        if(direct2.isDirectory())
        {
            System.out.println("Директория");
        }
        else
        {
            System.out.println("Не директория");
        }
        System.out.println("Длина - "+direct2.length());
        System.out.println("Абсолютный путь - "+direct2.getAbsolutePath());
        System.out.println();

        File direct3 = new File("D:Games\\God of War");
        System.out.println(direct3.getName());
        if(direct3.isDirectory())
        {
            System.out.println("Директория");
        }
        else
        {
            System.out.println("Не директория");
        }
        System.out.println("Длина - "+direct3.length());
        System.out.println("Абсолютный путь - "+direct3.getAbsolutePath());
        System.out.println();

        File file1 = new File("D:Games\\God of War\\libSceJobManager.dll");
        System.out.println(file1.getName());
        if(file1.isDirectory())
        {
            System.out.println("Директория");
        }
        else
        {
            System.out.println("Не директория");
        }
        System.out.println("Длина - "+file1.length());
        System.out.println("Абсолютный путь - "+file1.getAbsolutePath());
        System.out.println();

        File file2 = new File("D:\\Games\\Diablo III\\.build.info");
        System.out.println(file2.getName());
        if(file2.isDirectory())
        {
            System.out.println("Директория");
        }
        else
        {
            System.out.println("Не директория");
        }
        System.out.println("Длина - "+file2.length());
        System.out.println("Абсолютный путь - "+file2.getAbsolutePath());
        System.out.println();

        File file3 = new File("D:\\Games\\Elden Ring\\unins000.exe");
        System.out.println(file3.getName());
        if(file3.isDirectory())
        {
            System.out.println("Директория");
        }
        else
        {
            System.out.println("Не директория");
        }
        System.out.println("Длина - "+file3.length());
        System.out.println("Абсолютный путь - "+file3.getAbsolutePath());

    }
}
