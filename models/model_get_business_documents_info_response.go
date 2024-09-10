package models

type GetBusinessDocumentsInfoResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OrderBusinessDocumentsDto `json:"result,omitempty"`
}
