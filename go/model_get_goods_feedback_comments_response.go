// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




type GetGoodsFeedbackCommentsResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result GoodsFeedbackCommentListDto `json:"result,omitempty"`
}

// AssertGetGoodsFeedbackCommentsResponseRequired checks if the required fields are not zero-ed
func AssertGetGoodsFeedbackCommentsResponseRequired(obj GetGoodsFeedbackCommentsResponse) error {
	if err := AssertGoodsFeedbackCommentListDtoRequired(obj.Result); err != nil {
		return err
	}
	return nil
}

// AssertGetGoodsFeedbackCommentsResponseConstraints checks if the values respects the defined constraints
func AssertGetGoodsFeedbackCommentsResponseConstraints(obj GetGoodsFeedbackCommentsResponse) error {
	if err := AssertGoodsFeedbackCommentListDtoConstraints(obj.Result); err != nil {
		return err
	}
	return nil
}
