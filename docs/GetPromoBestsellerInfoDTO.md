# GetPromoBestsellerInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bestseller** | **Boolean** | Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers). | 
**EntryDeadline** | **System.DateTime** | До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPromoBestsellerInfoDTO = Initialize-ympa_powershell_clientGetPromoBestsellerInfoDTO  -Bestseller null `
 -EntryDeadline null
```

- Convert the resource to JSON
```powershell
$GetPromoBestsellerInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

