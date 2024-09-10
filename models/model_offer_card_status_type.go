package models
// OfferCardStatusType : Статус карточки товара:  * `HAS_CARD_CAN_NOT_UPDATE` — Карточка Маркета. * `HAS_CARD_CAN_UPDATE` — Можно дополнить. * `HAS_CARD_CAN_UPDATE_ERRORS` — Изменения не приняты. * `HAS_CARD_CAN_UPDATE_PROCESSING` — Изменения на проверке. * `NO_CARD_NEED_CONTENT` — Создайте карточку. * `NO_CARD_MARKET_WILL_CREATE` — Создаст Маркет. * `NO_CARD_ERRORS` — Не создана из-за ошибки. * `NO_CARD_PROCESSING` — Проверяем данные. * `NO_CARD_ADD_TO_CAMPAIGN` — Разместите товар в магазине.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/content/statuses.html) 
type OfferCardStatusType string

// List of OfferCardStatusType
const (
	HAS_CARD_CAN_NOT_UPDATE OfferCardStatusType = "HAS_CARD_CAN_NOT_UPDATE"
	HAS_CARD_CAN_UPDATE OfferCardStatusType = "HAS_CARD_CAN_UPDATE"
	HAS_CARD_CAN_UPDATE_ERRORS OfferCardStatusType = "HAS_CARD_CAN_UPDATE_ERRORS"
	HAS_CARD_CAN_UPDATE_PROCESSING OfferCardStatusType = "HAS_CARD_CAN_UPDATE_PROCESSING"
	NO_CARD_NEED_CONTENT OfferCardStatusType = "NO_CARD_NEED_CONTENT"
	NO_CARD_MARKET_WILL_CREATE OfferCardStatusType = "NO_CARD_MARKET_WILL_CREATE"
	NO_CARD_ERRORS OfferCardStatusType = "NO_CARD_ERRORS"
	NO_CARD_PROCESSING OfferCardStatusType = "NO_CARD_PROCESSING"
	NO_CARD_ADD_TO_CAMPAIGN OfferCardStatusType = "NO_CARD_ADD_TO_CAMPAIGN"
)
