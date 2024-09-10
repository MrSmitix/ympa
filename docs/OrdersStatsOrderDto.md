# OrdersStatsOrderDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | Идентификатор заказа. | [optional]
**creation_date** | Option<[**String**](string.md)> | Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.  | [optional]
**status_update_date** | Option<**String**> | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).  | [optional]
**status** | Option<[**models::OrderStatsStatusType**](OrderStatsStatusType.md)> |  | [optional]
**partner_order_id** | Option<**String**> | Идентификатор заказа в информационной системе магазина. | [optional]
**payment_type** | Option<[**models::OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md)> |  | [optional]
**fake** | Option<**bool**> | Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional]
**delivery_region** | Option<[**models::OrdersStatsDeliveryRegionDto**](OrdersStatsDeliveryRegionDTO.md)> |  | [optional]
**items** | [**Vec<models::OrdersStatsItemDto>**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | 
**initial_items** | Option<[**Vec<models::OrdersStatsItemDto>**](OrdersStatsItemDTO.md)> | Список товаров в заказе до изменений. | [optional]
**payments** | [**Vec<models::OrdersStatsPaymentDto>**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | 
**commissions** | [**Vec<models::OrdersStatsCommissionDto>**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


