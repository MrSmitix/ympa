package models
// OfferCampaignStatusType : Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
type OfferCampaignStatusType string

// List of OfferCampaignStatusType
const (
	PUBLISHED OfferCampaignStatusType = "PUBLISHED"
	CHECKING OfferCampaignStatusType = "CHECKING"
	DISABLED_BY_PARTNER OfferCampaignStatusType = "DISABLED_BY_PARTNER"
	DISABLED_AUTOMATICALLY OfferCampaignStatusType = "DISABLED_AUTOMATICALLY"
	REJECTED_BY_MARKET OfferCampaignStatusType = "REJECTED_BY_MARKET"
	CREATING_CARD OfferCampaignStatusType = "CREATING_CARD"
	NO_CARD OfferCampaignStatusType = "NO_CARD"
	NO_STOCKS OfferCampaignStatusType = "NO_STOCKS"
	ARCHIVED OfferCampaignStatusType = "ARCHIVED"
)
