# OrderDeliveryAddressDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **country** | **String** | Страна.  Обязательный параметр.  | [optional] [default to null] |
| **postcode** | **String** | Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).  | [optional] [default to null] |
| **city** | **String** | Город или населенный пункт.  Обязательный параметр.  | [optional] [default to null] |
| **district** | **String** | Район. | [optional] [default to null] |
| **subway** | **String** | Станция метро. | [optional] [default to null] |
| **street** | **String** | Улица.  Обязательный параметр.  | [optional] [default to null] |
| **house** | **String** | Дом или владение.  Обязательный параметр.  | [optional] [default to null] |
| **block** | **String** | Корпус или строение. | [optional] [default to null] |
| **entrance** | **String** | Подъезд. | [optional] [default to null] |
| **entryphone** | **String** | Код домофона. | [optional] [default to null] |
| **floor** | **String** | Этаж. | [optional] [default to null] |
| **apartment** | **String** | Квартира или офис. | [optional] [default to null] |
| **phone** | **String** | Телефон получателя заказа.  Обязательный параметр.  | [optional] [default to null] |
| **recipient** | **String** | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  | [optional] [default to null] |
| **gps** | [**GpsDTO**](GpsDTO.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

