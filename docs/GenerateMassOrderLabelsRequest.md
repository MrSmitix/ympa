# GenerateMassOrderLabelsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessId** | **Int64** | Идентификатор кабинета. | 
**OrderIds** | **Int64[]** | Список идентификаторов заказов. | 

## Examples

- Prepare the resource
```powershell
$GenerateMassOrderLabelsRequest = Initialize-ympa_powershell_clientGenerateMassOrderLabelsRequest  -BusinessId null `
 -OrderIds null
```

- Convert the resource to JSON
```powershell
$GenerateMassOrderLabelsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

