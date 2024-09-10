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
 * OAIDeliveryServicesDTO.h
 *
 * Информация о службах доставки.
 */

#ifndef OAIDeliveryServicesDTO_H
#define OAIDeliveryServicesDTO_H

#include <QJsonObject>

#include "OAIDeliveryServiceInfoDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIDeliveryServiceInfoDTO;

class OAIDeliveryServicesDTO : public OAIObject {
public:
    OAIDeliveryServicesDTO();
    OAIDeliveryServicesDTO(QString json);
    ~OAIDeliveryServicesDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIDeliveryServiceInfoDTO> getDeliveryService() const;
    void setDeliveryService(const QList<OAIDeliveryServiceInfoDTO> &delivery_service);
    bool is_delivery_service_Set() const;
    bool is_delivery_service_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIDeliveryServiceInfoDTO> m_delivery_service;
    bool m_delivery_service_isSet;
    bool m_delivery_service_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIDeliveryServicesDTO)

#endif // OAIDeliveryServicesDTO_H
