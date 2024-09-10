package models

// GetPromoDto - Информация об акции.
type GetPromoDto struct {

	// Идентификатор акции.
	Id string `json:"id"`

	// Название акции.
	Name string `json:"name"`

	Period PromoPeriodDto `json:"period"`

	// Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
	Participating bool `json:"participating"`

	AssortmentInfo GetPromoAssortmentInfoDto `json:"assortmentInfo"`

	MechanicsInfo GetPromoMechanicsInfoDto `json:"mechanicsInfo"`

	BestsellerInfo GetPromoBestsellerInfoDto `json:"bestsellerInfo"`

	// Список каналов продвижения товаров.
	Channels *[]ChannelType `json:"channels,omitempty"`

	Constraints GetPromoConstraintsDto `json:"constraints,omitempty"`
}
