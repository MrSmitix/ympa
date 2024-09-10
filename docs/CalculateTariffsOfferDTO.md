
# CalculateTariffsOfferDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **categoryId** | **kotlin.Long** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  |  |
| **price** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена на товар в рублях. |  |
| **length** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Длина товара в сантиметрах. |  |
| **width** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Ширина товара в сантиметрах. |  |
| **height** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Высота товара в сантиметрах. |  |
| **weight** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Вес товара в килограммах. |  |
| **quantity** | **kotlin.Int** | Квант продажи — количество единиц товара в одном товарном предложении. |  [optional] |



