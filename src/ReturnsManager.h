#ifndef _ReturnsManager_H_
#define _ReturnsManager_H_

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
#include "Date.h"
#include "EmptyApiResponse.h"
#include "GetReturnResponse.h"
#include "GetReturnsResponse.h"
#include "RefundStatusType.h"
#include "ReturnType.h"
#include "SetReturnDecisionRequest.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Returns Returns
 * \ingroup Operations
 *  @{
 */
class ReturnsManager {
public:
	ReturnsManager();
	virtual ~ReturnsManager();

/*! \brief Информация о невыкупе или возврате. *Synchronous*
 *
 * Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param returnId Идентификатор возврата. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getReturnSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(GetReturnResponse, Error, void* )
	, void* userData);

/*! \brief Информация о невыкупе или возврате. *Asynchronous*
 *
 * Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param returnId Идентификатор возврата. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getReturnAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(GetReturnResponse, Error, void* )
	, void* userData);


/*! \brief Получение заявления на возврат. *Synchronous*
 *
 * Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param returnId Идентификатор возврата. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getReturnApplicationSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Получение заявления на возврат. *Asynchronous*
 *
 * Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param returnId Идентификатор возврата. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getReturnApplicationAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Получение фотографии возврата. *Synchronous*
 *
 * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param returnId Идентификатор возврата. *Required*
 * \param itemId Идентификатор товара в возврате. *Required*
 * \param imageHash Хеш ссылки изображения для загрузки. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getReturnPhotoSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, long long itemId, std::string imageHash, 
	void(* handler)(std::string, Error, void* )
	, void* userData);

/*! \brief Получение фотографии возврата. *Asynchronous*
 *
 * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param returnId Идентификатор возврата. *Required*
 * \param itemId Идентификатор товара в возврате. *Required*
 * \param imageHash Хеш ссылки изображения для загрузки. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getReturnPhotoAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, long long itemId, std::string imageHash, 
	void(* handler)(std::string, Error, void* )
	, void* userData);


/*! \brief Список невыкупов и возвратов. *Synchronous*
 *
 * Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
 * \param limit Количество значений на одной странице. 
 * \param orderIds Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
 * \param statuses Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
 * \param type Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
 * \param fromDate Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
 * \param toDate Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
 * \param fromDate2 {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
 * \param toDate2 {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getReturnsSync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::list<long long> orderIds, std::list<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2, 
	void(* handler)(GetReturnsResponse, Error, void* )
	, void* userData);

/*! \brief Список невыкупов и возвратов. *Asynchronous*
 *
 * Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
 * \param limit Количество значений на одной странице. 
 * \param orderIds Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
 * \param statuses Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
 * \param type Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
 * \param fromDate Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
 * \param toDate Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
 * \param fromDate2 {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
 * \param toDate2 {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getReturnsAsync(char * accessToken,
	long long campaignId, std::string pageToken, int limit, std::list<long long> orderIds, std::list<RefundStatusType> statuses, ReturnType type, Date fromDate, Date toDate, Date fromDate2, Date toDate2, 
	void(* handler)(GetReturnsResponse, Error, void* )
	, void* userData);


/*! \brief Принятие или изменение решения по возврату. *Synchronous*
 *
 * Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param returnId Идентификатор возврата. *Required*
 * \param setReturnDecisionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool setReturnDecisionSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, std::shared_ptr<SetReturnDecisionRequest> setReturnDecisionRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData);

/*! \brief Принятие или изменение решения по возврату. *Asynchronous*
 *
 * Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param returnId Идентификатор возврата. *Required*
 * \param setReturnDecisionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool setReturnDecisionAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, std::shared_ptr<SetReturnDecisionRequest> setReturnDecisionRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData);


/*! \brief Подтверждение решения по возврату. *Synchronous*
 *
 * Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param returnId Идентификатор возврата. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool submitReturnDecisionSync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData);

/*! \brief Подтверждение решения по возврату. *Asynchronous*
 *
 * Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
 * \param campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param orderId Идентификатор заказа. *Required*
 * \param returnId Идентификатор возврата. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool submitReturnDecisionAsync(char * accessToken,
	long long campaignId, long long orderId, long long returnId, 
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
#endif /* ReturnsManager_H_ */
