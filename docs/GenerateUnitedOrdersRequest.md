# GenerateUnitedOrdersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **Int64** | Идентификатор бизнеса. | 
**DateFrom** | **System.DateTime** | Начало периода, включительно. | 
**DateTo** | **System.DateTime** | Конец периода, включительно. Максимальный период — 1 год. | 
**CampaignIds** | **Int64[]** | Список магазинов, которые нужны в отчете. | [optional] 
**PromoId** | **String** | Идентификатор акции, товары из которой нужны в отчете. | [optional] 

## Examples

- Prepare the resource
```powershell
$GenerateUnitedOrdersRequest = Initialize-ympa_powershell_clientGenerateUnitedOrdersRequest  -BusinessId null `
 -DateFrom null `
 -DateTo null `
 -CampaignIds null `
 -PromoId null
```

- Convert the resource to JSON
```powershell
$GenerateUnitedOrdersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

