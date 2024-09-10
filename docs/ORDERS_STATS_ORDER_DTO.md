# ORDERS_STATS_ORDER_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор заказа. | [optional] [default to null]
**creation_date** | [**DATE**](DATE.md) | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] [default to null]
**status_update_date** | [**DATE_TIME**](DATE_TIME.md) | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  | [optional] [default to null]
**status** | [**ORDER_STATS_STATUS_TYPE**](OrderStatsStatusType.md) |  | [optional] [default to null]
**partner_order_id** | [**STRING_32**](STRING_32.md) | Идентификатор заказа в информационной системе магазина. | [optional] [default to null]
**payment_type** | [**ORDERS_STATS_ORDER_PAYMENT_TYPE**](OrdersStatsOrderPaymentType.md) |  | [optional] [default to null]
**fake** | **BOOLEAN** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] [default to null]
**delivery_region** | [**ORDERS_STATS_DELIVERY_REGION_DTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] [default to null]
**items** | [**LIST [ORDERS_STATS_ITEM_DTO]**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | [default to null]
**initial_items** | [**LIST [ORDERS_STATS_ITEM_DTO]**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] [default to null]
**payments** | [**LIST [ORDERS_STATS_PAYMENT_DTO]**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | [default to null]
**commissions** | [**LIST [ORDERS_STATS_COMMISSION_DTO]**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


