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
 * OAISetOrderDeliveryTrackCodeRequest.h
 *
 * 
 */

#ifndef OAISetOrderDeliveryTrackCodeRequest_H
#define OAISetOrderDeliveryTrackCodeRequest_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAISetOrderDeliveryTrackCodeRequest : public OAIObject {
public:
    OAISetOrderDeliveryTrackCodeRequest();
    OAISetOrderDeliveryTrackCodeRequest(QString json);
    ~OAISetOrderDeliveryTrackCodeRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getTrackCode() const;
    void setTrackCode(const QString &track_code);
    bool is_track_code_Set() const;
    bool is_track_code_Valid() const;

    qint64 getDeliveryServiceId() const;
    void setDeliveryServiceId(const qint64 &delivery_service_id);
    bool is_delivery_service_id_Set() const;
    bool is_delivery_service_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_track_code;
    bool m_track_code_isSet;
    bool m_track_code_isValid;

    qint64 m_delivery_service_id;
    bool m_delivery_service_id_isSet;
    bool m_delivery_service_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAISetOrderDeliveryTrackCodeRequest)

#endif // OAISetOrderDeliveryTrackCodeRequest_H
