# OrdersStatsOrderDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Long** | Идентификатор заказа. | [optional] [default to null] |
| **creationDate** | **date** | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] [default to null] |
| **statusUpdateDate** | **Date** | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  | [optional] [default to null] |
| **status** | [**OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional] [default to null] |
| **partnerOrderId** | **String** | Идентификатор заказа в информационной системе магазина. | [optional] [default to null] |
| **paymentType** | [**OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional] [default to null] |
| **fake** | **Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] [default to null] |
| **deliveryRegion** | [**OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] [default to null] |
| **items** | [**List**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | [default to null] |
| **initialItems** | [**List**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] [default to null] |
| **payments** | [**List**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | [default to null] |
| **commissions** | [**List**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

