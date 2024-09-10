package models

// EacVerificationResultDto - Результат выполнения запроса.
type EacVerificationResultDto struct {

	VerificationResult EacVerificationStatusType `json:"verificationResult,omitempty"`

	// Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
	AttemptsLeft int32 `json:"attemptsLeft,omitempty"`
}
