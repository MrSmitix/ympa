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
 * OAILicenseCheckStatusType.h
 *
 * Статус проверки лицензии:  * &#x60;NEW&#x60; — лицензия проверяется. * &#x60;SUCCESS&#x60; — лицензия прошла проверку. * &#x60;FAIL&#x60; — лицензия не прошла проверку. 
 */

#ifndef OAILicenseCheckStatusType_H
#define OAILicenseCheckStatusType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAILicenseCheckStatusType : public OAIEnum {
public:
    OAILicenseCheckStatusType();
    OAILicenseCheckStatusType(QString json);
    ~OAILicenseCheckStatusType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAILicenseCheckStatusType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        NEW, 
        SUCCESS, 
        FAIL, 
        REVOKE, 
        DONT_WANT, 
        FAIL_MANUAL
    };
    OAILicenseCheckStatusType::eOAILicenseCheckStatusType getValue() const;
    void setValue(const OAILicenseCheckStatusType::eOAILicenseCheckStatusType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAILicenseCheckStatusType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAILicenseCheckStatusType)

#endif // OAILicenseCheckStatusType_H
