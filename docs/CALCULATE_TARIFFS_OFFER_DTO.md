# CALCULATE_TARIFFS_OFFER_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_id** | **INTEGER_64** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | [default to null]
**price** | **REAL_32** | Цена на товар в рублях. | [default to null]
**length** | **REAL_32** | Длина товара в сантиметрах. | [default to null]
**width** | **REAL_32** | Ширина товара в сантиметрах. | [default to null]
**height** | **REAL_32** | Высота товара в сантиметрах. | [default to null]
**weight** | **REAL_32** | Вес товара в килограммах. | [default to null]
**quantity** | **INTEGER_32** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


