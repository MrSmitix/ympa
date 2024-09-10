package models

// RegionalModelInfoDto - Региональная информация.
type RegionalModelInfoDto struct {

	Currency CurrencyType `json:"currency,omitempty"`

	// Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md). 
	RegionId int64 `json:"regionId,omitempty"`
}
