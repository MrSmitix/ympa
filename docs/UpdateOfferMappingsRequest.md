# UpdateOfferMappingsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferMappings** | [**UpdateOfferMappingDTO[]**](UpdateOfferMappingDTO.md) | Перечень товаров, которые нужно добавить или обновить. | 
**OnlyPartnerMediaContent** | **Boolean** | Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — &#x60;false&#x60;. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение &#x60;true&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateOfferMappingsRequest = Initialize-ympa_powershell_clientUpdateOfferMappingsRequest  -OfferMappings null `
 -OnlyPartnerMediaContent null
```

- Convert the resource to JSON
```powershell
$UpdateOfferMappingsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

