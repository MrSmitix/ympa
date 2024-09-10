package models

// GetModelsRequest - Запрос информации о моделях.
type GetModelsRequest struct {

	// Список моделей.
	Models []int64 `json:"models"`
}
