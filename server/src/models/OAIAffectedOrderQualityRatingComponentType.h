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
 * OAIAffectedOrderQualityRatingComponentType.h
 *
 * Составляющие индекса качества.  **Для модели DBS:** * &#x60;DBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;DBS_LATE_DELIVERY_RATE&#x60; — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * &#x60;FBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;FBS_LATE_SHIP_RATE&#x60; — доля не вовремя отгруженных заказов. 
 */

#ifndef OAIAffectedOrderQualityRatingComponentType_H
#define OAIAffectedOrderQualityRatingComponentType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAffectedOrderQualityRatingComponentType : public OAIEnum {
public:
    OAIAffectedOrderQualityRatingComponentType();
    OAIAffectedOrderQualityRatingComponentType(QString json);
    ~OAIAffectedOrderQualityRatingComponentType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIAffectedOrderQualityRatingComponentType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        DBS_CANCELLATION_RATE, 
        DBS_LATE_DELIVERY_RATE, 
        FBS_CANCELLATION_RATE, 
        FBS_LATE_SHIP_RATE
    };
    OAIAffectedOrderQualityRatingComponentType::eOAIAffectedOrderQualityRatingComponentType getValue() const;
    void setValue(const OAIAffectedOrderQualityRatingComponentType::eOAIAffectedOrderQualityRatingComponentType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIAffectedOrderQualityRatingComponentType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAffectedOrderQualityRatingComponentType)

#endif // OAIAffectedOrderQualityRatingComponentType_H
