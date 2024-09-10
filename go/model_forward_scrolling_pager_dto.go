// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// ForwardScrollingPagerDto - Ссылка на следующую страницу. 
type ForwardScrollingPagerDto struct {

	// Идентификатор следующей страницы результатов.
	NextPageToken string `json:"nextPageToken,omitempty"`
}

// AssertForwardScrollingPagerDtoRequired checks if the required fields are not zero-ed
func AssertForwardScrollingPagerDtoRequired(obj ForwardScrollingPagerDto) error {
	return nil
}

// AssertForwardScrollingPagerDtoConstraints checks if the values respects the defined constraints
func AssertForwardScrollingPagerDtoConstraints(obj ForwardScrollingPagerDto) error {
	return nil
}
