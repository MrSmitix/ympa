# ReturnDecisionDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReturnItemId** | **Int64** | Идентификатор товара в возврате. | [optional] 
**Count** | **Int32** | Количество единиц товара. | [optional] 
**Comment** | **String** | Комментарий. | [optional] 
**ReasonType** | [**ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] 
**SubreasonType** | [**ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] 
**DecisionType** | [**ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] 
**RefundAmount** | **Int64** | Сумма возврата. | [optional] 
**PartnerCompensation** | **Int64** | Компенсация за обратную доставку. | [optional] 
**Images** | **String[]** | Список хеш-кодов фотографий товара от покупателя. | [optional] 

## Examples

- Prepare the resource
```powershell
$ReturnDecisionDTO = Initialize-ympa_powershell_clientReturnDecisionDTO  -ReturnItemId null `
 -Count null `
 -Comment null `
 -ReasonType null `
 -SubreasonType null `
 -DecisionType null `
 -RefundAmount null `
 -PartnerCompensation null `
 -Images null
```

- Convert the resource to JSON
```powershell
$ReturnDecisionDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

