

# CalculateTariffsOfferDTO

Параметры товара, для которого нужно рассчитать стоимость услуг.

The class is defined in **[CalculateTariffsOfferDTO.java](../../src/main/java/org/openapitools/model/CalculateTariffsOfferDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryId** | `Long` | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**price** | `BigDecimal` | Цена на товар в рублях. | 
**length** | `BigDecimal` | Длина товара в сантиметрах. | 
**width** | `BigDecimal` | Ширина товара в сантиметрах. | 
**height** | `BigDecimal` | Высота товара в сантиметрах. | 
**weight** | `BigDecimal` | Вес товара в килограммах. | 
**quantity** | `Integer` | Квант продажи — количество единиц товара в одном товарном предложении. |  [optional property]









