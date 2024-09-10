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



#include "ValueRestrictionDTO.h"

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

ValueRestrictionDTO::ValueRestrictionDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ValueRestrictionDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ValueRestrictionDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ValueRestrictionDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("limitingParameterId", m_LimitingParameterId);
	// generate tree for LimitedValues
    tmp_node.clear();
	if (!m_LimitedValues.empty()) {
        tmp_node = toPt(m_LimitedValues);
		pt.add_child("limitedValues", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void ValueRestrictionDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_LimitingParameterId = pt.get("limitingParameterId", 0L);
	// push all items of LimitedValues into member
	if (pt.get_child_optional("limitedValues")) {
        m_LimitedValues = fromPt<std::vector<OptionValuesLimitedDTO>>(pt.get_child("limitedValues"));
	}
}

int64_t ValueRestrictionDTO::getLimitingParameterId() const
{
    return m_LimitingParameterId;
}

void ValueRestrictionDTO::setLimitingParameterId(int64_t value)
{
    m_LimitingParameterId = value;
}


std::vector<OptionValuesLimitedDTO> ValueRestrictionDTO::getLimitedValues() const
{
    return m_LimitedValues;
}

void ValueRestrictionDTO::setLimitedValues(std::vector<OptionValuesLimitedDTO> value)
{
    m_LimitedValues = value;
}



std::vector<ValueRestrictionDTO> createValueRestrictionDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ValueRestrictionDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(ValueRestrictionDTO(child.second));
    }

    return vec;
}

}
}
}
}

