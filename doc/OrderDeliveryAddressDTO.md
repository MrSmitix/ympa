# openapi.model.OrderDeliveryAddressDTO

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **String** | Страна.  Обязательный параметр.  | [optional] 
**postcode** | **String** | Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`).  | [optional] 
**city** | **String** | Город или населенный пункт.  Обязательный параметр.  | [optional] 
**district** | **String** | Район. | [optional] 
**subway** | **String** | Станция метро. | [optional] 
**street** | **String** | Улица.  Обязательный параметр.  | [optional] 
**house** | **String** | Дом или владение.  Обязательный параметр.  | [optional] 
**block** | **String** | Корпус или строение. | [optional] 
**entrance** | **String** | Подъезд. | [optional] 
**entryphone** | **String** | Код домофона. | [optional] 
**floor** | **String** | Этаж. | [optional] 
**apartment** | **String** | Квартира или офис. | [optional] 
**phone** | **String** | Телефон получателя заказа.  Обязательный параметр.  | [optional] 
**recipient** | **String** | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  | [optional] 
**gps** | [**GpsDTO**](GpsDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


