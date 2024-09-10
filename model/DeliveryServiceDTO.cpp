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



#include "DeliveryServiceDTO.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

DeliveryServiceDTO::DeliveryServiceDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string DeliveryServiceDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void DeliveryServiceDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree DeliveryServiceDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void DeliveryServiceDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string DeliveryServiceDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void DeliveryServiceDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree DeliveryServiceDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("name", m_Name);
	return pt;
}

void DeliveryServiceDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0L);
	m_Name = pt.get("name", "");
}

int64_t DeliveryServiceDTO::getId() const
{
    return m_Id;
}

void DeliveryServiceDTO::setId(int64_t value)
{
	m_Id = value;
}
std::string DeliveryServiceDTO::getName() const
{
    return m_Name;
}

void DeliveryServiceDTO::setName(std::string value)
{
	m_Name = value;
}

std::vector<DeliveryServiceDTO> createDeliveryServiceDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<DeliveryServiceDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(DeliveryServiceDTO(child.second));
    }

    return vec;
}

}
}
}
}

