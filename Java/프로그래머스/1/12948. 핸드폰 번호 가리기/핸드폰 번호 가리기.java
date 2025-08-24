class Solution {
    public String solution(String phone_number) {
        String front_phone_number = phone_number.substring(0, phone_number.length() - 4);
        String back_phone_number = phone_number.substring(phone_number.length() - 4);

        front_phone_number = front_phone_number.replaceAll("[0-9]", "*");

        return front_phone_number + back_phone_number;
    }
}