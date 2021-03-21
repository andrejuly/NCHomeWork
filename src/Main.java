import com.ulyanovcompany.task3.Employee;
import com.ulyanovcompany.task4.Author;
import com.ulyanovcompany.task4.Book;
import com.ulyanovcompany.task5.MyPoint;
import com.ulyanovcompany.task6.MyTriangle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(new Employee(1, "andrey", "anov", 12222));
        Author[] authors = new Author[3];
        authors[0] = new Author("andrey", "fdsad@ya.ru", 'm');
        authors[1] = new Author("andrey1", "1fdsad@ya.ru", 'm');
        authors[2] = new Author("andrey2", "2fdsad@ya.ru", 'g');
        for (Author autor : authors) {
            System.out.println(autor);
        }
        Book book = new Book("Potter", authors, 120.3, 12);
        System.out.println(book);
        System.out.println(book.getAuthorNames());
        MyPoint myPoint = new MyPoint(1,5);
        System.out.println(myPoint);
        MyTriangle myTriangle = new MyTriangle(1,2,3,4,5,6);
        System.out.println(myTriangle);
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());
    }
}
