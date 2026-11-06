// 契約與教師版相同；佔位值只是讓骨架能啟動，不代表完成需求。
public class MissionStep {
    private int command;
    private int energy;
    private String result;

    public MissionStep(int command, int energy, String result) {
        // TODO 1：以 this 將三個參數保存到目前物件的三個欄位。
        this.command = command;   // 左邊 this.command 是物件的欄位，右邊 command 是傳進來的參數
        this.energy = energy;     // 保存本步執行後的能源
        this.result = result;     // 保存本步的結果字串
    }

    // TODO 2：三個 getter 應讀取本物件對應欄位，取代以下佔位回傳值。
    public int getCommand() {
        return command;           // 回傳本物件保存的指令
    }

    public int getEnergy() {
        return energy;            // 回傳本物件保存的能源
    }

    public String getResult() {
        return result;            // 回傳本物件保存的結果
    }

    public boolean isSuccessful() {
        // TODO 3：以內容比較判斷本物件的 result 是否為 OK。
        return "OK".equals(result); // 字串內容比較用 equals；把 "OK" 放前面，result 是 null 也不會出錯
    }
}
