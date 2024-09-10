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

#include "ReturnsApi.h"
#include "Helpers.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

const std::string ReturnsApi::base = "";

ReturnsApi::ReturnsApi(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : ApiBase(rtr)
{
}

void ReturnsApi::init() {
    setupRoutes();
}

void ReturnsApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Get(*router, base + "/campaigns/:campaignId/orders/:orderId/returns/:returnId", Routes::bind(&ReturnsApi::get_return_handler, this));
    Routes::Get(*router, base + "/campaigns/:campaignId/orders/:orderId/returns/:returnId/application", Routes::bind(&ReturnsApi::get_return_application_handler, this));
    Routes::Get(*router, base + "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/:itemId/image/:imageHash", Routes::bind(&ReturnsApi::get_return_photo_handler, this));
    Routes::Get(*router, base + "/campaigns/:campaignId/returns", Routes::bind(&ReturnsApi::get_returns_handler, this));
    Routes::Post(*router, base + "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision", Routes::bind(&ReturnsApi::set_return_decision_handler, this));
    Routes::Post(*router, base + "/campaigns/:campaignId/orders/:orderId/returns/:returnId/decision/submit", Routes::bind(&ReturnsApi::submit_return_decision_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&ReturnsApi::returns_api_default_handler, this));
}

void ReturnsApi::handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleParsingException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> ReturnsApi::handleParsingException(const std::exception& ex) const noexcept
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

void ReturnsApi::handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleOperationException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> ReturnsApi::handleOperationException(const std::exception& ex) const noexcept
{
    return std::make_pair(Pistache::Http::Code::Internal_Server_Error, ex.what());
}

void ReturnsApi::get_return_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto campaignId = request.param(":campaignId").as<int64_t>();
    auto orderId = request.param(":orderId").as<int64_t>();
    auto returnId = request.param(":returnId").as<int64_t>();
    
    try {
        this->get_return(campaignId, orderId, returnId, response);
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
void ReturnsApi::get_return_application_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto campaignId = request.param(":campaignId").as<int64_t>();
    auto orderId = request.param(":orderId").as<int64_t>();
    auto returnId = request.param(":returnId").as<int64_t>();
    
    try {
        this->get_return_application(campaignId, orderId, returnId, response);
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
void ReturnsApi::get_return_photo_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto campaignId = request.param(":campaignId").as<int64_t>();
    auto orderId = request.param(":orderId").as<int64_t>();
    auto returnId = request.param(":returnId").as<int64_t>();
    auto itemId = request.param(":itemId").as<int64_t>();
    auto imageHash = request.param(":imageHash").as<std::string>();
    
    try {
        this->get_return_photo(campaignId, orderId, returnId, itemId, imageHash, response);
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
void ReturnsApi::get_returns_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto campaignId = request.param(":campaignId").as<int64_t>();
    
    // Getting the query params
    auto pageTokenQuery = request.query().get("page_token");
    std::optional<std::string> pageToken;
    if(pageTokenQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(pageTokenQuery.value(), valueQuery_instance)){
            pageToken = valueQuery_instance;
        }
    }
    auto limitQuery = request.query().get("limit");
    std::optional<int32_t> limit;
    if(limitQuery.has_value()){
        int32_t valueQuery_instance;
        if(fromStringValue(limitQuery.value(), valueQuery_instance)){
            limit = valueQuery_instance;
        }
    }
    auto orderIdsQuery = request.query().get("orderIds");
    std::optional<std::vector<int64_t>> orderIds;
    if(orderIdsQuery.has_value()){
        std::vector<int64_t> valueQuery_instance;
        if(fromStringValue(orderIdsQuery.value(), valueQuery_instance)){
            orderIds = valueQuery_instance;
        }
    }
    auto statusesQuery = request.query().get("statuses");
    std::optional<std::vector<RefundStatusType>> statuses;
    if(statusesQuery.has_value()){
        std::vector<RefundStatusType> valueQuery_instance;
        if(fromStringValue(statusesQuery.value(), valueQuery_instance)){
            statuses = valueQuery_instance;
        }
    }
    auto typeQuery = request.query().get("type");
    std::optional<ReturnType> type;
    if(typeQuery.has_value()){
        ReturnType valueQuery_instance;
        if(fromStringValue(typeQuery.value(), valueQuery_instance)){
            type = valueQuery_instance;
        }
    }
    auto fromDateQuery = request.query().get("fromDate");
    std::optional<std::string> fromDate;
    if(fromDateQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(fromDateQuery.value(), valueQuery_instance)){
            fromDate = valueQuery_instance;
        }
    }
    auto toDateQuery = request.query().get("toDate");
    std::optional<std::string> toDate;
    if(toDateQuery.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(toDateQuery.value(), valueQuery_instance)){
            toDate = valueQuery_instance;
        }
    }
    auto fromDate2Query = request.query().get("from_date");
    std::optional<std::string> fromDate2;
    if(fromDate2Query.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(fromDate2Query.value(), valueQuery_instance)){
            fromDate2 = valueQuery_instance;
        }
    }
    auto toDate2Query = request.query().get("to_date");
    std::optional<std::string> toDate2;
    if(toDate2Query.has_value()){
        std::string valueQuery_instance;
        if(fromStringValue(toDate2Query.value(), valueQuery_instance)){
            toDate2 = valueQuery_instance;
        }
    }
    
    try {
        this->get_returns(campaignId, pageToken, limit, orderIds, statuses, type, fromDate, toDate, fromDate2, toDate2, response);
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
void ReturnsApi::set_return_decision_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto campaignId = request.param(":campaignId").as<int64_t>();
    auto orderId = request.param(":orderId").as<int64_t>();
    auto returnId = request.param(":returnId").as<int64_t>();
    
    // Getting the body param
    
    SetReturnDecisionRequest setReturnDecisionRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(setReturnDecisionRequest);
        setReturnDecisionRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->set_return_decision(campaignId, orderId, returnId, setReturnDecisionRequest, response);
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
void ReturnsApi::submit_return_decision_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {

    // Getting the path params
    auto campaignId = request.param(":campaignId").as<int64_t>();
    auto orderId = request.param(":orderId").as<int64_t>();
    auto returnId = request.param(":returnId").as<int64_t>();
    
    try {
        this->submit_return_decision(campaignId, orderId, returnId, response);
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

void ReturnsApi::returns_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

} // namespace org::openapitools::server::api

