package models

type GetPromoOffersResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetPromoOffersResultDto `json:"result,omitempty"`
}
