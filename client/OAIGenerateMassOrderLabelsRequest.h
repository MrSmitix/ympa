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
 * OAIGenerateMassOrderLabelsRequest.h
 *
 * Данные, необходимые для генерации файла. 
 */

#ifndef OAIGenerateMassOrderLabelsRequest_H
#define OAIGenerateMassOrderLabelsRequest_H

#include <QJsonObject>

#include <QSet>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGenerateMassOrderLabelsRequest : public OAIObject {
public:
    OAIGenerateMassOrderLabelsRequest();
    OAIGenerateMassOrderLabelsRequest(QString json);
    ~OAIGenerateMassOrderLabelsRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getBusinessId() const;
    void setBusinessId(const qint64 &business_id);
    bool is_business_id_Set() const;
    bool is_business_id_Valid() const;

    QSet<qint64> getOrderIds() const;
    void setOrderIds(const QSet<qint64> &order_ids);
    bool is_order_ids_Set() const;
    bool is_order_ids_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 m_business_id;
    bool m_business_id_isSet;
    bool m_business_id_isValid;

    QSet<qint64> m_order_ids;
    bool m_order_ids_isSet;
    bool m_order_ids_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGenerateMassOrderLabelsRequest)

#endif // OAIGenerateMassOrderLabelsRequest_H
