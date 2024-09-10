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



#include "CategoryContentParametersDTO.h"

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

CategoryContentParametersDTO::CategoryContentParametersDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CategoryContentParametersDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CategoryContentParametersDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CategoryContentParametersDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("categoryId", m_CategoryId);
	// generate tree for Parameters
    tmp_node.clear();
	if (!m_Parameters.empty()) {
        tmp_node = toPt(m_Parameters);
		pt.add_child("parameters", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void CategoryContentParametersDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_CategoryId = pt.get("categoryId", 0);
	// push all items of Parameters into member
	if (pt.get_child_optional("parameters")) {
        m_Parameters = fromPt<std::vector<CategoryParameterDTO>>(pt.get_child("parameters"));
	}
}

int32_t CategoryContentParametersDTO::getCategoryId() const
{
    return m_CategoryId;
}

void CategoryContentParametersDTO::setCategoryId(int32_t value)
{
    m_CategoryId = value;
}


std::vector<CategoryParameterDTO> CategoryContentParametersDTO::getParameters() const
{
    return m_Parameters;
}

void CategoryContentParametersDTO::setParameters(std::vector<CategoryParameterDTO> value)
{
    m_Parameters = value;
}



std::vector<CategoryContentParametersDTO> createCategoryContentParametersDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CategoryContentParametersDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(CategoryContentParametersDTO(child.second));
    }

    return vec;
}

}
}
}
}

