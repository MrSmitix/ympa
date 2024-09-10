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



#include "CategoryDTO.h"

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

CategoryDTO::CategoryDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string CategoryDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void CategoryDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CategoryDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("name", m_Name);
	// generate tree for Children
    tmp_node.clear();
	if (!m_Children.empty()) {
        tmp_node = toPt(m_Children);
		pt.add_child("children", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void CategoryDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0L);
	m_Name = pt.get("name", "");
	// push all items of Children into member
	if (pt.get_child_optional("children")) {
        m_Children = fromPt<std::vector<CategoryDTO>>(pt.get_child("children"));
	}
}

int64_t CategoryDTO::getId() const
{
    return m_Id;
}

void CategoryDTO::setId(int64_t value)
{
    m_Id = value;
}


std::string CategoryDTO::getName() const
{
    return m_Name;
}

void CategoryDTO::setName(std::string value)
{
    m_Name = value;
}


std::vector<CategoryDTO> CategoryDTO::getChildren() const
{
    return m_Children;
}

void CategoryDTO::setChildren(std::vector<CategoryDTO> value)
{
    m_Children = value;
}



std::vector<CategoryDTO> createCategoryDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CategoryDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(CategoryDTO(child.second));
    }

    return vec;
}

}
}
}
}

