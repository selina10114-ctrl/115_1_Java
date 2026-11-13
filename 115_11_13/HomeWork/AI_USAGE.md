# 第六週AI使用紀錄

| 欄位 | 本人紀錄 |
|---|---|
| 使用工具／方式 | 真實AI（GitHub Copilot） |
| 目的與提問摘要 | 這次要完成 Mission.java 的 TODO1~TODO3：實作 run()、countOk()、lowestEnergy()。另外請AI協助設計一個可執行的測試程式 MissionTest.java，確認任務回放、成功次數、最低能源與任務結果是否正確。 |
| 建議與本人處理 | 採納AI建議，依照 Rover.execute()、MissionStep 與 MissionLog 的規格補上逐筆執行與紀錄邏輯，並在返回指令時設置 returned = true 後 break。也依AI建議新增測試檔，保留中文註解與中文字串，最終以實際執行結果驗證程式正確性。 |
| 本人實際驗證 | 先執行 `javac *.java; java MissionLog`，輸出顯示步數=3、成功=3、最低能源=6、最終結果=任務成功；再執行 `javac *.java; java MissionTest`，輸出 `全部測試通過`。這證明 run()、countOk()、lowestEnergy() 的行為符合預期。 |

## 我的反思

哪一句需求幫我判斷AI建議：AI 的重點是「依照 Rover.execute() 先執行再紀錄、遇到返回後立刻停止」，這與 MissionLog 的預期輸出完全一致，所以我採納。  
只看類別圖還不能證明什麼：只能知道有這些方法與欄位，不能證明執行順序、停止條件、結果判斷是否正確；因此我仍然依照實際輸出做了編譯與執行驗證，才能確認程式真的正確。
