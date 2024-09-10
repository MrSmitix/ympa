# WarehouseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор склада. | 
**Name** | **String** | Название склада. | 
**CampaignId** | **Int64** | Идентификатор кампании в API и идентификатор магазина. | 
**Express** | **Boolean** | Возможна ли доставка по модели Экспресс. | 
**Address** | [**WarehouseAddressDTO**](WarehouseAddressDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$WarehouseDTO = Initialize-ympa_powershell_clientWarehouseDTO  -Id null `
 -Name null `
 -CampaignId null `
 -Express null `
 -Address null
```

- Convert the resource to JSON
```powershell
$WarehouseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

