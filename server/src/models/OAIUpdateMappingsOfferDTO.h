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
 * OAIUpdateMappingsOfferDTO.h
 *
 * Информация о товарах в каталоге.
 */

#ifndef OAIUpdateMappingsOfferDTO_H
#define OAIUpdateMappingsOfferDTO_H

#include <QJsonObject>

#include "OAIDayOfWeekType.h"
#include "OAIOfferAvailabilityStatusType.h"
#include "OAIOfferProcessingStateDTO.h"
#include "OAIOfferWeightDimensionsDTO.h"
#include "OAITimePeriodDTO.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIUpdateMappingsOfferDTO : public OAIObject {
public:
    OAIUpdateMappingsOfferDTO();
    OAIUpdateMappingsOfferDTO(QString json);
    ~OAIUpdateMappingsOfferDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getShopSku() const;
    void setShopSku(const QString &shop_sku);
    bool is_shop_sku_Set() const;
    bool is_shop_sku_Valid() const;

    QString getCategory() const;
    void setCategory(const QString &category);
    bool is_category_Set() const;
    bool is_category_Valid() const;

    QString getVendor() const;
    void setVendor(const QString &vendor);
    bool is_vendor_Set() const;
    bool is_vendor_Valid() const;

    QString getVendorCode() const;
    void setVendorCode(const QString &vendor_code);
    bool is_vendor_code_Set() const;
    bool is_vendor_code_Valid() const;

    QString getDescription() const;
    void setDescription(const QString &description);
    bool is_description_Set() const;
    bool is_description_Valid() const;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    qint64 getFeedId() const;
    void setFeedId(const qint64 &feed_id);
    bool is_feed_id_Set() const;
    bool is_feed_id_Valid() const;

    QList<QString> getBarcodes() const;
    void setBarcodes(const QList<QString> &barcodes);
    bool is_barcodes_Set() const;
    bool is_barcodes_Valid() const;

    QList<QString> getUrls() const;
    void setUrls(const QList<QString> &urls);
    bool is_urls_Set() const;
    bool is_urls_Valid() const;

    QList<QString> getPictures() const;
    void setPictures(const QList<QString> &pictures);
    bool is_pictures_Set() const;
    bool is_pictures_Valid() const;

    QString getManufacturer() const;
    void setManufacturer(const QString &manufacturer);
    bool is_manufacturer_Set() const;
    bool is_manufacturer_Valid() const;

    QList<QString> getManufacturerCountries() const;
    void setManufacturerCountries(const QList<QString> &manufacturer_countries);
    bool is_manufacturer_countries_Set() const;
    bool is_manufacturer_countries_Valid() const;

    qint32 getMinShipment() const;
    void setMinShipment(const qint32 &min_shipment);
    bool is_min_shipment_Set() const;
    bool is_min_shipment_Valid() const;

    qint32 getTransportUnitSize() const;
    void setTransportUnitSize(const qint32 &transport_unit_size);
    bool is_transport_unit_size_Set() const;
    bool is_transport_unit_size_Valid() const;

    qint32 getQuantumOfSupply() const;
    void setQuantumOfSupply(const qint32 &quantum_of_supply);
    bool is_quantum_of_supply_Set() const;
    bool is_quantum_of_supply_Valid() const;

    qint32 getDeliveryDurationDays() const;
    void setDeliveryDurationDays(const qint32 &delivery_duration_days);
    bool is_delivery_duration_days_Set() const;
    bool is_delivery_duration_days_Valid() const;

    qint32 getBoxCount() const;
    void setBoxCount(const qint32 &box_count);
    bool is_box_count_Set() const;
    bool is_box_count_Valid() const;

    QList<QString> getCustomsCommodityCodes() const;
    void setCustomsCommodityCodes(const QList<QString> &customs_commodity_codes);
    bool is_customs_commodity_codes_Set() const;
    bool is_customs_commodity_codes_Valid() const;

    OAIOfferWeightDimensionsDTO getWeightDimensions() const;
    void setWeightDimensions(const OAIOfferWeightDimensionsDTO &weight_dimensions);
    bool is_weight_dimensions_Set() const;
    bool is_weight_dimensions_Valid() const;

    QList<OAIDayOfWeekType> getSupplyScheduleDays() const;
    void setSupplyScheduleDays(const QList<OAIDayOfWeekType> &supply_schedule_days);
    bool is_supply_schedule_days_Set() const;
    bool is_supply_schedule_days_Valid() const;

    qint32 getShelfLifeDays() const;
    void setShelfLifeDays(const qint32 &shelf_life_days);
    bool is_shelf_life_days_Set() const;
    bool is_shelf_life_days_Valid() const;

    qint32 getLifeTimeDays() const;
    void setLifeTimeDays(const qint32 &life_time_days);
    bool is_life_time_days_Set() const;
    bool is_life_time_days_Valid() const;

    qint32 getGuaranteePeriodDays() const;
    void setGuaranteePeriodDays(const qint32 &guarantee_period_days);
    bool is_guarantee_period_days_Set() const;
    bool is_guarantee_period_days_Valid() const;

    OAIOfferProcessingStateDTO getProcessingState() const;
    void setProcessingState(const OAIOfferProcessingStateDTO &processing_state);
    bool is_processing_state_Set() const;
    bool is_processing_state_Valid() const;

    OAIOfferAvailabilityStatusType getAvailability() const;
    void setAvailability(const OAIOfferAvailabilityStatusType &availability);
    bool is_availability_Set() const;
    bool is_availability_Valid() const;

    OAITimePeriodDTO getShelfLife() const;
    void setShelfLife(const OAITimePeriodDTO &shelf_life);
    bool is_shelf_life_Set() const;
    bool is_shelf_life_Valid() const;

    OAITimePeriodDTO getLifeTime() const;
    void setLifeTime(const OAITimePeriodDTO &life_time);
    bool is_life_time_Set() const;
    bool is_life_time_Valid() const;

    OAITimePeriodDTO getGuaranteePeriod() const;
    void setGuaranteePeriod(const OAITimePeriodDTO &guarantee_period);
    bool is_guarantee_period_Set() const;
    bool is_guarantee_period_Valid() const;

    QString getCertificate() const;
    void setCertificate(const QString &certificate);
    bool is_certificate_Set() const;
    bool is_certificate_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString shop_sku;
    bool m_shop_sku_isSet;
    bool m_shop_sku_isValid;

    QString category;
    bool m_category_isSet;
    bool m_category_isValid;

    QString vendor;
    bool m_vendor_isSet;
    bool m_vendor_isValid;

    QString vendor_code;
    bool m_vendor_code_isSet;
    bool m_vendor_code_isValid;

    QString description;
    bool m_description_isSet;
    bool m_description_isValid;

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    qint64 feed_id;
    bool m_feed_id_isSet;
    bool m_feed_id_isValid;

    QList<QString> barcodes;
    bool m_barcodes_isSet;
    bool m_barcodes_isValid;

    QList<QString> urls;
    bool m_urls_isSet;
    bool m_urls_isValid;

    QList<QString> pictures;
    bool m_pictures_isSet;
    bool m_pictures_isValid;

    QString manufacturer;
    bool m_manufacturer_isSet;
    bool m_manufacturer_isValid;

    QList<QString> manufacturer_countries;
    bool m_manufacturer_countries_isSet;
    bool m_manufacturer_countries_isValid;

    qint32 min_shipment;
    bool m_min_shipment_isSet;
    bool m_min_shipment_isValid;

    qint32 transport_unit_size;
    bool m_transport_unit_size_isSet;
    bool m_transport_unit_size_isValid;

    qint32 quantum_of_supply;
    bool m_quantum_of_supply_isSet;
    bool m_quantum_of_supply_isValid;

    qint32 delivery_duration_days;
    bool m_delivery_duration_days_isSet;
    bool m_delivery_duration_days_isValid;

    qint32 box_count;
    bool m_box_count_isSet;
    bool m_box_count_isValid;

    QList<QString> customs_commodity_codes;
    bool m_customs_commodity_codes_isSet;
    bool m_customs_commodity_codes_isValid;

    OAIOfferWeightDimensionsDTO weight_dimensions;
    bool m_weight_dimensions_isSet;
    bool m_weight_dimensions_isValid;

    QList<OAIDayOfWeekType> supply_schedule_days;
    bool m_supply_schedule_days_isSet;
    bool m_supply_schedule_days_isValid;

    qint32 shelf_life_days;
    bool m_shelf_life_days_isSet;
    bool m_shelf_life_days_isValid;

    qint32 life_time_days;
    bool m_life_time_days_isSet;
    bool m_life_time_days_isValid;

    qint32 guarantee_period_days;
    bool m_guarantee_period_days_isSet;
    bool m_guarantee_period_days_isValid;

    OAIOfferProcessingStateDTO processing_state;
    bool m_processing_state_isSet;
    bool m_processing_state_isValid;

    OAIOfferAvailabilityStatusType availability;
    bool m_availability_isSet;
    bool m_availability_isValid;

    OAITimePeriodDTO shelf_life;
    bool m_shelf_life_isSet;
    bool m_shelf_life_isValid;

    OAITimePeriodDTO life_time;
    bool m_life_time_isSet;
    bool m_life_time_isValid;

    OAITimePeriodDTO guarantee_period;
    bool m_guarantee_period_isSet;
    bool m_guarantee_period_isValid;

    QString certificate;
    bool m_certificate_isSet;
    bool m_certificate_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIUpdateMappingsOfferDTO)

#endif // OAIUpdateMappingsOfferDTO_H
