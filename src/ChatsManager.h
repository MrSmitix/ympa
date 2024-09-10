#ifndef _ChatsManager_H_
#define _ChatsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "CreateChatRequest.h"
#include "CreateChatResponse.h"
#include "EmptyApiResponse.h"
#include "GetChatHistoryRequest.h"
#include "GetChatHistoryResponse.h"
#include "GetChatsRequest.h"
#include "GetChatsResponse.h"
#include "SendMessageToChatRequest.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Chats Chats
 * \ingroup Operations
 *  @{
 */
class ChatsManager {
public:
	ChatsManager();
	virtual ~ChatsManager();

/*! \brief Создание нового чата с покупателем. *Synchronous*
 *
 * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param createChatRequest description *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createChatSync(char * accessToken,
	long long businessId, std::shared_ptr<CreateChatRequest> createChatRequest, 
	void(* handler)(CreateChatResponse, Error, void* )
	, void* userData);

/*! \brief Создание нового чата с покупателем. *Asynchronous*
 *
 * Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param createChatRequest description *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createChatAsync(char * accessToken,
	long long businessId, std::shared_ptr<CreateChatRequest> createChatRequest, 
	void(* handler)(CreateChatResponse, Error, void* )
	, void* userData);


/*! \brief Получение истории сообщений в чате. *Synchronous*
 *
 * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param chatId Идентификатор чата. *Required*
 * \param getChatHistoryRequest description *Required*
 * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
 * \param limit Количество значений на одной странице. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getChatHistorySync(char * accessToken,
	long long businessId, long long chatId, std::shared_ptr<GetChatHistoryRequest> getChatHistoryRequest, std::string pageToken, int limit, 
	void(* handler)(GetChatHistoryResponse, Error, void* )
	, void* userData);

/*! \brief Получение истории сообщений в чате. *Asynchronous*
 *
 * Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param chatId Идентификатор чата. *Required*
 * \param getChatHistoryRequest description *Required*
 * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
 * \param limit Количество значений на одной странице. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getChatHistoryAsync(char * accessToken,
	long long businessId, long long chatId, std::shared_ptr<GetChatHistoryRequest> getChatHistoryRequest, std::string pageToken, int limit, 
	void(* handler)(GetChatHistoryResponse, Error, void* )
	, void* userData);


/*! \brief Получение доступных чатов. *Synchronous*
 *
 * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param getChatsRequest description *Required*
 * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
 * \param limit Количество значений на одной странице. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getChatsSync(char * accessToken,
	long long businessId, std::shared_ptr<GetChatsRequest> getChatsRequest, std::string pageToken, int limit, 
	void(* handler)(GetChatsResponse, Error, void* )
	, void* userData);

/*! \brief Получение доступных чатов. *Asynchronous*
 *
 * Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param getChatsRequest description *Required*
 * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
 * \param limit Количество значений на одной странице. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getChatsAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetChatsRequest> getChatsRequest, std::string pageToken, int limit, 
	void(* handler)(GetChatsResponse, Error, void* )
	, void* userData);


/*! \brief Отправка файла в чат. *Synchronous*
 *
 * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param chatId Идентификатор чата. *Required*
 * \param file Содержимое файла. Максимальный размер файла — 5 Мбайт. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sendFileToChatSync(char * accessToken,
	long long businessId, long long chatId, std::string file, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData);

/*! \brief Отправка файла в чат. *Asynchronous*
 *
 * Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param chatId Идентификатор чата. *Required*
 * \param file Содержимое файла. Максимальный размер файла — 5 Мбайт. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sendFileToChatAsync(char * accessToken,
	long long businessId, long long chatId, std::string file, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData);


/*! \brief Отправка сообщения в чат. *Synchronous*
 *
 * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param chatId Идентификатор чата. *Required*
 * \param sendMessageToChatRequest description *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sendMessageToChatSync(char * accessToken,
	long long businessId, long long chatId, std::shared_ptr<SendMessageToChatRequest> sendMessageToChatRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData);

/*! \brief Отправка сообщения в чат. *Asynchronous*
 *
 * Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param chatId Идентификатор чата. *Required*
 * \param sendMessageToChatRequest description *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sendMessageToChatAsync(char * accessToken,
	long long businessId, long long chatId, std::shared_ptr<SendMessageToChatRequest> sendMessageToChatRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.partner.market.yandex.ru";
	}
};
/** @}*/

}
}
#endif /* ChatsManager_H_ */
