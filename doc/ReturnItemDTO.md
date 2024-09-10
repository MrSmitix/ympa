# openapi.model.ReturnItemDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketSku** | **int** | SKU на Маркете. | [optional] 
**shopSku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**count** | **int** | Количество единиц товара. | 
**decisions** | [**List<ReturnDecisionDTO>**](ReturnDecisionDTO.md) | Список решений по возврату. | [optional] [default to const []]
**instances** | [**List<ReturnInstanceDTO>**](ReturnInstanceDTO.md) | Список логистических позиций возврата. | [optional] [default to const []]
**tracks** | [**List<TrackDTO>**](TrackDTO.md) | Список трек-кодов для почтовых отправлений. | [optional] [default to const []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


