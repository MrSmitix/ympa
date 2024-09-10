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
 * CampaignQualityRatingDTO.h
 *
 * Информация об индексе качества магазина.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CampaignQualityRatingDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CampaignQualityRatingDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/QualityRatingDTO.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class QualityRatingDTO;


/// <summary>
/// Информация об индексе качества магазина.
/// </summary>
class  CampaignQualityRatingDTO
    : public ModelBase
{
public:
    CampaignQualityRatingDTO();
    virtual ~CampaignQualityRatingDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CampaignQualityRatingDTO members

    /// <summary>
    /// Идентификатор магазина.
    /// </summary>
    int64_t getCampaignId() const;
    bool campaignIdIsSet() const;
    void unsetCampaignId();

    void setCampaignId(int64_t value);

    /// <summary>
    /// Список значений индекса качества.
    /// </summary>
    std::vector<std::shared_ptr<QualityRatingDTO>>& getRatings();
    bool ratingsIsSet() const;
    void unsetRatings();

    void setRatings(const std::vector<std::shared_ptr<QualityRatingDTO>>& value);


protected:
    int64_t m_CampaignId;
    bool m_CampaignIdIsSet;
    std::vector<std::shared_ptr<QualityRatingDTO>> m_Ratings;
    bool m_RatingsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CampaignQualityRatingDTO_H_ */
