/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// ScrollingPagerDto - Информация о страницах результатов.
type ScrollingPagerDto struct {

	// Идентификатор следующей страницы результатов.
	NextPageToken string `json:"nextPageToken,omitempty"`

	// Идентификатор предыдущей страницы результатов.
	PrevPageToken string `json:"prevPageToken,omitempty"`
}
