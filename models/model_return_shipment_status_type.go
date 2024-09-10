package models
// ReturnShipmentStatusType : Статус передачи возврата:  * `CREATED` — возврат создан.  * `RECEIVED` — принят у покупателя.  * `IN_TRANSIT` — возврат в пути.  * `READY_FOR_PICKUP` — возврат готов к выдаче магазину.  * `PICKED` — возврат выдан магазину.  * `LOST` — возврат утерян при транспортировке.  * `CANCELLED` — возврат отменен.  * `FULFILMENT_RECEIVED` — возврат принят на складе Маркета.  * `PREPARED_FOR_UTILIZATION` — возврат передан в утилизацию.  * `UTILIZED` — возврат утилизирован. 
type ReturnShipmentStatusType string

// List of ReturnShipmentStatusType
const (
	CREATED ReturnShipmentStatusType = "CREATED"
	RECEIVED ReturnShipmentStatusType = "RECEIVED"
	IN_TRANSIT ReturnShipmentStatusType = "IN_TRANSIT"
	READY_FOR_PICKUP ReturnShipmentStatusType = "READY_FOR_PICKUP"
	PICKED ReturnShipmentStatusType = "PICKED"
	LOST ReturnShipmentStatusType = "LOST"
	EXPIRED ReturnShipmentStatusType = "EXPIRED"
	CANCELLED ReturnShipmentStatusType = "CANCELLED"
	FULFILMENT_RECEIVED ReturnShipmentStatusType = "FULFILMENT_RECEIVED"
	PREPARED_FOR_UTILIZATION ReturnShipmentStatusType = "PREPARED_FOR_UTILIZATION"
	NOT_IN_DEMAND ReturnShipmentStatusType = "NOT_IN_DEMAND"
	UTILIZED ReturnShipmentStatusType = "UTILIZED"
	READY_FOR_EXPROPRIATION ReturnShipmentStatusType = "READY_FOR_EXPROPRIATION"
	RECEIVED_FOR_EXPROPRIATION ReturnShipmentStatusType = "RECEIVED_FOR_EXPROPRIATION"
)
