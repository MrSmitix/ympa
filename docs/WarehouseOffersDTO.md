# WarehouseOffersDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WarehouseId** | **Int64** | Идентификатор склада. | 
**Offers** | [**WarehouseOfferDTO[]**](WarehouseOfferDTO.md) | Информация об остатках. | 

## Examples

- Prepare the resource
```powershell
$WarehouseOffersDTO = Initialize-ympa_powershell_clientWarehouseOffersDTO  -WarehouseId null `
 -Offers null
```

- Convert the resource to JSON
```powershell
$WarehouseOffersDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

