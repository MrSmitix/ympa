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
 * OAICalculateTariffsRequest.h
 *
 * 
 */

#ifndef OAICalculateTariffsRequest_H
#define OAICalculateTariffsRequest_H

#include <QJsonObject>

#include "OAICalculateTariffsOfferDTO.h"
#include "OAICalculateTariffsParametersDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICalculateTariffsParametersDTO;
class OAICalculateTariffsOfferDTO;

class OAICalculateTariffsRequest : public OAIObject {
public:
    OAICalculateTariffsRequest();
    OAICalculateTariffsRequest(QString json);
    ~OAICalculateTariffsRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICalculateTariffsParametersDTO getParameters() const;
    void setParameters(const OAICalculateTariffsParametersDTO &parameters);
    bool is_parameters_Set() const;
    bool is_parameters_Valid() const;

    QList<OAICalculateTariffsOfferDTO> getOffers() const;
    void setOffers(const QList<OAICalculateTariffsOfferDTO> &offers);
    bool is_offers_Set() const;
    bool is_offers_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICalculateTariffsParametersDTO m_parameters;
    bool m_parameters_isSet;
    bool m_parameters_isValid;

    QList<OAICalculateTariffsOfferDTO> m_offers;
    bool m_offers_isSet;
    bool m_offers_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICalculateTariffsRequest)

#endif // OAICalculateTariffsRequest_H
