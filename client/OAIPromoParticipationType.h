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
 * OAIPromoParticipationType.h
 *
 * Какие акции вернутся:  * &#x60;PARTICIPATING_NOW&#x60; — текущие и будущие акции продавца.  * &#x60;PARTICIPATED&#x60; — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
 */

#ifndef OAIPromoParticipationType_H
#define OAIPromoParticipationType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIPromoParticipationType : public OAIEnum {
public:
    OAIPromoParticipationType();
    OAIPromoParticipationType(QString json);
    ~OAIPromoParticipationType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIPromoParticipationType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        PARTICIPATING_NOW, 
        PARTICIPATED
    };
    OAIPromoParticipationType::eOAIPromoParticipationType getValue() const;
    void setValue(const OAIPromoParticipationType::eOAIPromoParticipationType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIPromoParticipationType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIPromoParticipationType)

#endif // OAIPromoParticipationType_H
