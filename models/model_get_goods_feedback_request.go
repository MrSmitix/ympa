package models

import (
	"time"
)

// GetGoodsFeedbackRequest - Фильтр запроса отзывов в кабинете. 
type GetGoodsFeedbackRequest struct {

	// Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
	DateTimeFrom time.Time `json:"dateTimeFrom,omitempty"`

	// Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
	DateTimeTo time.Time `json:"dateTimeTo,omitempty"`

	ReactionStatus FeedbackReactionStatusType `json:"reactionStatus,omitempty"`

	// Оценка товара.
	RatingValues *[]int32 `json:"ratingValues,omitempty"`

	// Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
	ModelIds *[]int64 `json:"modelIds,omitempty"`

	// Фильтр отзывов за баллы Плюса.
	Paid bool `json:"paid,omitempty"`
}
