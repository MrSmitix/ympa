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
 * OAIGetCategoriesMaxSaleQuantumRequest.h
 *
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 */

#ifndef OAIGetCategoriesMaxSaleQuantumRequest_H
#define OAIGetCategoriesMaxSaleQuantumRequest_H

#include <QJsonObject>

#include <QSet>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetCategoriesMaxSaleQuantumRequest : public OAIObject {
public:
    OAIGetCategoriesMaxSaleQuantumRequest();
    OAIGetCategoriesMaxSaleQuantumRequest(QString json);
    ~OAIGetCategoriesMaxSaleQuantumRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QSet<qint64> getMarketCategoryIds() const;
    void setMarketCategoryIds(const QSet<qint64> &market_category_ids);
    bool is_market_category_ids_Set() const;
    bool is_market_category_ids_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QSet<qint64> market_category_ids;
    bool m_market_category_ids_isSet;
    bool m_market_category_ids_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetCategoriesMaxSaleQuantumRequest)

#endif // OAIGetCategoriesMaxSaleQuantumRequest_H
