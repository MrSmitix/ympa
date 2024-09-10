package models

type VerifyOrderEacRequest struct {

	// Код для подтверждения ЭАПП.
	Code string `json:"code,omitempty"`
}
