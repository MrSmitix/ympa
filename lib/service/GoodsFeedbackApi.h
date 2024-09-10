#ifndef TINY_CPP_CLIENT_GoodsFeedbackApi_H_
#define TINY_CPP_CLIENT_GoodsFeedbackApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

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

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class GoodsFeedbackApi : public Service {
public:
    GoodsFeedbackApi() = default;

    virtual ~GoodsFeedbackApi() = default;

    /**
    * Удаление комментария к отзыву.
    *
    * Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param deleteGoodsFeedbackCommentRequest  *Required*
    */
    Response<
                EmptyApiResponse
        >
    deleteGoodsFeedbackComment(
            
            long businessId
            , 
            
            DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest
            
    );
    /**
    * Получение комментариев к отзыву.
    *
    * Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param getGoodsFeedbackCommentsRequest  *Required*
    * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    * \param limit Количество значений на одной странице. 
    */
    Response<
                GetGoodsFeedbackCommentsResponse
        >
    getGoodsFeedbackComments(
            
            long businessId
            , 
            
            GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest
            , 
            
            std::string pageToken
            , 
            
            int limit
            
    );
    /**
    * Получение отзывов о товарах продавца.
    *
    * Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    * \param limit Количество значений на одной странице. 
    * \param getGoodsFeedbackRequest 
    */
    Response<
                GetGoodsFeedbackResponse
        >
    getGoodsFeedbacks(
            
            long businessId
            , 
            
            std::string pageToken
            , 
            
            int limit
            , 
            
            GetGoodsFeedbackRequest getGoodsFeedbackRequest
            
    );
    /**
    * Отказ от ответа на отзывы.
    *
    * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param skipGoodsFeedbackReactionRequest  *Required*
    */
    Response<
                EmptyApiResponse
        >
    skipGoodsFeedbacksReaction(
            
            long businessId
            , 
            
            SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest
            
    );
    /**
    * Добавление нового или изменение созданного комментария.
    *
    * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
    * \param businessId Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  *Required*
    * \param updateGoodsFeedbackCommentRequest  *Required*
    */
    Response<
                UpdateGoodsFeedbackCommentResponse
        >
    updateGoodsFeedbackComment(
            
            long businessId
            , 
            
            UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_GoodsFeedbackApi_H_ */