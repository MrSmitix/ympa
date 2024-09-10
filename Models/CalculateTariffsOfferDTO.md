# CalculateTariffsOfferDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **categoryId** | **Long** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | [default to null] |
| **price** | **BigDecimal** | Цена на товар в рублях. | [default to null] |
| **length** | **BigDecimal** | Длина товара в сантиметрах. | [default to null] |
| **width** | **BigDecimal** | Ширина товара в сантиметрах. | [default to null] |
| **height** | **BigDecimal** | Высота товара в сантиметрах. | [default to null] |
| **weight** | **BigDecimal** | Вес товара в килограммах. | [default to null] |
| **quantity** | **Integer** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to 1] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

