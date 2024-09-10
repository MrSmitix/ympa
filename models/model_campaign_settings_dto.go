package models

// CampaignSettingsDto - Настройки магазина.
type CampaignSettingsDto struct {

	// Идентификатор региона, в котором находится магазин.
	CountryRegion int64 `json:"countryRegion,omitempty"`

	// Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
	ShopName string `json:"shopName,omitempty"`

	// Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
	ShowInContext bool `json:"showInContext,omitempty"`

	// Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
	ShowInPremium bool `json:"showInPremium,omitempty"`

	// Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
	UseOpenStat bool `json:"useOpenStat,omitempty"`

	LocalRegion CampaignSettingsLocalRegionDto `json:"localRegion,omitempty"`
}
