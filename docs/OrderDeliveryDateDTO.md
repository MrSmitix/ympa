# OrderDeliveryDateDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ToDate** | **System.DateTime** | Новая дата доставки заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 

## Examples

- Prepare the resource
```powershell
$OrderDeliveryDateDTO = Initialize-ympa_powershell_clientOrderDeliveryDateDTO  -ToDate null
```

- Convert the resource to JSON
```powershell
$OrderDeliveryDateDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

