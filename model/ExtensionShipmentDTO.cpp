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



#include "ExtensionShipmentDTO.h"

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

ExtensionShipmentDTO::ExtensionShipmentDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ExtensionShipmentDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ExtensionShipmentDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ExtensionShipmentDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.add_child("currentStatus", m_CurrentStatus.toPropertyTree());
	// generate tree for AvailableActions
    tmp_node.clear();
	if (!m_AvailableActions.empty()) {
        tmp_node = toPt(m_AvailableActions);
		pt.add_child("availableActions", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void ExtensionShipmentDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("currentStatus")) {
        m_CurrentStatus = fromPt<ShipmentStatusChangeDTO>(pt.get_child("currentStatus"));
	}
	// push all items of AvailableActions into member
	if (pt.get_child_optional("availableActions")) {
        m_AvailableActions = fromPt<std::set<ShipmentActionType>>(pt.get_child("availableActions"));
	}
}

ShipmentStatusChangeDTO ExtensionShipmentDTO::getCurrentStatus() const
{
    return m_CurrentStatus;
}

void ExtensionShipmentDTO::setCurrentStatus(ShipmentStatusChangeDTO value)
{
    m_CurrentStatus = value;
}


std::set<ShipmentActionType> ExtensionShipmentDTO::getAvailableActions() const
{
    return m_AvailableActions;
}

void ExtensionShipmentDTO::setAvailableActions(std::set<ShipmentActionType> value)
{
    m_AvailableActions = value;
}



std::vector<ExtensionShipmentDTO> createExtensionShipmentDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ExtensionShipmentDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(ExtensionShipmentDTO(child.second));
    }

    return vec;
}

}
}
}
}

