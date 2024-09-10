# CalculateTariffsOfferDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_id** | **i64** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**price** | **f64** | Цена на товар в рублях. | 
**length** | **f64** | Длина товара в сантиметрах. | 
**width** | **f64** | Ширина товара в сантиметрах. | 
**height** | **f64** | Высота товара в сантиметрах. | 
**weight** | **f64** | Вес товара в килограммах. | 
**quantity** | **u32** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to Some(1)]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


