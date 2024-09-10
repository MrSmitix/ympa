package models

// GetBidsInfoResponse - description.
type GetBidsInfoResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetBidsInfoResponseDto `json:"result,omitempty"`
}
