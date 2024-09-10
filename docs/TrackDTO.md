# TrackDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TrackCode** | **String** | Трек-код почтового отправления. | [optional] 

## Examples

- Prepare the resource
```powershell
$TrackDTO = Initialize-ympa_powershell_clientTrackDTO  -TrackCode null
```

- Convert the resource to JSON
```powershell
$TrackDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

