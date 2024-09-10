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
 * OAICalculateTariffsOfferInfoDTO.h
 *
 * Стоимость услуг.
 */

#ifndef OAICalculateTariffsOfferInfoDTO_H
#define OAICalculateTariffsOfferInfoDTO_H

#include <QJsonObject>

#include "OAICalculateTariffsOfferDTO.h"
#include "OAICalculatedTariffDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICalculateTariffsOfferDTO;
class OAICalculatedTariffDTO;

class OAICalculateTariffsOfferInfoDTO : public OAIObject {
public:
    OAICalculateTariffsOfferInfoDTO();
    OAICalculateTariffsOfferInfoDTO(QString json);
    ~OAICalculateTariffsOfferInfoDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICalculateTariffsOfferDTO getOffer() const;
    void setOffer(const OAICalculateTariffsOfferDTO &offer);
    bool is_offer_Set() const;
    bool is_offer_Valid() const;

    QList<OAICalculatedTariffDTO> getTariffs() const;
    void setTariffs(const QList<OAICalculatedTariffDTO> &tariffs);
    bool is_tariffs_Set() const;
    bool is_tariffs_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICalculateTariffsOfferDTO m_offer;
    bool m_offer_isSet;
    bool m_offer_isValid;

    QList<OAICalculatedTariffDTO> m_tariffs;
    bool m_tariffs_isSet;
    bool m_tariffs_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICalculateTariffsOfferInfoDTO)

#endif // OAICalculateTariffsOfferInfoDTO_H
