/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
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

#ifndef FeedbacksApi_H_
#define FeedbacksApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "GetFeedbackListResponse.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  FeedbacksApiException: public std::exception
{
public:
    FeedbacksApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace FeedbacksApiResources {
/// <summary>
/// Новые и обновленные отзывы о магазине
/// </summary>
/// <remarks>
/// {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
/// </remarks>
class  CampaignsCampaignIdFeedbackUpdatesResource: public restbed::Resource
{
public:
    CampaignsCampaignIdFeedbackUpdatesResource(const std::string& context = "");
    virtual ~CampaignsCampaignIdFeedbackUpdatesResource() = default;

    CampaignsCampaignIdFeedbackUpdatesResource(
        const CampaignsCampaignIdFeedbackUpdatesResource& other) = default; // copy constructor
    CampaignsCampaignIdFeedbackUpdatesResource(CampaignsCampaignIdFeedbackUpdatesResource&& other) noexcept = default; // move constructor

    CampaignsCampaignIdFeedbackUpdatesResource& operator=(const CampaignsCampaignIdFeedbackUpdatesResource& other) = default; // copy assignment
    CampaignsCampaignIdFeedbackUpdatesResource& operator=(CampaignsCampaignIdFeedbackUpdatesResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, GetFeedbackListResponse>(
        int64_t & campaignId, std::string & pageToken, int32_t & limit, std::string & fromDate)> handler_GET_func =
            [](int64_t &, std::string &, int32_t &, std::string &) -> std::pair<int, GetFeedbackListResponse>
                { throw FeedbacksApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, GetFeedbackListResponse> handler_GET(
        int64_t & campaignId, std::string & pageToken, int32_t & limit, std::string & fromDate);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleFeedbacksApiException(const FeedbacksApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

} /* namespace FeedbacksApiResources */

using FeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource [[deprecated]] = FeedbacksApiResources::CampaignsCampaignIdFeedbackUpdatesResource;

//
// The restbed service to actually implement the REST server
//
class  FeedbacksApi
{
public:
    explicit FeedbacksApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~FeedbacksApi();

    std::shared_ptr<FeedbacksApiResources::CampaignsCampaignIdFeedbackUpdatesResource> getCampaignsCampaignIdFeedbackUpdatesResource();

    void setResource(std::shared_ptr<FeedbacksApiResources::CampaignsCampaignIdFeedbackUpdatesResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setFeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource(std::shared_ptr<FeedbacksApiResources::CampaignsCampaignIdFeedbackUpdatesResource> spFeedbacksApiCampaignsCampaignIdFeedbackUpdatesResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<FeedbacksApiResources::CampaignsCampaignIdFeedbackUpdatesResource> m_spCampaignsCampaignIdFeedbackUpdatesResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* FeedbacksApi_H_ */

