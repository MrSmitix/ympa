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



#include "OrdersStatsPriceDTO.h"

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

OrdersStatsPriceDTO::OrdersStatsPriceDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string OrdersStatsPriceDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void OrdersStatsPriceDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree OrdersStatsPriceDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void OrdersStatsPriceDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string OrdersStatsPriceDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void OrdersStatsPriceDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OrdersStatsPriceDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("costPerItem", m_CostPerItem);
	pt.put("total", m_Total);
	return pt;
}

void OrdersStatsPriceDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_CostPerItem = pt.get("costPerItem", 0.0);
	m_Total = pt.get("total", 0.0);
}

std::shared_ptr<OrdersStatsPriceType> OrdersStatsPriceDTO::getType() const
{
    return m_Type;
}

void OrdersStatsPriceDTO::setType(std::shared_ptr<OrdersStatsPriceType> value)
{
	m_Type = value;
}
double OrdersStatsPriceDTO::getCostPerItem() const
{
    return m_CostPerItem;
}

void OrdersStatsPriceDTO::setCostPerItem(double value)
{
	m_CostPerItem = value;
}
double OrdersStatsPriceDTO::getTotal() const
{
    return m_Total;
}

void OrdersStatsPriceDTO::setTotal(double value)
{
	m_Total = value;
}

std::vector<OrdersStatsPriceDTO> createOrdersStatsPriceDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OrdersStatsPriceDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(OrdersStatsPriceDTO(child.second));
    }

    return vec;
}

}
}
}
}

