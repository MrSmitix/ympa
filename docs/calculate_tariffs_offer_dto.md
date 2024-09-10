# calculate_tariffs_offer_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_id** | **long** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**price** | **double** | Цена на товар в рублях. | 
**length** | **double** | Длина товара в сантиметрах. | 
**width** | **double** | Ширина товара в сантиметрах. | 
**height** | **double** | Высота товара в сантиметрах. | 
**weight** | **double** | Вес товара в килограммах. | 
**quantity** | **int** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


