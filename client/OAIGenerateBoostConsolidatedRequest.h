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
 * OAIGenerateBoostConsolidatedRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef OAIGenerateBoostConsolidatedRequest_H
#define OAIGenerateBoostConsolidatedRequest_H

#include <QJsonObject>

#include <QDate>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGenerateBoostConsolidatedRequest : public OAIObject {
public:
    OAIGenerateBoostConsolidatedRequest();
    OAIGenerateBoostConsolidatedRequest(QString json);
    ~OAIGenerateBoostConsolidatedRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getBusinessId() const;
    void setBusinessId(const qint64 &business_id);
    bool is_business_id_Set() const;
    bool is_business_id_Valid() const;

    QDate getDateFrom() const;
    void setDateFrom(const QDate &date_from);
    bool is_date_from_Set() const;
    bool is_date_from_Valid() const;

    QDate getDateTo() const;
    void setDateTo(const QDate &date_to);
    bool is_date_to_Set() const;
    bool is_date_to_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 m_business_id;
    bool m_business_id_isSet;
    bool m_business_id_isValid;

    QDate m_date_from;
    bool m_date_from_isSet;
    bool m_date_from_isValid;

    QDate m_date_to;
    bool m_date_to_isSet;
    bool m_date_to_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGenerateBoostConsolidatedRequest)

#endif // OAIGenerateBoostConsolidatedRequest_H
