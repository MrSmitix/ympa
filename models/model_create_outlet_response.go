package models

// CreateOutletResponse - Ответ на запрос о создании точки продаж.
type CreateOutletResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OutletResponseDto `json:"result,omitempty"`
}
