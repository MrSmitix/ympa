package models
// WarehouseStockType : Тип остатков товаров на складе:  * `AVAILABLE` (соответствует типу «Доступный к заказу» в отчете «Остатки на складе» в кабинете продавца на Маркете) — товар, доступный для продажи.  * `DEFECT` (соответствует типу «Брак») — товар с браком.  * `EXPIRED` (соответствует типу «Просрочен») — товар с истекшим сроком годности.  * `FIT` (соответствует типу «Годный») — товар, который доступен для продажи или уже зарезервирован.  * `FREEZE` — товар, который зарезервирован для заказов.  * `QUARANTINE` (соответствует типу «Карантин») — товар, временно недоступный для продажи (например, товар перемещают из одного помещения склада в другое).  * `UTILIZATION` — товар, который будет утилизирован. 
type WarehouseStockType string

// List of WarehouseStockType
const (
	FIT WarehouseStockType = "FIT"
	FREEZE WarehouseStockType = "FREEZE"
	AVAILABLE WarehouseStockType = "AVAILABLE"
	QUARANTINE WarehouseStockType = "QUARANTINE"
	UTILIZATION WarehouseStockType = "UTILIZATION"
	DEFECT WarehouseStockType = "DEFECT"
	EXPIRED WarehouseStockType = "EXPIRED"
)
