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



#include "PromoOfferParamsDTO.h"

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

PromoOfferParamsDTO::PromoOfferParamsDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string PromoOfferParamsDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void PromoOfferParamsDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree PromoOfferParamsDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void PromoOfferParamsDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string PromoOfferParamsDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void PromoOfferParamsDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree PromoOfferParamsDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m_DiscountParams != nullptr) {
		pt.add_child("discountParams", m_DiscountParams->toPropertyTree());
	}
	if (m_PromocodeParams != nullptr) {
		pt.add_child("promocodeParams", m_PromocodeParams->toPropertyTree());
	}
	return pt;
}

void PromoOfferParamsDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("discountParams")) {
		m_DiscountParams = std::make_shared<PromoOfferDiscountParamsDTO>();
		m_DiscountParams->fromPropertyTree(pt.get_child("discountParams"));
	}
	if (pt.get_child_optional("promocodeParams")) {
		m_PromocodeParams = std::make_shared<PromoOfferPromocodeParamsDTO>();
		m_PromocodeParams->fromPropertyTree(pt.get_child("promocodeParams"));
	}
}

std::shared_ptr<PromoOfferDiscountParamsDTO> PromoOfferParamsDTO::getDiscountParams() const
{
    return m_DiscountParams;
}

void PromoOfferParamsDTO::setDiscountParams(std::shared_ptr<PromoOfferDiscountParamsDTO> value)
{
	m_DiscountParams = value;
}
std::shared_ptr<PromoOfferPromocodeParamsDTO> PromoOfferParamsDTO::getPromocodeParams() const
{
    return m_PromocodeParams;
}

void PromoOfferParamsDTO::setPromocodeParams(std::shared_ptr<PromoOfferPromocodeParamsDTO> value)
{
	m_PromocodeParams = value;
}

std::vector<PromoOfferParamsDTO> createPromoOfferParamsDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<PromoOfferParamsDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(PromoOfferParamsDTO(child.second));
    }

    return vec;
}

}
}
}
}

