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



#include "GetBidsInfoRequest.h"

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

GetBidsInfoRequest::GetBidsInfoRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string GetBidsInfoRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void GetBidsInfoRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetBidsInfoRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Skus
    tmp_node.clear();
	if (!m_Skus.empty()) {
        tmp_node = toPt(m_Skus);
		pt.add_child("skus", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void GetBidsInfoRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Skus into member
	if (pt.get_child_optional("skus")) {
        m_Skus = fromPt<std::vector<std::string>>(pt.get_child("skus"));
	}
}

std::vector<std::string> GetBidsInfoRequest::getSkus() const
{
    return m_Skus;
}

void GetBidsInfoRequest::setSkus(std::vector<std::string> value)
{
    m_Skus = value;
}



std::vector<GetBidsInfoRequest> createGetBidsInfoRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetBidsInfoRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(GetBidsInfoRequest(child.second));
    }

    return vec;
}

}
}
}
}

