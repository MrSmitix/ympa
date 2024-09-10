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
 * ReportSubStatusType.h
 *
 * Подстатус генерации отчета: * &#x60;NO_DATA&#x60; — для такого отчета нет данных. * &#x60;TOO_LARGE&#x60; — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * &#x60;RESOURCE_NOT_FOUND&#x60; — для такого отчета не удалось найти часть сущностей. 
 */

#ifndef ReportSubStatusType_H_
#define ReportSubStatusType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Подстатус генерации отчета: * &#x60;NO_DATA&#x60; — для такого отчета нет данных. * &#x60;TOO_LARGE&#x60; — отчет превысил допустимый размер — укажите меньший период времени или уточните условия запроса. * &#x60;RESOURCE_NOT_FOUND&#x60; — для такого отчета не удалось найти часть сущностей. 
/// </summary>
class  ReportSubStatusType 
{
public:
    ReportSubStatusType() = default;
    explicit ReportSubStatusType(boost::property_tree::ptree const& pt);
    virtual ~ReportSubStatusType() = default;

    ReportSubStatusType(const ReportSubStatusType& other) = default; // copy constructor
    ReportSubStatusType(ReportSubStatusType&& other) noexcept = default; // move constructor

    ReportSubStatusType& operator=(const ReportSubStatusType& other) = default; // copy assignment
    ReportSubStatusType& operator=(ReportSubStatusType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// ReportSubStatusType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_ReportSubStatusTypeEnumValue;
};

std::vector<ReportSubStatusType> createReportSubStatusTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ReportSubStatusType>(const ReportSubStatusType& val) {
    return val.toPropertyTree();
}

template<>
inline ReportSubStatusType fromPt<ReportSubStatusType>(const boost::property_tree::ptree& pt) {
    ReportSubStatusType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ReportSubStatusType_H_ */
