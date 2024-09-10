# GetChatsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderIds** | **Int64[]** | Фильтр по идентификаторам заказов на Маркете. | [optional] 
**Types** | [**ChatType[]**](ChatType.md) | Фильтр по типам чатов. | [optional] 
**Statuses** | [**ChatStatusType[]**](ChatStatusType.md) | Фильтр по статусам чатов. | [optional] 

## Examples

- Prepare the resource
```powershell
$GetChatsRequest = Initialize-ympa_powershell_clientGetChatsRequest  -OrderIds null `
 -Types null `
 -Statuses null
```

- Convert the resource to JSON
```powershell
$GetChatsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

