package models
// ReturnDecisionReasonType : Причины возврата:  * `BAD_QUALITY` — бракованный товар (есть недостатки).  * `DO_NOT_FIT` — товар не подошел.  * `WRONG_ITEM` — привезли не тот товар.  * `DAMAGE_DELIVERY` — товар поврежден при доставке.  * `LOYALTY_FAIL` — невозможно установить виновного в браке/пересорте.  * `CONTENT_FAIL` — ошибочное описание товара по вине Маркета.  * `UNKNOWN` — причина не известна. 
type ReturnDecisionReasonType string

// List of ReturnDecisionReasonType
const (
	BAD_QUALITY ReturnDecisionReasonType = "BAD_QUALITY"
	DOES_NOT_FIT ReturnDecisionReasonType = "DOES_NOT_FIT"
	WRONG_ITEM ReturnDecisionReasonType = "WRONG_ITEM"
	DAMAGE_DELIVERY ReturnDecisionReasonType = "DAMAGE_DELIVERY"
	LOYALTY_FAIL ReturnDecisionReasonType = "LOYALTY_FAIL"
	CONTENT_FAIL ReturnDecisionReasonType = "CONTENT_FAIL"
	UNKNOWN ReturnDecisionReasonType = "UNKNOWN"
)
