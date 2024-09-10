# OfferProcessingStatusType

Статус публикации товара:  * `READY` — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * `IN_WORK` — товар проходит модерацию. Это занимает несколько дней. * `NEED_CONTENT` — для товара без SKU на Маркете `marketSku` нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре `notes`. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 

## Enum

* `UNKNOWN` (value: `'UNKNOWN'`)

* `READY` (value: `'READY'`)

* `IN_WORK` (value: `'IN_WORK'`)

* `NEED_INFO` (value: `'NEED_INFO'`)

* `NEED_MAPPING` (value: `'NEED_MAPPING'`)

* `NEED_CONTENT` (value: `'NEED_CONTENT'`)

* `CONTENT_PROCESSING` (value: `'CONTENT_PROCESSING'`)

* `SUSPENDED` (value: `'SUSPENDED'`)

* `REJECTED` (value: `'REJECTED'`)

* `REVIEW` (value: `'REVIEW'`)

* `CREATE_ERROR` (value: `'CREATE_ERROR'`)

* `UPDATE_ERROR` (value: `'UPDATE_ERROR'`)

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


