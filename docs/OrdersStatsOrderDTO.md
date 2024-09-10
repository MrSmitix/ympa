

# OrdersStatsOrderDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Идентификатор заказа. |  [optional]
**creationDate** | [**Date**](Date.md) | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  |  [optional]
**statusUpdateDate** | [**Date**](Date.md) | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  |  [optional]
**status** | [**OrderStatsStatusType**](OrderStatsStatusType.md) |  |  [optional]
**partnerOrderId** | **String** | Идентификатор заказа в информационной системе магазина. |  [optional]
**paymentType** | [**OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  |  [optional]
**fake** | **Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  |  [optional]
**deliveryRegion** | [**OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  |  [optional]
**items** | [**List&lt;OrdersStatsItemDTO&gt;**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | 
**initialItems** | [**List&lt;OrdersStatsItemDTO&gt;**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. |  [optional]
**payments** | [**List&lt;OrdersStatsPaymentDTO&gt;**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | 
**commissions** | [**List&lt;OrdersStatsCommissionDTO&gt;**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | 




