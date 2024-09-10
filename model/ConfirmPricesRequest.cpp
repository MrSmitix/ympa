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



#include "ConfirmPricesRequest.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
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

ConfirmPricesRequest::ConfirmPricesRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ConfirmPricesRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ConfirmPricesRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ConfirmPricesRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for OfferIds
    tmp_node.clear();
	if (!m_OfferIds.empty()) {
        tmp_node = toPt(m_OfferIds);
		pt.add_child("offerIds", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void ConfirmPricesRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of OfferIds into member
	if (pt.get_child_optional("offerIds")) {
        m_OfferIds = fromPt<std::vector<std::string>>(pt.get_child("offerIds"));
	}
}

std::vector<std::string> ConfirmPricesRequest::getOfferIds() const
{
    return m_OfferIds;
}

void ConfirmPricesRequest::setOfferIds(std::vector<std::string> value)
{
    m_OfferIds = value;
}



std::vector<ConfirmPricesRequest> createConfirmPricesRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ConfirmPricesRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(ConfirmPricesRequest(child.second));
    }

    return vec;
}

}
}
}
}

