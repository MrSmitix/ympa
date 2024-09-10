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
 * LogisticPointType.h
 *
 * Тип логистической точки:    * &#x60;WAREHOUSE&#x60; — склад.   * &#x60;PICKUP_POINT&#x60; — обычная точка выдачи заказов (ПВЗ).   * &#x60;PICKUP_TERMINAL&#x60; — постамат.   * &#x60;PICKUP_POST_OFFICE&#x60; — отделение почтовой связи (ОПС).   * &#x60;PICKUP_MIXED&#x60; — торговый зал и пункт выдачи заказов.   * &#x60;PICKUP_RETAIL&#x60; — торговый зал. 
 */

#ifndef LogisticPointType_H_
#define LogisticPointType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Тип логистической точки:    * &#x60;WAREHOUSE&#x60; — склад.   * &#x60;PICKUP_POINT&#x60; — обычная точка выдачи заказов (ПВЗ).   * &#x60;PICKUP_TERMINAL&#x60; — постамат.   * &#x60;PICKUP_POST_OFFICE&#x60; — отделение почтовой связи (ОПС).   * &#x60;PICKUP_MIXED&#x60; — торговый зал и пункт выдачи заказов.   * &#x60;PICKUP_RETAIL&#x60; — торговый зал. 
/// </summary>
class  LogisticPointType 
{
public:
    LogisticPointType() = default;
    explicit LogisticPointType(boost::property_tree::ptree const& pt);
    virtual ~LogisticPointType() = default;

    LogisticPointType(const LogisticPointType& other) = default; // copy constructor
    LogisticPointType(LogisticPointType&& other) noexcept = default; // move constructor

    LogisticPointType& operator=(const LogisticPointType& other) = default; // copy assignment
    LogisticPointType& operator=(LogisticPointType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// LogisticPointType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_LogisticPointTypeEnumValue;
};

std::vector<LogisticPointType> createLogisticPointTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<LogisticPointType>(const LogisticPointType& val) {
    return val.toPropertyTree();
}

template<>
inline LogisticPointType fromPt<LogisticPointType>(const boost::property_tree::ptree& pt) {
    LogisticPointType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* LogisticPointType_H_ */
