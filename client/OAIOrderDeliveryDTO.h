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
 * OAIOrderDeliveryDTO.h
 *
 * Информация о доставке.
 */

#ifndef OAIOrderDeliveryDTO_H
#define OAIOrderDeliveryDTO_H

#include <QJsonObject>

#include "OAIOrderCourierDTO.h"
#include "OAIOrderDeliveryAddressDTO.h"
#include "OAIOrderDeliveryDatesDTO.h"
#include "OAIOrderDeliveryDispatchType.h"
#include "OAIOrderDeliveryEacType.h"
#include "OAIOrderDeliveryPartnerType.h"
#include "OAIOrderDeliveryType.h"
#include "OAIOrderLiftType.h"
#include "OAIOrderShipmentDTO.h"
#include "OAIOrderTrackDTO.h"
#include "OAIOrderVatType.h"
#include "OAIRegionDTO.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIOrderCourierDTO;
class OAIOrderDeliveryDatesDTO;
class OAIRegionDTO;
class OAIOrderDeliveryAddressDTO;
class OAIOrderTrackDTO;
class OAIOrderShipmentDTO;

class OAIOrderDeliveryDTO : public OAIObject {
public:
    OAIOrderDeliveryDTO();
    OAIOrderDeliveryDTO(QString json);
    ~OAIOrderDeliveryDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    OAIOrderDeliveryType getType() const;
    void setType(const OAIOrderDeliveryType &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    QString getServiceName() const;
    void setServiceName(const QString &service_name);
    bool is_service_name_Set() const;
    bool is_service_name_Valid() const;

    Q_DECL_DEPRECATED double getPrice() const;
    Q_DECL_DEPRECATED void setPrice(const double &price);
    Q_DECL_DEPRECATED bool is_price_Set() const;
    Q_DECL_DEPRECATED bool is_price_Valid() const;

    OAIOrderDeliveryPartnerType getDeliveryPartnerType() const;
    void setDeliveryPartnerType(const OAIOrderDeliveryPartnerType &delivery_partner_type);
    bool is_delivery_partner_type_Set() const;
    bool is_delivery_partner_type_Valid() const;

    OAIOrderCourierDTO getCourier() const;
    void setCourier(const OAIOrderCourierDTO &courier);
    bool is_courier_Set() const;
    bool is_courier_Valid() const;

    OAIOrderDeliveryDatesDTO getDates() const;
    void setDates(const OAIOrderDeliveryDatesDTO &dates);
    bool is_dates_Set() const;
    bool is_dates_Valid() const;

    OAIRegionDTO getRegion() const;
    void setRegion(const OAIRegionDTO &region);
    bool is_region_Set() const;
    bool is_region_Valid() const;

    OAIOrderDeliveryAddressDTO getAddress() const;
    void setAddress(const OAIOrderDeliveryAddressDTO &address);
    bool is_address_Set() const;
    bool is_address_Valid() const;

    OAIOrderVatType getVat() const;
    void setVat(const OAIOrderVatType &vat);
    bool is_vat_Set() const;
    bool is_vat_Valid() const;

    qint64 getDeliveryServiceId() const;
    void setDeliveryServiceId(const qint64 &delivery_service_id);
    bool is_delivery_service_id_Set() const;
    bool is_delivery_service_id_Valid() const;

    OAIOrderLiftType getLiftType() const;
    void setLiftType(const OAIOrderLiftType &lift_type);
    bool is_lift_type_Set() const;
    bool is_lift_type_Valid() const;

    double getLiftPrice() const;
    void setLiftPrice(const double &lift_price);
    bool is_lift_price_Set() const;
    bool is_lift_price_Valid() const;

    QString getOutletCode() const;
    void setOutletCode(const QString &outlet_code);
    bool is_outlet_code_Set() const;
    bool is_outlet_code_Valid() const;

    QString getOutletStorageLimitDate() const;
    void setOutletStorageLimitDate(const QString &outlet_storage_limit_date);
    bool is_outlet_storage_limit_date_Set() const;
    bool is_outlet_storage_limit_date_Valid() const;

    OAIOrderDeliveryDispatchType getDispatchType() const;
    void setDispatchType(const OAIOrderDeliveryDispatchType &dispatch_type);
    bool is_dispatch_type_Set() const;
    bool is_dispatch_type_Valid() const;

    QList<OAIOrderTrackDTO> getTracks() const;
    void setTracks(const QList<OAIOrderTrackDTO> &tracks);
    bool is_tracks_Set() const;
    bool is_tracks_Valid() const;

    QList<OAIOrderShipmentDTO> getShipments() const;
    void setShipments(const QList<OAIOrderShipmentDTO> &shipments);
    bool is_shipments_Set() const;
    bool is_shipments_Valid() const;

    bool isEstimated() const;
    void setEstimated(const bool &estimated);
    bool is_estimated_Set() const;
    bool is_estimated_Valid() const;

    OAIOrderDeliveryEacType getEacType() const;
    void setEacType(const OAIOrderDeliveryEacType &eac_type);
    bool is_eac_type_Set() const;
    bool is_eac_type_Valid() const;

    QString getEacCode() const;
    void setEacCode(const QString &eac_code);
    bool is_eac_code_Set() const;
    bool is_eac_code_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    OAIOrderDeliveryType m_type;
    bool m_type_isSet;
    bool m_type_isValid;

    QString m_service_name;
    bool m_service_name_isSet;
    bool m_service_name_isValid;

    double m_price;
    bool m_price_isSet;
    bool m_price_isValid;

    OAIOrderDeliveryPartnerType m_delivery_partner_type;
    bool m_delivery_partner_type_isSet;
    bool m_delivery_partner_type_isValid;

    OAIOrderCourierDTO m_courier;
    bool m_courier_isSet;
    bool m_courier_isValid;

    OAIOrderDeliveryDatesDTO m_dates;
    bool m_dates_isSet;
    bool m_dates_isValid;

    OAIRegionDTO m_region;
    bool m_region_isSet;
    bool m_region_isValid;

    OAIOrderDeliveryAddressDTO m_address;
    bool m_address_isSet;
    bool m_address_isValid;

    OAIOrderVatType m_vat;
    bool m_vat_isSet;
    bool m_vat_isValid;

    qint64 m_delivery_service_id;
    bool m_delivery_service_id_isSet;
    bool m_delivery_service_id_isValid;

    OAIOrderLiftType m_lift_type;
    bool m_lift_type_isSet;
    bool m_lift_type_isValid;

    double m_lift_price;
    bool m_lift_price_isSet;
    bool m_lift_price_isValid;

    QString m_outlet_code;
    bool m_outlet_code_isSet;
    bool m_outlet_code_isValid;

    QString m_outlet_storage_limit_date;
    bool m_outlet_storage_limit_date_isSet;
    bool m_outlet_storage_limit_date_isValid;

    OAIOrderDeliveryDispatchType m_dispatch_type;
    bool m_dispatch_type_isSet;
    bool m_dispatch_type_isValid;

    QList<OAIOrderTrackDTO> m_tracks;
    bool m_tracks_isSet;
    bool m_tracks_isValid;

    QList<OAIOrderShipmentDTO> m_shipments;
    bool m_shipments_isSet;
    bool m_shipments_isValid;

    bool m_estimated;
    bool m_estimated_isSet;
    bool m_estimated_isValid;

    OAIOrderDeliveryEacType m_eac_type;
    bool m_eac_type_isSet;
    bool m_eac_type_isValid;

    QString m_eac_code;
    bool m_eac_code_isSet;
    bool m_eac_code_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOrderDeliveryDTO)

#endif // OAIOrderDeliveryDTO_H
