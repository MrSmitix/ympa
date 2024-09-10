package models

type GetOfferMappingsRequest struct {

	// Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
	OfferIds *[]string `json:"offerIds,omitempty"`

	// Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
	CardStatuses *[]OfferCardStatusType `json:"cardStatuses,omitempty"`

	// Фильтр по категориям на Маркете.
	CategoryIds *[]int32 `json:"categoryIds,omitempty"`

	// Фильтр по брендам.
	VendorNames *[]string `json:"vendorNames,omitempty"`

	// Фильтр по тегам.
	Tags *[]string `json:"tags,omitempty"`

	// Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
	Archived bool `json:"archived,omitempty"`
}
