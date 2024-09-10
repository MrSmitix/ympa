// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// SkipGoodsFeedbackReactionRequest - Идентификаторы отзывов.
type SkipGoodsFeedbackReactionRequest struct {

	// Список идентификаторов отзывов, на которые магазин не будет отвечать.
	FeedbackIds []int64 `json:"feedbackIds"`
}

// AssertSkipGoodsFeedbackReactionRequestRequired checks if the required fields are not zero-ed
func AssertSkipGoodsFeedbackReactionRequestRequired(obj SkipGoodsFeedbackReactionRequest) error {
	elements := map[string]interface{}{
		"feedbackIds": obj.FeedbackIds,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertSkipGoodsFeedbackReactionRequestConstraints checks if the values respects the defined constraints
func AssertSkipGoodsFeedbackReactionRequestConstraints(obj SkipGoodsFeedbackReactionRequest) error {
	return nil
}
