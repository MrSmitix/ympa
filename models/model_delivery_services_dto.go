package models

// DeliveryServicesDto - Информация о службах доставки.
type DeliveryServicesDto struct {

	// Информация о службе доставки.
	DeliveryService []DeliveryServiceInfoDto `json:"deliveryService"`
}
