public class RoomServiceImpl<R extends Room> implements RoomService<R> {

    @Override
    public void cleanRoom(R room) {
        System.out.println("Комната " + room.getNumbRoom() + " очищена.");
    }
    @Override
    public void reserveRoom(R room) {
        if (room.isBooked()) {
            throw new RoomAlreadyBookedException("Комната " + room.getNumbRoom() + " уже забронирована!");
        }
        room.setBooked(true);
        System.out.println("Комната " + room.getNumbRoom() + " забронирована!");
    }

    @Override
    public void freeRoom(R room) {
        if(!room.isBooked()) {
            System.out.println("Комната " + room.getNumbRoom() + " уже свободна.");
            return;
        }
        room.setBooked(false);
        System.out.println("Комната " + room.getNumbRoom() + " успешно освобождена!");
    }

    @Override
    public void infoRoom(R room) {
        System.out.println(room.toString());
    }
}

