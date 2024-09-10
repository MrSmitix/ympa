
# Table `EacVerificationResultDTO`
(mapped from: EacVerificationResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**verificationResult** | verificationResult | long |  | [**EacVerificationStatusType**](EacVerificationStatusType.md) |  |  [optional] [foreignkey]
**attemptsLeft** | attemptsLeft | int |  | **kotlin.Int** | Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится.  |  [optional]




