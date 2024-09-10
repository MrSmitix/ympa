# EacVerificationResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VerificationResult** | [**EacVerificationStatusType**](EacVerificationStatusType.md) |  | [optional] 
**AttemptsLeft** | **Int32** | Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.  | [optional] 

## Examples

- Prepare the resource
```powershell
$EacVerificationResultDTO = Initialize-ympa_powershell_clientEacVerificationResultDTO  -VerificationResult null `
 -AttemptsLeft null
```

- Convert the resource to JSON
```powershell
$EacVerificationResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

