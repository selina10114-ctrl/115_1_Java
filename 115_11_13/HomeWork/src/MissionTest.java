import java.util.Objects;

// 類別：MissionTest（任務測試）
// 作用：用最簡單的方式驗證 Mission 類別的主要功能。
// 設計：不使用 JUnit，而是直接寫一個 main 方法，執行多個測試案例，
//       若有任何結果不符合預期，就直接丟出錯誤。
public class MissionTest {
    // main：測試入口點。
    public static void main(String[] args) {
        testSuccessCase();
        testEmptyScriptCase();
        testReturnStopsCase();
        System.out.println("全部測試通過");
    }

    // testSuccessCase：測試正常執行腳本，確認成功、步數、最低能源與結果。
    static void testSuccessCase() {
        Rover rover = new Rover(20, 0);
        Mission mission = new Mission(rover);

        mission.run(new int[] {1, 1, 2});

        check("成功案例：步數", 3, mission.getStepCount());
        check("成功案例：成功次數", 3, mission.countOk());
        check("成功案例：最低能源", 6, mission.lowestEnergy());
        check("成功案例：任務結果", "任務成功", mission.getOutcome());
    }

    // testEmptyScriptCase：測試空腳本時，應該沒有任何紀錄，最低能源回傳 -1。
    static void testEmptyScriptCase() {
        Rover rover = new Rover(10, 0);
        Mission mission = new Mission(rover);

        mission.run(new int[] {});

        check("空腳本：步數", 0, mission.getStepCount());
        check("空腳本：最低能源", -1, mission.lowestEnergy());
        check("空腳本：任務結果", "任務未完成", mission.getOutcome());
    }

    // testReturnStopsCase：測試遇到返回指令時，任務會立刻停止，並記錄為已返回。
    static void testReturnStopsCase() {
        Rover rover = new Rover(10, 0);
        Mission mission = new Mission(rover);

        mission.run(new int[] {0, 1, 2});

        check("返回案例：步數", 1, mission.getStepCount());
        check("返回案例：結果", "已返回", mission.getOutcome());
    }

    // check：比較預期值與實際值是否一致；若不同，直接丟出錯誤。
    static void check(String name, Object expected, Object actual) {
        if (!Objects.equals(expected, actual)) {
            throw new AssertionError(name + " 失敗：預期=" + expected + "，實際=" + actual);
        }
    }
}
