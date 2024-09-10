# OrdersStatsDetailsDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_status** | [***models::OrdersStatsItemStatusType**](OrdersStatsItemStatusType.md) |  | [optional] [default to None]
**item_count** | **i64** | Количество товара со статусом, указанном в параметре `itemStatus`. | [optional] [default to None]
**update_date** | [***chrono::naive::NaiveDate**](date.md) | Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.  | [optional] [default to None]
**stock_type** | [***models::OrdersStatsStockType**](OrdersStatsStockType.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


