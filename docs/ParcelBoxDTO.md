# ParcelBoxDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] 
**FulfilmentId** | **String** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] 

## Examples

- Prepare the resource
```powershell
$ParcelBoxDTO = Initialize-ympa_powershell_clientParcelBoxDTO  -Id null `
 -FulfilmentId null
```

- Convert the resource to JSON
```powershell
$ParcelBoxDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

