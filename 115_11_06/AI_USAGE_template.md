# 第五週 AI 使用紀錄

| 欄位 | 本人紀錄 |
|---|---|
| 使用工具／方式 | 真實AI：Claude Code（VS Code 擴充套件），由AI說明觀念並直接修改 starter 程式；TODO 6 由本人撰寫，AI協助除錯 |
| 目的與提問摘要 | 1. 請AI教我並完成 MissionStep 的 TODO 1～3（this 保存欄位、getter 讀欄位、isSuccessful 判斷 OK）；2. 完成 MissionLog 的 TODO 4（每步新增一筆 MissionStep）與 TODO 5（依索引取出物件，以 getter 印出與第四週相同的回放）；3. 我自己寫的 TODO 6 出現編譯錯誤，請AI找出原因 |
| 建議與本人處理 | 採納：TODO 4 放在 switch 之後只寫一次 `history.add(new MissionStep(command, energy, result))`，因為拒絕、無效、返回都會走到這裡，不必在每個 case 重複寫，也不會漏記；每步都 new 新物件，才是各時間點的快照。採納 `"OK".equals(result)`，拒絕用 `==`，因為 `==` 比的是物件參考，不是字串內容。TODO 6 除錯：AI 指出 for 迴圈少一個「}」，後面的程式被誤判在迴圈內，所以又出現 Duplicate local variable step；我補上「}」並修正縮排後通過編譯 |
| 本人實際驗證 | 已自行修改 main 並執行測試，9 組測試結果皆與預期一致，包含 SUCCESS、RETURNED、UNFINISHED、EXHAUSTED 等情況，也確認初始樣本為 5 或能源為 0 時，steps = 0、lowest energy = N/A。另以 new String("OK") 驗證 isSuccessful，結果為 true，確認程式使用字串內容比較而非物件參考比較。完整執行輸出已整理於 LAB_REPORT F3。