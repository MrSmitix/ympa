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


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/uri.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include <boost/lexical_cast.hpp>
#include <boost/algorithm/string.hpp>

#include "ContentApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

ContentApiException::ContentApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int ContentApiException::getStatus() const
{
    return m_status;
}
const char* ContentApiException::what() const noexcept
{
    return m_what.c_str();
}


template<class MODEL_T>
std::shared_ptr<MODEL_T> extractJsonModelBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto model = std::make_shared<MODEL_T>(pt);
    return model;
}

template<class MODEL_T>
std::vector<std::shared_ptr<MODEL_T>> extractJsonArrayBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto arrayRet = std::vector<std::shared_ptr<MODEL_T>>();
    for (const auto& child: pt) {
        arrayRet.emplace_back(std::make_shared<MODEL_T>(child.second));
    }
    return arrayRet;
}

template <class KEY_T, class VAL_T>
std::string convertMapResponse(const std::map<KEY_T, VAL_T>& map)
{
    boost::property_tree::ptree pt;
    for(const auto &kv: map) {
    pt.push_back(boost::property_tree::ptree::value_type(
        boost::lexical_cast<std::string>(kv.first),
        boost::property_tree::ptree(
        boost::lexical_cast<std::string>(kv.second))));
    }
    std::stringstream sstream;
    write_json(sstream, pt);
    std::string result = sstream.str();
    return result;
}

ContentApiCategoryCategoryIdParametersResource::ContentApiCategoryCategoryIdParametersResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/category/{categoryId: .*}/parameters/");
	this->set_method_handler("POST",
		std::bind(&ContentApiCategoryCategoryIdParametersResource::handler_POST_internal, this,
			std::placeholders::_1));
}

ContentApiCategoryCategoryIdParametersResource::~ContentApiCategoryCategoryIdParametersResource()
{
}

std::pair<int, std::string> ContentApiCategoryCategoryIdParametersResource::handleContentApiException(const ContentApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ContentApiCategoryCategoryIdParametersResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ContentApiCategoryCategoryIdParametersResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ContentApiCategoryCategoryIdParametersResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ContentApiCategoryCategoryIdParametersResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void ContentApiCategoryCategoryIdParametersResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ContentApiCategoryCategoryIdParametersResource::handler_POST_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();

    // Getting the path params
    const int64_t categoryId = getPathParam_categoryId(request);



    int status_code = 500;
    std::shared_ptr<GetCategoryContentParametersResponse> resultObject = std::make_shared<GetCategoryContentParametersResponse>();
    std::string result = "";

    try {
        std::tie(status_code, resultObject) =
             handler_POST(categoryId);
    }
    catch(const ContentApiException& e) {
        std::tie(status_code, result) = handleContentApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }

    if (status_code == 200) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 200, result.empty() ? "Список характеристик товаров из заданной категории." : result, contentType);
        return;
    }
    if (status_code == 400) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 400, result.empty() ? "Запрос содержит неправильные данные." : result, contentType);
        return;
    }
    if (status_code == 401) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 401, result.empty() ? "В запросе не указаны данные для авторизации." : result, contentType);
        return;
    }
    if (status_code == 403) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 403, result.empty() ? "Данные для авторизации неверны или доступ к ресурсу запрещен." : result, contentType);
        return;
    }
    if (status_code == 404) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 404, result.empty() ? "Запрашиваемый ресурс не найден." : result, contentType);
        return;
    }
    if (status_code == 420) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 420, result.empty() ? "Превышено ограничение на доступ к ресурсу." : result, contentType);
        return;
    }
    if (status_code == 500) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 500, result.empty() ? "Внутренняя ошибка сервера." : result, contentType);
        return;
    }
    defaultSessionClose(session, status_code, result);
}


std::pair<int, std::shared_ptr<GetCategoryContentParametersResponse>> ContentApiCategoryCategoryIdParametersResource::handler_POST(
        int64_t const & categoryId)
{
    throw ContentApiException(501, "Not implemented");
}


std::string ContentApiCategoryCategoryIdParametersResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}
ContentApiBusinessesBusinessIdOffer-cardsResource::ContentApiBusinessesBusinessIdOffer-cardsResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/businesses/{businessId: .*}/offer-cards/");
	this->set_method_handler("POST",
		std::bind(&ContentApiBusinessesBusinessIdOffer-cardsResource::handler_POST_internal, this,
			std::placeholders::_1));
}

ContentApiBusinessesBusinessIdOffer-cardsResource::~ContentApiBusinessesBusinessIdOffer-cardsResource()
{
}

std::pair<int, std::string> ContentApiBusinessesBusinessIdOffer-cardsResource::handleContentApiException(const ContentApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ContentApiBusinessesBusinessIdOffer-cardsResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ContentApiBusinessesBusinessIdOffer-cardsResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ContentApiBusinessesBusinessIdOffer-cardsResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ContentApiBusinessesBusinessIdOffer-cardsResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void ContentApiBusinessesBusinessIdOffer-cardsResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ContentApiBusinessesBusinessIdOffer-cardsResource::handler_POST_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    std::string bodyContent = extractBodyContent(session);

    // Get body params or form params here from the body content string
    auto getOfferCardsContentStatusRequest = extractJsonModelBodyParam<GetOfferCardsContentStatusRequest>(bodyContent);

    // Getting the path params
    const int64_t businessId = getPathParam_businessId(request);

    // Getting the query params
    const std::string pageToken = getQueryParam_pageToken(request);
    const int32_t limit = getQueryParam_limit(request);


    int status_code = 500;
    std::shared_ptr<GetOfferCardsContentStatusResponse> resultObject = std::make_shared<GetOfferCardsContentStatusResponse>();
    std::string result = "";

    try {
        std::tie(status_code, resultObject) =
             handler_POST(businessId, pageToken, limit, getOfferCardsContentStatusRequest);
    }
    catch(const ContentApiException& e) {
        std::tie(status_code, result) = handleContentApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }

    if (status_code == 200) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 200, result.empty() ? "Информация о карточках указанных товаров." : result, contentType);
        return;
    }
    if (status_code == 400) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 400, result.empty() ? "Запрос содержит неправильные данные." : result, contentType);
        return;
    }
    if (status_code == 401) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 401, result.empty() ? "В запросе не указаны данные для авторизации." : result, contentType);
        return;
    }
    if (status_code == 403) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 403, result.empty() ? "Данные для авторизации неверны или доступ к ресурсу запрещен." : result, contentType);
        return;
    }
    if (status_code == 404) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 404, result.empty() ? "Запрашиваемый ресурс не найден." : result, contentType);
        return;
    }
    if (status_code == 420) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 420, result.empty() ? "Превышено ограничение на доступ к ресурсу." : result, contentType);
        return;
    }
    if (status_code == 500) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 500, result.empty() ? "Внутренняя ошибка сервера." : result, contentType);
        return;
    }
    defaultSessionClose(session, status_code, result);
}


std::pair<int, std::shared_ptr<GetOfferCardsContentStatusResponse>> ContentApiBusinessesBusinessIdOffer-cardsResource::handler_POST(
        int64_t const & businessId, std::string const & pageToken, int32_t const & limit, std::shared_ptr<GetOfferCardsContentStatusRequest> const & getOfferCardsContentStatusRequest)
{
    throw ContentApiException(501, "Not implemented");
}


std::string ContentApiBusinessesBusinessIdOffer-cardsResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}
ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::ContentApiBusinessesBusinessIdOffer-cardsUpdateResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/businesses/{businessId: .*}/offer-cards/update/");
	this->set_method_handler("POST",
		std::bind(&ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::handler_POST_internal, this,
			std::placeholders::_1));
}

ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::~ContentApiBusinessesBusinessIdOffer-cardsUpdateResource()
{
}

std::pair<int, std::string> ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::handleContentApiException(const ContentApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::handler_POST_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    std::string bodyContent = extractBodyContent(session);

    // Get body params or form params here from the body content string
    auto updateOfferContentRequest = extractJsonModelBodyParam<UpdateOfferContentRequest>(bodyContent);

    // Getting the path params
    const int64_t businessId = getPathParam_businessId(request);



    int status_code = 500;
    std::shared_ptr<UpdateOfferContentResponse> resultObject = std::make_shared<UpdateOfferContentResponse>();
    std::string result = "";

    try {
        std::tie(status_code, resultObject) =
             handler_POST(businessId, updateOfferContentRequest);
    }
    catch(const ContentApiException& e) {
        std::tie(status_code, result) = handleContentApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }

    if (status_code == 200) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 200, result.empty() ? "Запрос выполнен корректно, данные обработаны.  {% note warning \&quot;Ответ 200 сам по себе не значит, что переданные значения корректны\&quot; %}  Обязательно посмотрите детали ответа: &#x60;status&#x60; и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в &#x60;status&#x60; вернулось &#x60;ERROR&#x60;, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля &#x60;errors&#x60; и &#x60;warnings&#x60;. " : result, contentType);
        return;
    }
    if (status_code == 400) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 400, result.empty() ? "Запрос содержит неправильные данные." : result, contentType);
        return;
    }
    if (status_code == 401) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 401, result.empty() ? "В запросе не указаны данные для авторизации." : result, contentType);
        return;
    }
    if (status_code == 403) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 403, result.empty() ? "Данные для авторизации неверны или доступ к ресурсу запрещен." : result, contentType);
        return;
    }
    if (status_code == 404) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 404, result.empty() ? "Запрашиваемый ресурс не найден." : result, contentType);
        return;
    }
    if (status_code == 420) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 420, result.empty() ? "Превышено ограничение на доступ к ресурсу." : result, contentType);
        return;
    }
    if (status_code == 423) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 423, result.empty() ? "К ресурсу нельзя применить указанный метод." : result, contentType);
        return;
    }
    if (status_code == 500) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 500, result.empty() ? "Внутренняя ошибка сервера." : result, contentType);
        return;
    }
    defaultSessionClose(session, status_code, result);
}


std::pair<int, std::shared_ptr<UpdateOfferContentResponse>> ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::handler_POST(
        int64_t const & businessId, std::shared_ptr<UpdateOfferContentRequest> const & updateOfferContentRequest)
{
    throw ContentApiException(501, "Not implemented");
}


std::string ContentApiBusinessesBusinessIdOffer-cardsUpdateResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}

ContentApi::ContentApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

ContentApi::~ContentApi() {}

void ContentApi::setContentApiCategoryCategoryIdParametersResource(std::shared_ptr<ContentApiCategoryCategoryIdParametersResource> spContentApiCategoryCategoryIdParametersResource) {
    m_spContentApiCategoryCategoryIdParametersResource = spContentApiCategoryCategoryIdParametersResource;
    m_service->publish(m_spContentApiCategoryCategoryIdParametersResource);
}
void ContentApi::setContentApiBusinessesBusinessIdOffer-cardsResource(std::shared_ptr<ContentApiBusinessesBusinessIdOffer-cardsResource> spContentApiBusinessesBusinessIdOffer-cardsResource) {
    m_spContentApiBusinessesBusinessIdOffer-cardsResource = spContentApiBusinessesBusinessIdOffer-cardsResource;
    m_service->publish(m_spContentApiBusinessesBusinessIdOffer-cardsResource);
}
void ContentApi::setContentApiBusinessesBusinessIdOffer-cardsUpdateResource(std::shared_ptr<ContentApiBusinessesBusinessIdOffer-cardsUpdateResource> spContentApiBusinessesBusinessIdOffer-cardsUpdateResource) {
    m_spContentApiBusinessesBusinessIdOffer-cardsUpdateResource = spContentApiBusinessesBusinessIdOffer-cardsUpdateResource;
    m_service->publish(m_spContentApiBusinessesBusinessIdOffer-cardsUpdateResource);
}


void ContentApi::publishDefaultResources() {
    if (!m_spContentApiCategoryCategoryIdParametersResource) {
        setContentApiCategoryCategoryIdParametersResource(std::make_shared<ContentApiCategoryCategoryIdParametersResource>());
    }
    if (!m_spContentApiBusinessesBusinessIdOffer-cardsResource) {
        setContentApiBusinessesBusinessIdOffer-cardsResource(std::make_shared<ContentApiBusinessesBusinessIdOffer-cardsResource>());
    }
    if (!m_spContentApiBusinessesBusinessIdOffer-cardsUpdateResource) {
        setContentApiBusinessesBusinessIdOffer-cardsUpdateResource(std::make_shared<ContentApiBusinessesBusinessIdOffer-cardsUpdateResource>());
    }
}

std::shared_ptr<restbed::Service> ContentApi::service() {
    return m_service;
}


}
}
}
}

