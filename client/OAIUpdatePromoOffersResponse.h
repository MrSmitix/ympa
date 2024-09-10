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
 * OAIUpdatePromoOffersResponse.h
 *
 * Результат добавления товаров в акцию.
 */

#ifndef OAIUpdatePromoOffersResponse_H
#define OAIUpdatePromoOffersResponse_H

#include <QJsonObject>

#include "OAIApiResponseStatusType.h"
#include "OAIUpdatePromoOffersResultDTO.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIUpdatePromoOffersResultDTO;

class OAIUpdatePromoOffersResponse : public OAIObject {
public:
    OAIUpdatePromoOffersResponse();
    OAIUpdatePromoOffersResponse(QString json);
    ~OAIUpdatePromoOffersResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIApiResponseStatusType getStatus() const;
    void setStatus(const OAIApiResponseStatusType &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    OAIUpdatePromoOffersResultDTO getResult() const;
    void setResult(const OAIUpdatePromoOffersResultDTO &result);
    bool is_result_Set() const;
    bool is_result_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIApiResponseStatusType m_status;
    bool m_status_isSet;
    bool m_status_isValid;

    OAIUpdatePromoOffersResultDTO m_result;
    bool m_result_isSet;
    bool m_result_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIUpdatePromoOffersResponse)

#endif // OAIUpdatePromoOffersResponse_H
