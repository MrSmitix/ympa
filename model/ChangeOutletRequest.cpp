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



#include "ChangeOutletRequest.h"

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

ChangeOutletRequest::ChangeOutletRequest(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ChangeOutletRequest::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ChangeOutletRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ChangeOutletRequest::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	pt.put("coords", m_Coords);
	pt.put("isMain", m_IsMain);
	pt.put("shopOutletCode", m_ShopOutletCode);
	pt.add_child("address", m_Address.toPropertyTree());
	// generate tree for Phones
    tmp_node.clear();
	if (!m_Phones.empty()) {
        tmp_node = toPt(m_Phones);
		pt.add_child("phones", tmp_node);
		tmp_node.clear();
	}
	pt.add_child("workingSchedule", m_WorkingSchedule.toPropertyTree());
	// generate tree for DeliveryRules
    tmp_node.clear();
	if (!m_DeliveryRules.empty()) {
        tmp_node = toPt(m_DeliveryRules);
		pt.add_child("deliveryRules", tmp_node);
		tmp_node.clear();
	}
	pt.put("storagePeriod", m_StoragePeriod);
	return pt;
}

void ChangeOutletRequest::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
	m_Coords = pt.get("coords", "");
	m_IsMain = pt.get("isMain", false);
	m_ShopOutletCode = pt.get("shopOutletCode", "");
	if (pt.get_child_optional("address")) {
        m_Address = fromPt<OutletAddressDTO>(pt.get_child("address"));
	}
	// push all items of Phones into member
	if (pt.get_child_optional("phones")) {
        m_Phones = fromPt<std::vector<std::string>>(pt.get_child("phones"));
	}
	if (pt.get_child_optional("workingSchedule")) {
        m_WorkingSchedule = fromPt<OutletWorkingScheduleDTO>(pt.get_child("workingSchedule"));
	}
	// push all items of DeliveryRules into member
	if (pt.get_child_optional("deliveryRules")) {
        m_DeliveryRules = fromPt<std::vector<OutletDeliveryRuleDTO>>(pt.get_child("deliveryRules"));
	}
	m_StoragePeriod = pt.get("storagePeriod", 0L);
}

std::string ChangeOutletRequest::getName() const
{
    return m_Name;
}

void ChangeOutletRequest::setName(std::string value)
{
    m_Name = value;
}


OutletType ChangeOutletRequest::getType() const
{
    return m_Type;
}

void ChangeOutletRequest::setType(OutletType value)
{
    m_Type = value;
}


std::string ChangeOutletRequest::getCoords() const
{
    return m_Coords;
}

void ChangeOutletRequest::setCoords(std::string value)
{
    m_Coords = value;
}


bool ChangeOutletRequest::isIsMain() const
{
    return m_IsMain;
}

void ChangeOutletRequest::setIsMain(bool value)
{
    m_IsMain = value;
}


std::string ChangeOutletRequest::getShopOutletCode() const
{
    return m_ShopOutletCode;
}

void ChangeOutletRequest::setShopOutletCode(std::string value)
{
    m_ShopOutletCode = value;
}


OutletVisibilityType ChangeOutletRequest::getVisibility() const
{
    return m_Visibility;
}

void ChangeOutletRequest::setVisibility(OutletVisibilityType value)
{
    m_Visibility = value;
}


OutletAddressDTO ChangeOutletRequest::getAddress() const
{
    return m_Address;
}

void ChangeOutletRequest::setAddress(OutletAddressDTO value)
{
    m_Address = value;
}


std::vector<std::string> ChangeOutletRequest::getPhones() const
{
    return m_Phones;
}

void ChangeOutletRequest::setPhones(std::vector<std::string> value)
{
    m_Phones = value;
}


OutletWorkingScheduleDTO ChangeOutletRequest::getWorkingSchedule() const
{
    return m_WorkingSchedule;
}

void ChangeOutletRequest::setWorkingSchedule(OutletWorkingScheduleDTO value)
{
    m_WorkingSchedule = value;
}


std::vector<OutletDeliveryRuleDTO> ChangeOutletRequest::getDeliveryRules() const
{
    return m_DeliveryRules;
}

void ChangeOutletRequest::setDeliveryRules(std::vector<OutletDeliveryRuleDTO> value)
{
    m_DeliveryRules = value;
}


int64_t ChangeOutletRequest::getStoragePeriod() const
{
    return m_StoragePeriod;
}

void ChangeOutletRequest::setStoragePeriod(int64_t value)
{
    m_StoragePeriod = value;
}



std::vector<ChangeOutletRequest> createChangeOutletRequestVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ChangeOutletRequest>();
    for (const auto& child: pt) {
        vec.emplace_back(ChangeOutletRequest(child.second));
    }

    return vec;
}

}
}
}
}

