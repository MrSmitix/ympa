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
 * OAIOrderPaymentMethodType.h
 *
 * Способ оплаты заказа:  * Значения, если выбрана оплата при оформлении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;PREPAID\&quot;&#x60;):    * &#x60;YANDEX&#x60; — банковской картой.    * &#x60;APPLE_PAY&#x60; — Apple Pay.    * &#x60;GOOGLE_PAY&#x60; — Google Pay.    * &#x60;CREDIT&#x60; — в кредит.    * &#x60;TINKOFF_CREDIT&#x60; — в кредит в Тинькофф Банке.    * &#x60;TINKOFF_INSTALLMENTS&#x60; — рассрочка в Тинькофф Банке.    * &#x60;EXTERNAL_CERTIFICATE&#x60; — подарочным сертификатом (например, из приложения «Сбербанк Онлайн»).    * &#x60;SBP&#x60; — через систему быстрых платежей.    * &#x60;B2B_ACCOUNT_PREPAYMENT&#x60; — заказ оплачивает организация.   * Значения, если выбрана оплата при получении заказа (&#x60;\&quot;paymentType\&quot;: \&quot;POSTPAID\&quot;&#x60;):    * &#x60;CARD_ON_DELIVERY&#x60; — банковской картой.    * &#x60;BOUND_CARD_ON_DELIVERY&#x60; — привязанной картой при получении.    * &#x60;CASH_ON_DELIVERY&#x60; — наличными.    * &#x60;B2B_ACCOUNT_POSTPAYMENT&#x60; — заказ оплачивает организация после доставки.  * &#x60;UNKNOWN&#x60; — неизвестный тип.  Значение по умолчанию: &#x60;CASH_ON_DELIVERY&#x60;. 
 */

#ifndef OAIOrderPaymentMethodType_H
#define OAIOrderPaymentMethodType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOrderPaymentMethodType : public OAIEnum {
public:
    OAIOrderPaymentMethodType();
    OAIOrderPaymentMethodType(QString json);
    ~OAIOrderPaymentMethodType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIOrderPaymentMethodType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        CASH_ON_DELIVERY, 
        CARD_ON_DELIVERY, 
        BOUND_CARD_ON_DELIVERY, 
        YANDEX, 
        APPLE_PAY, 
        EXTERNAL_CERTIFICATE, 
        CREDIT, 
        GOOGLE_PAY, 
        TINKOFF_CREDIT, 
        SBP, 
        TINKOFF_INSTALLMENTS, 
        B2B_ACCOUNT_PREPAYMENT, 
        B2B_ACCOUNT_POSTPAYMENT, 
        UNKNOWN
    };
    OAIOrderPaymentMethodType::eOAIOrderPaymentMethodType getValue() const;
    void setValue(const OAIOrderPaymentMethodType::eOAIOrderPaymentMethodType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIOrderPaymentMethodType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOrderPaymentMethodType)

#endif // OAIOrderPaymentMethodType_H
