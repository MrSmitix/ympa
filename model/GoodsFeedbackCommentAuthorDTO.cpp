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



#include "GoodsFeedbackCommentAuthorDTO.h"

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

GoodsFeedbackCommentAuthorDTO::GoodsFeedbackCommentAuthorDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GoodsFeedbackCommentAuthorDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GoodsFeedbackCommentAuthorDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GoodsFeedbackCommentAuthorDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GoodsFeedbackCommentAuthorDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GoodsFeedbackCommentAuthorDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GoodsFeedbackCommentAuthorDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GoodsFeedbackCommentAuthorDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	return pt;
}

void GoodsFeedbackCommentAuthorDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
}

std::shared_ptr<GoodsFeedbackCommentAuthorType> GoodsFeedbackCommentAuthorDTO::getType() const
{
    return m_Type;
}

void GoodsFeedbackCommentAuthorDTO::setType(std::shared_ptr<GoodsFeedbackCommentAuthorType> value)
{
	m_Type = value;
}
std::string GoodsFeedbackCommentAuthorDTO::getName() const
{
    return m_Name;
}

void GoodsFeedbackCommentAuthorDTO::setName(std::string value)
{
	m_Name = value;
}

std::vector<GoodsFeedbackCommentAuthorDTO> createGoodsFeedbackCommentAuthorDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GoodsFeedbackCommentAuthorDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(GoodsFeedbackCommentAuthorDTO(child.second));
    }

    return vec;
}

}
}
}
}

