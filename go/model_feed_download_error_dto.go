/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// FeedDownloadErrorDto - Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`. 
type FeedDownloadErrorDto struct {

	// HTTP-код ошибки индексации прайс-листа. Выводится, если `type=DOWNLOAD_HTTP_ERROR`. 
	HttpStatusCode int32 `json:"httpStatusCode,omitempty"`

	Type FeedDownloadErrorType `json:"type,omitempty"`

	// Описание ошибки. Выводится, если `type=DOWNLOAD_ERROR`. 
	Description string `json:"description,omitempty"`
}
