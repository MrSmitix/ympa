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



#include "ParcelDTO.h"

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

ParcelDTO::ParcelDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ParcelDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ParcelDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ParcelDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Boxes
    tmp_node.clear();
	if (!m_Boxes.empty()) {
        tmp_node = toPt(m_Boxes);
		pt.add_child("boxes", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void ParcelDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Boxes into member
	if (pt.get_child_optional("boxes")) {
        m_Boxes = fromPt<std::vector<ParcelBoxDTO>>(pt.get_child("boxes"));
	}
}

std::vector<ParcelBoxDTO> ParcelDTO::getBoxes() const
{
    return m_Boxes;
}

void ParcelDTO::setBoxes(std::vector<ParcelBoxDTO> value)
{
    m_Boxes = value;
}



std::vector<ParcelDTO> createParcelDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ParcelDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(ParcelDTO(child.second));
    }

    return vec;
}

}
}
}
}

