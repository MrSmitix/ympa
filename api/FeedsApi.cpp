/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "FeedsApi.h"
#include "Helpers.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

const std::string FeedsApi::base = "";

FeedsApi::FeedsApi(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : ApiBase(rtr)
{
}

void FeedsApi::init() {
    setupRoutes();
}

void FeedsApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Get(*router, base + "/campaigns/:campaignId/feeds/:feedId", Routes::bind(&FeedsApi::get_feed_handler, this));
    Routes::Get(*router, base + "/campaigns/:campaignId/feeds/:feedId/index-logs", Routes::bind(&FeedsApi::get_feed_index_logs_handler, this));
    Routes::Get(*router, base + "/campaigns/:campaignId/feeds", Routes::bind(&FeedsApi::get_feeds_handler, this));
    Routes::Post(*router, base + "/campaigns/:campaignId/feeds/:feedId/refresh", Routes::bind(&FeedsApi::refresh_feed_handler, this));
    Routes::Post(*router, base + "/campaigns/:campaignId/feeds/:feedId/params", Routes::bind(&FeedsApi::set_feed_params_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&FeedsApi::feeds_api_default_handler, this));
}

void FeedsApi::handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleParsingException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> FeedsApi::handleParsingException(const std::exception& ex) const noexcept
{
    try {
        throw;
    } catch (nlohmann::detail::exception &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (org::openapitools::server::helpers::ValidationException &e) {
        return std::make_pair(Pistache::Http::Code::Bad_Request, e.what());
    } catch (std::exception &e) {
        return std::make_pair(Pistache::Http::Code::Internal_Server_Error, e.what());
    }
}

void FeedsApi::handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleOperationException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> FeedsApi::handleOperationException(const std::exception& ex) const noexcept
{
    return std::make_pair(Pistache::Http::Code::Internal_Server_Error, ex.what());
}

void FeedsApi::get_feed_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto campaignId = request.param(":campaignId").as<int64_t>();
    auto feedId = request.param(":feedId").as<int64_t>();
    
    try {
        this->get_feed(campaignId, feedId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void FeedsApi::get_feed_index_logs_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto campaignId = request.param(":campaignId").as<int64_t>();
    auto feedId = request.param(":feedId").as<int64_t>();
    
    // Getting the query params
    auto limitQuery = request.query().get("limit");
    std::optional<int32_t> limit;
    if(limitQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(limitQuery.value(), valueQuery_instance)){
            limit = valueQuery_instance;
        }
    }
    auto publishedTimeFromQuery = request.query().get("published_time_from");
    std::optional<std::string> publishedTimeFrom;
    if(publishedTimeFromQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(publishedTimeFromQuery.value(), valueQuery_instance)){
            publishedTimeFrom = valueQuery_instance;
        }
    }
    auto publishedTimeToQuery = request.query().get("published_time_to");
    std::optional<std::string> publishedTimeTo;
    if(publishedTimeToQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(publishedTimeToQuery.value(), valueQuery_instance)){
            publishedTimeTo = valueQuery_instance;
        }
    }
    auto statusQuery = request.query().get("status");
    std::optional<FeedIndexLogsStatusType> status;
    if(statusQuery.has_value()){
        FeedIndexLogsStatusType valueQuery_instance;
        if(fromStringValue(statusQuery.value(), valueQuery_instance)){
            status = valueQuery_instance;
        }
    }
    
    try {
        this->get_feed_index_logs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void FeedsApi::get_feeds_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto campaignId = request.param(":campaignId").as<int64_t>();
    
    try {
        this->get_feeds(campaignId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void FeedsApi::refresh_feed_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto campaignId = request.param(":campaignId").as<int64_t>();
    auto feedId = request.param(":feedId").as<int64_t>();
    
    try {
        this->refresh_feed(campaignId, feedId, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}
void FeedsApi::set_feed_params_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto campaignId = request.param(":campaignId").as<int64_t>();
    auto feedId = request.param(":feedId").as<int64_t>();
    
    // Getting the body param
    
    SetFeedParamsRequest setFeedParamsRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(setFeedParamsRequest);
        setFeedParamsRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->set_feed_params(campaignId, feedId, setFeedParamsRequest, response);
    } catch (Pistache::Http::HttpError &e) {
        response.send(static_cast<Pistache::Http::Code>(e.code()), e.what());
        return;
    } catch (std::exception &e) {
        this->handleOperationException(e, response);
        return;
    }

    } catch (std::exception &e) {
        response.send(Pistache::Http::Code::Internal_Server_Error, e.what());
    }

}

void FeedsApi::feeds_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

} // namespace org::openapitools::server::api

