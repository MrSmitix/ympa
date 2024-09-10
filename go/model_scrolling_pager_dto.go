// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// ScrollingPagerDto - Информация о страницах результатов.
type ScrollingPagerDto struct {

	// Идентификатор следующей страницы результатов.
	NextPageToken string `json:"nextPageToken,omitempty"`

	// Идентификатор предыдущей страницы результатов.
	PrevPageToken string `json:"prevPageToken,omitempty"`
}

// AssertScrollingPagerDtoRequired checks if the required fields are not zero-ed
func AssertScrollingPagerDtoRequired(obj ScrollingPagerDto) error {
	return nil
}

// AssertScrollingPagerDtoConstraints checks if the values respects the defined constraints
func AssertScrollingPagerDtoConstraints(obj ScrollingPagerDto) error {
	return nil
}
