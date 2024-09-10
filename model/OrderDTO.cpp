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



#include "OrderDTO.h"

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

OrderDTO::OrderDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string OrderDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void OrderDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OrderDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("id", m_Id);
	pt.put("creationDate", m_CreationDate);
	pt.put("updatedAt", m_UpdatedAt);
	pt.put("itemsTotal", m_ItemsTotal);
	pt.put("deliveryTotal", m_DeliveryTotal);
	pt.put("buyerItemsTotal", m_BuyerItemsTotal);
	pt.put("buyerTotal", m_BuyerTotal);
	pt.put("buyerItemsTotalBeforeDiscount", m_BuyerItemsTotalBeforeDiscount);
	pt.put("buyerTotalBeforeDiscount", m_BuyerTotalBeforeDiscount);
	pt.put("fake", m_Fake);
	// generate tree for Items
    tmp_node.clear();
	if (!m_Items.empty()) {
        tmp_node = toPt(m_Items);
		pt.add_child("items", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Subsidies
    tmp_node.clear();
	if (!m_Subsidies.empty()) {
        tmp_node = toPt(m_Subsidies);
		pt.add_child("subsidies", tmp_node);
		tmp_node.clear();
	}
	pt.add_child("delivery", m_Delivery.toPropertyTree());
	pt.add_child("buyer", m_Buyer.toPropertyTree());
	pt.put("notes", m_Notes);
	pt.put("cancelRequested", m_CancelRequested);
	pt.put("expiryDate", m_ExpiryDate);
	return pt;
}

void OrderDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Id = pt.get("id", 0L);
	m_CreationDate = pt.get("creationDate", "");
	m_UpdatedAt = pt.get("updatedAt", "");
	m_ItemsTotal = pt.get("itemsTotal", 0.0);
	m_DeliveryTotal = pt.get("deliveryTotal", 0.0);
	m_BuyerItemsTotal = pt.get("buyerItemsTotal", 0.0);
	m_BuyerTotal = pt.get("buyerTotal", 0.0);
	m_BuyerItemsTotalBeforeDiscount = pt.get("buyerItemsTotalBeforeDiscount", 0.0);
	m_BuyerTotalBeforeDiscount = pt.get("buyerTotalBeforeDiscount", 0.0);
	m_Fake = pt.get("fake", false);
	// push all items of Items into member
	if (pt.get_child_optional("items")) {
        m_Items = fromPt<std::vector<OrderItemDTO>>(pt.get_child("items"));
	}
	// push all items of Subsidies into member
	if (pt.get_child_optional("subsidies")) {
        m_Subsidies = fromPt<std::vector<OrderSubsidyDTO>>(pt.get_child("subsidies"));
	}
	if (pt.get_child_optional("delivery")) {
        m_Delivery = fromPt<OrderDeliveryDTO>(pt.get_child("delivery"));
	}
	if (pt.get_child_optional("buyer")) {
        m_Buyer = fromPt<OrderBuyerDTO>(pt.get_child("buyer"));
	}
	m_Notes = pt.get("notes", "");
	m_CancelRequested = pt.get("cancelRequested", false);
	m_ExpiryDate = pt.get("expiryDate", "");
}

int64_t OrderDTO::getId() const
{
    return m_Id;
}

void OrderDTO::setId(int64_t value)
{
    m_Id = value;
}


OrderStatusType OrderDTO::getStatus() const
{
    return m_Status;
}

void OrderDTO::setStatus(OrderStatusType value)
{
    m_Status = value;
}


OrderSubstatusType OrderDTO::getSubstatus() const
{
    return m_Substatus;
}

void OrderDTO::setSubstatus(OrderSubstatusType value)
{
    m_Substatus = value;
}


std::string OrderDTO::getCreationDate() const
{
    return m_CreationDate;
}

void OrderDTO::setCreationDate(std::string value)
{
    m_CreationDate = value;
}


std::string OrderDTO::getUpdatedAt() const
{
    return m_UpdatedAt;
}

void OrderDTO::setUpdatedAt(std::string value)
{
    m_UpdatedAt = value;
}


CurrencyType OrderDTO::getCurrency() const
{
    return m_Currency;
}

void OrderDTO::setCurrency(CurrencyType value)
{
    m_Currency = value;
}


double OrderDTO::getItemsTotal() const
{
    return m_ItemsTotal;
}

void OrderDTO::setItemsTotal(double value)
{
    m_ItemsTotal = value;
}


double OrderDTO::getDeliveryTotal() const
{
    return m_DeliveryTotal;
}

void OrderDTO::setDeliveryTotal(double value)
{
    m_DeliveryTotal = value;
}


double OrderDTO::getBuyerItemsTotal() const
{
    return m_BuyerItemsTotal;
}

void OrderDTO::setBuyerItemsTotal(double value)
{
    m_BuyerItemsTotal = value;
}


double OrderDTO::getBuyerTotal() const
{
    return m_BuyerTotal;
}

void OrderDTO::setBuyerTotal(double value)
{
    m_BuyerTotal = value;
}


double OrderDTO::getBuyerItemsTotalBeforeDiscount() const
{
    return m_BuyerItemsTotalBeforeDiscount;
}

void OrderDTO::setBuyerItemsTotalBeforeDiscount(double value)
{
    m_BuyerItemsTotalBeforeDiscount = value;
}


double OrderDTO::getBuyerTotalBeforeDiscount() const
{
    return m_BuyerTotalBeforeDiscount;
}

void OrderDTO::setBuyerTotalBeforeDiscount(double value)
{
    m_BuyerTotalBeforeDiscount = value;
}


OrderPaymentType OrderDTO::getPaymentType() const
{
    return m_PaymentType;
}

void OrderDTO::setPaymentType(OrderPaymentType value)
{
    m_PaymentType = value;
}


OrderPaymentMethodType OrderDTO::getPaymentMethod() const
{
    return m_PaymentMethod;
}

void OrderDTO::setPaymentMethod(OrderPaymentMethodType value)
{
    m_PaymentMethod = value;
}


bool OrderDTO::isFake() const
{
    return m_Fake;
}

void OrderDTO::setFake(bool value)
{
    m_Fake = value;
}


std::vector<OrderItemDTO> OrderDTO::getItems() const
{
    return m_Items;
}

void OrderDTO::setItems(std::vector<OrderItemDTO> value)
{
    m_Items = value;
}


std::vector<OrderSubsidyDTO> OrderDTO::getSubsidies() const
{
    return m_Subsidies;
}

void OrderDTO::setSubsidies(std::vector<OrderSubsidyDTO> value)
{
    m_Subsidies = value;
}


OrderDeliveryDTO OrderDTO::getDelivery() const
{
    return m_Delivery;
}

void OrderDTO::setDelivery(OrderDeliveryDTO value)
{
    m_Delivery = value;
}


OrderBuyerDTO OrderDTO::getBuyer() const
{
    return m_Buyer;
}

void OrderDTO::setBuyer(OrderBuyerDTO value)
{
    m_Buyer = value;
}


std::string OrderDTO::getNotes() const
{
    return m_Notes;
}

void OrderDTO::setNotes(std::string value)
{
    m_Notes = value;
}


OrderTaxSystemType OrderDTO::getTaxSystem() const
{
    return m_TaxSystem;
}

void OrderDTO::setTaxSystem(OrderTaxSystemType value)
{
    m_TaxSystem = value;
}


bool OrderDTO::isCancelRequested() const
{
    return m_CancelRequested;
}

void OrderDTO::setCancelRequested(bool value)
{
    m_CancelRequested = value;
}


std::string OrderDTO::getExpiryDate() const
{
    return m_ExpiryDate;
}

void OrderDTO::setExpiryDate(std::string value)
{
    m_ExpiryDate = value;
}



std::vector<OrderDTO> createOrderDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OrderDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(OrderDTO(child.second));
    }

    return vec;
}

}
}
}
}

