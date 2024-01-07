import java.lang.management.ManagementFactory;

public class GetCurrentProcessID {
    public static void main(String[] args) {
        // 현재 JQVMAP 프로세스 ID 가져오기
        String processID = getProcessID();
        System.out.println(STR."현재 프로세스 ID: \{processID}");
    }

    public static String getProcessID() {
        // ManagementFactory 사용하여 현재 JQVMAP RuntimeMXBean 얻음
        String jvmName = ManagementFactory.getRuntimeMXBean().getName();
        // JVM 이름에서 프로세스 ID만 추출
        return jvmName.split("@")[0];
    }
}
