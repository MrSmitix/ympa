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
 * OAIGenerateShipmentListDocumentReportRequest.h
 *
 * Данные, необходимые для генерации документа. 
 */

#ifndef OAIGenerateShipmentListDocumentReportRequest_H
#define OAIGenerateShipmentListDocumentReportRequest_H

#include <QJsonObject>

#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGenerateShipmentListDocumentReportRequest : public OAIObject {
public:
    OAIGenerateShipmentListDocumentReportRequest();
    OAIGenerateShipmentListDocumentReportRequest(QString json);
    ~OAIGenerateShipmentListDocumentReportRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getCampaignId() const;
    void setCampaignId(const qint64 &campaign_id);
    bool is_campaign_id_Set() const;
    bool is_campaign_id_Valid() const;

    qint64 getShipmentId() const;
    void setShipmentId(const qint64 &shipment_id);
    bool is_shipment_id_Set() const;
    bool is_shipment_id_Valid() const;

    QList<qint64> getOrderIds() const;
    void setOrderIds(const QList<qint64> &order_ids);
    bool is_order_ids_Set() const;
    bool is_order_ids_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 m_campaign_id;
    bool m_campaign_id_isSet;
    bool m_campaign_id_isValid;

    qint64 m_shipment_id;
    bool m_shipment_id_isSet;
    bool m_shipment_id_isValid;

    QList<qint64> m_order_ids;
    bool m_order_ids_isSet;
    bool m_order_ids_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGenerateShipmentListDocumentReportRequest)

#endif // OAIGenerateShipmentListDocumentReportRequest_H
