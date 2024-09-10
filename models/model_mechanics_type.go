package models
// MechanicsType : Тип акции:  * `DIRECT_DISCOUNT` — прямая скидка.  * `BLUE_FLASH` — флеш-акция.  * `MARKET_PROMOCODE` — скидка по промокоду. 
type MechanicsType string

// List of MechanicsType
const (
	DIRECT_DISCOUNT MechanicsType = "DIRECT_DISCOUNT"
	BLUE_FLASH MechanicsType = "BLUE_FLASH"
	MARKET_PROMOCODE MechanicsType = "MARKET_PROMOCODE"
)
