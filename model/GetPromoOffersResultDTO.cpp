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



#include "GetPromoOffersResultDTO.h"

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

GetPromoOffersResultDTO::GetPromoOffersResultDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GetPromoOffersResultDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GetPromoOffersResultDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GetPromoOffersResultDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GetPromoOffersResultDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GetPromoOffersResultDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GetPromoOffersResultDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetPromoOffersResultDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	// generate tree for Offers
	if (!m_Offers.empty()) {
		for (const auto &childEntry : m_Offers) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("offers", tmp_node);
		tmp_node.clear();
	}
	if (m_Paging != nullptr) {
		pt.add_child("paging", m_Paging->toPropertyTree());
	}
	return pt;
}

void GetPromoOffersResultDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	// push all items of Offers into member vector
	if (pt.get_child_optional("offers")) {
		for (const auto &childTree : pt.get_child("offers")) {
            std::shared_ptr<GetPromoOfferDTO> val =
                std::make_shared<GetPromoOfferDTO>(childTree.second);
            m_Offers.emplace_back(std::move(val));
		}
	}
	if (pt.get_child_optional("paging")) {
		m_Paging = std::make_shared<ForwardScrollingPagerDTO>();
		m_Paging->fromPropertyTree(pt.get_child("paging"));
	}
}

std::vector<std::shared_ptr<GetPromoOfferDTO>> GetPromoOffersResultDTO::getOffers() const
{
    return m_Offers;
}

void GetPromoOffersResultDTO::setOffers(std::vector<std::shared_ptr<GetPromoOfferDTO>> value)
{
	m_Offers = value;
}
std::shared_ptr<ForwardScrollingPagerDTO> GetPromoOffersResultDTO::getPaging() const
{
    return m_Paging;
}

void GetPromoOffersResultDTO::setPaging(std::shared_ptr<ForwardScrollingPagerDTO> value)
{
	m_Paging = value;
}

std::vector<GetPromoOffersResultDTO> createGetPromoOffersResultDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetPromoOffersResultDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(GetPromoOffersResultDTO(child.second));
    }

    return vec;
}

}
}
}
}

