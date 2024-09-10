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
 * OAIFullOutletDTO.h
 *
 * Информация о точке продаж.
 */

#ifndef OAIFullOutletDTO_H
#define OAIFullOutletDTO_H

#include <QJsonObject>

#include "OAIOutletAddressDTO.h"
#include "OAIOutletDeliveryRuleDTO.h"
#include "OAIOutletStatusType.h"
#include "OAIOutletType.h"
#include "OAIOutletVisibilityType.h"
#include "OAIOutletWorkingScheduleDTO.h"
#include "OAIRegionDTO.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIFullOutletDTO : public OAIObject {
public:
    OAIFullOutletDTO();
    OAIFullOutletDTO(QString json);
    ~OAIFullOutletDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    OAIOutletType getType() const;
    void setType(const OAIOutletType &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    QString getCoords() const;
    void setCoords(const QString &coords);
    bool is_coords_Set() const;
    bool is_coords_Valid() const;

    bool isIsMain() const;
    void setIsMain(const bool &is_main);
    bool is_is_main_Set() const;
    bool is_is_main_Valid() const;

    QString getShopOutletCode() const;
    void setShopOutletCode(const QString &shop_outlet_code);
    bool is_shop_outlet_code_Set() const;
    bool is_shop_outlet_code_Valid() const;

    OAIOutletVisibilityType getVisibility() const;
    void setVisibility(const OAIOutletVisibilityType &visibility);
    bool is_visibility_Set() const;
    bool is_visibility_Valid() const;

    OAIOutletAddressDTO getAddress() const;
    void setAddress(const OAIOutletAddressDTO &address);
    bool is_address_Set() const;
    bool is_address_Valid() const;

    QList<QString> getPhones() const;
    void setPhones(const QList<QString> &phones);
    bool is_phones_Set() const;
    bool is_phones_Valid() const;

    OAIOutletWorkingScheduleDTO getWorkingSchedule() const;
    void setWorkingSchedule(const OAIOutletWorkingScheduleDTO &working_schedule);
    bool is_working_schedule_Set() const;
    bool is_working_schedule_Valid() const;

    QList<OAIOutletDeliveryRuleDTO> getDeliveryRules() const;
    void setDeliveryRules(const QList<OAIOutletDeliveryRuleDTO> &delivery_rules);
    bool is_delivery_rules_Set() const;
    bool is_delivery_rules_Valid() const;

    qint64 getStoragePeriod() const;
    void setStoragePeriod(const qint64 &storage_period);
    bool is_storage_period_Set() const;
    bool is_storage_period_Valid() const;

    qint64 getId() const;
    void setId(const qint64 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    OAIOutletStatusType getStatus() const;
    void setStatus(const OAIOutletStatusType &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    OAIRegionDTO getRegion() const;
    void setRegion(const OAIRegionDTO &region);
    bool is_region_Set() const;
    bool is_region_Valid() const;

    QString getShopOutletId() const;
    void setShopOutletId(const QString &shop_outlet_id);
    bool is_shop_outlet_id_Set() const;
    bool is_shop_outlet_id_Valid() const;

    QString getWorkingTime() const;
    void setWorkingTime(const QString &working_time);
    bool is_working_time_Set() const;
    bool is_working_time_Valid() const;

    QString getModerationReason() const;
    void setModerationReason(const QString &moderation_reason);
    bool is_moderation_reason_Set() const;
    bool is_moderation_reason_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    OAIOutletType type;
    bool m_type_isSet;
    bool m_type_isValid;

    QString coords;
    bool m_coords_isSet;
    bool m_coords_isValid;

    bool is_main;
    bool m_is_main_isSet;
    bool m_is_main_isValid;

    QString shop_outlet_code;
    bool m_shop_outlet_code_isSet;
    bool m_shop_outlet_code_isValid;

    OAIOutletVisibilityType visibility;
    bool m_visibility_isSet;
    bool m_visibility_isValid;

    OAIOutletAddressDTO address;
    bool m_address_isSet;
    bool m_address_isValid;

    QList<QString> phones;
    bool m_phones_isSet;
    bool m_phones_isValid;

    OAIOutletWorkingScheduleDTO working_schedule;
    bool m_working_schedule_isSet;
    bool m_working_schedule_isValid;

    QList<OAIOutletDeliveryRuleDTO> delivery_rules;
    bool m_delivery_rules_isSet;
    bool m_delivery_rules_isValid;

    qint64 storage_period;
    bool m_storage_period_isSet;
    bool m_storage_period_isValid;

    qint64 id;
    bool m_id_isSet;
    bool m_id_isValid;

    OAIOutletStatusType status;
    bool m_status_isSet;
    bool m_status_isValid;

    OAIRegionDTO region;
    bool m_region_isSet;
    bool m_region_isValid;

    QString shop_outlet_id;
    bool m_shop_outlet_id_isSet;
    bool m_shop_outlet_id_isValid;

    QString working_time;
    bool m_working_time_isSet;
    bool m_working_time_isValid;

    QString moderation_reason;
    bool m_moderation_reason_isSet;
    bool m_moderation_reason_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIFullOutletDTO)

#endif // OAIFullOutletDTO_H
