
# Table `OrderDeliveryAddressDTO`
(mapped from: OrderDeliveryAddressDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**country** | country | text |  | **kotlin.String** | Страна.  Обязательный параметр.  |  [optional]
**postcode** | postcode | text |  | **kotlin.String** | Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).  |  [optional]
**city** | city | text |  | **kotlin.String** | Город или населенный пункт.  Обязательный параметр.  |  [optional]
**district** | district | text |  | **kotlin.String** | Район. |  [optional]
**subway** | subway | text |  | **kotlin.String** | Станция метро. |  [optional]
**street** | street | text |  | **kotlin.String** | Улица.  Обязательный параметр.  |  [optional]
**house** | house | text |  | **kotlin.String** | Дом или владение.  Обязательный параметр.  |  [optional]
**block** | block | text |  | **kotlin.String** | Корпус или строение. |  [optional]
**entrance** | entrance | text |  | **kotlin.String** | Подъезд. |  [optional]
**entryphone** | entryphone | text |  | **kotlin.String** | Код домофона. |  [optional]
**floor** | floor | text |  | **kotlin.String** | Этаж. |  [optional]
**apartment** | apartment | text |  | **kotlin.String** | Квартира или офис. |  [optional]
**phone** | phone | text |  | **kotlin.String** | Телефон получателя заказа.  Обязательный параметр.  |  [optional]
**recipient** | recipient | text |  | **kotlin.String** | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  |  [optional]
**gps** | gps | long |  | [**GpsDTO**](GpsDTO.md) |  |  [optional] [foreignkey]

















