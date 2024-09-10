package models
// OrdersStatsStockType : Тип товара:  * `DEFECT` — товар бракованный.  * `FIT` — товар надлежащего качества. 
type OrdersStatsStockType string

// List of OrdersStatsStockType
const (
	FIT OrdersStatsStockType = "FIT"
	FREEZE OrdersStatsStockType = "FREEZE"
	AVAILABLE OrdersStatsStockType = "AVAILABLE"
	QUARANTINE OrdersStatsStockType = "QUARANTINE"
	UTILIZATION OrdersStatsStockType = "UTILIZATION"
	DEFECT OrdersStatsStockType = "DEFECT"
	EXPIRED OrdersStatsStockType = "EXPIRED"
)
