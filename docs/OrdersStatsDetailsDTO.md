# OrdersStatsDetailsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemStatus** | [**OrdersStatsItemStatusType**](OrdersStatsItemStatusType.md) |  | [optional] 
**ItemCount** | **Int64** | Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;. | [optional] 
**UpdateDate** | **System.DateTime** | Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**StockType** | [**OrdersStatsStockType**](OrdersStatsStockType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrdersStatsDetailsDTO = Initialize-ympa_powershell_clientOrdersStatsDetailsDTO  -ItemStatus null `
 -ItemCount null `
 -UpdateDate null `
 -StockType null
```

- Convert the resource to JSON
```powershell
$OrdersStatsDetailsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

