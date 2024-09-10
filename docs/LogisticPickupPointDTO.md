# LogisticPickupPointDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор пункта вывоза. | [optional] 
**Name** | **String** | Название пункта вывоза. | [optional] 
**Address** | [**PickupAddressDTO**](PickupAddressDTO.md) |  | [optional] 
**Instruction** | **String** | Дополнительные инструкции к вывозу. | [optional] 
**Type** | [**LogisticPointType**](LogisticPointType.md) |  | [optional] 
**LogisticPartnerId** | **Int64** | Идентификатор логистического партнера, к которому относится логистическая точка. | [optional] 

## Examples

- Prepare the resource
```powershell
$LogisticPickupPointDTO = Initialize-ympa_powershell_clientLogisticPickupPointDTO  -Id null `
 -Name null `
 -Address null `
 -Instruction null `
 -Type null `
 -LogisticPartnerId null
```

- Convert the resource to JSON
```powershell
$LogisticPickupPointDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

