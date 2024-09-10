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



#include "LogisticPickupPointDTO.h"

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

LogisticPickupPointDTO::LogisticPickupPointDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string LogisticPickupPointDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void LogisticPickupPointDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree LogisticPickupPointDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("name", m_Name);
	pt.add_child("address", m_Address.toPropertyTree());
	pt.put("instruction", m_Instruction);
	pt.put("logisticPartnerId", m_LogisticPartnerId);
	return pt;
}

void LogisticPickupPointDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0L);
	m_Name = pt.get("name", "");
	if (pt.get_child_optional("address")) {
        m_Address = fromPt<PickupAddressDTO>(pt.get_child("address"));
	}
	m_Instruction = pt.get("instruction", "");
	m_LogisticPartnerId = pt.get("logisticPartnerId", 0L);
}

int64_t LogisticPickupPointDTO::getId() const
{
    return m_Id;
}

void LogisticPickupPointDTO::setId(int64_t value)
{
    m_Id = value;
}


std::string LogisticPickupPointDTO::getName() const
{
    return m_Name;
}

void LogisticPickupPointDTO::setName(std::string value)
{
    m_Name = value;
}


PickupAddressDTO LogisticPickupPointDTO::getAddress() const
{
    return m_Address;
}

void LogisticPickupPointDTO::setAddress(PickupAddressDTO value)
{
    m_Address = value;
}


std::string LogisticPickupPointDTO::getInstruction() const
{
    return m_Instruction;
}

void LogisticPickupPointDTO::setInstruction(std::string value)
{
    m_Instruction = value;
}


LogisticPointType LogisticPickupPointDTO::getType() const
{
    return m_Type;
}

void LogisticPickupPointDTO::setType(LogisticPointType value)
{
    m_Type = value;
}


int64_t LogisticPickupPointDTO::getLogisticPartnerId() const
{
    return m_LogisticPartnerId;
}

void LogisticPickupPointDTO::setLogisticPartnerId(int64_t value)
{
    m_LogisticPartnerId = value;
}



std::vector<LogisticPickupPointDTO> createLogisticPickupPointDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<LogisticPickupPointDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(LogisticPickupPointDTO(child.second));
    }

    return vec;
}

}
}
}
}

