# OrdersStatsOrderDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор заказа. | [optional] [default to None]
**creation_date** | [***chrono::naive::NaiveDate**](date.md) | Дата создания заказа.  Формат даты: `ГГГГ-ММ-ДД`.  | [optional] [default to None]
**status_update_date** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, `2017-11-21T00:00:00`. Часовой пояс — UTC+03:00 (Москва).  | [optional] [default to None]
**status** | [***models::OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional] [default to None]
**partner_order_id** | **String** | Идентификатор заказа в информационной системе магазина. | [optional] [default to None]
**payment_type** | [***models::OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional] [default to None]
**fake** | **bool** | Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] [default to None]
**delivery_region** | [***models::OrdersStatsDeliveryRegionDto**](OrdersStatsDeliveryRegionDTO.md) |  | [optional] [default to None]
**items** | [**Vec<models::OrdersStatsItemDto>**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. | 
**initial_items** | [**Vec<models::OrdersStatsItemDto>**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional] [default to None]
**payments** | [**Vec<models::OrdersStatsPaymentDto>**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. | 
**commissions** | [**Vec<models::OrdersStatsCommissionDto>**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


