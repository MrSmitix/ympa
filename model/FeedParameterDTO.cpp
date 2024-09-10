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



#include "FeedParameterDTO.h"

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

FeedParameterDTO::FeedParameterDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string FeedParameterDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void FeedParameterDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree FeedParameterDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("deleted", m_Deleted);
	pt.put("name", m_Name);
	// generate tree for Values
    tmp_node.clear();
	if (!m_Values.empty()) {
        tmp_node = toPt(m_Values);
		pt.add_child("values", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void FeedParameterDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Deleted = pt.get("deleted", false);
	m_Name = pt.get("name", "");
	// push all items of Values into member
	if (pt.get_child_optional("values")) {
        m_Values = fromPt<std::vector<int32_t>>(pt.get_child("values"));
	}
}

bool FeedParameterDTO::isDeleted() const
{
    return m_Deleted;
}

void FeedParameterDTO::setDeleted(bool value)
{
    m_Deleted = value;
}


std::string FeedParameterDTO::getName() const
{
    return m_Name;
}

void FeedParameterDTO::setName(std::string value)
{
    m_Name = value;
}


std::vector<int32_t> FeedParameterDTO::getValues() const
{
    return m_Values;
}

void FeedParameterDTO::setValues(std::vector<int32_t> value)
{
    m_Values = value;
}



std::vector<FeedParameterDTO> createFeedParameterDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<FeedParameterDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(FeedParameterDTO(child.second));
    }

    return vec;
}

}
}
}
}

