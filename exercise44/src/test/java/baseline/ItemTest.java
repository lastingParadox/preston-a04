package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void toStringTest() {
        //Verifies that Item's overridden toString() method works as intended.
        Item testItem = new Item("Orange", 10.00, 5);

        String expected = String.format("Name: Orange%nPrice: 10.00%nQuantity: 5%n");
        String actual = testItem.toString();

        assertEquals(expected, actual);
    }

}