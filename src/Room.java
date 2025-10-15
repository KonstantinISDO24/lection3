public abstract class Room {
        protected int numbRoom;
        protected int maxPeople;
        protected int price;
        protected boolean isBooked;

    public Room (int numbRoom, int maxPeople, int price) {
        this.numbRoom = numbRoom;
        this.maxPeople = maxPeople;
        this.price = price;
        this.isBooked = false;
    }

    public int getNumbRoom() {
        return numbRoom;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public int getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" + " номер комнаты: " + numbRoom + ", максимум людей: " + maxPeople + ", цена: " + price + ", статус: " + isBooked;
    }
}

