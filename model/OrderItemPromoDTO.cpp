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



#include "OrderItemPromoDTO.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <algorithm>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrderItemPromoDTO::OrderItemPromoDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string OrderItemPromoDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void OrderItemPromoDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OrderItemPromoDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("discount", m_Discount);
	pt.put("subsidy", m_Subsidy);
	pt.put("shopPromoId", m_ShopPromoId);
	pt.put("marketPromoId", m_MarketPromoId);
	return pt;
}

void OrderItemPromoDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Discount = pt.get("discount", 0.0);
	m_Subsidy = pt.get("subsidy", 0.0);
	m_ShopPromoId = pt.get("shopPromoId", "");
	m_MarketPromoId = pt.get("marketPromoId", "");
}

OrderPromoType OrderItemPromoDTO::getType() const
{
    return m_Type;
}

void OrderItemPromoDTO::setType(OrderPromoType value)
{
    m_Type = value;
}


double OrderItemPromoDTO::getDiscount() const
{
    return m_Discount;
}

void OrderItemPromoDTO::setDiscount(double value)
{
    m_Discount = value;
}


double OrderItemPromoDTO::getSubsidy() const
{
    return m_Subsidy;
}

void OrderItemPromoDTO::setSubsidy(double value)
{
    m_Subsidy = value;
}


std::string OrderItemPromoDTO::getShopPromoId() const
{
    return m_ShopPromoId;
}

void OrderItemPromoDTO::setShopPromoId(std::string value)
{
    m_ShopPromoId = value;
}


std::string OrderItemPromoDTO::getMarketPromoId() const
{
    return m_MarketPromoId;
}

void OrderItemPromoDTO::setMarketPromoId(std::string value)
{
    m_MarketPromoId = value;
}



std::vector<OrderItemPromoDTO> createOrderItemPromoDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OrderItemPromoDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(OrderItemPromoDTO(child.second));
    }

    return vec;
}

}
}
}
}

