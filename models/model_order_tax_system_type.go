package models
// OrderTaxSystemType : Система налогообложения (СНО) магазина на момент оформления заказа:  * `ECHN` — единый сельскохозяйственный налог (ЕСХН).  * `ENVD` — единый налог на вмененный доход (ЕНВД).  * `OSN` — общая система налогообложения (ОСН).  * `PSN` — патентная система налогообложения (ПСН).  * `USN` — упрощенная система налогообложения (УСН).  * `USN_MINUS_COST` — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * `NPD` — налог на профессиональный доход (НПД).  * `UNKNOWN_VALUE` — неизвестное значение. Используется только совместно с параметром `payment-method=YANDEX`. 
type OrderTaxSystemType string

// List of OrderTaxSystemType
const (
	OSN OrderTaxSystemType = "OSN"
	USN OrderTaxSystemType = "USN"
	USN_MINUS_COST OrderTaxSystemType = "USN_MINUS_COST"
	ENVD OrderTaxSystemType = "ENVD"
	ECHN OrderTaxSystemType = "ECHN"
	PSN OrderTaxSystemType = "PSN"
	NPD OrderTaxSystemType = "NPD"
	UNKNOWN_VALUE OrderTaxSystemType = "UNKNOWN_VALUE"
)
