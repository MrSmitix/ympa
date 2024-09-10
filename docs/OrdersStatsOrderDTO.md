# OrdersStatsOrderDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор заказа. | [optional] [default to nothing]
**creationDate** | **Date** | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] [default to nothing]
**statusUpdateDate** | **ZonedDateTime** | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  | [optional] [default to nothing]
**status** | [***OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional] [default to nothing]
**partnerOrderId** | **String** | Идентификатор заказа в информационной системе магазина. | [optional] [default to nothing]
**paymentType** | [***OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional] [default to nothing]
**fake** | **Bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] [default to nothing]
**deliveryRegion** | [***OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] [default to nothing]
**items** | [**Vector{OrdersStatsItemDTO}**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | [default to nothing]
**initialItems** | [**Vector{OrdersStatsItemDTO}**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] [default to nothing]
**payments** | [**Vector{OrdersStatsPaymentDTO}**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | [default to nothing]
**commissions** | [**Vector{OrdersStatsCommissionDTO}**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


