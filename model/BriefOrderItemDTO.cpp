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



#include "BriefOrderItemDTO.h"

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

BriefOrderItemDTO::BriefOrderItemDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string BriefOrderItemDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void BriefOrderItemDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree BriefOrderItemDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("count", m_Count);
	pt.put("price", m_Price);
	pt.put("offerName", m_OfferName);
	pt.put("offerId", m_OfferId);
	// generate tree for Instances
    tmp_node.clear();
	if (!m_Instances.empty()) {
        tmp_node = toPt(m_Instances);
		pt.add_child("instances", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void BriefOrderItemDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0L);
	m_Count = pt.get("count", 0);
	m_Price = pt.get("price", 0.0);
	m_OfferName = pt.get("offerName", "");
	m_OfferId = pt.get("offerId", "");
	// push all items of Instances into member
	if (pt.get_child_optional("instances")) {
        m_Instances = fromPt<std::vector<OrderItemInstanceDTO>>(pt.get_child("instances"));
	}
}

int64_t BriefOrderItemDTO::getId() const
{
    return m_Id;
}

void BriefOrderItemDTO::setId(int64_t value)
{
    m_Id = value;
}


OrderVatType BriefOrderItemDTO::getVat() const
{
    return m_Vat;
}

void BriefOrderItemDTO::setVat(OrderVatType value)
{
    m_Vat = value;
}


int32_t BriefOrderItemDTO::getCount() const
{
    return m_Count;
}

void BriefOrderItemDTO::setCount(int32_t value)
{
    m_Count = value;
}


double BriefOrderItemDTO::getPrice() const
{
    return m_Price;
}

void BriefOrderItemDTO::setPrice(double value)
{
    m_Price = value;
}


std::string BriefOrderItemDTO::getOfferName() const
{
    return m_OfferName;
}

void BriefOrderItemDTO::setOfferName(std::string value)
{
    m_OfferName = value;
}


std::string BriefOrderItemDTO::getOfferId() const
{
    return m_OfferId;
}

void BriefOrderItemDTO::setOfferId(std::string value)
{
    m_OfferId = value;
}


std::vector<OrderItemInstanceDTO> BriefOrderItemDTO::getInstances() const
{
    return m_Instances;
}

void BriefOrderItemDTO::setInstances(std::vector<OrderItemInstanceDTO> value)
{
    m_Instances = value;
}



std::vector<BriefOrderItemDTO> createBriefOrderItemDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<BriefOrderItemDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(BriefOrderItemDTO(child.second));
    }

    return vec;
}

}
}
}
}

