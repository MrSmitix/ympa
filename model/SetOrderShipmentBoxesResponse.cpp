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



#include "SetOrderShipmentBoxesResponse.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <algorithm>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

SetOrderShipmentBoxesResponse::SetOrderShipmentBoxesResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string SetOrderShipmentBoxesResponse::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void SetOrderShipmentBoxesResponse::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree SetOrderShipmentBoxesResponse::toPropertyTree()
{
    return toPropertyTree_internal();
}

void SetOrderShipmentBoxesResponse::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string SetOrderShipmentBoxesResponse::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void SetOrderShipmentBoxesResponse::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree SetOrderShipmentBoxesResponse::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m_Result != nullptr) {
		pt.add_child("result", m_Result->toPropertyTree());
	}
	return pt;
}

void SetOrderShipmentBoxesResponse::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("result")) {
		m_Result = std::make_shared<ShipmentBoxesDTO>();
		m_Result->fromPropertyTree(pt.get_child("result"));
	}
}

std::shared_ptr<ApiResponseStatusType> SetOrderShipmentBoxesResponse::getStatus() const
{
    return m_Status;
}

void SetOrderShipmentBoxesResponse::setStatus(std::shared_ptr<ApiResponseStatusType> value)
{
	m_Status = value;
}
std::shared_ptr<ShipmentBoxesDTO> SetOrderShipmentBoxesResponse::getResult() const
{
    return m_Result;
}

void SetOrderShipmentBoxesResponse::setResult(std::shared_ptr<ShipmentBoxesDTO> value)
{
	m_Result = value;
}

std::vector<SetOrderShipmentBoxesResponse> createSetOrderShipmentBoxesResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<SetOrderShipmentBoxesResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(SetOrderShipmentBoxesResponse(child.second));
    }

    return vec;
}

}
}
}
}

