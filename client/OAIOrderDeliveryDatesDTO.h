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
 * OAIOrderDeliveryDatesDTO.h
 *
 * Диапазон дат доставки.
 */

#ifndef OAIOrderDeliveryDatesDTO_H
#define OAIOrderDeliveryDatesDTO_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOrderDeliveryDatesDTO : public OAIObject {
public:
    OAIOrderDeliveryDatesDTO();
    OAIOrderDeliveryDatesDTO(QString json);
    ~OAIOrderDeliveryDatesDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getFromDate() const;
    void setFromDate(const QString &from_date);
    bool is_from_date_Set() const;
    bool is_from_date_Valid() const;

    QString getToDate() const;
    void setToDate(const QString &to_date);
    bool is_to_date_Set() const;
    bool is_to_date_Valid() const;

    QString getFromTime() const;
    void setFromTime(const QString &from_time);
    bool is_from_time_Set() const;
    bool is_from_time_Valid() const;

    QString getToTime() const;
    void setToTime(const QString &to_time);
    bool is_to_time_Set() const;
    bool is_to_time_Valid() const;

    QString getRealDeliveryDate() const;
    void setRealDeliveryDate(const QString &real_delivery_date);
    bool is_real_delivery_date_Set() const;
    bool is_real_delivery_date_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_from_date;
    bool m_from_date_isSet;
    bool m_from_date_isValid;

    QString m_to_date;
    bool m_to_date_isSet;
    bool m_to_date_isValid;

    QString m_from_time;
    bool m_from_time_isSet;
    bool m_from_time_isValid;

    QString m_to_time;
    bool m_to_time_isSet;
    bool m_to_time_isValid;

    QString m_real_delivery_date;
    bool m_real_delivery_date_isSet;
    bool m_real_delivery_date_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOrderDeliveryDatesDTO)

#endif // OAIOrderDeliveryDatesDTO_H
