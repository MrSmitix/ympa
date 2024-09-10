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
 * OAIGetOrderBuyerInfoResponse.h
 *
 * 
 */

#ifndef OAIGetOrderBuyerInfoResponse_H
#define OAIGetOrderBuyerInfoResponse_H

#include <QJsonObject>

#include "OAIApiResponseStatusType.h"
#include "OAIOrderBuyerInfoDTO.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetOrderBuyerInfoResponse : public OAIObject {
public:
    OAIGetOrderBuyerInfoResponse();
    OAIGetOrderBuyerInfoResponse(QString json);
    ~OAIGetOrderBuyerInfoResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIApiResponseStatusType getStatus() const;
    void setStatus(const OAIApiResponseStatusType &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    OAIOrderBuyerInfoDTO getResult() const;
    void setResult(const OAIOrderBuyerInfoDTO &result);
    bool is_result_Set() const;
    bool is_result_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIApiResponseStatusType status;
    bool m_status_isSet;
    bool m_status_isValid;

    OAIOrderBuyerInfoDTO result;
    bool m_result_isSet;
    bool m_result_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetOrderBuyerInfoResponse)

#endif // OAIGetOrderBuyerInfoResponse_H
