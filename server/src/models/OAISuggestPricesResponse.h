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
 * OAISuggestPricesResponse.h
 *
 * Ответ на запрос списка цен для продвижения.
 */

#ifndef OAISuggestPricesResponse_H
#define OAISuggestPricesResponse_H

#include <QJsonObject>

#include "OAIApiResponseStatusType.h"
#include "OAISuggestPricesResultDTO.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAISuggestPricesResponse : public OAIObject {
public:
    OAISuggestPricesResponse();
    OAISuggestPricesResponse(QString json);
    ~OAISuggestPricesResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIApiResponseStatusType getStatus() const;
    void setStatus(const OAIApiResponseStatusType &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    OAISuggestPricesResultDTO getResult() const;
    void setResult(const OAISuggestPricesResultDTO &result);
    bool is_result_Set() const;
    bool is_result_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIApiResponseStatusType status;
    bool m_status_isSet;
    bool m_status_isValid;

    OAISuggestPricesResultDTO result;
    bool m_result_isSet;
    bool m_result_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAISuggestPricesResponse)

#endif // OAISuggestPricesResponse_H
