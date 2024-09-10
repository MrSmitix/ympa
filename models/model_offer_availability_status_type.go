package models
// OfferAvailabilityStatusType : Планы по поставкам:  * `ACTIVE` — поставки будут. * `INACTIVE` — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. Через 60 дней после того, как товар закончится на складе, этот статус изменится на `DELISTED`. * `DELISTED` — архив: товар закончился на складе, и его поставок больше не будет. Если товар вернется на склад (например, покупатель вернет заказ), этот статус изменится на `INACTIVE`. 
type OfferAvailabilityStatusType string

// List of OfferAvailabilityStatusType
const (
	ACTIVE OfferAvailabilityStatusType = "ACTIVE"
	INACTIVE OfferAvailabilityStatusType = "INACTIVE"
	DELISTED OfferAvailabilityStatusType = "DELISTED"
)
