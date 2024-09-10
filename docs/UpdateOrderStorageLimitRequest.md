# UpdateOrderStorageLimitRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NewDate** | **System.DateTime** | Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 

## Examples

- Prepare the resource
```powershell
$UpdateOrderStorageLimitRequest = Initialize-ympa_powershell_clientUpdateOrderStorageLimitRequest  -NewDate null
```

- Convert the resource to JSON
```powershell
$UpdateOrderStorageLimitRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

