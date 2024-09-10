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



#include "GetBusinessSettingsInfoDTO.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

GetBusinessSettingsInfoDTO::GetBusinessSettingsInfoDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GetBusinessSettingsInfoDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GetBusinessSettingsInfoDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GetBusinessSettingsInfoDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GetBusinessSettingsInfoDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GetBusinessSettingsInfoDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GetBusinessSettingsInfoDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetBusinessSettingsInfoDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m_Info != nullptr) {
		pt.add_child("info", m_Info->toPropertyTree());
	}
	if (m_Settings != nullptr) {
		pt.add_child("settings", m_Settings->toPropertyTree());
	}
	return pt;
}

void GetBusinessSettingsInfoDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("info")) {
		m_Info = std::make_shared<BusinessDTO>();
		m_Info->fromPropertyTree(pt.get_child("info"));
	}
	if (pt.get_child_optional("settings")) {
		m_Settings = std::make_shared<BusinessSettingsDTO>();
		m_Settings->fromPropertyTree(pt.get_child("settings"));
	}
}

std::shared_ptr<BusinessDTO> GetBusinessSettingsInfoDTO::getInfo() const
{
    return m_Info;
}

void GetBusinessSettingsInfoDTO::setInfo(std::shared_ptr<BusinessDTO> value)
{
	m_Info = value;
}
std::shared_ptr<BusinessSettingsDTO> GetBusinessSettingsInfoDTO::getSettings() const
{
    return m_Settings;
}

void GetBusinessSettingsInfoDTO::setSettings(std::shared_ptr<BusinessSettingsDTO> value)
{
	m_Settings = value;
}

std::vector<GetBusinessSettingsInfoDTO> createGetBusinessSettingsInfoDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetBusinessSettingsInfoDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(GetBusinessSettingsInfoDTO(child.second));
    }

    return vec;
}

}
}
}
}

