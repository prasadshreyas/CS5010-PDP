import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import person.Book;
import person.Person;

/**
 * A JUnit test class for the Book class.
 */
public class BookTest {
  private Book book;
  private Person person;

  @Before
  public void setBook() {
    person = new Person("john", "doe", 1989);
    book = new Book("ABC", person, 10);
  }

  @Test
  public void testTitle() {
    assertEquals("ABC", book.getTitle());
  }

  @Test
  public void testAuthor() {
    assertEquals(person.getFirstName(), book.getAuthor().getFirstName());
    assertEquals(person.getLastName(), book.getAuthor().getLastName());
    assertEquals(person.getYearOfBirth(), book.getAuthor().getYearOfBirth());
  }

  @Test
  public void testPrice() {
    assertEquals(10, book.getPrice(), 0);
  }


}