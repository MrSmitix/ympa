package models

// OfferCardsContentStatusDto - Список товаров с информацией о состоянии карточек.
type OfferCardsContentStatusDto struct {

	// Страница списка товаров с информацией о состоянии карточек.
	OfferCards []OfferCardDto `json:"offerCards"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}
