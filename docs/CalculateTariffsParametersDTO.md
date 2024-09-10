# CalculateTariffsParametersDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CampaignId** | **Int64** | Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  | [optional] 
**SellingProgram** | [**SellingProgramType**](SellingProgramType.md) |  | [optional] 
**Frequency** | [**PaymentFrequencyType**](PaymentFrequencyType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CalculateTariffsParametersDTO = Initialize-ympa_powershell_clientCalculateTariffsParametersDTO  -CampaignId null `
 -SellingProgram null `
 -Frequency null
```

- Convert the resource to JSON
```powershell
$CalculateTariffsParametersDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

