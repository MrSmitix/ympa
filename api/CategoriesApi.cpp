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

#include "CategoriesApi.h"
#include "Helpers.h"

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::helpers;
using namespace org::openapitools::server::model;

const std::string CategoriesApi::base = "";

CategoriesApi::CategoriesApi(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : ApiBase(rtr)
{
}

void CategoriesApi::init() {
    setupRoutes();
}

void CategoriesApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Post(*router, base + "/categories/max-sale-quantum", Routes::bind(&CategoriesApi::get_categories_max_sale_quantum_handler, this));
    Routes::Post(*router, base + "/categories/tree", Routes::bind(&CategoriesApi::get_categories_tree_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&CategoriesApi::categories_api_default_handler, this));
}

void CategoriesApi::handleParsingException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleParsingException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> CategoriesApi::handleParsingException(const std::exception& ex) const noexcept
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

void CategoriesApi::handleOperationException(const std::exception& ex, Pistache::Http::ResponseWriter &response) const noexcept
{
    std::pair<Pistache::Http::Code, std::string> codeAndError = handleOperationException(ex);
    response.send(codeAndError.first, codeAndError.second);
}

std::pair<Pistache::Http::Code, std::string> CategoriesApi::handleOperationException(const std::exception& ex) const noexcept
{
    return std::make_pair(Pistache::Http::Code::Internal_Server_Error, ex.what());
}

void CategoriesApi::get_categories_max_sale_quantum_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the body param
    
    GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(getCategoriesMaxSaleQuantumRequest);
        getCategoriesMaxSaleQuantumRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->get_categories_max_sale_quantum(getCategoriesMaxSaleQuantumRequest, response);
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
void CategoriesApi::get_categories_tree_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    try {


    // Getting the body param
    
    GetCategoriesRequest getCategoriesRequest;
    
    try {
        nlohmann::json::parse(request.body()).get_to(getCategoriesRequest);
        getCategoriesRequest.validate();
    } catch (std::exception &e) {
        this->handleParsingException(e, response);
        return;
    }

    try {
        this->get_categories_tree(getCategoriesRequest, response);
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

void CategoriesApi::categories_api_default_handler(const Pistache::Rest::Request &, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
}

} // namespace org::openapitools::server::api

