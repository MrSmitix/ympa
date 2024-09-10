# GetChatsInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Chats** | [**GetChatInfoDTO[]**](GetChatInfoDTO.md) | Информация о чатах. | 
**Paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetChatsInfoDTO = Initialize-ympa_powershell_clientGetChatsInfoDTO  -Chats null `
 -Paging null
```

- Convert the resource to JSON
```powershell
$GetChatsInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

