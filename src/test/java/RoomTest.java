import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room1;
    Room room2;
    Room room3;
    Room room4;

    @Before
    public void before(){
        room1 = new Room(RoomType.SINGLE);
        room2 = new Room(RoomType.DOUBLE);
        room3 = new Room(RoomType.TWIN);
        room4 = new Room(RoomType.FAMILY);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, room2.getRoomType());
    }

    @Test
    public void singleHasValue1(){
        assertEquals(1, room1.getValueFromEnum());
    }
    @Test
    public void doubleHasValue2(){
        assertEquals(2, room2.getValueFromEnum());
    }
    @Test
    public void twinHasValue3(){
        assertEquals(3, room3.getValueFromEnum());
    }
    @Test
    public void familyHasValue4(){
        assertEquals(4, room4.getValueFromEnum());
    }

//    @Test
//    public void roomTypeCanBeMisspelled(){
//        room = new Room("Dooooooble");
//        assertEquals("Dooooooble", room.getRoomType());
//    }
//
//    @Test
//    public void roomIsBanana(){
//        room = new Room("Banana");
//        assertEquals("Banana", room.getRoomType());
//    }
}
