/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * FeedbacksApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_FeedbacksApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_FeedbacksApi_H_



#include "ympa_cpp_restsdk_client/ApiClient.h"

#include "ympa_cpp_restsdk_client/model/ApiClientDataErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/ApiForbiddenErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/ApiLimitErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/ApiNotFoundErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/ApiServerErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/ApiUnauthorizedErrorResponse.h"
#include "ympa_cpp_restsdk_client/model/GetFeedbackListResponse.h"
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  FeedbacksApi 
{
public:

    explicit FeedbacksApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~FeedbacksApi();

    /// <summary>
    /// Новые и обновленные отзывы о магазине
    /// </summary>
    /// <remarks>
    /// {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
    /// </remarks>
    /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
    /// <param name="pageToken">Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="limit">Количество значений на одной странице.  (optional, default to 0)</param>
    /// <param name="fromDate">Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  (optional, default to utility::datetime())</param>
    pplx::task<std::shared_ptr<GetFeedbackListResponse>> getFeedbackAndCommentUpdates(
        int64_t campaignId,
        boost::optional<utility::string_t> pageToken,
        boost::optional<int32_t> limit,
        boost::optional<utility::datetime> fromDate
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_FeedbacksApi_H_ */

