//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            RoomService service = new RoomServiceImpl();

            Room economy = new EconomyRoom(123, 3, 1500);
            Room standart = new StandartRoom(213, 2, 2500);
            Room lux = new LuxRoom(314, 1, 3500);
            Room ultra = new UltraLuxRoom(414, 1, 5000);


            service.infoRoom(economy);
            service.bookRoom(economy);
            service.infoRoom(economy);

            try {
                service.bookRoom(economy);
            } catch (RoomAlreadyBookedException e) {
                System.out.println("Ошибка " + e.getMessage());
            }

            service.freeRoom(economy);
            service.infoRoom(economy);


            service.bookRoom(standart);
            service.bookRoom(lux);
            service.bookRoom(ultra);

            service.infoRoom(standart);
            service.infoRoom(lux);
            service.infoRoom(ultra);

            service.freeRoom(standart);
            service.freeRoom(lux);
            service.freeRoom(ultra);

            service.infoRoom(standart);
            service.infoRoom(lux);
            service.infoRoom(ultra);

        }
    }
