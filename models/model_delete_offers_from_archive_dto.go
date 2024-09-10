package models

// DeleteOffersFromArchiveDto - Товары, которые не удалось восстановить из архива.
type DeleteOffersFromArchiveDto struct {

	// Список товаров, которые не удалось восстановить из архива.
	NotUnarchivedOfferIds *[]string `json:"notUnarchivedOfferIds,omitempty"`
}
