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

/*
 * ChatMessageSenderType.h
 *
 * Кто отправил сообщение:  * &#x60;PARTNER&#x60; — магазин. * &#x60;CUSTOMER&#x60; — покупатель. * &#x60;MARKET&#x60; — Маркет. * &#x60;SUPPORT&#x60; — сотрудник службы поддержки Маркета. 
 */

#ifndef ChatMessageSenderType_H_
#define ChatMessageSenderType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Кто отправил сообщение:  * &#x60;PARTNER&#x60; — магазин. * &#x60;CUSTOMER&#x60; — покупатель. * &#x60;MARKET&#x60; — Маркет. * &#x60;SUPPORT&#x60; — сотрудник службы поддержки Маркета. 
/// </summary>
class  ChatMessageSenderType 
{
public:
    ChatMessageSenderType() = default;
    explicit ChatMessageSenderType(boost::property_tree::ptree const& pt);
    virtual ~ChatMessageSenderType() = default;

    ChatMessageSenderType(const ChatMessageSenderType& other) = default; // copy constructor
    ChatMessageSenderType(ChatMessageSenderType&& other) noexcept = default; // move constructor

    ChatMessageSenderType& operator=(const ChatMessageSenderType& other) = default; // copy assignment
    ChatMessageSenderType& operator=(ChatMessageSenderType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// ChatMessageSenderType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_ChatMessageSenderTypeEnumValue;
};

std::vector<ChatMessageSenderType> createChatMessageSenderTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ChatMessageSenderType>(const ChatMessageSenderType& val) {
    return val.toPropertyTree();
}

template<>
inline ChatMessageSenderType fromPt<ChatMessageSenderType>(const boost::property_tree::ptree& pt) {
    ChatMessageSenderType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ChatMessageSenderType_H_ */
