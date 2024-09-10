# OrdersStatsOrderDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional] 
**creationDate** | [**\DateTime**](Date.md) | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. | [optional] 
**statusUpdateDate** | **\DateTime** | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). | [optional] 
**status** | [**OpenAPI\Server\Model\OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional] 
**partnerOrderId** | **string** | Идентификатор заказа в информационной системе магазина. | [optional] 
**paymentType** | [**OpenAPI\Server\Model\OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional] 
**fake** | **bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. | [optional] 
**deliveryRegion** | [**OpenAPI\Server\Model\OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] 
**items** | [**OpenAPI\Server\Model\OrdersStatsItemDTO**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | 
**initialItems** | [**OpenAPI\Server\Model\OrdersStatsItemDTO**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] 
**payments** | [**OpenAPI\Server\Model\OrdersStatsPaymentDTO**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | 
**commissions** | [**OpenAPI\Server\Model\OrdersStatsCommissionDTO**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


