package models

// GetDeliveryServicesResponse - Ответ на запрос списка служб доставки.
type GetDeliveryServicesResponse struct {

	Result DeliveryServicesDto `json:"result,omitempty"`
}
