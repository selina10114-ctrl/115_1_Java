# 第二週 AI 使用紀錄

每欄簡短填寫即可，不必貼上完整對話。未使用 AI 時，第一欄填「未使用」及原因，其餘免填。

| 欄位 | 學生填寫 |
|---|---|
| 使用工具 | Claude |
| 使用目的與提問摘要 | 請 AI 一步一步教我完成 RoverDashboard 與 RoverMission 的 TODO（整數除法、取餘數、布林條件、探索／掃描／充電的 switch 判斷），並在程式中附上註解說明每一步的用意。 |
| AI 建議與本人處理 | AI 逐步說明並建議：用 `energy / 6` 與 `energy % 6` 算探索次數與剩餘能源；用 `energy >= 6 && !locked` 判斷能否探索；百分比用 `energy * 100.0 / 20` 避免整數除法變 0；探索／掃描需能源足夠才扣除並計次，充電用 `Math.min(energy + 5, 20)` 封頂，滿電不計次。我全部採納並保留註解，因為能對應講義的需求，且理解其原因。 |
| 實際驗證結果 | 實際執行 RoverDashboard：energy=7，電量 35.0、探索次數 1、剩餘能源 1、有效能源 true、能否探索 true，與預期一致。實際執行 RoverMission：依序輸入 1、1、2 時，energy 20→14→8→6、samples 0→2→4→5，印出 SUCCESS；另輸入 1、1、1 時 samples 為 6，同樣印出 SUCCESS，皆符合預期。 |

只記錄實際發生的使用與測試；AI 說「正確」不能代替實際執行。不要上傳個資、密碼或未授權資料。

## 填寫範例：電量百分比算成 0.0

以下為模擬填寫內容，不代表已實際使用 AI 或完成測試。請保留上方空白表格，依自己的使用與執行結果填寫，不要直接照抄範例。



![AI 使用紀錄範例附圖](https://raw.githubusercontent.com/shuochenghu/115_1_Java_Tutorial/main/img/test.png)
