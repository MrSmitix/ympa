# OrderDeliveryAddressDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | Option<**String**> | Страна.  Обязательный параметр.  | [optional]
**postcode** | Option<**String**> | Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`).  | [optional]
**city** | Option<**String**> | Город или населенный пункт.  Обязательный параметр.  | [optional]
**district** | Option<**String**> | Район. | [optional]
**subway** | Option<**String**> | Станция метро. | [optional]
**street** | Option<**String**> | Улица.  Обязательный параметр.  | [optional]
**house** | Option<**String**> | Дом или владение.  Обязательный параметр.  | [optional]
**block** | Option<**String**> | Корпус или строение. | [optional]
**entrance** | Option<**String**> | Подъезд. | [optional]
**entryphone** | Option<**String**> | Код домофона. | [optional]
**floor** | Option<**String**> | Этаж. | [optional]
**apartment** | Option<**String**> | Квартира или офис. | [optional]
**phone** | Option<**String**> | Телефон получателя заказа.  Обязательный параметр.  | [optional]
**recipient** | Option<**String**> | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  | [optional]
**gps** | Option<[**models::GpsDto**](GpsDTO.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


