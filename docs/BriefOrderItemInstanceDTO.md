# BriefOrderItemInstanceDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cis** | **String** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя &#x60;\u001d&#x60;!  ✅ &#x60;01030410947874432155Qbag!\u001d93Zjqw&#x60;  ❌ &#x60;01030410947874432155Qbag!\\u001d93Zjqw&#x60;  Косые черты и кавычки в других местах экранируйте по правилам JSON: &#x60;\\&#x60; и &#x60;\&quot;&quot;&#x60;  {% endnote %}  | [optional] 
**Uin** | **String** | Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр.  | [optional] 
**Rnpt** | **String** | Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.  | [optional] 
**Gtd** | **String** | Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.  | [optional] 

## Examples

- Prepare the resource
```powershell
$BriefOrderItemInstanceDTO = Initialize-ympa_powershell_clientBriefOrderItemInstanceDTO  -Cis null `
 -Uin null `
 -Rnpt null `
 -Gtd null
```

- Convert the resource to JSON
```powershell
$BriefOrderItemInstanceDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

