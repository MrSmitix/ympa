# FlippingPagerDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Total** | **Int32** | Сколько всего найдено элементов. | [optional] 
**VarFrom** | **Int32** | Начальный номер найденного элемента на странице. | [optional] 
**To** | **Int32** | Конечный номер найденного элемента на странице. | [optional] 
**CurrentPage** | **Int32** | Текущая страница. | [optional] 
**PagesCount** | **Int32** | Общее количество страниц. | [optional] 
**PageSize** | **Int32** | Размер страницы. | [optional] 

## Examples

- Prepare the resource
```powershell
$FlippingPagerDTO = Initialize-ympa_powershell_clientFlippingPagerDTO  -Total null `
 -VarFrom null `
 -To null `
 -CurrentPage null `
 -PagesCount null `
 -PageSize null
```

- Convert the resource to JSON
```powershell
$FlippingPagerDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

