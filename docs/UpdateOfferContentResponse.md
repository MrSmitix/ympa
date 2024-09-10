# UpdateOfferContentResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**Results** | [**UpdateOfferContentResultDTO[]**](UpdateOfferContentResultDTO.md) | Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается.  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateOfferContentResponse = Initialize-ympa_powershell_clientUpdateOfferContentResponse  -Status null `
 -Results null
```

- Convert the resource to JSON
```powershell
$UpdateOfferContentResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

