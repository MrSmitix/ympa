# full_outlet_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **char \*** | Название точки продаж.  | 
**type** | **outlet_type_t \*** |  | 
**coords** | **char \*** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  | [optional] 
**is_main** | **int** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  | [optional] 
**shop_outlet_code** | **char \*** | Идентификатор точки продаж, присвоенный магазином. | [optional] 
**visibility** | **outlet_visibility_type_t \*** |  | [optional] 
**address** | [**outlet_address_dto_t**](outlet_address_dto.md) \* |  | 
**phones** | **list_t \*** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | 
**working_schedule** | [**outlet_working_schedule_dto_t**](outlet_working_schedule_dto.md) \* |  | 
**delivery_rules** | [**list_t**](outlet_delivery_rule_dto.md) \* | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  | [optional] 
**storage_period** | **long** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] 
**id** | **long** | Идентификатор точки продаж, присвоенный Маркетом. | [optional] 
**status** | **outlet_status_type_t \*** |  | [optional] 
**region** | [**region_dto_t**](region_dto.md) \* |  | [optional] 
**shop_outlet_id** | **char \*** | Идентификатор точки продаж, заданный магазином. | [optional] 
**working_time** | **char \*** | Рабочее время. | [optional] 
**moderation_reason** | **char \*** | Статус модерации. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


