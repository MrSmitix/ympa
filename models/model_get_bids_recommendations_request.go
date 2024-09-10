package models

// GetBidsRecommendationsRequest - description.
type GetBidsRecommendationsRequest struct {

	// Список товаров, для которых нужно получить рекомендации по ставкам. 
	Skus []string `json:"skus"`
}
