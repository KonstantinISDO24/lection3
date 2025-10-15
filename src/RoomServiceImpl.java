public class RoomServiceImpl implements RoomService {
    @Override
    public void bookRoom(Room room) {
        if (room.isBooked()) {
            throw new RoomAlreadyBookedException("Комната №" + room.getNumbRoom() + " уже забронирована!");
        }
        room.setBooked(true);
        System.out.println("Комната " + room.getNumbRoom() + " забронирована!");
    }

    @Override
    public void freeRoom(Room room) {
        if(!room.isBooked()) {
            System.out.println("Комната " + room.getNumbRoom() + " уже свободна.");
            return;
        }
        room.setBooked(false);
        System.out.println("Комната " + room.getNumbRoom() + " успешно освобождена!");
    }

    @Override
    public void infoRoom(Room room) {
        System.out.println(room.toString());
    }
}

