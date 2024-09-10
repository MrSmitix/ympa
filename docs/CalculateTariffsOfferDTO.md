# ympa_csharp_client.Model.CalculateTariffsOfferDTO
Параметры товара, для которого нужно рассчитать стоимость услуг.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CategoryId** | **long** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**Price** | **decimal** | Цена на товар в рублях. | 
**Length** | **decimal** | Длина товара в сантиметрах. | 
**Width** | **decimal** | Ширина товара в сантиметрах. | 
**Height** | **decimal** | Высота товара в сантиметрах. | 
**Weight** | **decimal** | Вес товара в килограммах. | 
**Quantity** | **int** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

