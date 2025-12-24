class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int serviceChicken = 0;

        while (coupon >= 10) {
            int newService = coupon / 10;
            int leftCoupon = coupon % 10;

            serviceChicken += newService;
            coupon = newService + leftCoupon;
        }

        return serviceChicken;
    }
}