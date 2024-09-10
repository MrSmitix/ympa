package models

// ExtensionShipmentDto - Информация об отгрузке.
type ExtensionShipmentDto struct {

	CurrentStatus ShipmentStatusChangeDto `json:"currentStatus,omitempty"`

	// Доступные действия над отгрузкой.
	AvailableActions []ShipmentActionType `json:"availableActions"`
}
