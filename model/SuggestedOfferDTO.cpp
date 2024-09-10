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



#include "SuggestedOfferDTO.h"

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

SuggestedOfferDTO::SuggestedOfferDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string SuggestedOfferDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void SuggestedOfferDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree SuggestedOfferDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("offerId", m_OfferId);
	pt.put("name", m_Name);
	pt.put("category", m_Category);
	pt.put("vendor", m_Vendor);
	// generate tree for Barcodes
    tmp_node.clear();
	if (!m_Barcodes.empty()) {
        tmp_node = toPt(m_Barcodes);
		pt.add_child("barcodes", tmp_node);
		tmp_node.clear();
	}
	pt.put("description", m_Description);
	pt.put("vendorCode", m_VendorCode);
	pt.add_child("basicPrice", m_BasicPrice.toPropertyTree());
	return pt;
}

void SuggestedOfferDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_OfferId = pt.get("offerId", "");
	m_Name = pt.get("name", "");
	m_Category = pt.get("category", "");
	m_Vendor = pt.get("vendor", "");
	// push all items of Barcodes into member
	if (pt.get_child_optional("barcodes")) {
        m_Barcodes = fromPt<std::vector<std::string>>(pt.get_child("barcodes"));
	}
	m_Description = pt.get("description", "");
	m_VendorCode = pt.get("vendorCode", "");
	if (pt.get_child_optional("basicPrice")) {
        m_BasicPrice = fromPt<BasePriceDTO>(pt.get_child("basicPrice"));
	}
}

std::string SuggestedOfferDTO::getOfferId() const
{
    return m_OfferId;
}

void SuggestedOfferDTO::setOfferId(std::string value)
{
    m_OfferId = value;
}


std::string SuggestedOfferDTO::getName() const
{
    return m_Name;
}

void SuggestedOfferDTO::setName(std::string value)
{
    m_Name = value;
}


std::string SuggestedOfferDTO::getCategory() const
{
    return m_Category;
}

void SuggestedOfferDTO::setCategory(std::string value)
{
    m_Category = value;
}


std::string SuggestedOfferDTO::getVendor() const
{
    return m_Vendor;
}

void SuggestedOfferDTO::setVendor(std::string value)
{
    m_Vendor = value;
}


std::vector<std::string> SuggestedOfferDTO::getBarcodes() const
{
    return m_Barcodes;
}

void SuggestedOfferDTO::setBarcodes(std::vector<std::string> value)
{
    m_Barcodes = value;
}


std::string SuggestedOfferDTO::getDescription() const
{
    return m_Description;
}

void SuggestedOfferDTO::setDescription(std::string value)
{
    m_Description = value;
}


std::string SuggestedOfferDTO::getVendorCode() const
{
    return m_VendorCode;
}

void SuggestedOfferDTO::setVendorCode(std::string value)
{
    m_VendorCode = value;
}


BasePriceDTO SuggestedOfferDTO::getBasicPrice() const
{
    return m_BasicPrice;
}

void SuggestedOfferDTO::setBasicPrice(BasePriceDTO value)
{
    m_BasicPrice = value;
}



std::vector<SuggestedOfferDTO> createSuggestedOfferDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<SuggestedOfferDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(SuggestedOfferDTO(child.second));
    }

    return vec;
}

}
}
}
}

