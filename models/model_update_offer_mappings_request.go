package models

type UpdateOfferMappingsRequest struct {

	// Перечень товаров, которые нужно добавить или обновить.
	OfferMappings []UpdateOfferMappingDto `json:"offerMappings"`

	// Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
	OnlyPartnerMediaContent bool `json:"onlyPartnerMediaContent,omitempty"`
}
