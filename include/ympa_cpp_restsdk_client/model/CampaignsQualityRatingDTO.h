/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CampaignsQualityRatingDTO.h
 *
 * Информация об индексе качества магазинов.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CampaignsQualityRatingDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CampaignsQualityRatingDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include <vector>
#include "ympa_cpp_restsdk_client/model/CampaignQualityRatingDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CampaignQualityRatingDTO;


/// <summary>
/// Информация об индексе качества магазинов.
/// </summary>
class  CampaignsQualityRatingDTO
    : public ModelBase
{
public:
    CampaignsQualityRatingDTO();
    virtual ~CampaignsQualityRatingDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CampaignsQualityRatingDTO members

    /// <summary>
    /// Список магазинов c информацией об их индексе качества.
    /// </summary>
    std::vector<std::shared_ptr<CampaignQualityRatingDTO>>& getCampaignRatings();
    bool campaignRatingsIsSet() const;
    void unsetCampaignRatings();

    void setCampaignRatings(const std::vector<std::shared_ptr<CampaignQualityRatingDTO>>& value);


protected:
    std::vector<std::shared_ptr<CampaignQualityRatingDTO>> m_CampaignRatings;
    bool m_CampaignRatingsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CampaignsQualityRatingDTO_H_ */
