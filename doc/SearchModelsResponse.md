# openapi.model.SearchModelsResponse

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**List<ModelDTO>**](ModelDTO.md) | Список моделей товаров. | [default to const []]
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**regionId** | **int** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 
**pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


