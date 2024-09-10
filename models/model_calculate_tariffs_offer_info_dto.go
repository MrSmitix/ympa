package models

// CalculateTariffsOfferInfoDto - Стоимость услуг.
type CalculateTariffsOfferInfoDto struct {

	Offer CalculateTariffsOfferDto `json:"offer"`

	// Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
	Tariffs []CalculatedTariffDto `json:"tariffs"`
}
