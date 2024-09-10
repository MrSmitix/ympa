# CalculateTariffsOfferInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offer** | [**CalculateTariffsOfferDTO**](CalculateTariffsOfferDTO.md) |  | 
**Tariffs** | [**CalculatedTariffDTO[]**](CalculatedTariffDTO.md) | Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | 

## Examples

- Prepare the resource
```powershell
$CalculateTariffsOfferInfoDTO = Initialize-ympa_powershell_clientCalculateTariffsOfferInfoDTO  -Offer null `
 -Tariffs null
```

- Convert the resource to JSON
```powershell
$CalculateTariffsOfferInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

