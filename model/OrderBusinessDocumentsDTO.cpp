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



#include "OrderBusinessDocumentsDTO.h"

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

OrderBusinessDocumentsDTO::OrderBusinessDocumentsDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string OrderBusinessDocumentsDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void OrderBusinessDocumentsDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree OrderBusinessDocumentsDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void OrderBusinessDocumentsDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string OrderBusinessDocumentsDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void OrderBusinessDocumentsDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree OrderBusinessDocumentsDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	if (m_Upd != nullptr) {
		pt.add_child("upd", m_Upd->toPropertyTree());
	}
	if (m_Ukd != nullptr) {
		pt.add_child("ukd", m_Ukd->toPropertyTree());
	}
	if (m_TorgTwelve != nullptr) {
		pt.add_child("torgTwelve", m_TorgTwelve->toPropertyTree());
	}
	if (m_Sf != nullptr) {
		pt.add_child("sf", m_Sf->toPropertyTree());
	}
	if (m_Ksf != nullptr) {
		pt.add_child("ksf", m_Ksf->toPropertyTree());
	}
	return pt;
}

void OrderBusinessDocumentsDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	if (pt.get_child_optional("upd")) {
		m_Upd = std::make_shared<DocumentDTO>();
		m_Upd->fromPropertyTree(pt.get_child("upd"));
	}
	if (pt.get_child_optional("ukd")) {
		m_Ukd = std::make_shared<DocumentDTO>();
		m_Ukd->fromPropertyTree(pt.get_child("ukd"));
	}
	if (pt.get_child_optional("torgTwelve")) {
		m_TorgTwelve = std::make_shared<DocumentDTO>();
		m_TorgTwelve->fromPropertyTree(pt.get_child("torgTwelve"));
	}
	if (pt.get_child_optional("sf")) {
		m_Sf = std::make_shared<DocumentDTO>();
		m_Sf->fromPropertyTree(pt.get_child("sf"));
	}
	if (pt.get_child_optional("ksf")) {
		m_Ksf = std::make_shared<DocumentDTO>();
		m_Ksf->fromPropertyTree(pt.get_child("ksf"));
	}
}

std::shared_ptr<DocumentDTO> OrderBusinessDocumentsDTO::getUpd() const
{
    return m_Upd;
}

void OrderBusinessDocumentsDTO::setUpd(std::shared_ptr<DocumentDTO> value)
{
	m_Upd = value;
}
std::shared_ptr<DocumentDTO> OrderBusinessDocumentsDTO::getUkd() const
{
    return m_Ukd;
}

void OrderBusinessDocumentsDTO::setUkd(std::shared_ptr<DocumentDTO> value)
{
	m_Ukd = value;
}
std::shared_ptr<DocumentDTO> OrderBusinessDocumentsDTO::getTorgTwelve() const
{
    return m_TorgTwelve;
}

void OrderBusinessDocumentsDTO::setTorgTwelve(std::shared_ptr<DocumentDTO> value)
{
	m_TorgTwelve = value;
}
std::shared_ptr<DocumentDTO> OrderBusinessDocumentsDTO::getSf() const
{
    return m_Sf;
}

void OrderBusinessDocumentsDTO::setSf(std::shared_ptr<DocumentDTO> value)
{
	m_Sf = value;
}
std::shared_ptr<DocumentDTO> OrderBusinessDocumentsDTO::getKsf() const
{
    return m_Ksf;
}

void OrderBusinessDocumentsDTO::setKsf(std::shared_ptr<DocumentDTO> value)
{
	m_Ksf = value;
}

std::vector<OrderBusinessDocumentsDTO> createOrderBusinessDocumentsDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<OrderBusinessDocumentsDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(OrderBusinessDocumentsDTO(child.second));
    }

    return vec;
}

}
}
}
}

