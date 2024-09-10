# CalculateTariffsOfferDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryId** | **Int64** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**price** | **Double** | Цена на товар в рублях. | 
**length** | **Double** | Длина товара в сантиметрах. | 
**width** | **Double** | Ширина товара в сантиметрах. | 
**height** | **Double** | Высота товара в сантиметрах. | 
**weight** | **Double** | Вес товара в килограммах. | 
**quantity** | **Int** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


