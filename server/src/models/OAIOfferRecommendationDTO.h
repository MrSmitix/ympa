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
 * OAIOfferRecommendationDTO.h
 *
 * Информация о состоянии цен и рекомендации. 
 */

#ifndef OAIOfferRecommendationDTO_H
#define OAIOfferRecommendationDTO_H

#include <QJsonObject>

#include "OAIOfferForRecommendationDTO.h"
#include "OAIOfferRecommendationInfoDTO.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOfferRecommendationDTO : public OAIObject {
public:
    OAIOfferRecommendationDTO();
    OAIOfferRecommendationDTO(QString json);
    ~OAIOfferRecommendationDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIOfferForRecommendationDTO getOffer() const;
    void setOffer(const OAIOfferForRecommendationDTO &offer);
    bool is_offer_Set() const;
    bool is_offer_Valid() const;

    OAIOfferRecommendationInfoDTO getRecommendation() const;
    void setRecommendation(const OAIOfferRecommendationInfoDTO &recommendation);
    bool is_recommendation_Set() const;
    bool is_recommendation_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIOfferForRecommendationDTO offer;
    bool m_offer_isSet;
    bool m_offer_isValid;

    OAIOfferRecommendationInfoDTO recommendation;
    bool m_recommendation_isSet;
    bool m_recommendation_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOfferRecommendationDTO)

#endif // OAIOfferRecommendationDTO_H
