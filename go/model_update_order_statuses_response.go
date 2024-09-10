// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




type UpdateOrderStatusesResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	Result UpdateOrderStatusesDto `json:"result,omitempty"`
}

// AssertUpdateOrderStatusesResponseRequired checks if the required fields are not zero-ed
func AssertUpdateOrderStatusesResponseRequired(obj UpdateOrderStatusesResponse) error {
	if err := AssertUpdateOrderStatusesDtoRequired(obj.Result); err != nil {
		return err
	}
	return nil
}

// AssertUpdateOrderStatusesResponseConstraints checks if the values respects the defined constraints
func AssertUpdateOrderStatusesResponseConstraints(obj UpdateOrderStatusesResponse) error {
	if err := AssertUpdateOrderStatusesDtoConstraints(obj.Result); err != nil {
		return err
	}
	return nil
}
