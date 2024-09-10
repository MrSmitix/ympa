package models

// GetOrderLabelsDataResponse - Ответ с информацией для печати ярлыков.
type GetOrderLabelsDataResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OrderLabelDto `json:"result,omitempty"`
}
