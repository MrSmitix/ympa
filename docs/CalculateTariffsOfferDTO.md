

# CalculateTariffsOfferDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryId** | **Long** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**price** | [**BigDecimal**](BigDecimal.md) | Цена на товар в рублях. | 
**length** | [**BigDecimal**](BigDecimal.md) | Длина товара в сантиметрах. | 
**width** | [**BigDecimal**](BigDecimal.md) | Ширина товара в сантиметрах. | 
**height** | [**BigDecimal**](BigDecimal.md) | Высота товара в сантиметрах. | 
**weight** | [**BigDecimal**](BigDecimal.md) | Вес товара в килограммах. | 
**quantity** | **Integer** | Квант продажи — количество единиц товара в одном товарном предложении. |  [optional]




