package models
// ReturnDecisionSubreasonType : Детали причин возврата:   * `DO_NOT_FIT`:     * `USER_DID_NOT_LIKE` — товар не понравился.     * `USER_CHANGED_MIND` — передумал покупать.     * `DELIVERED_TOO_LONG` — длительный срок доставки, поэтому передумал.    * `BAD_QUALITY`:     * `BAD_PACKAGE` — упаковка товара была нарушена.     * `DAMAGED` — царапины, сколы.     * `NOT_WORKING` — не включается / не работает.     * `INCOMPLETENESS` — некомплект (не хватает детали в наборе, к товару).    * `WRONG_ITEM`:     * `WRONG_ITEM` — не тот товар.     * `WRONG_COLOR` — не соответствует по цвету.     * `DID_NOT_MATCH_DESCRIPTION` — не соответствует заявленным характеристикам/описанию. 
type ReturnDecisionSubreasonType string

// List of ReturnDecisionSubreasonType
const (
	USER_DID_NOT_LIKE ReturnDecisionSubreasonType = "USER_DID_NOT_LIKE"
	USER_CHANGED_MIND ReturnDecisionSubreasonType = "USER_CHANGED_MIND"
	DELIVERED_TOO_LONG ReturnDecisionSubreasonType = "DELIVERED_TOO_LONG"
	BAD_PACKAGE ReturnDecisionSubreasonType = "BAD_PACKAGE"
	DAMAGED ReturnDecisionSubreasonType = "DAMAGED"
	NOT_WORKING ReturnDecisionSubreasonType = "NOT_WORKING"
	INCOMPLETENESS ReturnDecisionSubreasonType = "INCOMPLETENESS"
	WRONG_ITEM ReturnDecisionSubreasonType = "WRONG_ITEM"
	WRONG_COLOR ReturnDecisionSubreasonType = "WRONG_COLOR"
	DID_NOT_MATCH_DESCRIPTION ReturnDecisionSubreasonType = "DID_NOT_MATCH_DESCRIPTION"
	UNKNOWN ReturnDecisionSubreasonType = "UNKNOWN"
)
