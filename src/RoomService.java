public interface RoomService<R extends Room> {
    void cleanRoom(R room);
    void reserveRoom(R room);
    void freeRoom(R room);
    void infoRoom(R room);
}
