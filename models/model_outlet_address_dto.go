package models

// OutletAddressDto - Адрес точки продаж. 
type OutletAddressDto struct {

	// Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
	RegionId int64 `json:"regionId"`

	// Улица.
	Street string `json:"street,omitempty"`

	// Номер дома.
	Number string `json:"number,omitempty"`

	// Номер строения.
	Building string `json:"building,omitempty"`

	// Номер владения.
	Estate string `json:"estate,omitempty"`

	// Номер корпуса.
	Block string `json:"block,omitempty"`

	// Дополнительная информация.
	Additional string `json:"additional,omitempty"`

	// Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
	Km int32 `json:"km,omitempty"`

	// {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
	City string `json:"city,omitempty"`
}
