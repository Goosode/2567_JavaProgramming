
//=========================================== Lab5 ===========================================
public class TestSmartPhone {
    public static void main(String[] args) {
    //OBJ
    SmartPhone phone = new SmartPhone();

    //Default setting for phone
    System.out.println("กำลังตั้งค่าข้อมูลสมาร์ทโฟนเริ่มต้น...");
    phone.setBrand("SmartMobile");
    phone.setModel("W1000");
    phone.setStorageCapacity(256);
    
    //Phone details
    System.out.println("\nข้อมูลสมาร์ทโฟนเบื้องต้น:");
    phone.printDetails();

    // Increase capacity by valid
    System.out.println("\nเพิ่มความจุหน่วยความจำ 100 GB...");
    phone.increaseStorage(100);

    // Increase capacity by invalid (Over the limit)
    System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ 200 GB...");
    phone.increaseStorage(200);

    // Increase capacity by invalid (Negative)
    System.out.println("\nพยายามเพิ่มความจุหน่วยความจำ -50 GB...");
    phone.increaseStorage(-50);

    // Calculate remaining capacity (valid used storage)
    System.out.println("\nคำนวณพึ้นที่หน่วยความจำที่เหลือโดยใช้ไปแล้ว 120 GB...");
    int remainingStorage = phone.getRemainingStorage(120);
    if (remainingStorage != -1) {
        System.out.println("พี้นที่ที่เหลือ: " + remainingStorage + " GB");
    }

    // Calculate remaining capacity (invalid used storage)
    System.out.println("\nคำนวณพึ้นที่หน่วยความจำที่เหลือโดยใช้ไปแล้ว 500 GB...");
    phone.getRemainingStorage(500);

    // Test error (brand and model)
    System.out.println("\nตั้งค่าแบรนด์และรุ่นด้วยค่าที่ไม่ถูกต้อง...");
    phone.setBrand("");
    phone.setModel("A");

    // Test capacity is incorrect
    System.out.println("\nตั้งค่าความจุหน่วยความจำที่ไม่ถูกต้อง...");
    phone.setStorageCapacity(600);

    // Details after setting
    System.out.println("\nข้อมูลสมาร์ทโฟนสุดท้าย:");
    phone.printDetails();
    }
}