package models
// AddOffersToArchiveErrorType : Причина, по которой товар не удалось поместить в архив:  * `OFFER_HAS_STOCKS` — товар хранится на складе Маркета. 
type AddOffersToArchiveErrorType string

// List of AddOffersToArchiveErrorType
const (
	OFFER_HAS_STOCKS AddOffersToArchiveErrorType = "OFFER_HAS_STOCKS"
	UNKNOWN AddOffersToArchiveErrorType = "UNKNOWN"
)
