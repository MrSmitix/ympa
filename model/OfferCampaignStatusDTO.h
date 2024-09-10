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
 * OfferCampaignStatusDTO.h
 *
 * Статус товара в магазине.
 */

#ifndef OfferCampaignStatusDTO_H_
#define OfferCampaignStatusDTO_H_



#include "OfferCampaignStatusType.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Статус товара в магазине.
/// </summary>
class  OfferCampaignStatusDTO 
{
public:
    OfferCampaignStatusDTO() = default;
    explicit OfferCampaignStatusDTO(boost::property_tree::ptree const& pt);
    virtual ~OfferCampaignStatusDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// OfferCampaignStatusDTO members

    /// <summary>
    /// Идентификатор кампании. 
    /// </summary>
    int64_t getCampaignId() const;
    void setCampaignId(int64_t value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OfferCampaignStatusType> getStatus() const;
    void setStatus(std::shared_ptr<OfferCampaignStatusType> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    int64_t m_CampaignId = 0L;
    std::shared_ptr<OfferCampaignStatusType> m_Status = std::make_shared<OfferCampaignStatusType>();
};

std::vector<OfferCampaignStatusDTO> createOfferCampaignStatusDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* OfferCampaignStatusDTO_H_ */
