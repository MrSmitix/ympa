# OrderBusinessBuyerDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Inn** | **String** | ИНН. | [optional] 
**Kpp** | **String** | КПП. | [optional] 
**OrganizationName** | **String** | Наименование юридического лица. | [optional] 
**OrganizationJurAddress** | **String** | Юридический адрес. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderBusinessBuyerDTO = Initialize-ympa_powershell_clientOrderBusinessBuyerDTO  -Inn null `
 -Kpp null `
 -OrganizationName null `
 -OrganizationJurAddress null
```

- Convert the resource to JSON
```powershell
$OrderBusinessBuyerDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

