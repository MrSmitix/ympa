# GenerateShipmentListDocumentReportRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **Int64** | Идентификатор кампании. | 
**ShipmentId** | **Int64** | Идентификатор отгрузки. | [optional] 
**OrderIds** | **Int64[]** | Фильтр по идентификаторам заказа в отгрузке. | [optional] 

## Examples

- Prepare the resource
```powershell
$GenerateShipmentListDocumentReportRequest = Initialize-ympa_powershell_clientGenerateShipmentListDocumentReportRequest  -CampaignId null `
 -ShipmentId null `
 -OrderIds null
```

- Convert the resource to JSON
```powershell
$GenerateShipmentListDocumentReportRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

