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
 * OAIGetQuarantineOffersResultDTO.h
 *
 * Список товаров в карантине.
 */

#ifndef OAIGetQuarantineOffersResultDTO_H
#define OAIGetQuarantineOffersResultDTO_H

#include <QJsonObject>

#include "OAIQuarantineOfferDTO.h"
#include "OAIScrollingPagerDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIScrollingPagerDTO;
class OAIQuarantineOfferDTO;

class OAIGetQuarantineOffersResultDTO : public OAIObject {
public:
    OAIGetQuarantineOffersResultDTO();
    OAIGetQuarantineOffersResultDTO(QString json);
    ~OAIGetQuarantineOffersResultDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIScrollingPagerDTO getPaging() const;
    void setPaging(const OAIScrollingPagerDTO &paging);
    bool is_paging_Set() const;
    bool is_paging_Valid() const;

    QList<OAIQuarantineOfferDTO> getOffers() const;
    void setOffers(const QList<OAIQuarantineOfferDTO> &offers);
    bool is_offers_Set() const;
    bool is_offers_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIScrollingPagerDTO m_paging;
    bool m_paging_isSet;
    bool m_paging_isValid;

    QList<OAIQuarantineOfferDTO> m_offers;
    bool m_offers_isSet;
    bool m_offers_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetQuarantineOffersResultDTO)

#endif // OAIGetQuarantineOffersResultDTO_H
