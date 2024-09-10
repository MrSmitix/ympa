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
 * OAIOutletStatusType.h
 *
 * Статус точки продаж.  Возможные значения:  * &#x60;AT_MODERATION&#x60; — проверяется. * &#x60;FAILED&#x60; — не прошла проверку и отклонена модератором. * &#x60;MODERATED&#x60; — проверена и одобрена. * &#x60;NONMODERATED&#x60; — новая точка, нуждается в проверке. 
 */

#ifndef OAIOutletStatusType_H
#define OAIOutletStatusType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOutletStatusType : public OAIEnum {
public:
    OAIOutletStatusType();
    OAIOutletStatusType(QString json);
    ~OAIOutletStatusType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIOutletStatusType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        AT_MODERATION, 
        FAILED, 
        MODERATED, 
        NONMODERATED, 
        UNKNOWN
    };
    OAIOutletStatusType::eOAIOutletStatusType getValue() const;
    void setValue(const OAIOutletStatusType::eOAIOutletStatusType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIOutletStatusType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOutletStatusType)

#endif // OAIOutletStatusType_H
