# FeedParameterDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Deleted** | **Boolean** | Удалить ли значение параметра.  Возможное значение: * &#x60;true&#x60; — удалить значение параметра.  Используется вместе с параметром &#x60;name&#x60;.  | [optional] 
**Name** | **String** | Название параметра.  Возможное значение: - &#x60;reparseIntervalMinutes&#x60; — период скачивания прайс-листа. Маркет будет скачивать прайс-лист через количество минут, указанное в параметре &#x60;value&#x60;. Например, при &#x60;value&#x3D;1440&#x60;, Маркет будет скачивать прайс-лист один раз в сутки.  {% note alert %}  Несмотря на установленное значение, Маркет скачает прайс-лист один раз в сутки.  {% endnote %}  Обязательный параметр.  | 
**Values** | **Int32[]** | Значения параметра.  Используется вместе с параметром &#x60;name&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$FeedParameterDTO = Initialize-ympa_powershell_clientFeedParameterDTO  -Deleted null `
 -Name null `
 -Values null
```

- Convert the resource to JSON
```powershell
$FeedParameterDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

