# CalculateTariffsOfferDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryId** | **Int64** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | [default to nothing]
**price** | **Float64** | Цена на товар в рублях. | [default to nothing]
**length** | **Float64** | Длина товара в сантиметрах. | [default to nothing]
**width** | **Float64** | Ширина товара в сантиметрах. | [default to nothing]
**height** | **Float64** | Высота товара в сантиметрах. | [default to nothing]
**weight** | **Float64** | Вес товара в килограммах. | [default to nothing]
**quantity** | **Int64** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to 1]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


