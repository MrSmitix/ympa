# CalculateTariffsOfferDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CategoryId** | **Int64** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**Price** | **Decimal** | Цена на товар в рублях. | 
**Length** | **Decimal** | Длина товара в сантиметрах. | 
**Width** | **Decimal** | Ширина товара в сантиметрах. | 
**Height** | **Decimal** | Высота товара в сантиметрах. | 
**Weight** | **Decimal** | Вес товара в килограммах. | 
**Quantity** | **Int32** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to 1]

## Examples

- Prepare the resource
```powershell
$CalculateTariffsOfferDTO = Initialize-ympa_powershell_clientCalculateTariffsOfferDTO  -CategoryId null `
 -Price null `
 -Length null `
 -Width null `
 -Height null `
 -Weight null `
 -Quantity null
```

- Convert the resource to JSON
```powershell
$CalculateTariffsOfferDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

