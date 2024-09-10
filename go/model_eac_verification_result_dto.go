// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// EacVerificationResultDto - Результат выполнения запроса.
type EacVerificationResultDto struct {

	VerificationResult EacVerificationStatusType `json:"verificationResult,omitempty"`

	// Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
	AttemptsLeft int32 `json:"attemptsLeft,omitempty"`
}

// AssertEacVerificationResultDtoRequired checks if the required fields are not zero-ed
func AssertEacVerificationResultDtoRequired(obj EacVerificationResultDto) error {
	return nil
}

// AssertEacVerificationResultDtoConstraints checks if the values respects the defined constraints
func AssertEacVerificationResultDtoConstraints(obj EacVerificationResultDto) error {
	return nil
}
