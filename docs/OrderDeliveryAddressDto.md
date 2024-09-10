# OrderDeliveryAddressDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **String** | Страна.  Обязательный параметр.  | [optional] [default to None]
**postcode** | **String** | Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`).  | [optional] [default to None]
**city** | **String** | Город или населенный пункт.  Обязательный параметр.  | [optional] [default to None]
**district** | **String** | Район. | [optional] [default to None]
**subway** | **String** | Станция метро. | [optional] [default to None]
**street** | **String** | Улица.  Обязательный параметр.  | [optional] [default to None]
**house** | **String** | Дом или владение.  Обязательный параметр.  | [optional] [default to None]
**block** | **String** | Корпус или строение. | [optional] [default to None]
**entrance** | **String** | Подъезд. | [optional] [default to None]
**entryphone** | **String** | Код домофона. | [optional] [default to None]
**floor** | **String** | Этаж. | [optional] [default to None]
**apartment** | **String** | Квартира или офис. | [optional] [default to None]
**phone** | **String** | Телефон получателя заказа.  Обязательный параметр.  | [optional] [default to None]
**recipient** | **String** | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  | [optional] [default to None]
**gps** | [***models::GpsDto**](GpsDTO.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


