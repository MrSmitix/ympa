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



#include "ChatMessagesResultDTO.h"

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

ChatMessagesResultDTO::ChatMessagesResultDTO(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string ChatMessagesResultDTO::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void ChatMessagesResultDTO::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree ChatMessagesResultDTO::toPropertyTree()
{
    return toPropertyTree_internal();
}

void ChatMessagesResultDTO::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string ChatMessagesResultDTO::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void ChatMessagesResultDTO::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree ChatMessagesResultDTO::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("orderId", m_OrderId);
	// generate tree for Messages
	if (!m_Messages.empty()) {
		for (const auto &childEntry : m_Messages) {
            tmp_node.push_back(std::make_pair("", childEntry->toPropertyTree()));
		}
		pt.add_child("messages", tmp_node);
		tmp_node.clear();
	}
	if (m_Paging != nullptr) {
		pt.add_child("paging", m_Paging->toPropertyTree());
	}
	return pt;
}

void ChatMessagesResultDTO::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_OrderId = pt.get("orderId", 0L);
	// push all items of Messages into member vector
	if (pt.get_child_optional("messages")) {
		for (const auto &childTree : pt.get_child("messages")) {
            std::shared_ptr<ChatMessageDTO> val =
                std::make_shared<ChatMessageDTO>(childTree.second);
            m_Messages.emplace_back(std::move(val));
		}
	}
	if (pt.get_child_optional("paging")) {
		m_Paging = std::make_shared<ForwardScrollingPagerDTO>();
		m_Paging->fromPropertyTree(pt.get_child("paging"));
	}
}

int64_t ChatMessagesResultDTO::getOrderId() const
{
    return m_OrderId;
}

void ChatMessagesResultDTO::setOrderId(int64_t value)
{
	m_OrderId = value;
}
std::vector<std::shared_ptr<ChatMessageDTO>> ChatMessagesResultDTO::getMessages() const
{
    return m_Messages;
}

void ChatMessagesResultDTO::setMessages(std::vector<std::shared_ptr<ChatMessageDTO>> value)
{
	m_Messages = value;
}
std::shared_ptr<ForwardScrollingPagerDTO> ChatMessagesResultDTO::getPaging() const
{
    return m_Paging;
}

void ChatMessagesResultDTO::setPaging(std::shared_ptr<ForwardScrollingPagerDTO> value)
{
	m_Paging = value;
}

std::vector<ChatMessagesResultDTO> createChatMessagesResultDTOVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<ChatMessagesResultDTO>();
    for (const auto& child: pt) {
        vec.emplace_back(ChatMessagesResultDTO(child.second));
    }

    return vec;
}

}
}
}
}

