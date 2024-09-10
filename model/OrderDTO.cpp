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
#include <sstream>
#include <stdexcept>
#include <algorithm>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

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

std::string OrderDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void OrderDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree OrderDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void OrderDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string OrderDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void OrderDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OrderDTO::toPropertyTree_internal()
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
	if (!m_Items.empty()) {
		for (const auto &childEntry : m_Items) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("items", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Subsidies
	if (!m_Subsidies.empty()) {
		for (const auto &childEntry : m_Subsidies) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("subsidies", tmp_node);
		tmp_node.clear();
	}
	if (m_Delivery != nullptr) {
		pt.add_child("delivery", m_Delivery->toPropertyTree());
	}
	if (m_Buyer != nullptr) {
		pt.add_child("buyer", m_Buyer->toPropertyTree());
	}
	pt.put("notes", m_Notes);
	pt.put("cancelRequested", m_CancelRequested);
	pt.put("expiryDate", m_ExpiryDate);
	return pt;
}

void OrderDTO::fromPropertyTree_internal(ptree const &pt)
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
	// push all items of Items into member vector
	if (pt.get_child_optional("items")) {
		for (const auto &childTree : pt.get_child("items")) {
            std::shared_ptr<OrderItemDTO> val =
                std::make_shared<OrderItemDTO>(childTree.second);
            m_Items.emplace_back(std::move(val));
		}
	}
	// push all items of Subsidies into member vector
	if (pt.get_child_optional("subsidies")) {
		for (const auto &childTree : pt.get_child("subsidies")) {
            std::shared_ptr<OrderSubsidyDTO> val =
                std::make_shared<OrderSubsidyDTO>(childTree.second);
            m_Subsidies.emplace_back(std::move(val));
		}
	}
	if (pt.get_child_optional("delivery")) {
		m_Delivery = std::make_shared<OrderDeliveryDTO>();
		m_Delivery->fromPropertyTree(pt.get_child("delivery"));
	}
	if (pt.get_child_optional("buyer")) {
		m_Buyer = std::make_shared<OrderBuyerDTO>();
		m_Buyer->fromPropertyTree(pt.get_child("buyer"));
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
std::shared_ptr<OrderStatusType> OrderDTO::getStatus() const
{
    return m_Status;
}

void OrderDTO::setStatus(std::shared_ptr<OrderStatusType> value)
{
	m_Status = value;
}
std::shared_ptr<OrderSubstatusType> OrderDTO::getSubstatus() const
{
    return m_Substatus;
}

void OrderDTO::setSubstatus(std::shared_ptr<OrderSubstatusType> value)
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
std::shared_ptr<CurrencyType> OrderDTO::getCurrency() const
{
    return m_Currency;
}

void OrderDTO::setCurrency(std::shared_ptr<CurrencyType> value)
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
std::shared_ptr<OrderPaymentType> OrderDTO::getPaymentType() const
{
    return m_PaymentType;
}

void OrderDTO::setPaymentType(std::shared_ptr<OrderPaymentType> value)
{
	m_PaymentType = value;
}
std::shared_ptr<OrderPaymentMethodType> OrderDTO::getPaymentMethod() const
{
    return m_PaymentMethod;
}

void OrderDTO::setPaymentMethod(std::shared_ptr<OrderPaymentMethodType> value)
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
std::vector<std::shared_ptr<OrderItemDTO>> OrderDTO::getItems() const
{
    return m_Items;
}

void OrderDTO::setItems(std::vector<std::shared_ptr<OrderItemDTO>> value)
{
	m_Items = value;
}
std::vector<std::shared_ptr<OrderSubsidyDTO>> OrderDTO::getSubsidies() const
{
    return m_Subsidies;
}

void OrderDTO::setSubsidies(std::vector<std::shared_ptr<OrderSubsidyDTO>> value)
{
	m_Subsidies = value;
}
std::shared_ptr<OrderDeliveryDTO> OrderDTO::getDelivery() const
{
    return m_Delivery;
}

void OrderDTO::setDelivery(std::shared_ptr<OrderDeliveryDTO> value)
{
	m_Delivery = value;
}
std::shared_ptr<OrderBuyerDTO> OrderDTO::getBuyer() const
{
    return m_Buyer;
}

void OrderDTO::setBuyer(std::shared_ptr<OrderBuyerDTO> value)
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
std::shared_ptr<OrderTaxSystemType> OrderDTO::getTaxSystem() const
{
    return m_TaxSystem;
}

void OrderDTO::setTaxSystem(std::shared_ptr<OrderTaxSystemType> value)
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

