// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




type SetOrderBoxLayoutResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result OrderBoxesLayoutDto `json:"result,omitempty"`
}

// AssertSetOrderBoxLayoutResponseRequired checks if the required fields are not zero-ed
func AssertSetOrderBoxLayoutResponseRequired(obj SetOrderBoxLayoutResponse) error {
	if err := AssertOrderBoxesLayoutDtoRequired(obj.Result); err != nil {
		return err
	}
	return nil
}

// AssertSetOrderBoxLayoutResponseConstraints checks if the values respects the defined constraints
func AssertSetOrderBoxLayoutResponseConstraints(obj SetOrderBoxLayoutResponse) error {
	if err := AssertOrderBoxesLayoutDtoConstraints(obj.Result); err != nil {
		return err
	}
	return nil
}
