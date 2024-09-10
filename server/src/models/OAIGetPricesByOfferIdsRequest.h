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
 * OAIGetPricesByOfferIdsRequest.h
 *
 * Запрос списка цен.
 */

#ifndef OAIGetPricesByOfferIdsRequest_H
#define OAIGetPricesByOfferIdsRequest_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetPricesByOfferIdsRequest : public OAIObject {
public:
    OAIGetPricesByOfferIdsRequest();
    OAIGetPricesByOfferIdsRequest(QString json);
    ~OAIGetPricesByOfferIdsRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<QString> getOfferIds() const;
    void setOfferIds(const QList<QString> &offer_ids);
    bool is_offer_ids_Set() const;
    bool is_offer_ids_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<QString> offer_ids;
    bool m_offer_ids_isSet;
    bool m_offer_ids_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetPricesByOfferIdsRequest)

#endif // OAIGetPricesByOfferIdsRequest_H
