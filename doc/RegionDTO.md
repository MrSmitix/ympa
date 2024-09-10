# openapi.model.RegionDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор региона. | [optional] 
**name** | **String** | Название региона. | 
**type** | [**RegionType**](RegionType.md) |  | 
**parent** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**children** | [**List<RegionDTO>**](RegionDTO.md) | Дочерние регионы. | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


