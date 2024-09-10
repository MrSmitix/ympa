package models
// ReturnInstanceStockType : Тип остатка на складе.
type ReturnInstanceStockType string

// List of ReturnInstanceStockType
const (
	FIT ReturnInstanceStockType = "FIT"
	DEFECT ReturnInstanceStockType = "DEFECT"
	ANOMALY ReturnInstanceStockType = "ANOMALY"
	SURPLUS ReturnInstanceStockType = "SURPLUS"
	EXPIRED ReturnInstanceStockType = "EXPIRED"
	MISGRADING ReturnInstanceStockType = "MISGRADING"
	UNDEFINED ReturnInstanceStockType = "UNDEFINED"
	INCORRECT_IMEI ReturnInstanceStockType = "INCORRECT_IMEI"
	INCORRECT_SERIAL_NUMBER ReturnInstanceStockType = "INCORRECT_SERIAL_NUMBER"
	INCORRECT_CIS ReturnInstanceStockType = "INCORRECT_CIS"
	PART_MISSING ReturnInstanceStockType = "PART_MISSING"
	NON_COMPLIENT ReturnInstanceStockType = "NON_COMPLIENT"
	NOT_ACCEPTABLE ReturnInstanceStockType = "NOT_ACCEPTABLE"
	SERVICE ReturnInstanceStockType = "SERVICE"
	MARKDOWN ReturnInstanceStockType = "MARKDOWN"
	DEMO ReturnInstanceStockType = "DEMO"
	REPAIR ReturnInstanceStockType = "REPAIR"
	FIRMWARE ReturnInstanceStockType = "FIRMWARE"
	UNKNOWN ReturnInstanceStockType = "UNKNOWN"
)
