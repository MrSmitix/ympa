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
 * OrdersStatsItemStatusType.h
 *
 * Статус товара:  * &#x60;REJECTED&#x60; — товар был добавлен в созданный заказ, но не был оплачен. * &#x60;RETURNED&#x60; — товар вернули. 
 */

#ifndef OrdersStatsItemStatusType_H_
#define OrdersStatsItemStatusType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Статус товара:  * &#x60;REJECTED&#x60; — товар был добавлен в созданный заказ, но не был оплачен. * &#x60;RETURNED&#x60; — товар вернули. 
/// </summary>
class  OrdersStatsItemStatusType 
{
public:
    OrdersStatsItemStatusType() = default;
    explicit OrdersStatsItemStatusType(boost::property_tree::ptree const& pt);
    virtual ~OrdersStatsItemStatusType() = default;

    OrdersStatsItemStatusType(const OrdersStatsItemStatusType& other) = default; // copy constructor
    OrdersStatsItemStatusType(OrdersStatsItemStatusType&& other) noexcept = default; // move constructor

    OrdersStatsItemStatusType& operator=(const OrdersStatsItemStatusType& other) = default; // copy assignment
    OrdersStatsItemStatusType& operator=(OrdersStatsItemStatusType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// OrdersStatsItemStatusType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_OrdersStatsItemStatusTypeEnumValue;
};

std::vector<OrdersStatsItemStatusType> createOrdersStatsItemStatusTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OrdersStatsItemStatusType>(const OrdersStatsItemStatusType& val) {
    return val.toPropertyTree();
}

template<>
inline OrdersStatsItemStatusType fromPt<OrdersStatsItemStatusType>(const boost::property_tree::ptree& pt) {
    OrdersStatsItemStatusType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OrdersStatsItemStatusType_H_ */
