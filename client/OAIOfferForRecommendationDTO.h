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
 * OAIOfferForRecommendationDTO.h
 *
 * Информация о состоянии цены на товар.
 */

#ifndef OAIOfferForRecommendationDTO_H
#define OAIOfferForRecommendationDTO_H

#include <QJsonObject>

#include "OAIBasePriceDTO.h"
#include "OAIGetPriceDTO.h"
#include "OAIPriceCompetitivenessType.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIBasePriceDTO;
class OAIGetPriceDTO;

class OAIOfferForRecommendationDTO : public OAIObject {
public:
    OAIOfferForRecommendationDTO();
    OAIOfferForRecommendationDTO(QString json);
    ~OAIOfferForRecommendationDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getOfferId() const;
    void setOfferId(const QString &offer_id);
    bool is_offer_id_Set() const;
    bool is_offer_id_Valid() const;

    OAIBasePriceDTO getPrice() const;
    void setPrice(const OAIBasePriceDTO &price);
    bool is_price_Set() const;
    bool is_price_Valid() const;

    OAIGetPriceDTO getCofinancePrice() const;
    void setCofinancePrice(const OAIGetPriceDTO &cofinance_price);
    bool is_cofinance_price_Set() const;
    bool is_cofinance_price_Valid() const;

    OAIPriceCompetitivenessType getCompetitiveness() const;
    void setCompetitiveness(const OAIPriceCompetitivenessType &competitiveness);
    bool is_competitiveness_Set() const;
    bool is_competitiveness_Valid() const;

    qint64 getShows() const;
    void setShows(const qint64 &shows);
    bool is_shows_Set() const;
    bool is_shows_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_offer_id;
    bool m_offer_id_isSet;
    bool m_offer_id_isValid;

    OAIBasePriceDTO m_price;
    bool m_price_isSet;
    bool m_price_isValid;

    OAIGetPriceDTO m_cofinance_price;
    bool m_cofinance_price_isSet;
    bool m_cofinance_price_isValid;

    OAIPriceCompetitivenessType m_competitiveness;
    bool m_competitiveness_isSet;
    bool m_competitiveness_isValid;

    qint64 m_shows;
    bool m_shows_isSet;
    bool m_shows_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOfferForRecommendationDTO)

#endif // OAIOfferForRecommendationDTO_H
