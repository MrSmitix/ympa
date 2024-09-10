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
 * OAIUpdatePromoOffersResultDTO.h
 *
 * Ошибки и предупреждения, которые появились при добавлении товаров в акцию.
 */

#ifndef OAIUpdatePromoOffersResultDTO_H
#define OAIUpdatePromoOffersResultDTO_H

#include <QJsonObject>

#include "OAIRejectedPromoOfferUpdateDTO.h"
#include "OAIWarningPromoOfferUpdateDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIUpdatePromoOffersResultDTO : public OAIObject {
public:
    OAIUpdatePromoOffersResultDTO();
    OAIUpdatePromoOffersResultDTO(QString json);
    ~OAIUpdatePromoOffersResultDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIRejectedPromoOfferUpdateDTO> getRejectedOffers() const;
    void setRejectedOffers(const QList<OAIRejectedPromoOfferUpdateDTO> &rejected_offers);
    bool is_rejected_offers_Set() const;
    bool is_rejected_offers_Valid() const;

    QList<OAIWarningPromoOfferUpdateDTO> getWarningOffers() const;
    void setWarningOffers(const QList<OAIWarningPromoOfferUpdateDTO> &warning_offers);
    bool is_warning_offers_Set() const;
    bool is_warning_offers_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIRejectedPromoOfferUpdateDTO> rejected_offers;
    bool m_rejected_offers_isSet;
    bool m_rejected_offers_isValid;

    QList<OAIWarningPromoOfferUpdateDTO> warning_offers;
    bool m_warning_offers_isSet;
    bool m_warning_offers_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIUpdatePromoOffersResultDTO)

#endif // OAIUpdatePromoOffersResultDTO_H
