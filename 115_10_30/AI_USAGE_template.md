# 第四週 AI 使用紀錄

每欄簡短填寫，不必貼完整對話。沒用 AI，第一欄填「未使用」及原因，其餘免填；課堂測試仍要完成。使用模擬建議時，第一欄寫「教師模擬建議，未使用 AI 服務」，其餘依本人操作填寫。

| 欄位 | 記錄 |
|---|---|
| 使用工具 | Claude Code（VS Code 擴充功能，Claude Sonnet 5.5） |
| 使用目的與提問摘要 | 請 AI 完成 starter/MissionLog.java 的 TODO 1–5（三條清單逐筆記錄、回放、指令計數、摘要與最低能源）並加上中文註解；另請 AI 協助核對編譯與執行輸出。未上傳個資、密碼或憑證 |
| AI 建議與本人處理 | 採納：每步同時 add 三條清單；回放用同一索引且條件為 < size()；countCommands 保留 0..3 範圍檢查；摘要用 Collections.frequency，最低能源先 isEmpty 再 min。摘要輸出格式講義未規定，AI 自訂為 steps=、ok=、rejected=、ignored=。本人最後修改：待本人確認後補寫（若無修改請寫「無」） |
| 實際驗證結果 | AI 以暫存副本測試講義 E 的六條路線，結果與預期一致：{0}→20/0/0 RETURNED、{1,1,2}→6/5/3 SUCCESS、{2,2,2,2,2}→10/5/5 SUCCESS、{3,9,0}→20/0/0 RETURNED（counts=[1,0,0,1]，rejected=2）、{1,1,1,1}→2/6/3 SUCCESS（ignored=1）、{2,1}→12/3/2 UNFINISHED；F1 五個案例可執行，空日誌印 lowest energy=N/A。本人重新編譯執行預設 {1,1,2}，輸出 counts=[0, 2, 1, 0]、steps=3、ok=3、lowest energy=6、final energy=6, samples=5, actionCount=3 -> SUCCESS、battery=30.0。F3 的反例（刪範圍檢查、<= size()）本人尚未實測，待補 |

只記錄實際發生的操作。AI 宣稱正確不能取代編譯執行。不要上傳個資、密碼、憑證或未授權資料。