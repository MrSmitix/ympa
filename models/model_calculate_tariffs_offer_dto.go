package models

// CalculateTariffsOfferDto - Параметры товара, для которого нужно рассчитать стоимость услуг.
type CalculateTariffsOfferDto struct {

	// Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
	CategoryId int64 `json:"categoryId"`

	// Цена на товар в рублях.
	Price float32 `json:"price"`

	// Длина товара в сантиметрах.
	Length float32 `json:"length"`

	// Ширина товара в сантиметрах.
	Width float32 `json:"width"`

	// Высота товара в сантиметрах.
	Height float32 `json:"height"`

	// Вес товара в килограммах.
	Weight float32 `json:"weight"`

	// Квант продажи — количество единиц товара в одном товарном предложении.
	Quantity int32 `json:"quantity,omitempty"`
}
