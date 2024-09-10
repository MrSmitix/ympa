# SearchShipmentsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateFrom** | **System.DateTime** | Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**DateTo** | **System.DateTime** | Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | 
**Statuses** | [**ShipmentStatusType[]**](ShipmentStatusType.md) | Список статусов отгрузок. | [optional] 
**OrderIds** | **Int64[]** | Список идентификаторов заказов из отгрузок. | [optional] 
**CancelledOrders** | **Boolean** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional] [default to $true]

## Examples

- Prepare the resource
```powershell
$SearchShipmentsRequest = Initialize-ympa_powershell_clientSearchShipmentsRequest  -DateFrom null `
 -DateTo null `
 -Statuses null `
 -OrderIds null `
 -CancelledOrders null
```

- Convert the resource to JSON
```powershell
$SearchShipmentsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

