package models

type GetCategoriesResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result CategoryDto `json:"result,omitempty"`
}
