// MissionStep 代表一個任務步驟的快照：記錄當下執行的指令、剩餘能源與結果狀態。
// 這裡加入中文註解，方便閱讀與維護每個欄位與方法的用途。
public class MissionStep {
    // 指令代碼，例如 1、2、3、0 代表不同行動。
    private int command;
    // 執行完這一步後的能源值。
    private int energy;
    // 這一步的回應結果，例如 OK、RETURN、NOT_ENOUGH_ENERGY。
    private String result;

    public MissionStep(int command, int energy, String result) {
        // TODO 1：以 this 將三個參數保存到目前物件的三個欄位。
        // 這個建構子會把執行時的狀態記錄成一個不可變更的快照。
        this.command = command;
        this.energy = energy;
        this.result = result;
    }

    // TODO 2：三個 getter 應讀取本物件對應欄位，取代以下佔位回傳值。
    // 讀取本步的指令代碼。
    public int getCommand() {
        return this.command;
    }

    // 讀取本步執行後的能源值。
    public int getEnergy() {
        return this.energy;
    }

    // 讀取本步的結果字串。
    public String getResult() {
        return this.result;
    }

    // 判斷這一步是否成功，成功條件是結果內容等於 OK。
    public boolean isSuccessful() {
        // TODO 3：以內容比較判斷本物件的 result 是否為 OK。
        // 使用 "OK".equals(this.result) 可避免 this.result 為 null 時發生例外。
        return "OK".equals(this.result);
    }
}
