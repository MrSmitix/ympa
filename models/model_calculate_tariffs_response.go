package models

type CalculateTariffsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result CalculateTariffsResponseDto `json:"result,omitempty"`
}
