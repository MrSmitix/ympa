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
 * OAIReturnDTO.h
 *
 * Возврат заказа.
 */

#ifndef OAIReturnDTO_H
#define OAIReturnDTO_H

#include <QJsonObject>

#include "OAILogisticPickupPointDTO.h"
#include "OAIRecipientType.h"
#include "OAIRefundStatusType.h"
#include "OAIReturnItemDTO.h"
#include "OAIReturnShipmentStatusType.h"
#include "OAIReturnType.h"
#include <QDateTime>
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAILogisticPickupPointDTO;
class OAIReturnItemDTO;

class OAIReturnDTO : public OAIObject {
public:
    OAIReturnDTO();
    OAIReturnDTO(QString json);
    ~OAIReturnDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getId() const;
    void setId(const qint64 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    qint64 getOrderId() const;
    void setOrderId(const qint64 &order_id);
    bool is_order_id_Set() const;
    bool is_order_id_Valid() const;

    QDateTime getCreationDate() const;
    void setCreationDate(const QDateTime &creation_date);
    bool is_creation_date_Set() const;
    bool is_creation_date_Valid() const;

    QDateTime getUpdateDate() const;
    void setUpdateDate(const QDateTime &update_date);
    bool is_update_date_Set() const;
    bool is_update_date_Valid() const;

    OAIRefundStatusType getRefundStatus() const;
    void setRefundStatus(const OAIRefundStatusType &refund_status);
    bool is_refund_status_Set() const;
    bool is_refund_status_Valid() const;

    OAILogisticPickupPointDTO getLogisticPickupPoint() const;
    void setLogisticPickupPoint(const OAILogisticPickupPointDTO &logistic_pickup_point);
    bool is_logistic_pickup_point_Set() const;
    bool is_logistic_pickup_point_Valid() const;

    OAIRecipientType getShipmentRecipientType() const;
    void setShipmentRecipientType(const OAIRecipientType &shipment_recipient_type);
    bool is_shipment_recipient_type_Set() const;
    bool is_shipment_recipient_type_Valid() const;

    OAIReturnShipmentStatusType getShipmentStatus() const;
    void setShipmentStatus(const OAIReturnShipmentStatusType &shipment_status);
    bool is_shipment_status_Set() const;
    bool is_shipment_status_Valid() const;

    qint64 getRefundAmount() const;
    void setRefundAmount(const qint64 &refund_amount);
    bool is_refund_amount_Set() const;
    bool is_refund_amount_Valid() const;

    QList<OAIReturnItemDTO> getItems() const;
    void setItems(const QList<OAIReturnItemDTO> &items);
    bool is_items_Set() const;
    bool is_items_Valid() const;

    OAIReturnType getReturnType() const;
    void setReturnType(const OAIReturnType &return_type);
    bool is_return_type_Set() const;
    bool is_return_type_Valid() const;

    bool isFastReturn() const;
    void setFastReturn(const bool &fast_return);
    bool is_fast_return_Set() const;
    bool is_fast_return_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    qint64 m_order_id;
    bool m_order_id_isSet;
    bool m_order_id_isValid;

    QDateTime m_creation_date;
    bool m_creation_date_isSet;
    bool m_creation_date_isValid;

    QDateTime m_update_date;
    bool m_update_date_isSet;
    bool m_update_date_isValid;

    OAIRefundStatusType m_refund_status;
    bool m_refund_status_isSet;
    bool m_refund_status_isValid;

    OAILogisticPickupPointDTO m_logistic_pickup_point;
    bool m_logistic_pickup_point_isSet;
    bool m_logistic_pickup_point_isValid;

    OAIRecipientType m_shipment_recipient_type;
    bool m_shipment_recipient_type_isSet;
    bool m_shipment_recipient_type_isValid;

    OAIReturnShipmentStatusType m_shipment_status;
    bool m_shipment_status_isSet;
    bool m_shipment_status_isValid;

    qint64 m_refund_amount;
    bool m_refund_amount_isSet;
    bool m_refund_amount_isValid;

    QList<OAIReturnItemDTO> m_items;
    bool m_items_isSet;
    bool m_items_isValid;

    OAIReturnType m_return_type;
    bool m_return_type_isSet;
    bool m_return_type_isValid;

    bool m_fast_return;
    bool m_fast_return_isSet;
    bool m_fast_return_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIReturnDTO)

#endif // OAIReturnDTO_H
