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
 * CampaignSettingsScheduleSourceType.h
 *
 * Источник информации о расписании работы службы доставки. Возможные значения: * &#x60;WEB&#x60; — информация получена из настроек кабинета продавца на Маркете. * &#x60;YML&#x60; — информация получена из прайс-листа магазина. 
 */

#ifndef CampaignSettingsScheduleSourceType_H_
#define CampaignSettingsScheduleSourceType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Источник информации о расписании работы службы доставки. Возможные значения: * &#x60;WEB&#x60; — информация получена из настроек кабинета продавца на Маркете. * &#x60;YML&#x60; — информация получена из прайс-листа магазина. 
/// </summary>
class  CampaignSettingsScheduleSourceType 
{
public:
    CampaignSettingsScheduleSourceType() = default;
    explicit CampaignSettingsScheduleSourceType(boost::property_tree::ptree const& pt);
    virtual ~CampaignSettingsScheduleSourceType() = default;

    CampaignSettingsScheduleSourceType(const CampaignSettingsScheduleSourceType& other) = default; // copy constructor
    CampaignSettingsScheduleSourceType(CampaignSettingsScheduleSourceType&& other) noexcept = default; // move constructor

    CampaignSettingsScheduleSourceType& operator=(const CampaignSettingsScheduleSourceType& other) = default; // copy assignment
    CampaignSettingsScheduleSourceType& operator=(CampaignSettingsScheduleSourceType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// CampaignSettingsScheduleSourceType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_CampaignSettingsScheduleSourceTypeEnumValue;
};

std::vector<CampaignSettingsScheduleSourceType> createCampaignSettingsScheduleSourceTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CampaignSettingsScheduleSourceType>(const CampaignSettingsScheduleSourceType& val) {
    return val.toPropertyTree();
}

template<>
inline CampaignSettingsScheduleSourceType fromPt<CampaignSettingsScheduleSourceType>(const boost::property_tree::ptree& pt) {
    CampaignSettingsScheduleSourceType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CampaignSettingsScheduleSourceType_H_ */
