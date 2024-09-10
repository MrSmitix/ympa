package models
// OfferType : Особый тип товара:  * `MEDICINE` — лекарства. * `BOOK` — бумажные и электронные книги. * `AUDIOBOOK` — аудиокниги. * `ARTIST_TITLE` — музыкальная и видеопродукция. * `ON_DEMAND` — товары на заказ.  {% note info \"Если ваш товар — книга\" %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
type OfferType string

// List of OfferType
const (
	DEFAULT OfferType = "DEFAULT"
	MEDICINE OfferType = "MEDICINE"
	BOOK OfferType = "BOOK"
	AUDIOBOOK OfferType = "AUDIOBOOK"
	ARTIST_TITLE OfferType = "ARTIST_TITLE"
	ON_DEMAND OfferType = "ON_DEMAND"
)
