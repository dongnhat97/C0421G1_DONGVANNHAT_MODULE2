package _20_Casetudy.services.Facility;


import _20_Casetudy.libs.Choice;
import _20_Casetudy.libs.ValidateData;
import _20_Casetudy.models.Facility;
import _20_Casetudy.models.House;
import _20_Casetudy.models.Room;
import _20_Casetudy.models.Villa;
import _20_Casetudy.utils.ReadAndWriteByteStream;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {

    private static Scanner scanner = new Scanner(System.in);private static Map<Facility, Integer> facilityMap = new LinkedHashMap<>();
   private static ReadAndWriteByteStream<House> readwriteHouse = new ReadAndWriteByteStream<>();
   private static ReadAndWriteByteStream<Villa> readwriteVilla = new ReadAndWriteByteStream<>();
   private static ReadAndWriteByteStream<Room> readwriteRoom = new ReadAndWriteByteStream<>();
   private static final File fileRoom = new File("C0421G1_DONGVANNHAT_MODULE22\\src\\_20_Casetudy\\data\\Room.csv");
   private static final File fileVila = new File("C0421G1_DONGVANNHAT_MODULE22\\src\\_20_Casetudy\\data\\Villa.csv");
   private static final File fileHouse =new File("C0421G1_DONGVANNHAT_MODULE22\\src\\_20_Casetudy\\data\\House.csv");
//   houseMap
    private static Map<House,Integer> houseMap = new LinkedHashMap<>();
//   villaMap
    private static Map<Villa,Integer> villaMap = new LinkedHashMap<>();
//    roomMap
    private static Map<Room,Integer> roomMap = new LinkedHashMap<>();
    static {
        House house = new House("Ha",30.5f,"11",9,"11","55",3);
        houseMap.put(house,5);
        readwriteHouse.writeFileByteStreamMap(houseMap,fileHouse);
    }
    static {
         houseMap = readwriteHouse.readFileByteStreamMap(fileHouse);
         villaMap = readwriteVilla.readFileByteStreamMap(fileVila);
         roomMap = readwriteRoom.readFileByteStreamMap(fileRoom);
    }

    @Override
    public void showInfo() {
        if (villaMap.size()==0 && houseMap.size() == 0 && roomMap.size() == 0) {
            System.err.println("Không co du lieu , moi ban them du lieu");
        }
       else {
            for (House service : houseMap.keySet()) {
                System.out.println(service);
            }
            for (Villa service: villaMap.keySet()) {
                System.out.println(service);
            }
            for (Room service: roomMap.keySet()) {
                System.out.println(service);
            }
        }
    }

    @Override
    public void displayListMaintenance() {
        int countVilla = 0;
        int countHouse = 0;
        int countRoom = 0;
        for (Map.Entry<Villa, Integer> service : villaMap.entrySet()) {
            if (service.getValue()==5) {
                System.out.println(service);
                countVilla++;
            }
        }

        for (Map.Entry<House, Integer> service : houseMap.entrySet()) {
            if (service.getValue()==5) {
                System.out.println(service);
                countHouse++;
            }
        }
        for (Map.Entry<Room, Integer> service : roomMap.entrySet()) {
            if (service.getValue()==5) {
                System.out.println(service);
                countRoom++;
            }
        }
        if (countVilla == 0 && countHouse == 0 && countRoom == 0) {
            System.err.println("khong co gia tri ");
        }
    }

    public void addFacility() {
        System.out.println("Moi ban chon dich vu");
        System.out.println("1: House");
        System.out.println("2: Room");
        System.out.println("3: Villa");
        boolean check = false;
        while (!check) {

            int choice = Choice.choiceMenu();
            switch (choice) {
                case 1:
                    String service = ValidateData.houseCode();
                    float area = ValidateData.area();
                    String cost = inputOutput("Nhap gia tien ban mon them vao");
                    int numberPerson = ValidateData.maxNumsPeople();
                    String rentalType = inputOutput("Nhap  loai cho the ban muon them vao");
                    String roomStandard = inputOutput("Nhap  tieu chuan phong ban muon them vao");
                    int floorsNumber = ValidateData.numsOfFoors();
                    houseMap.put(new House(service, area, cost, numberPerson, rentalType, roomStandard, floorsNumber), 0);
                    readwriteHouse.writeFileByteStreamMap(houseMap,fileHouse);
                    check = true;
                    break;
                case 2:
                    String service2 = ValidateData.roomCode();
                    float area2 = ValidateData.area();
                    String cost2 = inputOutput("Nhap gia tien ban mon them vao");
                    int numberPerson2 = ValidateData.maxNumsPeople();
                    String rentalType2 = inputOutput("Nhap  loai cho the ban muon them vao");
                    String freeService2 = inputOutput("Nhap  dich vu mien phi ban muon them vao");
                    roomMap.put(new Room(service2, area2, cost2, numberPerson2, rentalType2, freeService2), 0);
                    readwriteRoom.writeFileByteStreamMap(roomMap,fileRoom);
                    check = true;
                    break;
                case 3:
                    String service3 = ValidateData.villaCode();
                    float area3 = Choice.checkFloatException();
                    String cost3 = inputOutput("Nhap gia tien ban mon them vao");
                    int numberPerson3 = ValidateData.maxNumsPeople();
                    String rentalType3 = inputOutput("Nhap  loai cho the ban muon them vao");
                    String roomStandard3 = inputOutput("Nhap  tieu chuan phong ban muon them vao");
                    float poolArea = ValidateData.area();
                    int floorsNumber3 = ValidateData.numsOfFoors();
                    villaMap.put(new Villa(service3, area3, cost3, numberPerson3, rentalType3, roomStandard3, poolArea, floorsNumber3), 0);
                    readwriteVilla.writeFileByteStreamMap(villaMap,fileVila);
                    check = true;
                    break;
                default:
                    System.out.println(" khong co trong menu , moi ban nhap lai");
            }
        }
    }
        private String inputOutput (String message){
            System.out.println(message);
            String output = scanner.next();
            return output;
        }

    }


