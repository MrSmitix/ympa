# order_delivery_address_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **char \*** | Страна.  Обязательный параметр.  | [optional] 
**postcode** | **char \*** | Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).  | [optional] 
**city** | **char \*** | Город или населенный пункт.  Обязательный параметр.  | [optional] 
**district** | **char \*** | Район. | [optional] 
**subway** | **char \*** | Станция метро. | [optional] 
**street** | **char \*** | Улица.  Обязательный параметр.  | [optional] 
**house** | **char \*** | Дом или владение.  Обязательный параметр.  | [optional] 
**block** | **char \*** | Корпус или строение. | [optional] 
**entrance** | **char \*** | Подъезд. | [optional] 
**entryphone** | **char \*** | Код домофона. | [optional] 
**floor** | **char \*** | Этаж. | [optional] 
**apartment** | **char \*** | Квартира или офис. | [optional] 
**phone** | **char \*** | Телефон получателя заказа.  Обязательный параметр.  | [optional] 
**recipient** | **char \*** | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  | [optional] 
**gps** | [**gps_dto_t**](gps_dto.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


