# OrderDeliveryAddressDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Country** | **String** | Страна.  Обязательный параметр.  | [optional] 
**Postcode** | **String** | Почтовый индекс.  Указывается, если выбрана доставка почтой (&#x60;delivery type&#x3D;POST&#x60;).  | [optional] 
**City** | **String** | Город или населенный пункт.  Обязательный параметр.  | [optional] 
**District** | **String** | Район. | [optional] 
**Subway** | **String** | Станция метро. | [optional] 
**Street** | **String** | Улица.  Обязательный параметр.  | [optional] 
**House** | **String** | Дом или владение.  Обязательный параметр.  | [optional] 
**Block** | **String** | Корпус или строение. | [optional] 
**Entrance** | **String** | Подъезд. | [optional] 
**Entryphone** | **String** | Код домофона. | [optional] 
**Floor** | **String** | Этаж. | [optional] 
**Apartment** | **String** | Квартира или офис. | [optional] 
**Phone** | **String** | Телефон получателя заказа.  Обязательный параметр.  | [optional] 
**Recipient** | **String** | Фамилия, имя и отчество получателя заказа.  Обязательный параметр.  | [optional] 
**Gps** | [**GpsDTO**](GpsDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderDeliveryAddressDTO = Initialize-ympa_powershell_clientOrderDeliveryAddressDTO  -Country null `
 -Postcode null `
 -City null `
 -District null `
 -Subway null `
 -Street null `
 -House null `
 -Block null `
 -Entrance null `
 -Entryphone null `
 -Floor null `
 -Apartment null `
 -Phone null `
 -Recipient null `
 -Gps null
```

- Convert the resource to JSON
```powershell
$OrderDeliveryAddressDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

