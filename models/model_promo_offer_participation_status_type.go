package models
// PromoOfferParticipationStatusType : Статус товара в акции:  * `AUTO` — добавлен автоматически во всех магазинах кабинета, в которых товар доступен для покупки.  * `PARTIALLY_AUTO` — добавлен автоматически у части магазинов.  * `MANUAL` — добавлен вручную.  * `NOT_PARTICIPATING` — не участвует в акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
type PromoOfferParticipationStatusType string

// List of PromoOfferParticipationStatusType
const (
	AUTO PromoOfferParticipationStatusType = "AUTO"
	PARTIALLY_AUTO PromoOfferParticipationStatusType = "PARTIALLY_AUTO"
	MANUAL PromoOfferParticipationStatusType = "MANUAL"
	NOT_PARTICIPATING PromoOfferParticipationStatusType = "NOT_PARTICIPATING"
)
