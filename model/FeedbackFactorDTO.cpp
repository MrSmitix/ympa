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



#include "FeedbackFactorDTO.h"

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

FeedbackFactorDTO::FeedbackFactorDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string FeedbackFactorDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void FeedbackFactorDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree FeedbackFactorDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("title", m_Title);
	pt.put("description", m_Description);
	pt.put("value", m_Value);
	return pt;
}

void FeedbackFactorDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0L);
	m_Title = pt.get("title", "");
	m_Description = pt.get("description", "");
	m_Value = pt.get("value", 0);
}

int64_t FeedbackFactorDTO::getId() const
{
    return m_Id;
}

void FeedbackFactorDTO::setId(int64_t value)
{
    m_Id = value;
}


std::string FeedbackFactorDTO::getTitle() const
{
    return m_Title;
}

void FeedbackFactorDTO::setTitle(std::string value)
{
    m_Title = value;
}


std::string FeedbackFactorDTO::getDescription() const
{
    return m_Description;
}

void FeedbackFactorDTO::setDescription(std::string value)
{
    m_Description = value;
}


int32_t FeedbackFactorDTO::getValue() const
{
    return m_Value;
}

void FeedbackFactorDTO::setValue(int32_t value)
{
    m_Value = value;
}



std::vector<FeedbackFactorDTO> createFeedbackFactorDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<FeedbackFactorDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(FeedbackFactorDTO(child.second));
    }

    return vec;
}

}
}
}
}

