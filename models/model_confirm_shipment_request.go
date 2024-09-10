package models

// ConfirmShipmentRequest - Запрос для подтверждения отгрузки.
type ConfirmShipmentRequest struct {

	// Идентификатор отгрузки в системе поставщика.
	ExternalShipmentId string `json:"externalShipmentId,omitempty"`
}
