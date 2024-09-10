# openapi.model.TariffDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TariffType**](TariffType.md) |  | 
**percent** | **num** | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  | [optional] 
**amount** | **num** | Значение тарифа в рублях. | 
**parameters** | [**List<TariffParameterDTO>**](TariffParameterDTO.md) | Параметры расчета тарифа. | [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


