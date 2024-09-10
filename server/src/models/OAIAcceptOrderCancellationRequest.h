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
 * OAIAcceptOrderCancellationRequest.h
 *
 * 
 */

#ifndef OAIAcceptOrderCancellationRequest_H
#define OAIAcceptOrderCancellationRequest_H

#include <QJsonObject>

#include "OAIOrderCancellationReasonType.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAcceptOrderCancellationRequest : public OAIObject {
public:
    OAIAcceptOrderCancellationRequest();
    OAIAcceptOrderCancellationRequest(QString json);
    ~OAIAcceptOrderCancellationRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    bool isAccepted() const;
    void setAccepted(const bool &accepted);
    bool is_accepted_Set() const;
    bool is_accepted_Valid() const;

    OAIOrderCancellationReasonType getReason() const;
    void setReason(const OAIOrderCancellationReasonType &reason);
    bool is_reason_Set() const;
    bool is_reason_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    bool accepted;
    bool m_accepted_isSet;
    bool m_accepted_isValid;

    OAIOrderCancellationReasonType reason;
    bool m_reason_isSet;
    bool m_reason_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAcceptOrderCancellationRequest)

#endif // OAIAcceptOrderCancellationRequest_H
