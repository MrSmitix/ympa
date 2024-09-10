package models
// ReturnInstanceStatusType : Логистический статус конкретного товара.
type ReturnInstanceStatusType string

// List of ReturnInstanceStatusType
const (
	CREATED ReturnInstanceStatusType = "CREATED"
	RECEIVED ReturnInstanceStatusType = "RECEIVED"
	IN_TRANSIT ReturnInstanceStatusType = "IN_TRANSIT"
	READY_FOR_PICKUP ReturnInstanceStatusType = "READY_FOR_PICKUP"
	PICKED ReturnInstanceStatusType = "PICKED"
	RECEIVED_ON_FULFILLMENT ReturnInstanceStatusType = "RECEIVED_ON_FULFILLMENT"
	CANCELLED ReturnInstanceStatusType = "CANCELLED"
	LOST ReturnInstanceStatusType = "LOST"
	UTILIZED ReturnInstanceStatusType = "UTILIZED"
	PREPARED_FOR_UTILIZATION ReturnInstanceStatusType = "PREPARED_FOR_UTILIZATION"
	EXPROPRIATED ReturnInstanceStatusType = "EXPROPRIATED"
	NOT_IN_DEMAND ReturnInstanceStatusType = "NOT_IN_DEMAND"
)
