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
 * OAIShipmentPalletLabelPageFormatType.h
 *
 * Формат страницы: * &#x60;A4&#x60; — формат страницы A4. * &#x60;A8&#x60; — формат страницы A8. 
 */

#ifndef OAIShipmentPalletLabelPageFormatType_H
#define OAIShipmentPalletLabelPageFormatType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIShipmentPalletLabelPageFormatType : public OAIEnum {
public:
    OAIShipmentPalletLabelPageFormatType();
    OAIShipmentPalletLabelPageFormatType(QString json);
    ~OAIShipmentPalletLabelPageFormatType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIShipmentPalletLabelPageFormatType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        A4, 
        A8
    };
    OAIShipmentPalletLabelPageFormatType::eOAIShipmentPalletLabelPageFormatType getValue() const;
    void setValue(const OAIShipmentPalletLabelPageFormatType::eOAIShipmentPalletLabelPageFormatType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIShipmentPalletLabelPageFormatType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIShipmentPalletLabelPageFormatType)

#endif // OAIShipmentPalletLabelPageFormatType_H
