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



#include "OfferDTO.h"

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

OfferDTO::OfferDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string OfferDTO::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void OfferDTO::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OfferDTO::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("price", m_Price);
	pt.put("feedId", m_FeedId);
	pt.put("id", m_Id);
	pt.put("shopCategoryId", m_ShopCategoryId);
	pt.put("marketCategoryId", m_MarketCategoryId);
	pt.put("preDiscountPrice", m_PreDiscountPrice);
	pt.put("discount", m_Discount);
	pt.put("cutPrice", m_CutPrice);
	pt.put("url", m_Url);
	pt.put("modelId", m_ModelId);
	pt.put("name", m_Name);
	pt.put("bid", m_Bid);
	pt.put("cbid", m_Cbid);
	pt.put("fee", m_Fee);
	pt.put("blocked", m_Blocked);
	return pt;
}

void OfferDTO::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Price = pt.get("price", 0.0);
	m_FeedId = pt.get("feedId", 0L);
	m_Id = pt.get("id", "");
	m_ShopCategoryId = pt.get("shopCategoryId", "");
	m_MarketCategoryId = pt.get("marketCategoryId", 0);
	m_PreDiscountPrice = pt.get("preDiscountPrice", 0.0);
	m_Discount = pt.get("discount", 0);
	m_CutPrice = pt.get("cutPrice", false);
	m_Url = pt.get("url", "");
	m_ModelId = pt.get("modelId", 0L);
	m_Name = pt.get("name", "");
	m_Bid = pt.get("bid", 0.0);
	m_Cbid = pt.get("cbid", 0.0);
	m_Fee = pt.get("fee", 0.0);
	m_Blocked = pt.get("blocked", false);
}

double OfferDTO::getPrice() const
{
    return m_Price;
}

void OfferDTO::setPrice(double value)
{
    m_Price = value;
}


int64_t OfferDTO::getFeedId() const
{
    return m_FeedId;
}

void OfferDTO::setFeedId(int64_t value)
{
    m_FeedId = value;
}


std::string OfferDTO::getId() const
{
    return m_Id;
}

void OfferDTO::setId(std::string value)
{
    m_Id = value;
}


std::string OfferDTO::getShopCategoryId() const
{
    return m_ShopCategoryId;
}

void OfferDTO::setShopCategoryId(std::string value)
{
    m_ShopCategoryId = value;
}


int32_t OfferDTO::getMarketCategoryId() const
{
    return m_MarketCategoryId;
}

void OfferDTO::setMarketCategoryId(int32_t value)
{
    m_MarketCategoryId = value;
}


double OfferDTO::getPreDiscountPrice() const
{
    return m_PreDiscountPrice;
}

void OfferDTO::setPreDiscountPrice(double value)
{
    m_PreDiscountPrice = value;
}


int32_t OfferDTO::getDiscount() const
{
    return m_Discount;
}

void OfferDTO::setDiscount(int32_t value)
{
    m_Discount = value;
}


bool OfferDTO::isCutPrice() const
{
    return m_CutPrice;
}

void OfferDTO::setCutPrice(bool value)
{
    m_CutPrice = value;
}


std::string OfferDTO::getUrl() const
{
    return m_Url;
}

void OfferDTO::setUrl(std::string value)
{
    m_Url = value;
}


int64_t OfferDTO::getModelId() const
{
    return m_ModelId;
}

void OfferDTO::setModelId(int64_t value)
{
    m_ModelId = value;
}


std::string OfferDTO::getName() const
{
    return m_Name;
}

void OfferDTO::setName(std::string value)
{
    m_Name = value;
}


CurrencyType OfferDTO::getCurrency() const
{
    return m_Currency;
}

void OfferDTO::setCurrency(CurrencyType value)
{
    m_Currency = value;
}


double OfferDTO::getBid() const
{
    return m_Bid;
}

void OfferDTO::setBid(double value)
{
    m_Bid = value;
}


double OfferDTO::getCbid() const
{
    return m_Cbid;
}

void OfferDTO::setCbid(double value)
{
    m_Cbid = value;
}


double OfferDTO::getFee() const
{
    return m_Fee;
}

void OfferDTO::setFee(double value)
{
    m_Fee = value;
}


bool OfferDTO::isBlocked() const
{
    return m_Blocked;
}

void OfferDTO::setBlocked(bool value)
{
    m_Blocked = value;
}



std::vector<OfferDTO> createOfferDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OfferDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(OfferDTO(child.second));
    }

    return vec;
}

}
}
}
}

