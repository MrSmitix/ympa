# ympa_r_client::OrdersStatsDetailsDTO

Информация об удалении товара из заказа.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemStatus** | [**OrdersStatsItemStatusType**](OrdersStatsItemStatusType.md) |  | [optional] [Enum: ] 
**itemCount** | **integer** | Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;. | [optional] 
**updateDate** | **character** | Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**stockType** | [**OrdersStatsStockType**](OrdersStatsStockType.md) |  | [optional] [Enum: ] 


