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
 * OAISetOrderDeliveryDateRequest.h
 *
 * 
 */

#ifndef OAISetOrderDeliveryDateRequest_H
#define OAISetOrderDeliveryDateRequest_H

#include <QJsonObject>

#include "OAIOrderDeliveryDateDTO.h"
#include "OAIOrderDeliveryDateReasonType.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAISetOrderDeliveryDateRequest : public OAIObject {
public:
    OAISetOrderDeliveryDateRequest();
    OAISetOrderDeliveryDateRequest(QString json);
    ~OAISetOrderDeliveryDateRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIOrderDeliveryDateDTO getDates() const;
    void setDates(const OAIOrderDeliveryDateDTO &dates);
    bool is_dates_Set() const;
    bool is_dates_Valid() const;

    OAIOrderDeliveryDateReasonType getReason() const;
    void setReason(const OAIOrderDeliveryDateReasonType &reason);
    bool is_reason_Set() const;
    bool is_reason_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIOrderDeliveryDateDTO dates;
    bool m_dates_isSet;
    bool m_dates_isValid;

    OAIOrderDeliveryDateReasonType reason;
    bool m_reason_isSet;
    bool m_reason_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAISetOrderDeliveryDateRequest)

#endif // OAISetOrderDeliveryDateRequest_H
