# OrderItemInstanceDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cis** | **String** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста. | [optional] 
**CisFull** | **String** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом. | [optional] 
**Uin** | **String** | УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК.  | [optional] 
**Rnpt** | **String** | Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.  | [optional] 
**Gtd** | **String** | Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderItemInstanceDTO = Initialize-ympa_powershell_clientOrderItemInstanceDTO  -Cis null `
 -CisFull null `
 -Uin null `
 -Rnpt null `
 -Gtd null
```

- Convert the resource to JSON
```powershell
$OrderItemInstanceDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

