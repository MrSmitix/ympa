package models

// GetQuarantineOffersRequest - Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
type GetQuarantineOffersRequest struct {

	// Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
	OfferIds *[]string `json:"offerIds,omitempty"`

	// Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
	CardStatuses *[]OfferCardStatusType `json:"cardStatuses,omitempty"`

	// Фильтр по категориям на Маркете.
	CategoryIds *[]int32 `json:"categoryIds,omitempty"`

	// Фильтр по брендам.
	VendorNames *[]string `json:"vendorNames,omitempty"`

	// Фильтр по тегам.
	Tags *[]string `json:"tags,omitempty"`
}
