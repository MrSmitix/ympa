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
 * OAIChatMessageSenderType.h
 *
 * Кто отправил сообщение:  * &#x60;PARTNER&#x60; — магазин. * &#x60;CUSTOMER&#x60; — покупатель. * &#x60;MARKET&#x60; — Маркет. * &#x60;SUPPORT&#x60; — сотрудник службы поддержки Маркета. 
 */

#ifndef OAIChatMessageSenderType_H
#define OAIChatMessageSenderType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIChatMessageSenderType : public OAIEnum {
public:
    OAIChatMessageSenderType();
    OAIChatMessageSenderType(QString json);
    ~OAIChatMessageSenderType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIChatMessageSenderType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        PARTNER, 
        CUSTOMER, 
        MARKET, 
        SUPPORT
    };
    OAIChatMessageSenderType::eOAIChatMessageSenderType getValue() const;
    void setValue(const OAIChatMessageSenderType::eOAIChatMessageSenderType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIChatMessageSenderType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIChatMessageSenderType)

#endif // OAIChatMessageSenderType_H
