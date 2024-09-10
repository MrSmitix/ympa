# EacVerificationResultDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verification_result** | Option<[**models::EacVerificationStatusType**](EacVerificationStatusType.md)> |  | [optional]
**attempts_left** | Option<**i32**> | Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


