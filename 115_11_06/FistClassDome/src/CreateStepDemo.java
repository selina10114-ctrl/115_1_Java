public class CreateStepDemo {
    public static void main(String[] args) {
        StepCard first = new StepCard(1, 14);
        StepCard second = new StepCard(2, 12);
        System.out.println("first=" + first.getCommand() + "/" + first.getEnergy());
        System.out.println("second=" + second.getCommand() + "/" + second.getEnergy());
        System.out.println("same object=" + (first == second));
        // first.energy = 99; // 私有存取錯誤練習只在副本取消註解。
        first.setEnergy(99); // 使用 setter 方法來修改 energy 值
        System.out.println("[After]first after update=" + first.getCommand() + "/" + first.getEnergy());
        // StepCard empty = new StepCard(); // 已宣告有參數建構子，不會自動補無參數版。
    }
}
