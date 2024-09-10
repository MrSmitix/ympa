// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// ChatMessagesResultDto - Информация о сообщениях.
type ChatMessagesResultDto struct {

	// Идентификатор заказа.
	OrderId int64 `json:"orderId"`

	// Информация о сообщениях.
	Messages []ChatMessageDto `json:"messages"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}

// AssertChatMessagesResultDtoRequired checks if the required fields are not zero-ed
func AssertChatMessagesResultDtoRequired(obj ChatMessagesResultDto) error {
	elements := map[string]interface{}{
		"orderId": obj.OrderId,
		"messages": obj.Messages,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Messages {
		if err := AssertChatMessageDtoRequired(el); err != nil {
			return err
		}
	}
	if err := AssertForwardScrollingPagerDtoRequired(obj.Paging); err != nil {
		return err
	}
	return nil
}

// AssertChatMessagesResultDtoConstraints checks if the values respects the defined constraints
func AssertChatMessagesResultDtoConstraints(obj ChatMessagesResultDto) error {
	for _, el := range obj.Messages {
		if err := AssertChatMessageDtoConstraints(el); err != nil {
			return err
		}
	}
	if err := AssertForwardScrollingPagerDtoConstraints(obj.Paging); err != nil {
		return err
	}
	return nil
}
