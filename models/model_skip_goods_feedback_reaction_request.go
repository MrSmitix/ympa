package models

// SkipGoodsFeedbackReactionRequest - Идентификаторы отзывов.
type SkipGoodsFeedbackReactionRequest struct {

	// Список идентификаторов отзывов, на которые магазин не будет отвечать.
	FeedbackIds []int64 `json:"feedbackIds"`
}
