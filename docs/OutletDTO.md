# WWW::OpenAPIClient::Object::OutletDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OutletDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Название точки продаж.  | 
**type** | [**OutletType**](OutletType.md) |  | 
**coords** | **string** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  | [optional] 
**is_main** | **boolean** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  | [optional] 
**shop_outlet_code** | **string** | Идентификатор точки продаж, присвоенный магазином. | [optional] 
**visibility** | [**OutletVisibilityType**](OutletVisibilityType.md) |  | [optional] 
**address** | [**OutletAddressDTO**](OutletAddressDTO.md) |  | 
**phones** | **ARRAY[string]** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | 
**working_schedule** | [**OutletWorkingScheduleDTO**](OutletWorkingScheduleDTO.md) |  | 
**delivery_rules** | [**ARRAY[OutletDeliveryRuleDTO]**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  | [optional] 
**storage_period** | **int** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


