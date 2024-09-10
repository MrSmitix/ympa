

# OrderDeliveryAddressDTO

Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 

The class is defined in **[OrderDeliveryAddressDTO.java](../../src/main/java/org/openapitools/model/OrderDeliveryAddressDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | `String` | Страна.  Обязательный параметр.  |  [optional property]
**postcode** | `String` | Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).  |  [optional property]
**city** | `String` | Город или населенный пункт.  Обязательный параметр.  |  [optional property]
**district** | `String` | Район. |  [optional property]
**subway** | `String` | Станция метро. |  [optional property]
**street** | `String` | Улица.  Обязательный параметр.  |  [optional property]
**house** | `String` | Дом или владение.  Обязательный параметр.  |  [optional property]
**block** | `String` | Корпус или строение. |  [optional property]
**entrance** | `String` | Подъезд. |  [optional property]
**entryphone** | `String` | Код домофона. |  [optional property]
**floor** | `String` | Этаж. |  [optional property]
**apartment** | `String` | Квартира или офис. |  [optional property]
**phone** | `String` | Телефон получателя заказа.  Обязательный параметр.  |  [optional property]
**recipient** | `String` | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  |  [optional property]
**gps** | [`GpsDTO`](GpsDTO.md) |  |  [optional property]

















