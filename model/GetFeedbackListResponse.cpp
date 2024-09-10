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



#include "GetFeedbackListResponse.h"

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

GetFeedbackListResponse::GetFeedbackListResponse(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string GetFeedbackListResponse::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void GetFeedbackListResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetFeedbackListResponse::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("result", m_Result.toPropertyTree());
	return pt;
}

void GetFeedbackListResponse::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("result")) {
        m_Result = fromPt<FeedbackListDTO>(pt.get_child("result"));
	}
}

ApiResponseStatusType GetFeedbackListResponse::getStatus() const
{
    return m_Status;
}

void GetFeedbackListResponse::setStatus(ApiResponseStatusType value)
{
    m_Status = value;
}


FeedbackListDTO GetFeedbackListResponse::getResult() const
{
    return m_Result;
}

void GetFeedbackListResponse::setResult(FeedbackListDTO value)
{
    m_Result = value;
}



std::vector<GetFeedbackListResponse> createGetFeedbackListResponseVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetFeedbackListResponse>();
    for (const auto& child: pt) {
        vec.emplace_back(GetFeedbackListResponse(child.second));
    }

    return vec;
}

}
}
}
}

