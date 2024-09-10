# ChatMessagesResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrderId** | **Int64** | Идентификатор заказа. | 
**Messages** | [**ChatMessageDTO[]**](ChatMessageDTO.md) | Информация о сообщениях. | 
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ChatMessagesResultDTO = Initialize-ympa_powershell_clientChatMessagesResultDTO  -OrderId null `
 -Messages null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$ChatMessagesResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

