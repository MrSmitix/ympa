# UpdateOfferMappingsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Results** | [**UpdateOfferMappingResultDTO[]**](UpdateOfferMappingResultDTO.md) | Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateOfferMappingsResponse = Initialize-ympa_powershell_clientUpdateOfferMappingsResponse  -Status null `
 -Results null
```

- Convert the resource to JSON
```powershell
$UpdateOfferMappingsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

