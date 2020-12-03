import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyIo
{

    public MyIo(  )
    {

    }

    public static void main( String[] args )
    {

        // 使用 System.in 创建 BufferedReader
        BufferedReader bf = new BufferedReader(
                new InputStreamReader(System.in)
        );

        // 从控制台读取多字符输入
        // readMoreChar(bf);
        // readMoreChar2(bf);

        // 从控制台读取字符串
        // readStrLine(bf);

        // 向控制台输出
        // writeToTerim();

        // 读取文件
        readFile();
        
    }

    /**
     * 从控制台读取多字符输入
     * BufferedReader bf
     */
    public static void readMoreChar(BufferedReader bf) {
        char c;

        System.out.println("输入字符, 按下 'q' 键退出。");

        try {
            do {
                c = (char) bf.read();
                System.out.println(c);
            }while (c != 'q');
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 从控制台读取多字符输入2
     * BufferedReader bf
     */
    public static void writeToTerim() {
        int b;
        b = 'A';
        System.out.write(b);
        System.out.write('\n');
    }


    /**
     * 获取控制台输入的内容
     * BufferedReader bf
     */
    public static void readMoreChar2(BufferedReader bf) {
        String read = null;
        System.out.print("请输入数据：");
        try {
            read = bf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("输入的数据为："+read);
    }


    /**
     * 从控制台读取字符串
     * BufferedReader bf
     */
    public static void readStrLine(BufferedReader bf) {
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        try {
            do {
                str = bf.readLine();
                System.out.println(str);
            }while ( !str.equals("end") );
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void readFile()
    {

    }

}
