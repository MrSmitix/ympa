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
 * OAIOrdersStatsOrderDTO.h
 *
 * Информация о заказе.
 */

#ifndef OAIOrdersStatsOrderDTO_H
#define OAIOrdersStatsOrderDTO_H

#include <QJsonObject>

#include "OAIOrderStatsStatusType.h"
#include "OAIOrdersStatsCommissionDTO.h"
#include "OAIOrdersStatsDeliveryRegionDTO.h"
#include "OAIOrdersStatsItemDTO.h"
#include "OAIOrdersStatsOrderPaymentType.h"
#include "OAIOrdersStatsPaymentDTO.h"
#include <QDate>
#include <QDateTime>
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOrdersStatsOrderDTO : public OAIObject {
public:
    OAIOrdersStatsOrderDTO();
    OAIOrdersStatsOrderDTO(QString json);
    ~OAIOrdersStatsOrderDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getId() const;
    void setId(const qint64 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QDate getCreationDate() const;
    void setCreationDate(const QDate &creation_date);
    bool is_creation_date_Set() const;
    bool is_creation_date_Valid() const;

    QDateTime getStatusUpdateDate() const;
    void setStatusUpdateDate(const QDateTime &status_update_date);
    bool is_status_update_date_Set() const;
    bool is_status_update_date_Valid() const;

    OAIOrderStatsStatusType getStatus() const;
    void setStatus(const OAIOrderStatsStatusType &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    QString getPartnerOrderId() const;
    void setPartnerOrderId(const QString &partner_order_id);
    bool is_partner_order_id_Set() const;
    bool is_partner_order_id_Valid() const;

    OAIOrdersStatsOrderPaymentType getPaymentType() const;
    void setPaymentType(const OAIOrdersStatsOrderPaymentType &payment_type);
    bool is_payment_type_Set() const;
    bool is_payment_type_Valid() const;

    bool isFake() const;
    void setFake(const bool &fake);
    bool is_fake_Set() const;
    bool is_fake_Valid() const;

    OAIOrdersStatsDeliveryRegionDTO getDeliveryRegion() const;
    void setDeliveryRegion(const OAIOrdersStatsDeliveryRegionDTO &delivery_region);
    bool is_delivery_region_Set() const;
    bool is_delivery_region_Valid() const;

    QList<OAIOrdersStatsItemDTO> getItems() const;
    void setItems(const QList<OAIOrdersStatsItemDTO> &items);
    bool is_items_Set() const;
    bool is_items_Valid() const;

    QList<OAIOrdersStatsItemDTO> getInitialItems() const;
    void setInitialItems(const QList<OAIOrdersStatsItemDTO> &initial_items);
    bool is_initial_items_Set() const;
    bool is_initial_items_Valid() const;

    QList<OAIOrdersStatsPaymentDTO> getPayments() const;
    void setPayments(const QList<OAIOrdersStatsPaymentDTO> &payments);
    bool is_payments_Set() const;
    bool is_payments_Valid() const;

    QList<OAIOrdersStatsCommissionDTO> getCommissions() const;
    void setCommissions(const QList<OAIOrdersStatsCommissionDTO> &commissions);
    bool is_commissions_Set() const;
    bool is_commissions_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 id;
    bool m_id_isSet;
    bool m_id_isValid;

    QDate creation_date;
    bool m_creation_date_isSet;
    bool m_creation_date_isValid;

    QDateTime status_update_date;
    bool m_status_update_date_isSet;
    bool m_status_update_date_isValid;

    OAIOrderStatsStatusType status;
    bool m_status_isSet;
    bool m_status_isValid;

    QString partner_order_id;
    bool m_partner_order_id_isSet;
    bool m_partner_order_id_isValid;

    OAIOrdersStatsOrderPaymentType payment_type;
    bool m_payment_type_isSet;
    bool m_payment_type_isValid;

    bool fake;
    bool m_fake_isSet;
    bool m_fake_isValid;

    OAIOrdersStatsDeliveryRegionDTO delivery_region;
    bool m_delivery_region_isSet;
    bool m_delivery_region_isValid;

    QList<OAIOrdersStatsItemDTO> items;
    bool m_items_isSet;
    bool m_items_isValid;

    QList<OAIOrdersStatsItemDTO> initial_items;
    bool m_initial_items_isSet;
    bool m_initial_items_isValid;

    QList<OAIOrdersStatsPaymentDTO> payments;
    bool m_payments_isSet;
    bool m_payments_isValid;

    QList<OAIOrdersStatsCommissionDTO> commissions;
    bool m_commissions_isSet;
    bool m_commissions_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOrdersStatsOrderDTO)

#endif // OAIOrdersStatsOrderDTO_H
