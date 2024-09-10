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



#include "ShipmentDTO.h"

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

ShipmentDTO::ShipmentDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string ShipmentDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void ShipmentDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ShipmentDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("planIntervalFrom", m_PlanIntervalFrom);
	pt.put("planIntervalTo", m_PlanIntervalTo);
	pt.add_child("warehouse", m_Warehouse.toPropertyTree());
	pt.add_child("warehouseTo", m_WarehouseTo.toPropertyTree());
	pt.put("externalId", m_ExternalId);
	pt.add_child("deliveryService", m_DeliveryService.toPropertyTree());
	pt.add_child("palletsCount", m_PalletsCount.toPropertyTree());
	// generate tree for OrderIds
    tmp_node.clear();
	if (!m_OrderIds.empty()) {
        tmp_node = toPt(m_OrderIds);
		pt.add_child("orderIds", tmp_node);
		tmp_node.clear();
	}
	pt.put("draftCount", m_DraftCount);
	pt.put("plannedCount", m_PlannedCount);
	pt.put("factCount", m_FactCount);
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

void ShipmentDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0L);
	m_PlanIntervalFrom = pt.get("planIntervalFrom", "");
	m_PlanIntervalTo = pt.get("planIntervalTo", "");
	if (pt.get_child_optional("warehouse")) {
        m_Warehouse = fromPt<PartnerShipmentWarehouseDTO>(pt.get_child("warehouse"));
	}
	if (pt.get_child_optional("warehouseTo")) {
        m_WarehouseTo = fromPt<PartnerShipmentWarehouseDTO>(pt.get_child("warehouseTo"));
	}
	m_ExternalId = pt.get("externalId", "");
	if (pt.get_child_optional("deliveryService")) {
        m_DeliveryService = fromPt<DeliveryServiceDTO>(pt.get_child("deliveryService"));
	}
	if (pt.get_child_optional("palletsCount")) {
        m_PalletsCount = fromPt<PalletsCountDTO>(pt.get_child("palletsCount"));
	}
	// push all items of OrderIds into member
	if (pt.get_child_optional("orderIds")) {
        m_OrderIds = fromPt<std::set<int64_t>>(pt.get_child("orderIds"));
	}
	m_DraftCount = pt.get("draftCount", 0);
	m_PlannedCount = pt.get("plannedCount", 0);
	m_FactCount = pt.get("factCount", 0);
	if (pt.get_child_optional("currentStatus")) {
        m_CurrentStatus = fromPt<ShipmentStatusChangeDTO>(pt.get_child("currentStatus"));
	}
	// push all items of AvailableActions into member
	if (pt.get_child_optional("availableActions")) {
        m_AvailableActions = fromPt<std::set<ShipmentActionType>>(pt.get_child("availableActions"));
	}
}

int64_t ShipmentDTO::getId() const
{
    return m_Id;
}

void ShipmentDTO::setId(int64_t value)
{
    m_Id = value;
}


std::string ShipmentDTO::getPlanIntervalFrom() const
{
    return m_PlanIntervalFrom;
}

void ShipmentDTO::setPlanIntervalFrom(std::string value)
{
    m_PlanIntervalFrom = value;
}


std::string ShipmentDTO::getPlanIntervalTo() const
{
    return m_PlanIntervalTo;
}

void ShipmentDTO::setPlanIntervalTo(std::string value)
{
    m_PlanIntervalTo = value;
}


ShipmentType ShipmentDTO::getShipmentType() const
{
    return m_ShipmentType;
}

void ShipmentDTO::setShipmentType(ShipmentType value)
{
    m_ShipmentType = value;
}


PartnerShipmentWarehouseDTO ShipmentDTO::getWarehouse() const
{
    return m_Warehouse;
}

void ShipmentDTO::setWarehouse(PartnerShipmentWarehouseDTO value)
{
    m_Warehouse = value;
}


PartnerShipmentWarehouseDTO ShipmentDTO::getWarehouseTo() const
{
    return m_WarehouseTo;
}

void ShipmentDTO::setWarehouseTo(PartnerShipmentWarehouseDTO value)
{
    m_WarehouseTo = value;
}


std::string ShipmentDTO::getExternalId() const
{
    return m_ExternalId;
}

void ShipmentDTO::setExternalId(std::string value)
{
    m_ExternalId = value;
}


DeliveryServiceDTO ShipmentDTO::getDeliveryService() const
{
    return m_DeliveryService;
}

void ShipmentDTO::setDeliveryService(DeliveryServiceDTO value)
{
    m_DeliveryService = value;
}


PalletsCountDTO ShipmentDTO::getPalletsCount() const
{
    return m_PalletsCount;
}

void ShipmentDTO::setPalletsCount(PalletsCountDTO value)
{
    m_PalletsCount = value;
}


std::set<int64_t> ShipmentDTO::getOrderIds() const
{
    return m_OrderIds;
}

void ShipmentDTO::setOrderIds(std::set<int64_t> value)
{
    m_OrderIds = value;
}


int32_t ShipmentDTO::getDraftCount() const
{
    return m_DraftCount;
}

void ShipmentDTO::setDraftCount(int32_t value)
{
    m_DraftCount = value;
}


int32_t ShipmentDTO::getPlannedCount() const
{
    return m_PlannedCount;
}

void ShipmentDTO::setPlannedCount(int32_t value)
{
    m_PlannedCount = value;
}


int32_t ShipmentDTO::getFactCount() const
{
    return m_FactCount;
}

void ShipmentDTO::setFactCount(int32_t value)
{
    m_FactCount = value;
}


ShipmentStatusChangeDTO ShipmentDTO::getCurrentStatus() const
{
    return m_CurrentStatus;
}

void ShipmentDTO::setCurrentStatus(ShipmentStatusChangeDTO value)
{
    m_CurrentStatus = value;
}


std::set<ShipmentActionType> ShipmentDTO::getAvailableActions() const
{
    return m_AvailableActions;
}

void ShipmentDTO::setAvailableActions(std::set<ShipmentActionType> value)
{
    m_AvailableActions = value;
}



std::vector<ShipmentDTO> createShipmentDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ShipmentDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(ShipmentDTO(child.second));
    }

    return vec;
}

}
}
}
}

