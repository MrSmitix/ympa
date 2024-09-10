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



#include "FeedbackOrderDTO.h"

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

FeedbackOrderDTO::FeedbackOrderDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string FeedbackOrderDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void FeedbackOrderDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree FeedbackOrderDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("shopOrderId", m_ShopOrderId);
	return pt;
}

void FeedbackOrderDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_ShopOrderId = pt.get("shopOrderId", "");
}

std::string FeedbackOrderDTO::getShopOrderId() const
{
    return m_ShopOrderId;
}

void FeedbackOrderDTO::setShopOrderId(std::string value)
{
    m_ShopOrderId = value;
}


FeedbackDeliveryType FeedbackOrderDTO::getDelivery() const
{
    return m_Delivery;
}

void FeedbackOrderDTO::setDelivery(FeedbackDeliveryType value)
{
    m_Delivery = value;
}



std::vector<FeedbackOrderDTO> createFeedbackOrderDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<FeedbackOrderDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(FeedbackOrderDTO(child.second));
    }

    return vec;
}

}
}
}
}

