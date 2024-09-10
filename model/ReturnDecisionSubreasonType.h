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
 * ReturnDecisionSubreasonType.h
 *
 * Детали причин возврата:   * &#x60;DO_NOT_FIT&#x60;:     * &#x60;USER_DID_NOT_LIKE&#x60; — товар не понравился.     * &#x60;USER_CHANGED_MIND&#x60; — передумал покупать.     * &#x60;DELIVERED_TOO_LONG&#x60; — длительный срок доставки, поэтому передумал.    * &#x60;BAD_QUALITY&#x60;:     * &#x60;BAD_PACKAGE&#x60; — упаковка товара была нарушена.     * &#x60;DAMAGED&#x60; — царапины, сколы.     * &#x60;NOT_WORKING&#x60; — не включается / не работает.     * &#x60;INCOMPLETENESS&#x60; — некомплект (не хватает детали в наборе, к товару).    * &#x60;WRONG_ITEM&#x60;:     * &#x60;WRONG_ITEM&#x60; — не тот товар.     * &#x60;WRONG_COLOR&#x60; — не соответствует по цвету.     * &#x60;DID_NOT_MATCH_DESCRIPTION&#x60; — не соответствует заявленным характеристикам/описанию. 
 */

#ifndef ReturnDecisionSubreasonType_H_
#define ReturnDecisionSubreasonType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Детали причин возврата:   * &#x60;DO_NOT_FIT&#x60;:     * &#x60;USER_DID_NOT_LIKE&#x60; — товар не понравился.     * &#x60;USER_CHANGED_MIND&#x60; — передумал покупать.     * &#x60;DELIVERED_TOO_LONG&#x60; — длительный срок доставки, поэтому передумал.    * &#x60;BAD_QUALITY&#x60;:     * &#x60;BAD_PACKAGE&#x60; — упаковка товара была нарушена.     * &#x60;DAMAGED&#x60; — царапины, сколы.     * &#x60;NOT_WORKING&#x60; — не включается / не работает.     * &#x60;INCOMPLETENESS&#x60; — некомплект (не хватает детали в наборе, к товару).    * &#x60;WRONG_ITEM&#x60;:     * &#x60;WRONG_ITEM&#x60; — не тот товар.     * &#x60;WRONG_COLOR&#x60; — не соответствует по цвету.     * &#x60;DID_NOT_MATCH_DESCRIPTION&#x60; — не соответствует заявленным характеристикам/описанию. 
/// </summary>
class  ReturnDecisionSubreasonType 
{
public:
    ReturnDecisionSubreasonType() = default;
    explicit ReturnDecisionSubreasonType(boost::property_tree::ptree const& pt);
    virtual ~ReturnDecisionSubreasonType() = default;

    ReturnDecisionSubreasonType(const ReturnDecisionSubreasonType& other) = default; // copy constructor
    ReturnDecisionSubreasonType(ReturnDecisionSubreasonType&& other) noexcept = default; // move constructor

    ReturnDecisionSubreasonType& operator=(const ReturnDecisionSubreasonType& other) = default; // copy assignment
    ReturnDecisionSubreasonType& operator=(ReturnDecisionSubreasonType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// ReturnDecisionSubreasonType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_ReturnDecisionSubreasonTypeEnumValue;
};

std::vector<ReturnDecisionSubreasonType> createReturnDecisionSubreasonTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ReturnDecisionSubreasonType>(const ReturnDecisionSubreasonType& val) {
    return val.toPropertyTree();
}

template<>
inline ReturnDecisionSubreasonType fromPt<ReturnDecisionSubreasonType>(const boost::property_tree::ptree& pt) {
    ReturnDecisionSubreasonType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ReturnDecisionSubreasonType_H_ */
