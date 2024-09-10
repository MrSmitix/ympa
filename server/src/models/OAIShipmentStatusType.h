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
 * OAIShipmentStatusType.h
 *
 * Статус отгрузки:  * &#x60;OUTBOUND_CREATED&#x60; — формируется. * &#x60;OUTBOUND_READY_FOR_CONFIRMATION&#x60; — можно обрабатывать. * &#x60;OUTBOUND_CONFIRMED&#x60; — подтверждена и готова к отправке. * &#x60;OUTBOUND_SIGNED&#x60; — по ней подписан электронный акт приема-передачи. * &#x60;ACCEPTED&#x60; — принята в сортировочном центре или пункте приема. * &#x60;ACCEPTED_WITH_DISCREPANCIES&#x60; — принята с расхождениями. * &#x60;FINISHED&#x60; — завершена. * &#x60;ERROR&#x60; — отменена из-за ошибки. 
 */

#ifndef OAIShipmentStatusType_H
#define OAIShipmentStatusType_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIShipmentStatusType : public OAIEnum {
public:
    OAIShipmentStatusType();
    OAIShipmentStatusType(QString json);
    ~OAIShipmentStatusType() override;

    QString asJson() const override;
    QJsonValue asJsonValue() const override;
    void fromJsonValue(QJsonValue json) override;
    void fromJson(QString jsonString) override;

    enum class eOAIShipmentStatusType {
        INVALID_VALUE_OPENAPI_GENERATED = 0,
        OUTBOUND_CREATED, 
        OUTBOUND_READY_FOR_CONFIRMATION, 
        OUTBOUND_CONFIRMED, 
        OUTBOUND_SIGNED, 
        FINISHED, 
        ACCEPTED, 
        ACCEPTED_WITH_DISCREPANCIES, 
        ERROR
    };
    OAIShipmentStatusType::eOAIShipmentStatusType getValue() const;
    void setValue(const OAIShipmentStatusType::eOAIShipmentStatusType& value);
    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    eOAIShipmentStatusType m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIShipmentStatusType)

#endif // OAIShipmentStatusType_H
