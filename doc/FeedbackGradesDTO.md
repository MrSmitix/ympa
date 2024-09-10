# openapi.model.FeedbackGradesDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**average** | **num** | Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»). | [optional] 
**agreeCount** | **int** | Количество пользователей, считающих отзыв полезным. | [optional] 
**rejectCount** | **int** | Количество пользователей, считающих отзыв бесполезным. | [optional] 
**factors** | [**List<FeedbackFactorDTO>**](FeedbackFactorDTO.md) | Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор.  | [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


