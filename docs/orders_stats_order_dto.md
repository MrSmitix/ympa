# orders_stats_order_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор заказа. | [optional] 
**creation_date** | **char \*** | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**status_update_date** | **char \*** | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).  | [optional] 
**status** | **order_stats_status_type_t \*** |  | [optional] 
**partner_order_id** | **char \*** | Идентификатор заказа в информационной системе магазина. | [optional] 
**payment_type** | **orders_stats_order_payment_type_t \*** |  | [optional] 
**fake** | **int** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**delivery_region** | [**orders_stats_delivery_region_dto_t**](orders_stats_delivery_region_dto.md) \* |  | [optional] 
**items** | [**list_t**](orders_stats_item_dto.md) \* | Список товаров в заказе после возможных изменений. | 
**initial_items** | [**list_t**](orders_stats_item_dto.md) \* | Список товаров в заказе до изменений. | [optional] 
**payments** | [**list_t**](orders_stats_payment_dto.md) \* | Информация о денежных переводах по заказу. | 
**commissions** | [**list_t**](orders_stats_commission_dto.md) \* | Информация о комиссиях за заказ. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


