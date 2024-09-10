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



#include "SetReturnDecisionRequest.h"

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

SetReturnDecisionRequest::SetReturnDecisionRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string SetReturnDecisionRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void SetReturnDecisionRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree SetReturnDecisionRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("returnItemId", m_ReturnItemId);
	pt.put("comment", m_Comment);
	return pt;
}

void SetReturnDecisionRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_ReturnItemId = pt.get("returnItemId", 0L);
	m_Comment = pt.get("comment", "");
}

int64_t SetReturnDecisionRequest::getReturnItemId() const
{
    return m_ReturnItemId;
}

void SetReturnDecisionRequest::setReturnItemId(int64_t value)
{
    m_ReturnItemId = value;
}


ReturnRequestDecisionType SetReturnDecisionRequest::getDecisionType() const
{
    return m_DecisionType;
}

void SetReturnDecisionRequest::setDecisionType(ReturnRequestDecisionType value)
{
    m_DecisionType = value;
}


std::string SetReturnDecisionRequest::getComment() const
{
    return m_Comment;
}

void SetReturnDecisionRequest::setComment(std::string value)
{
    m_Comment = value;
}



std::vector<SetReturnDecisionRequest> createSetReturnDecisionRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<SetReturnDecisionRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(SetReturnDecisionRequest(child.second));
    }

    return vec;
}

}
}
}
}

