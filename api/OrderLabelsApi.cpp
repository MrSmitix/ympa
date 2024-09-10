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

#include "OrderLabelsApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

OrderLabelsApiException::OrderLabelsApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int OrderLabelsApiException::getStatus() const
{
    return m_status;
}
const char* OrderLabelsApiException::what() const noexcept
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

OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/campaigns/{campaignId: .*}/orders/{orderId: .*}/delivery/shipments/{shipmentId: .*}/boxes/{boxId: .*}/label/");
	this->set_method_handler("GET",
		std::bind(&OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::handler_GET_internal, this,
			std::placeholders::_1));
}

OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::~OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource()
{
}

std::pair<int, std::string> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::handleOrderLabelsApiException(const OrderLabelsApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();

    // Getting the path params
    const int64_t campaignId = getPathParam_campaignId(request);
    const int64_t orderId = getPathParam_orderId(request);
    const int64_t shipmentId = getPathParam_shipmentId(request);
    const int64_t boxId = getPathParam_boxId(request);

    // Getting the query params


    int status_code = 500;
    std::string resultObject = "";
    std::string result = "";

    try {
        std::tie(status_code, resultObject) =
             handler_GET(campaignId, orderId, shipmentId, boxId, format);
    }
    catch(const OrderLabelsApiException& e) {
        std::tie(status_code, result) = handleOrderLabelsApiException(e);
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
        returnResponse(session, 200, result.empty() ? "PDF‑файл с ярлыками для коробки. Файл содержит одну страницу с ярлыком." : result, contentType);
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


std::pair<int, std::string> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::handler_GET(
        int64_t const & campaignId, int64_t const & orderId, int64_t const & shipmentId, int64_t const & boxId, std::shared_ptr<PageFormatType> const & format)
{
    throw OrderLabelsApiException(501, "Not implemented");
}


std::string OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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
OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/campaigns/{campaignId: .*}/orders/{orderId: .*}/delivery/labels/");
	this->set_method_handler("GET",
		std::bind(&OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::handler_GET_internal, this,
			std::placeholders::_1));
}

OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::~OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource()
{
}

std::pair<int, std::string> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::handleOrderLabelsApiException(const OrderLabelsApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();

    // Getting the path params
    const int64_t campaignId = getPathParam_campaignId(request);
    const int64_t orderId = getPathParam_orderId(request);

    // Getting the query params


    int status_code = 500;
    std::string resultObject = "";
    std::string result = "";

    try {
        std::tie(status_code, resultObject) =
             handler_GET(campaignId, orderId, format);
    }
    catch(const OrderLabelsApiException& e) {
        std::tie(status_code, result) = handleOrderLabelsApiException(e);
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
        returnResponse(session, 200, result.empty() ? "PDF‑файл с ярлыками на все коробки." : result, contentType);
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


std::pair<int, std::string> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::handler_GET(
        int64_t const & campaignId, int64_t const & orderId, std::shared_ptr<PageFormatType> const & format)
{
    throw OrderLabelsApiException(501, "Not implemented");
}


std::string OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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
OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/campaigns/{campaignId: .*}/orders/{orderId: .*}/delivery/labels/data/");
	this->set_method_handler("GET",
		std::bind(&OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::handler_GET_internal, this,
			std::placeholders::_1));
}

OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::~OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource()
{
}

std::pair<int, std::string> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::handleOrderLabelsApiException(const OrderLabelsApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();

    // Getting the path params
    const int64_t campaignId = getPathParam_campaignId(request);
    const int64_t orderId = getPathParam_orderId(request);



    int status_code = 500;
    std::shared_ptr<GetOrderLabelsDataResponse> resultObject = std::make_shared<GetOrderLabelsDataResponse>();
    std::string result = "";

    try {
        std::tie(status_code, resultObject) =
             handler_GET(campaignId, orderId);
    }
    catch(const OrderLabelsApiException& e) {
        std::tie(status_code, result) = handleOrderLabelsApiException(e);
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
        returnResponse(session, 200, result.empty() ? "Информация для печати ярлыков." : result, contentType);
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


std::pair<int, std::shared_ptr<GetOrderLabelsDataResponse>> OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::handler_GET(
        int64_t const & campaignId, int64_t const & orderId)
{
    throw OrderLabelsApiException(501, "Not implemented");
}


std::string OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

OrderLabelsApi::OrderLabelsApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

OrderLabelsApi::~OrderLabelsApi() {}

void OrderLabelsApi::setOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource(std::shared_ptr<OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource> spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource) {
    m_spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource = spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource;
    m_service->publish(m_spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource);
}
void OrderLabelsApi::setOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource(std::shared_ptr<OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource> spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource) {
    m_spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource = spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource;
    m_service->publish(m_spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource);
}
void OrderLabelsApi::setOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource(std::shared_ptr<OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource> spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource) {
    m_spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource = spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource;
    m_service->publish(m_spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource);
}


void OrderLabelsApi::publishDefaultResources() {
    if (!m_spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource) {
        setOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource(std::make_shared<OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryShipmentsShipmentIdBoxesBoxIdLabelResource>());
    }
    if (!m_spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource) {
        setOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource(std::make_shared<OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsResource>());
    }
    if (!m_spOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource) {
        setOrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource(std::make_shared<OrderLabelsApiCampaignsCampaignIdOrdersOrderIdDeliveryLabelsDataResource>());
    }
}

std::shared_ptr<restbed::Service> OrderLabelsApi::service() {
    return m_service;
}


}
}
}
}

