import java.io.*;
import java.util.*;


public class MyIo
{

    enum Color
    {
        RED, GREEN, BLUE;

        // 构造函数
        private Color()
        {
            System.out.println("Constructor called for : " + this.toString());
        }

        public void colorInfo()
        {
            System.out.println("Universal Color");
        }
    }

    public MyIo(  )
    {

    }

    public static void main( String[] args )
    {
        // 打印命令行参数
        for (String arg : args) {
            System.out.println("打印命令行参数： " + arg);
        }

        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();

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
//         String[] fileTextArr = readFileByLines("D:\\study\\java\\project\\read.log");

        // 写文件
//         writeToFile(fileTextArr, "D:\\study\\java\\project\\write.log");

        // 接受命令行输入,判断是否输入整数
//         inputCmd();

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


    /**
     * 读取文件
     * String fileName
     */
    public static String[] readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        String[] fileTextArr = new String[10];
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 0;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                fileTextArr[line] = tempString;
                System.out.println("line " + (line+1) + ": " + tempString);
                line++;
            }
            reader.close();
            System.out.println("文本内容 " + Arrays.toString(fileTextArr));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return fileTextArr;
    }


    /**
     * 将字符写入文件
     * String[] fileTextArr
     * String fileName
     */
    public static void writeToFile(String[] fileTextArr ,String fileName) {
        try {

            File f = new File(fileName);

            System.out.println("返回此抽象路径名的路径名字符串。"+f.toString()+"\r\n"
            +"返回由此抽象路径名表示的文件或目录的名称。"+f.getName()+"\r\n"
            +"将此抽象路径名转换为一个路径名字符串。"+f.getPath()+"\r\n");
            OutputStream fop = new FileOutputStream(f, true);
            // 构建FileOutputStream对象,文件不存在会自动新建

            OutputStreamWriter out = new OutputStreamWriter(fop, "UTF-8");
            // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

            for ( String text: fileTextArr ) {
                out.append(text);
                out.append("\r\n");
            }

            out.close();
            // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

            fop.close();
            // 关闭输出流,释放系统资源

        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println("error is"+e.getMessage());
        }

    }


    /**
     * 接受命令行输入,判断是否输入整数
     */
    public static void inputCmd() {

        boolean bool = true;
        Scanner scan = new Scanner(System.in);
        while (bool) {
            bool = hasInputInt(scan);
        }

    }


    /**
     * 判断是否输入整数
     * Scanner scan
     * @return boolean
     */
    public static boolean hasInputInt( Scanner scan ) {
        System.out.print("请输入整数：");
        int n = 0;
        if (scan.hasNextInt()) {
            // 判断输入的是否是整数
            n = scan.nextInt();
            System.out.println("整数数据：" + n);
            scan.close();
            return false;
        } else {
            // 输入错误的信息
            String str = scan.nextLine();
            System.out.println("输入的不是整数！输入的是："+str);
            return true;
        }
    }


    // 它在对象被垃圾收集器析构(回收)之前调用
    protected  void finalize() {

    }

}
