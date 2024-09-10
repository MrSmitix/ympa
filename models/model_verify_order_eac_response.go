package models

type VerifyOrderEacResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result EacVerificationResultDto `json:"result,omitempty"`
}
