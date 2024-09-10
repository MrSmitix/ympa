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
 * CampaignSettingsLocalRegionDTO.h
 *
 * Информация о своем регионе магазина.
 */

#ifndef CampaignSettingsLocalRegionDTO_H_
#define CampaignSettingsLocalRegionDTO_H_



#include "RegionType.h"
#include <string>
#include "CampaignSettingsDeliveryDTO.h"
#include "CampaignSettingsScheduleSourceType.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация о своем регионе магазина.
/// </summary>
class  CampaignSettingsLocalRegionDTO 
{
public:
    CampaignSettingsLocalRegionDTO() = default;
    explicit CampaignSettingsLocalRegionDTO(boost::property_tree::ptree const& pt);
    virtual ~CampaignSettingsLocalRegionDTO() = default;

    CampaignSettingsLocalRegionDTO(const CampaignSettingsLocalRegionDTO& other) = default; // copy constructor
    CampaignSettingsLocalRegionDTO(CampaignSettingsLocalRegionDTO&& other) noexcept = default; // move constructor

    CampaignSettingsLocalRegionDTO& operator=(const CampaignSettingsLocalRegionDTO& other) = default; // copy assignment
    CampaignSettingsLocalRegionDTO& operator=(CampaignSettingsLocalRegionDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CampaignSettingsLocalRegionDTO members

    /// <summary>
    /// Идентификатор региона.
    /// </summary>
    int64_t getId() const;
    void setId(int64_t value);

    /// <summary>
    /// Название региона.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// 
    /// </summary>
    RegionType getType() const;
    void setType(RegionType value);

    /// <summary>
    /// 
    /// </summary>
    CampaignSettingsScheduleSourceType getDeliveryOptionsSource() const;
    void setDeliveryOptionsSource(CampaignSettingsScheduleSourceType value);

    /// <summary>
    /// 
    /// </summary>
    CampaignSettingsDeliveryDTO getDelivery() const;
    void setDelivery(CampaignSettingsDeliveryDTO value);

protected:
    int64_t m_Id = 0L;
    std::string m_Name = "";
    RegionType m_Type = RegionType{};
    CampaignSettingsScheduleSourceType m_DeliveryOptionsSource = CampaignSettingsScheduleSourceType{};
    CampaignSettingsDeliveryDTO m_Delivery;
};

std::vector<CampaignSettingsLocalRegionDTO> createCampaignSettingsLocalRegionDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CampaignSettingsLocalRegionDTO>(const CampaignSettingsLocalRegionDTO& val) {
    return val.toPropertyTree();
}

template<>
inline CampaignSettingsLocalRegionDTO fromPt<CampaignSettingsLocalRegionDTO>(const boost::property_tree::ptree& pt) {
    CampaignSettingsLocalRegionDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CampaignSettingsLocalRegionDTO_H_ */
