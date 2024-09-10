# openapi.model.GetPromoDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор акции. | 
**name** | **String** | Название акции. | 
**period** | [**PromoPeriodDTO**](PromoPeriodDTO.md) |  | 
**participating** | **bool** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением `true`, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением `false`.  Для прошедших акций всегда возвращается со значением `true`.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**assortmentInfo** | [**GetPromoAssortmentInfoDTO**](GetPromoAssortmentInfoDTO.md) |  | 
**mechanicsInfo** | [**GetPromoMechanicsInfoDTO**](GetPromoMechanicsInfoDTO.md) |  | 
**bestsellerInfo** | [**GetPromoBestsellerInfoDTO**](GetPromoBestsellerInfoDTO.md) |  | 
**channels** | [**List<ChannelType>**](ChannelType.md) | Список каналов продвижения товаров. | [optional] [default to const []]
**constraints** | [**GetPromoConstraintsDTO**](GetPromoConstraintsDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


