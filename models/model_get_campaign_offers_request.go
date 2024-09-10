package models

// GetCampaignOffersRequest - Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
type GetCampaignOffersRequest struct {

	// Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
	OfferIds *[]string `json:"offerIds,omitempty"`

	// Фильтр по статусам товаров. 
	Statuses *[]OfferCampaignStatusType `json:"statuses,omitempty"`

	// Фильтр по категориям на Маркете.
	CategoryIds *[]int32 `json:"categoryIds,omitempty"`

	// Фильтр по брендам.
	VendorNames *[]string `json:"vendorNames,omitempty"`

	// Фильтр по тегам.
	Tags *[]string `json:"tags,omitempty"`
}
