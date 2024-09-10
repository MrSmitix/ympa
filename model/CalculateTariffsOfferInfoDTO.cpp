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



#include "CalculateTariffsOfferInfoDTO.h"

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

CalculateTariffsOfferInfoDTO::CalculateTariffsOfferInfoDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string CalculateTariffsOfferInfoDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void CalculateTariffsOfferInfoDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree CalculateTariffsOfferInfoDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void CalculateTariffsOfferInfoDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string CalculateTariffsOfferInfoDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void CalculateTariffsOfferInfoDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree CalculateTariffsOfferInfoDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m_Offer != nullptr) {
		pt.add_child("offer", m_Offer->toPropertyTree());
	}
	// generate tree for Tariffs
	if (!m_Tariffs.empty()) {
		for (const auto &childEntry : m_Tariffs) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("tariffs", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void CalculateTariffsOfferInfoDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("offer")) {
		m_Offer = std::make_shared<CalculateTariffsOfferDTO>();
		m_Offer->fromPropertyTree(pt.get_child("offer"));
	}
	// push all items of Tariffs into member vector
	if (pt.get_child_optional("tariffs")) {
		for (const auto &childTree : pt.get_child("tariffs")) {
            std::shared_ptr<CalculatedTariffDTO> val =
                std::make_shared<CalculatedTariffDTO>(childTree.second);
            m_Tariffs.emplace_back(std::move(val));
		}
	}
}

std::shared_ptr<CalculateTariffsOfferDTO> CalculateTariffsOfferInfoDTO::getOffer() const
{
    return m_Offer;
}

void CalculateTariffsOfferInfoDTO::setOffer(std::shared_ptr<CalculateTariffsOfferDTO> value)
{
	m_Offer = value;
}
std::vector<std::shared_ptr<CalculatedTariffDTO>> CalculateTariffsOfferInfoDTO::getTariffs() const
{
    return m_Tariffs;
}

void CalculateTariffsOfferInfoDTO::setTariffs(std::vector<std::shared_ptr<CalculatedTariffDTO>> value)
{
	m_Tariffs = value;
}

std::vector<CalculateTariffsOfferInfoDTO> createCalculateTariffsOfferInfoDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<CalculateTariffsOfferInfoDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(CalculateTariffsOfferInfoDTO(child.second));
    }

    return vec;
}

}
}
}
}

