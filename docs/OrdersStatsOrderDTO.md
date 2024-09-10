# ympa_r_client::OrdersStatsOrderDTO

Информация о заказе.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор заказа. | [optional] 
**creationDate** | **character** | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**statusUpdateDate** | **character** | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  | [optional] 
**status** | [**OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional] [Enum: ] 
**partnerOrderId** | **character** | Идентификатор заказа в информационной системе магазина. | [optional] 
**paymentType** | [**OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional] [Enum: ] 
**fake** | **character** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**deliveryRegion** | [**OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] 
**items** | [**array[OrdersStatsItemDTO]**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | 
**initialItems** | [**array[OrdersStatsItemDTO]**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] 
**payments** | [**array[OrdersStatsPaymentDTO]**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | 
**commissions** | [**array[OrdersStatsCommissionDTO]**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | 


