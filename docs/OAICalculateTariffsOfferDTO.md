# OAICalculateTariffsOfferDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryId** | **NSNumber*** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**price** | **NSNumber*** | Цена на товар в рублях. | 
**length** | **NSNumber*** | Длина товара в сантиметрах. | 
**width** | **NSNumber*** | Ширина товара в сантиметрах. | 
**height** | **NSNumber*** | Высота товара в сантиметрах. | 
**weight** | **NSNumber*** | Вес товара в килограммах. | 
**quantity** | **NSNumber*** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to @1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


