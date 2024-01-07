public class masking {

    public static void main(String[] args) {
        String customerName = "홍길동";
        String phoneNumber = "010-1234-5678";
        String residentRegistrationNumber = "901230-1234567";

        // 이름 마스킹
        String maskedName = maskName(customerName);
        System.out.println(STR."이름: \{maskedName}");

        // 전화번호 마스킹
        String maskedPhoneNumber = maskPhoneNumber(phoneNumber);
        System.out.println(STR."전화번호: \{maskedPhoneNumber}");

        // 주민등록번호 마스킹
        String maskedRRN = maskResidentRegistrationNumber(residentRegistrationNumber);
        System.out.println(STR."주민등록번호: \{maskedRRN}");
    }

    // 이름 마스킹 메서드
    private static String maskName(String name) {
        // 간단히 처음 두 글자만 표시하고 나머지는 마스킹
        return STR."\{name.substring(0, 2)}XX";
    }

    // 전화번호 마스킹 메서드
    private static String maskPhoneNumber(String phoneNumber) {
        // 정규식을 사용하여 숫자만 남기고 나머지는 마스킹
        return phoneNumber.replaceAll("[^0-9]", "") // 숫자만 남김
                .replaceAll("(\\d{3})(\\d{3,4})(\\d{4})", "$1-XXXX-$3");
    }

    // 주민등록번호 마스킹 메서드
    private static String maskResidentRegistrationNumber(String rrn) {
        // 정규식을 사용하여 숫자만 남기고 나머지는 마스킹
        return rrn.replaceAll("[^0-9]", "") // 숫자만 남김
                .replaceAll("(\\d{6})(\\d{7})", "$1-XXXXXXX");
    }
}