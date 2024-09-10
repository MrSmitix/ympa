package models

// GetCategoryContentParametersResponse - Ответ со списком характеристик для категории и их допустимыми значениями.
type GetCategoryContentParametersResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result CategoryContentParametersDto `json:"result,omitempty"`
}
