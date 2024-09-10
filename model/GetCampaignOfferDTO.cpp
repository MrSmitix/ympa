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



#include "GetCampaignOfferDTO.h"

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

GetCampaignOfferDTO::GetCampaignOfferDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string GetCampaignOfferDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void GetCampaignOfferDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree GetCampaignOfferDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void GetCampaignOfferDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string GetCampaignOfferDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void GetCampaignOfferDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree GetCampaignOfferDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("offerId", m_OfferId);
	if (m_Quantum != nullptr) {
		pt.add_child("quantum", m_Quantum->toPropertyTree());
	}
	pt.put("available", m_Available);
	if (m_BasicPrice != nullptr) {
		pt.add_child("basicPrice", m_BasicPrice->toPropertyTree());
	}
	if (m_CampaignPrice != nullptr) {
		pt.add_child("campaignPrice", m_CampaignPrice->toPropertyTree());
	}
	// generate tree for Errors
	if (!m_Errors.empty()) {
		for (const auto &childEntry : m_Errors) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("errors", tmp_node);
		tmp_node.clear();
	}
	// generate tree for Warnings
	if (!m_Warnings.empty()) {
		for (const auto &childEntry : m_Warnings) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("warnings", tmp_node);
		tmp_node.clear();
	}
	return pt;
}

void GetCampaignOfferDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_OfferId = pt.get("offerId", "");
	if (pt.get_child_optional("quantum")) {
		m_Quantum = std::make_shared<QuantumDTO>();
		m_Quantum->fromPropertyTree(pt.get_child("quantum"));
	}
	m_Available = pt.get("available", false);
	if (pt.get_child_optional("basicPrice")) {
		m_BasicPrice = std::make_shared<GetPriceWithDiscountDTO>();
		m_BasicPrice->fromPropertyTree(pt.get_child("basicPrice"));
	}
	if (pt.get_child_optional("campaignPrice")) {
		m_CampaignPrice = std::make_shared<GetPriceWithVatDTO>();
		m_CampaignPrice->fromPropertyTree(pt.get_child("campaignPrice"));
	}
	// push all items of Errors into member vector
	if (pt.get_child_optional("errors")) {
		for (const auto &childTree : pt.get_child("errors")) {
            std::shared_ptr<OfferErrorDTO> val =
                std::make_shared<OfferErrorDTO>(childTree.second);
            m_Errors.emplace_back(std::move(val));
		}
	}
	// push all items of Warnings into member vector
	if (pt.get_child_optional("warnings")) {
		for (const auto &childTree : pt.get_child("warnings")) {
            std::shared_ptr<OfferErrorDTO> val =
                std::make_shared<OfferErrorDTO>(childTree.second);
            m_Warnings.emplace_back(std::move(val));
		}
	}
}

std::string GetCampaignOfferDTO::getOfferId() const
{
    return m_OfferId;
}

void GetCampaignOfferDTO::setOfferId(std::string value)
{
	m_OfferId = value;
}
std::shared_ptr<QuantumDTO> GetCampaignOfferDTO::getQuantum() const
{
    return m_Quantum;
}

void GetCampaignOfferDTO::setQuantum(std::shared_ptr<QuantumDTO> value)
{
	m_Quantum = value;
}
bool GetCampaignOfferDTO::isAvailable() const
{
    return m_Available;
}

void GetCampaignOfferDTO::setAvailable(bool value)
{
	m_Available = value;
}
std::shared_ptr<GetPriceWithDiscountDTO> GetCampaignOfferDTO::getBasicPrice() const
{
    return m_BasicPrice;
}

void GetCampaignOfferDTO::setBasicPrice(std::shared_ptr<GetPriceWithDiscountDTO> value)
{
	m_BasicPrice = value;
}
std::shared_ptr<GetPriceWithVatDTO> GetCampaignOfferDTO::getCampaignPrice() const
{
    return m_CampaignPrice;
}

void GetCampaignOfferDTO::setCampaignPrice(std::shared_ptr<GetPriceWithVatDTO> value)
{
	m_CampaignPrice = value;
}
std::shared_ptr<OfferCampaignStatusType> GetCampaignOfferDTO::getStatus() const
{
    return m_Status;
}

void GetCampaignOfferDTO::setStatus(std::shared_ptr<OfferCampaignStatusType> value)
{
	m_Status = value;
}
std::vector<std::shared_ptr<OfferErrorDTO>> GetCampaignOfferDTO::getErrors() const
{
    return m_Errors;
}

void GetCampaignOfferDTO::setErrors(std::vector<std::shared_ptr<OfferErrorDTO>> value)
{
	m_Errors = value;
}
std::vector<std::shared_ptr<OfferErrorDTO>> GetCampaignOfferDTO::getWarnings() const
{
    return m_Warnings;
}

void GetCampaignOfferDTO::setWarnings(std::vector<std::shared_ptr<OfferErrorDTO>> value)
{
	m_Warnings = value;
}

std::vector<GetCampaignOfferDTO> createGetCampaignOfferDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<GetCampaignOfferDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(GetCampaignOfferDTO(child.second));
    }

    return vec;
}

}
}
}
}

