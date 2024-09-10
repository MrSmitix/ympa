# GetPromoAssortmentInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActiveOffers** | **Int32** | Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**PotentialOffers** | **Int32** | Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.  | [optional] 
**Processing** | **Boolean** | Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPromoAssortmentInfoDTO = Initialize-ympa_powershell_clientGetPromoAssortmentInfoDTO  -ActiveOffers null `
 -PotentialOffers null `
 -Processing null
```

- Convert the resource to JSON
```powershell
$GetPromoAssortmentInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

