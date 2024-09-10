# ympa_r_client::OrderDeliveryAddressDTO

Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **character** | Страна.  Обязательный параметр.  | [optional] 
**postcode** | **character** | Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).  | [optional] 
**city** | **character** | Город или населенный пункт.  Обязательный параметр.  | [optional] 
**district** | **character** | Район. | [optional] 
**subway** | **character** | Станция метро. | [optional] 
**street** | **character** | Улица.  Обязательный параметр.  | [optional] 
**house** | **character** | Дом или владение.  Обязательный параметр.  | [optional] 
**block** | **character** | Корпус или строение. | [optional] 
**entrance** | **character** | Подъезд. | [optional] 
**entryphone** | **character** | Код домофона. | [optional] 
**floor** | **character** | Этаж. | [optional] 
**apartment** | **character** | Квартира или офис. | [optional] 
**phone** | **character** | Телефон получателя заказа.  Обязательный параметр.  | [optional] 
**recipient** | **character** | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  | [optional] 
**gps** | [**GpsDTO**](GpsDTO.md) |  | [optional] 


