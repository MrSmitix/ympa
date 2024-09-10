
# Table `CalculateTariffsOfferDTO`
(mapped from: CalculateTariffsOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**categoryId** | categoryId | long UNSIGNED NOT NULL |  | **kotlin.Long** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**price** | price | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена на товар в рублях. | 
**length** | length | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Длина товара в сантиметрах. | 
**width** | width | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Ширина товара в сантиметрах. | 
**height** | height | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Высота товара в сантиметрах. | 
**weight** | weight | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Вес товара в килограммах. | 
**quantity** | quantity | int UNSIGNED |  | **kotlin.Int** | Квант продажи — количество единиц товара в одном товарном предложении. |  [optional]









