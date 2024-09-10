package models
// ChatType : Тип чата:  * `CHAT` — чат с покупателем. * `ARBITRAGE` — спор. 
type ChatType string

// List of ChatType
const (
	CHAT ChatType = "CHAT"
	ARBITRAGE ChatType = "ARBITRAGE"
)
