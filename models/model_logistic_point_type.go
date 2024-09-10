package models
// LogisticPointType : Тип логистической точки:    * `WAREHOUSE` — склад.   * `PICKUP_POINT` — обычная точка выдачи заказов (ПВЗ).   * `PICKUP_TERMINAL` — постамат.   * `PICKUP_POST_OFFICE` — отделение почтовой связи (ОПС).   * `PICKUP_MIXED` — торговый зал и пункт выдачи заказов.   * `PICKUP_RETAIL` — торговый зал. 
type LogisticPointType string

// List of LogisticPointType
const (
	WAREHOUSE LogisticPointType = "WAREHOUSE"
	PICKUP_POINT LogisticPointType = "PICKUP_POINT"
	PICKUP_TERMINAL LogisticPointType = "PICKUP_TERMINAL"
	PICKUP_POST_OFFICE LogisticPointType = "PICKUP_POST_OFFICE"
	PICKUP_MIXED LogisticPointType = "PICKUP_MIXED"
	PICKUP_RETAIL LogisticPointType = "PICKUP_RETAIL"
	UNKNOWN LogisticPointType = "UNKNOWN"
)
