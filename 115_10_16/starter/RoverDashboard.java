public class RoverDashboard {
    public static void main(String[] args) {
        String roverName = "赤砂號";
        char zone = 'A';
        int energy = 7;
        boolean locked = false;

        double batteryPercent = calculateBatteryPercent(energy);
        int explorationCount = energy / 6;                    // TODO 1：整數除法，7 / 6 = 1
        int remainingEnergy = energy % 6;                     // TODO 2：取餘數，7 % 6 = 1
        boolean validEnergy = energy >= 0 && energy <= 20;    // TODO 3：0 至 20（含端點）
        boolean canExplore = energy >= 6 && !locked;          // TODO 4：至少 6 格且未鎖定

        System.out.println("探測車：" + roverName + "；區域：" + zone);
        System.out.println("能源：" + energy + "；電量百分比：" + batteryPercent);
        System.out.println("完整探索次數：" + explorationCount + "；剩餘能源：" + remainingEnergy);
        System.out.println("有效能源：" + validEnergy + "；能否探索：" + canExplore);
    }

    static double calculateBatteryPercent(int energy) {
        return energy * 100.0 / 20;                           // TODO 5：只回傳，不要在這裡 print
    }
}