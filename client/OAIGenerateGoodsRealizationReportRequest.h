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
 * OAIGenerateGoodsRealizationReportRequest.h
 *
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 */

#ifndef OAIGenerateGoodsRealizationReportRequest_H
#define OAIGenerateGoodsRealizationReportRequest_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGenerateGoodsRealizationReportRequest : public OAIObject {
public:
    OAIGenerateGoodsRealizationReportRequest();
    OAIGenerateGoodsRealizationReportRequest(QString json);
    ~OAIGenerateGoodsRealizationReportRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getCampaignId() const;
    void setCampaignId(const qint64 &campaign_id);
    bool is_campaign_id_Set() const;
    bool is_campaign_id_Valid() const;

    qint32 getYear() const;
    void setYear(const qint32 &year);
    bool is_year_Set() const;
    bool is_year_Valid() const;

    qint32 getMonth() const;
    void setMonth(const qint32 &month);
    bool is_month_Set() const;
    bool is_month_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 m_campaign_id;
    bool m_campaign_id_isSet;
    bool m_campaign_id_isValid;

    qint32 m_year;
    bool m_year_isSet;
    bool m_year_isValid;

    qint32 m_month;
    bool m_month_isSet;
    bool m_month_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGenerateGoodsRealizationReportRequest)

#endif // OAIGenerateGoodsRealizationReportRequest_H
