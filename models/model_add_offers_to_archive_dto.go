package models

// AddOffersToArchiveDto - Товары, которые не удалось поместить в архив.
type AddOffersToArchiveDto struct {

	// Список товаров, которые не удалось поместить в архив.
	NotArchivedOffers *[]AddOffersToArchiveErrorDto `json:"notArchivedOffers,omitempty"`
}
