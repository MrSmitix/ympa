/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server

// GetChatsInfoDto - Список чатов.
type GetChatsInfoDto struct {

	// Информация о чатах.
	Chats []GetChatInfoDto `json:"chats"`

	Paging ForwardScrollingPagerDto `json:"paging,omitempty"`
}
