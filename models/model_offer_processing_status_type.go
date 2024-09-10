package models
// OfferProcessingStatusType : Статус публикации товара:  * `READY` — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * `IN_WORK` — товар проходит модерацию. Это занимает несколько дней. * `NEED_CONTENT` — для товара без SKU на Маркете `marketSku` нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре `notes`. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 
type OfferProcessingStatusType string

// List of OfferProcessingStatusType
const (
	UNKNOWN OfferProcessingStatusType = "UNKNOWN"
	READY OfferProcessingStatusType = "READY"
	IN_WORK OfferProcessingStatusType = "IN_WORK"
	NEED_INFO OfferProcessingStatusType = "NEED_INFO"
	NEED_MAPPING OfferProcessingStatusType = "NEED_MAPPING"
	NEED_CONTENT OfferProcessingStatusType = "NEED_CONTENT"
	CONTENT_PROCESSING OfferProcessingStatusType = "CONTENT_PROCESSING"
	SUSPENDED OfferProcessingStatusType = "SUSPENDED"
	REJECTED OfferProcessingStatusType = "REJECTED"
	REVIEW OfferProcessingStatusType = "REVIEW"
	CREATE_ERROR OfferProcessingStatusType = "CREATE_ERROR"
	UPDATE_ERROR OfferProcessingStatusType = "UPDATE_ERROR"
)
