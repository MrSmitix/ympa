package models
// OrderItemInstanceType : Вид маркировки товара:  * `CIS` — КИЗ, идентификатор единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  * `UIN` — УИН, уникальный идентификационный номер.  * `RNPT` — РНПТ, регистрационный номер партии товара.  * `GTD` — номер ГТД, грузовой таможенной декларации. 
type OrderItemInstanceType string

// List of OrderItemInstanceType
const (
	CIS OrderItemInstanceType = "CIS"
	UIN OrderItemInstanceType = "UIN"
	RNPT OrderItemInstanceType = "RNPT"
	GTD OrderItemInstanceType = "GTD"
)
