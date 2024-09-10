package models
// PromoOfferParticipationStatusFilterType : Фильтр для товаров, которые добавлены в акцию вручную:  * `MANUALLY_ADDED` — товары, которые добавлены вручную.  * `NOT_MANUALLY_ADDED`— товары, которые не участвуют в акции и те, которые добавлены автоматически.  Если не передать параметр `statusType`, вернутся все товары.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
type PromoOfferParticipationStatusFilterType string

// List of PromoOfferParticipationStatusFilterType
const (
	MANUALLY_ADDED PromoOfferParticipationStatusFilterType = "MANUALLY_ADDED"
	NOT_MANUALLY_ADDED PromoOfferParticipationStatusFilterType = "NOT_MANUALLY_ADDED"
)
