/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAICampaignsQualityRatingDTO.h
 *
 * Информация об индексе качества магазинов.
 */

#ifndef OAICampaignsQualityRatingDTO_H
#define OAICampaignsQualityRatingDTO_H

#include <QJsonObject>

#include "OAICampaignQualityRatingDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICampaignQualityRatingDTO;

class OAICampaignsQualityRatingDTO : public OAIObject {
public:
    OAICampaignsQualityRatingDTO();
    OAICampaignsQualityRatingDTO(QString json);
    ~OAICampaignsQualityRatingDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAICampaignQualityRatingDTO> getCampaignRatings() const;
    void setCampaignRatings(const QList<OAICampaignQualityRatingDTO> &campaign_ratings);
    bool is_campaign_ratings_Set() const;
    bool is_campaign_ratings_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAICampaignQualityRatingDTO> m_campaign_ratings;
    bool m_campaign_ratings_isSet;
    bool m_campaign_ratings_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICampaignsQualityRatingDTO)

#endif // OAICampaignsQualityRatingDTO_H
