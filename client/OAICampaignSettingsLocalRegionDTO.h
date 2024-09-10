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
 * OAICampaignSettingsLocalRegionDTO.h
 *
 * Информация о своем регионе магазина.
 */

#ifndef OAICampaignSettingsLocalRegionDTO_H
#define OAICampaignSettingsLocalRegionDTO_H

#include <QJsonObject>

#include "OAICampaignSettingsDeliveryDTO.h"
#include "OAICampaignSettingsScheduleSourceType.h"
#include "OAIRegionType.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICampaignSettingsDeliveryDTO;

class OAICampaignSettingsLocalRegionDTO : public OAIObject {
public:
    OAICampaignSettingsLocalRegionDTO();
    OAICampaignSettingsLocalRegionDTO(QString json);
    ~OAICampaignSettingsLocalRegionDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getId() const;
    void setId(const qint64 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    OAIRegionType getType() const;
    void setType(const OAIRegionType &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    OAICampaignSettingsScheduleSourceType getDeliveryOptionsSource() const;
    void setDeliveryOptionsSource(const OAICampaignSettingsScheduleSourceType &delivery_options_source);
    bool is_delivery_options_source_Set() const;
    bool is_delivery_options_source_Valid() const;

    OAICampaignSettingsDeliveryDTO getDelivery() const;
    void setDelivery(const OAICampaignSettingsDeliveryDTO &delivery);
    bool is_delivery_Set() const;
    bool is_delivery_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString m_name;
    bool m_name_isSet;
    bool m_name_isValid;

    OAIRegionType m_type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAICampaignSettingsScheduleSourceType m_delivery_options_source;
    bool m_delivery_options_source_isSet;
    bool m_delivery_options_source_isValid;

    OAICampaignSettingsDeliveryDTO m_delivery;
    bool m_delivery_isSet;
    bool m_delivery_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICampaignSettingsLocalRegionDTO)

#endif // OAICampaignSettingsLocalRegionDTO_H
