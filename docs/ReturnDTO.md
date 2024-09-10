# ReturnDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор возврата. | [optional] 
**OrderId** | **Int64** | Номер заказа. | [optional] 
**CreationDate** | **System.DateTime** | Дата создания возврата клиентом. | [optional] 
**UpdateDate** | **System.DateTime** | Дата обновления возврата. | [optional] 
**RefundStatus** | [**RefundStatusType**](RefundStatusType.md) |  | [optional] 
**LogisticPickupPoint** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] 
**ShipmentRecipientType** | [**RecipientType**](RecipientType.md) |  | [optional] 
**ShipmentStatus** | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] 
**RefundAmount** | **Int64** | Сумма возврата. | [optional] 
**Items** | [**ReturnItemDTO[]**](ReturnItemDTO.md) | Список товаров в возврате. | 
**ReturnType** | [**ReturnType**](ReturnType.md) |  | [optional] 
**FastReturn** | **Boolean** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] 

## Examples

- Prepare the resource
```powershell
$ReturnDTO = Initialize-ympa_powershell_clientReturnDTO  -Id null `
 -OrderId null `
 -CreationDate null `
 -UpdateDate null `
 -RefundStatus null `
 -LogisticPickupPoint null `
 -ShipmentRecipientType null `
 -ShipmentStatus null `
 -RefundAmount null `
 -Items null `
 -ReturnType null `
 -FastReturn null
```

- Convert the resource to JSON
```powershell
$ReturnDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

