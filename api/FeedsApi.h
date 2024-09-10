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
 * FeedsApi.h
 *
 * 
 */

#ifndef FeedsApi_H_
#define FeedsApi_H_


#include <memory>
#include <utility>
#include <exception>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiLockedErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "EmptyApiResponse.h"
#include "FeedIndexLogsStatusType.h"
#include "GetFeedIndexLogsResponse.h"
#include "GetFeedResponse.h"
#include "GetFeedsResponse.h"
#include "SetFeedParamsRequest.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  FeedsApiException: public std::exception
{
public:
    FeedsApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

/// <summary>
/// Информация о прайс-листе
/// </summary>
/// <remarks>
/// {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
/// </remarks>
class  FeedsApiCampaignsCampaignIdFeedsFeedIdResource: public restbed::Resource
{
public:
    FeedsApiCampaignsCampaignIdFeedsFeedIdResource(const std::string& context = "");
    virtual ~FeedsApiCampaignsCampaignIdFeedsFeedIdResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<GetFeedResponse>> handler_GET(
        int64_t const & campaignId, int64_t const & feedId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int64_t getPathParam_campaignId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("campaignId", 0L);
    }

    virtual int64_t getPathParam_feedId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("feedId", 0L);
    }



    virtual std::pair<int, std::string> handleFeedsApiException(const FeedsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Отчет по индексации прайс-листа
/// </summary>
/// <remarks>
/// {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
/// </remarks>
class  FeedsApiCampaignsCampaignIdFeedsFeedIdIndex-logsResource: public restbed::Resource
{
public:
    FeedsApiCampaignsCampaignIdFeedsFeedIdIndex-logsResource(const std::string& context = "");
    virtual ~FeedsApiCampaignsCampaignIdFeedsFeedIdIndex-logsResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<GetFeedIndexLogsResponse>> handler_GET(
        int64_t const & campaignId, int64_t const & feedId, int32_t const & limit, std::string const & publishedTimeFrom, std::string const & publishedTimeTo, std::shared_ptr<FeedIndexLogsStatusType> const & status);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int64_t getPathParam_campaignId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("campaignId", 0L);
    }

    virtual int64_t getPathParam_feedId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("feedId", 0L);
    }

    virtual int32_t getQueryParam_limit(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_query_parameter("limit", 0);
    }

    virtual std::string getQueryParam_publishedTimeFrom(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_query_parameter("publishedTimeFrom", "");
    }

    virtual std::string getQueryParam_publishedTimeTo(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_query_parameter("publishedTimeTo", "");
    }



    virtual std::pair<int, std::string> handleFeedsApiException(const FeedsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Список прайс-листов магазина
/// </summary>
/// <remarks>
/// {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
/// </remarks>
class  FeedsApiCampaignsCampaignIdFeedsResource: public restbed::Resource
{
public:
    FeedsApiCampaignsCampaignIdFeedsResource(const std::string& context = "");
    virtual ~FeedsApiCampaignsCampaignIdFeedsResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<GetFeedsResponse>> handler_GET(
        int64_t const & campaignId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int64_t getPathParam_campaignId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("campaignId", 0L);
    }



    virtual std::pair<int, std::string> handleFeedsApiException(const FeedsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Сообщить, что прайс-лист обновился
/// </summary>
/// <remarks>
/// {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
/// </remarks>
class  FeedsApiCampaignsCampaignIdFeedsFeedIdRefreshResource: public restbed::Resource
{
public:
    FeedsApiCampaignsCampaignIdFeedsFeedIdRefreshResource(const std::string& context = "");
    virtual ~FeedsApiCampaignsCampaignIdFeedsFeedIdRefreshResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<EmptyApiResponse>> handler_POST(
        int64_t const & campaignId, int64_t const & feedId);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int64_t getPathParam_campaignId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("campaignId", 0L);
    }

    virtual int64_t getPathParam_feedId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("feedId", 0L);
    }



    virtual std::pair<int, std::string> handleFeedsApiException(const FeedsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_POST_internal(const std::shared_ptr<restbed::Session> session);
};


/// <summary>
/// Изменение параметров прайс-листа
/// </summary>
/// <remarks>
/// {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
/// </remarks>
class  FeedsApiCampaignsCampaignIdFeedsFeedIdParamsResource: public restbed::Resource
{
public:
    FeedsApiCampaignsCampaignIdFeedsFeedIdParamsResource(const std::string& context = "");
    virtual ~FeedsApiCampaignsCampaignIdFeedsFeedIdParamsResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<EmptyApiResponse>> handler_POST(
        int64_t const & campaignId, int64_t const & feedId, std::shared_ptr<SetFeedParamsRequest> const & setFeedParamsRequest);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int64_t getPathParam_campaignId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("campaignId", 0L);
    }

    virtual int64_t getPathParam_feedId(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("feedId", 0L);
    }



    virtual std::pair<int, std::string> handleFeedsApiException(const FeedsApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_POST_internal(const std::shared_ptr<restbed::Session> session);
};



//
// The restbed service to actually implement the REST server
//
class  FeedsApi
{
public:
    explicit FeedsApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~FeedsApi();

    virtual void setFeedsApiCampaignsCampaignIdFeedsFeedIdResource(std::shared_ptr<FeedsApiCampaignsCampaignIdFeedsFeedIdResource> spFeedsApiCampaignsCampaignIdFeedsFeedIdResource);
    virtual void setFeedsApiCampaignsCampaignIdFeedsFeedIdIndex-logsResource(std::shared_ptr<FeedsApiCampaignsCampaignIdFeedsFeedIdIndex-logsResource> spFeedsApiCampaignsCampaignIdFeedsFeedIdIndex-logsResource);
    virtual void setFeedsApiCampaignsCampaignIdFeedsResource(std::shared_ptr<FeedsApiCampaignsCampaignIdFeedsResource> spFeedsApiCampaignsCampaignIdFeedsResource);
    virtual void setFeedsApiCampaignsCampaignIdFeedsFeedIdRefreshResource(std::shared_ptr<FeedsApiCampaignsCampaignIdFeedsFeedIdRefreshResource> spFeedsApiCampaignsCampaignIdFeedsFeedIdRefreshResource);
    virtual void setFeedsApiCampaignsCampaignIdFeedsFeedIdParamsResource(std::shared_ptr<FeedsApiCampaignsCampaignIdFeedsFeedIdParamsResource> spFeedsApiCampaignsCampaignIdFeedsFeedIdParamsResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<FeedsApiCampaignsCampaignIdFeedsFeedIdResource> m_spFeedsApiCampaignsCampaignIdFeedsFeedIdResource;
    std::shared_ptr<FeedsApiCampaignsCampaignIdFeedsFeedIdIndex-logsResource> m_spFeedsApiCampaignsCampaignIdFeedsFeedIdIndex-logsResource;
    std::shared_ptr<FeedsApiCampaignsCampaignIdFeedsResource> m_spFeedsApiCampaignsCampaignIdFeedsResource;
    std::shared_ptr<FeedsApiCampaignsCampaignIdFeedsFeedIdRefreshResource> m_spFeedsApiCampaignsCampaignIdFeedsFeedIdRefreshResource;
    std::shared_ptr<FeedsApiCampaignsCampaignIdFeedsFeedIdParamsResource> m_spFeedsApiCampaignsCampaignIdFeedsFeedIdParamsResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* FeedsApi_H_ */

