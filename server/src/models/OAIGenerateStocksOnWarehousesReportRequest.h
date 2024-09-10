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
 * OAIGenerateStocksOnWarehousesReportRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef OAIGenerateStocksOnWarehousesReportRequest_H
#define OAIGenerateStocksOnWarehousesReportRequest_H

#include <QJsonObject>

#include <QDate>
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGenerateStocksOnWarehousesReportRequest : public OAIObject {
public:
    OAIGenerateStocksOnWarehousesReportRequest();
    OAIGenerateStocksOnWarehousesReportRequest(QString json);
    ~OAIGenerateStocksOnWarehousesReportRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getCampaignId() const;
    void setCampaignId(const qint64 &campaign_id);
    bool is_campaign_id_Set() const;
    bool is_campaign_id_Valid() const;

    QList<qint64> getWarehouseIds() const;
    void setWarehouseIds(const QList<qint64> &warehouse_ids);
    bool is_warehouse_ids_Set() const;
    bool is_warehouse_ids_Valid() const;

    QDate getReportDate() const;
    void setReportDate(const QDate &report_date);
    bool is_report_date_Set() const;
    bool is_report_date_Valid() const;

    QList<qint64> getCategoryIds() const;
    void setCategoryIds(const QList<qint64> &category_ids);
    bool is_category_ids_Set() const;
    bool is_category_ids_Valid() const;

    bool isHasStocks() const;
    void setHasStocks(const bool &has_stocks);
    bool is_has_stocks_Set() const;
    bool is_has_stocks_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 campaign_id;
    bool m_campaign_id_isSet;
    bool m_campaign_id_isValid;

    QList<qint64> warehouse_ids;
    bool m_warehouse_ids_isSet;
    bool m_warehouse_ids_isValid;

    QDate report_date;
    bool m_report_date_isSet;
    bool m_report_date_isValid;

    QList<qint64> category_ids;
    bool m_category_ids_isSet;
    bool m_category_ids_isValid;

    bool has_stocks;
    bool m_has_stocks_isSet;
    bool m_has_stocks_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGenerateStocksOnWarehousesReportRequest)

#endif // OAIGenerateStocksOnWarehousesReportRequest_H
