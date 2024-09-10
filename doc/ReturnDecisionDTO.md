# openapi.model.ReturnDecisionDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**returnItemId** | **int** | Идентификатор товара в возврате. | [optional] 
**count** | **int** | Количество единиц товара. | [optional] 
**comment** | **String** | Комментарий. | [optional] 
**reasonType** | [**ReturnDecisionReasonType**](ReturnDecisionReasonType.md) |  | [optional] 
**subreasonType** | [**ReturnDecisionSubreasonType**](ReturnDecisionSubreasonType.md) |  | [optional] 
**decisionType** | [**ReturnDecisionType**](ReturnDecisionType.md) |  | [optional] 
**refundAmount** | **int** | Сумма возврата. | [optional] 
**partnerCompensation** | **int** | Компенсация за обратную доставку. | [optional] 
**images** | **List<String>** | Список хеш-кодов фотографий товара от покупателя. | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


