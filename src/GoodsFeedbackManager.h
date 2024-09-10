#ifndef _GoodsFeedbackManager_H_
#define _GoodsFeedbackManager_H_

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
#include "DeleteGoodsFeedbackCommentRequest.h"
#include "EmptyApiResponse.h"
#include "GetGoodsFeedbackCommentsRequest.h"
#include "GetGoodsFeedbackCommentsResponse.h"
#include "GetGoodsFeedbackRequest.h"
#include "GetGoodsFeedbackResponse.h"
#include "SkipGoodsFeedbackReactionRequest.h"
#include "UpdateGoodsFeedbackCommentRequest.h"
#include "UpdateGoodsFeedbackCommentResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup GoodsFeedback GoodsFeedback
 * \ingroup Operations
 *  @{
 */
class GoodsFeedbackManager {
public:
	GoodsFeedbackManager();
	virtual ~GoodsFeedbackManager();

/*! \brief Удаление комментария к отзыву. *Synchronous*
 *
 * Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param deleteGoodsFeedbackCommentRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteGoodsFeedbackCommentSync(char * accessToken,
	long long businessId, std::shared_ptr<DeleteGoodsFeedbackCommentRequest> deleteGoodsFeedbackCommentRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData);

/*! \brief Удаление комментария к отзыву. *Asynchronous*
 *
 * Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param deleteGoodsFeedbackCommentRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteGoodsFeedbackCommentAsync(char * accessToken,
	long long businessId, std::shared_ptr<DeleteGoodsFeedbackCommentRequest> deleteGoodsFeedbackCommentRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData);


/*! \brief Получение комментариев к отзыву. *Synchronous*
 *
 * Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param getGoodsFeedbackCommentsRequest  *Required*
 * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
 * \param limit Количество значений на одной странице. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getGoodsFeedbackCommentsSync(char * accessToken,
	long long businessId, std::shared_ptr<GetGoodsFeedbackCommentsRequest> getGoodsFeedbackCommentsRequest, std::string pageToken, int limit, 
	void(* handler)(GetGoodsFeedbackCommentsResponse, Error, void* )
	, void* userData);

/*! \brief Получение комментариев к отзыву. *Asynchronous*
 *
 * Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param getGoodsFeedbackCommentsRequest  *Required*
 * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
 * \param limit Количество значений на одной странице. 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getGoodsFeedbackCommentsAsync(char * accessToken,
	long long businessId, std::shared_ptr<GetGoodsFeedbackCommentsRequest> getGoodsFeedbackCommentsRequest, std::string pageToken, int limit, 
	void(* handler)(GetGoodsFeedbackCommentsResponse, Error, void* )
	, void* userData);


/*! \brief Получение отзывов о товарах продавца. *Synchronous*
 *
 * Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
 * \param limit Количество значений на одной странице. 
 * \param getGoodsFeedbackRequest 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getGoodsFeedbacksSync(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetGoodsFeedbackRequest> getGoodsFeedbackRequest, 
	void(* handler)(GetGoodsFeedbackResponse, Error, void* )
	, void* userData);

/*! \brief Получение отзывов о товарах продавца. *Asynchronous*
 *
 * Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
 * \param limit Количество значений на одной странице. 
 * \param getGoodsFeedbackRequest 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getGoodsFeedbacksAsync(char * accessToken,
	long long businessId, std::string pageToken, int limit, std::shared_ptr<GetGoodsFeedbackRequest> getGoodsFeedbackRequest, 
	void(* handler)(GetGoodsFeedbackResponse, Error, void* )
	, void* userData);


/*! \brief Отказ от ответа на отзывы. *Synchronous*
 *
 * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param skipGoodsFeedbackReactionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool skipGoodsFeedbacksReactionSync(char * accessToken,
	long long businessId, std::shared_ptr<SkipGoodsFeedbackReactionRequest> skipGoodsFeedbackReactionRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData);

/*! \brief Отказ от ответа на отзывы. *Asynchronous*
 *
 * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param skipGoodsFeedbackReactionRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool skipGoodsFeedbacksReactionAsync(char * accessToken,
	long long businessId, std::shared_ptr<SkipGoodsFeedbackReactionRequest> skipGoodsFeedbackReactionRequest, 
	void(* handler)(EmptyApiResponse, Error, void* )
	, void* userData);


/*! \brief Добавление нового или изменение созданного комментария. *Synchronous*
 *
 * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param updateGoodsFeedbackCommentRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateGoodsFeedbackCommentSync(char * accessToken,
	long long businessId, std::shared_ptr<UpdateGoodsFeedbackCommentRequest> updateGoodsFeedbackCommentRequest, 
	void(* handler)(UpdateGoodsFeedbackCommentResponse, Error, void* )
	, void* userData);

/*! \brief Добавление нового или изменение созданного комментария. *Asynchronous*
 *
 * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
 * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
 * \param updateGoodsFeedbackCommentRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool updateGoodsFeedbackCommentAsync(char * accessToken,
	long long businessId, std::shared_ptr<UpdateGoodsFeedbackCommentRequest> updateGoodsFeedbackCommentRequest, 
	void(* handler)(UpdateGoodsFeedbackCommentResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.partner.market.yandex.ru";
	}
};
/** @}*/

}
}
#endif /* GoodsFeedbackManager_H_ */
