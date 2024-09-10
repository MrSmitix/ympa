# ympa_csharp_client.Model.OrderDeliveryAddressDTO
Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | **string** | Страна.  Обязательный параметр.  | [optional] 
**Postcode** | **string** | Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).  | [optional] 
**City** | **string** | Город или населенный пункт.  Обязательный параметр.  | [optional] 
**District** | **string** | Район. | [optional] 
**Subway** | **string** | Станция метро. | [optional] 
**Street** | **string** | Улица.  Обязательный параметр.  | [optional] 
**House** | **string** | Дом или владение.  Обязательный параметр.  | [optional] 
**Block** | **string** | Корпус или строение. | [optional] 
**Entrance** | **string** | Подъезд. | [optional] 
**Entryphone** | **string** | Код домофона. | [optional] 
**Floor** | **string** | Этаж. | [optional] 
**Apartment** | **string** | Квартира или офис. | [optional] 
**Phone** | **string** | Телефон получателя заказа.  Обязательный параметр.  | [optional] 
**Recipient** | **string** | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  | [optional] 
**Gps** | [**GpsDTO**](GpsDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

