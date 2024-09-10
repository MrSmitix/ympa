# OrderItemDetailDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemCount** | **Int64** | Количество единиц товара. | [optional] 
**ItemStatus** | [**OrderItemStatusType**](OrderItemStatusType.md) |  | [optional] 
**UpdateDate** | **String** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderItemDetailDTO = Initialize-ympa_powershell_clientOrderItemDetailDTO  -ItemCount null `
 -ItemStatus null `
 -UpdateDate 23-09-2022
```

- Convert the resource to JSON
```powershell
$OrderItemDetailDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

