package models

// SearchShipmentsResponse - Ответ на запрос информации об отгрузках.
type SearchShipmentsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result SearchShipmentsResponseDto `json:"result,omitempty"`
}
