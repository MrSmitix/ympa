package models
// ChatMessageSenderType : Кто отправил сообщение:  * `PARTNER` — магазин. * `CUSTOMER` — покупатель. * `MARKET` — Маркет. * `SUPPORT` — сотрудник службы поддержки Маркета. 
type ChatMessageSenderType string

// List of ChatMessageSenderType
const (
	PARTNER ChatMessageSenderType = "PARTNER"
	CUSTOMER ChatMessageSenderType = "CUSTOMER"
	MARKET ChatMessageSenderType = "MARKET"
	SUPPORT ChatMessageSenderType = "SUPPORT"
)
