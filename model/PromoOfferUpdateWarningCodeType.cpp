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



#include "PromoOfferUpdateWarningCodeType.h"

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

PromoOfferUpdateWarningCodeType::PromoOfferUpdateWarningCodeType(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string PromoOfferUpdateWarningCodeType::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void PromoOfferUpdateWarningCodeType::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree PromoOfferUpdateWarningCodeType::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	return pt;
}

void PromoOfferUpdateWarningCodeType::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
}

std::string PromoOfferUpdateWarningCodeType::toString() const {
    return boost::lexical_cast<std::string>(getEnumValue());
}

void PromoOfferUpdateWarningCodeType::fromString(const std::string& str) {
    setEnumValue(boost::lexical_cast<std::string>(str));
}

std::string PromoOfferUpdateWarningCodeType::getEnumValue() const {
    return m_PromoOfferUpdateWarningCodeTypeEnumValue;
}

void PromoOfferUpdateWarningCodeType::setEnumValue(const std::string& val) {
    static const std::array<std::string, 5> allowedValues = {
        "DEEP_DISCOUNT_OFFER", "CATALOG_PRICE_IS_LOWER_THAN_PROMO", "SHOP_PRICES_ARE_LOWER_THAN_PROMO", "PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE", "SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO"
    };
    if (std::find(allowedValues.begin(), allowedValues.end(), val) != allowedValues.end()) {
        m_PromoOfferUpdateWarningCodeTypeEnumValue = val;
    } else {
        throw std::runtime_error("Value " + boost::lexical_cast<std::string>(val) + " not allowed");
    }
}

std::vector<PromoOfferUpdateWarningCodeType> createPromoOfferUpdateWarningCodeTypeVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<PromoOfferUpdateWarningCodeType>();
    for (const auto& child: pt) {
        vec.emplace_back(PromoOfferUpdateWarningCodeType(child.second));
    }

    return vec;
}

}
}
}
}

