package models
// TurnoverType : Оценка оборачиваемости.  |enum|Диапазон оборачиваемости|Комментарий| |-|-|-| |`LOW`|`turnoverDays` ≥ 120|| |`ALMOST_LOW`|100 ≤ `turnoverDays` < 120|| |`HIGH`|45 ≤ `turnoverDays` < 100|| |`VERY_HIGH`|0 ≤ `turnoverDays` < 45|| |`NO_SALES`|—|Продаж нет.| |`FREE_STORE`|Любое значение.|Товары этой категории сейчас хранятся бесплатно.| 
type TurnoverType string

// List of TurnoverType
const (
	LOW TurnoverType = "LOW"
	ALMOST_LOW TurnoverType = "ALMOST_LOW"
	HIGH TurnoverType = "HIGH"
	VERY_HIGH TurnoverType = "VERY_HIGH"
	NO_SALES TurnoverType = "NO_SALES"
	FREE_STORE TurnoverType = "FREE_STORE"
)
