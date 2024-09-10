package models

// EnrichedModelDto - Модель товара.
type EnrichedModelDto struct {

	// Идентификатор модели товара.
	Id int64 `json:"id,omitempty"`

	// Название модели товара.
	Name string `json:"name,omitempty"`

	Prices ModelPriceDto `json:"prices,omitempty"`

	// Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. 
	Offers *[]ModelOfferDto `json:"offers,omitempty"`

	// Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина.
	OfflineOffers int32 `json:"offlineOffers,omitempty"`

	// Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина.
	OnlineOffers int32 `json:"onlineOffers,omitempty"`
}
