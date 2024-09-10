package models

// GetPromoAssortmentInfoDto - Информация о товарах в акции.
type GetPromoAssortmentInfoDto struct {

	// Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
	ActiveOffers int32 `json:"activeOffers"`

	// Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций. 
	PotentialOffers int32 `json:"potentialOffers,omitempty"`

	// Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций. 
	Processing bool `json:"processing,omitempty"`
}
