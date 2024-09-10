// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




type SetOrderDeliveryDateRequest struct {

	Dates OrderDeliveryDateDto `json:"dates"`

	Reason OrderDeliveryDateReasonType `json:"reason"`
}

// AssertSetOrderDeliveryDateRequestRequired checks if the required fields are not zero-ed
func AssertSetOrderDeliveryDateRequestRequired(obj SetOrderDeliveryDateRequest) error {
	elements := map[string]interface{}{
		"dates": obj.Dates,
		"reason": obj.Reason,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertOrderDeliveryDateDtoRequired(obj.Dates); err != nil {
		return err
	}
	return nil
}

// AssertSetOrderDeliveryDateRequestConstraints checks if the values respects the defined constraints
func AssertSetOrderDeliveryDateRequestConstraints(obj SetOrderDeliveryDateRequest) error {
	if err := AssertOrderDeliveryDateDtoConstraints(obj.Dates); err != nil {
		return err
	}
	return nil
}
