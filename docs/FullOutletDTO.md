# FullOutletDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Название точки продаж.  | 
**Type** | [**OutletType**](OutletType.md) |  | 
**Coords** | **String** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  | [optional] 
**IsMain** | **Boolean** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  | [optional] 
**ShopOutletCode** | **String** | Идентификатор точки продаж, присвоенный магазином. | [optional] 
**Visibility** | [**OutletVisibilityType**](OutletVisibilityType.md) |  | [optional] 
**Address** | [**OutletAddressDTO**](OutletAddressDTO.md) |  | 
**Phones** | **String[]** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | 
**WorkingSchedule** | [**OutletWorkingScheduleDTO**](OutletWorkingScheduleDTO.md) |  | 
**DeliveryRules** | [**OutletDeliveryRuleDTO[]**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  | [optional] 
**StoragePeriod** | **Int64** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] 
**Id** | **Int64** | Идентификатор точки продаж, присвоенный Маркетом. | [optional] 
**Status** | [**OutletStatusType**](OutletStatusType.md) |  | [optional] 
**Region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**ShopOutletId** | **String** | Идентификатор точки продаж, заданный магазином. | [optional] 
**WorkingTime** | **String** | Рабочее время. | [optional] 
**ModerationReason** | **String** | Статус модерации. | [optional] 

## Examples

- Prepare the resource
```powershell
$FullOutletDTO = Initialize-ympa_powershell_clientFullOutletDTO  -Name null `
 -Type null `
 -Coords null `
 -IsMain null `
 -ShopOutletCode null `
 -Visibility null `
 -Address null `
 -Phones null `
 -WorkingSchedule null `
 -DeliveryRules null `
 -StoragePeriod null `
 -Id null `
 -Status null `
 -Region null `
 -ShopOutletId null `
 -WorkingTime null `
 -ModerationReason null
```

- Convert the resource to JSON
```powershell
$FullOutletDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

