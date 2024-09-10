// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// FeedIndexLogsFeedDto - Информация о прайс-листе.
type FeedIndexLogsFeedDto struct {

	// Идентификатор прайс-листа.
	Id int64 `json:"id,omitempty"`
}

// AssertFeedIndexLogsFeedDtoRequired checks if the required fields are not zero-ed
func AssertFeedIndexLogsFeedDtoRequired(obj FeedIndexLogsFeedDto) error {
	return nil
}

// AssertFeedIndexLogsFeedDtoConstraints checks if the values respects the defined constraints
func AssertFeedIndexLogsFeedDtoConstraints(obj FeedIndexLogsFeedDto) error {
	return nil
}
