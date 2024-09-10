# openapi.model.CalculateTariffsOfferDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryId** | **int** | Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 
**price** | **num** | Цена на товар в рублях. | 
**length** | **num** | Длина товара в сантиметрах. | 
**width** | **num** | Ширина товара в сантиметрах. | 
**height** | **num** | Высота товара в сантиметрах. | 
**weight** | **num** | Вес товара в килограммах. | 
**quantity** | **int** | Квант продажи — количество единиц товара в одном товарном предложении. | [optional] [default to 1]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


