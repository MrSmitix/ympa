# OrdersStatsDetailsDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_status** | Option<[**models::OrdersStatsItemStatusType**](OrdersStatsItemStatusType.md)> |  | [optional]
**item_count** | Option<**i64**> | Количество товара со статусом, указанном в параметре `itemStatus`. | [optional]
**update_date** | Option<[**String**](string.md)> | Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.  | [optional]
**stock_type** | Option<[**models::OrdersStatsStockType**](OrdersStatsStockType.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


