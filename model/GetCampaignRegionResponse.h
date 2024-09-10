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
 * GetCampaignRegionResponse.h
 *
 * Ответ на запрос региона магазина.
 */

#ifndef GetCampaignRegionResponse_H_
#define GetCampaignRegionResponse_H_



#include "RegionDTO.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Ответ на запрос региона магазина.
/// </summary>
class  GetCampaignRegionResponse 
{
public:
    GetCampaignRegionResponse() = default;
    explicit GetCampaignRegionResponse(boost::property_tree::ptree const& pt);
    virtual ~GetCampaignRegionResponse() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GetCampaignRegionResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<RegionDTO> getRegion() const;
    void setRegion(std::shared_ptr<RegionDTO> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<RegionDTO> m_Region;
};

std::vector<GetCampaignRegionResponse> createGetCampaignRegionResponseVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GetCampaignRegionResponse_H_ */
