package models
// OrderLiftType : Тип подъема заказа на этаж:  * `NOT_NEEDED` — не требуется.  * `MANUAL` — ручной.  * `ELEVATOR` — лифт.  * `CARGO_ELEVATOR` — грузовой лифт.  * `FREE` — любой из перечисленных выше, если включена опция бесплатного подъема.  * `UNKNOWN` — неизвестный тип. 
type OrderLiftType string

// List of OrderLiftType
const (
	NOT_NEEDED OrderLiftType = "NOT_NEEDED"
	MANUAL OrderLiftType = "MANUAL"
	ELEVATOR OrderLiftType = "ELEVATOR"
	CARGO_ELEVATOR OrderLiftType = "CARGO_ELEVATOR"
	FREE OrderLiftType = "FREE"
	UNKNOWN OrderLiftType = "UNKNOWN"
)
