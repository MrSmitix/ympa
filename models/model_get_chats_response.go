package models

type GetChatsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GetChatsInfoDto `json:"result,omitempty"`
}
