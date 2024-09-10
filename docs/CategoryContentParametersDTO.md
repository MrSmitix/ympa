# CategoryContentParametersDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CategoryId** | **Int32** | Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). | 
**Parameters** | [**CategoryParameterDTO[]**](CategoryParameterDTO.md) | Список характеристик. | [optional] 

## Examples

- Prepare the resource
```powershell
$CategoryContentParametersDTO = Initialize-ympa_powershell_clientCategoryContentParametersDTO  -CategoryId null `
 -Parameters null
```

- Convert the resource to JSON
```powershell
$CategoryContentParametersDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

