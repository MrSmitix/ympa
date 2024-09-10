// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// DeleteGoodsFeedbackCommentRequest - Фильтр запроса отзывов по бизнесу. 
type DeleteGoodsFeedbackCommentRequest struct {

	// Идентификатор комментария к отзыву. 
	Id int64 `json:"id"`
}

// AssertDeleteGoodsFeedbackCommentRequestRequired checks if the required fields are not zero-ed
func AssertDeleteGoodsFeedbackCommentRequestRequired(obj DeleteGoodsFeedbackCommentRequest) error {
	elements := map[string]interface{}{
		"id": obj.Id,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertDeleteGoodsFeedbackCommentRequestConstraints checks if the values respects the defined constraints
func AssertDeleteGoodsFeedbackCommentRequestConstraints(obj DeleteGoodsFeedbackCommentRequest) error {
	return nil
}
