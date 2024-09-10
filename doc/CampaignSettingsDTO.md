# openapi.model.CampaignSettingsDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryRegion** | **int** | Идентификатор региона, в котором находится магазин. | [optional] 
**shopName** | **String** | Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`.  | [optional] 
**showInContext** | **bool** | Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции.  | [optional] 
**showInPremium** | **bool** | Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения.  | [optional] 
**useOpenStat** | **bool** | Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется.  | [optional] 
**localRegion** | [**CampaignSettingsLocalRegionDTO**](CampaignSettingsLocalRegionDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


