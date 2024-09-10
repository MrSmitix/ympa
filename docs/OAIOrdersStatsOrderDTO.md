# OAIOrdersStatsOrderDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор заказа. | [optional] 
**creationDate** | **NSDate*** | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**statusUpdateDate** | **NSDate*** | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  | [optional] 
**status** | [**OAIOrderStatsStatusType***](OAIOrderStatsStatusType.md) |  | [optional] 
**partnerOrderId** | **NSString*** | Идентификатор заказа в информационной системе магазина. | [optional] 
**paymentType** | [**OAIOrdersStatsOrderPaymentType***](OAIOrdersStatsOrderPaymentType.md) |  | [optional] 
**fake** | **NSNumber*** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**deliveryRegion** | [**OAIOrdersStatsDeliveryRegionDTO***](OAIOrdersStatsDeliveryRegionDTO.md) |  | [optional] 
**items** | [**NSArray&lt;OAIOrdersStatsItemDTO&gt;***](OAIOrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | 
**initialItems** | [**NSArray&lt;OAIOrdersStatsItemDTO&gt;***](OAIOrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] 
**payments** | [**NSArray&lt;OAIOrdersStatsPaymentDTO&gt;***](OAIOrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | 
**commissions** | [**NSArray&lt;OAIOrdersStatsCommissionDTO&gt;***](OAIOrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


