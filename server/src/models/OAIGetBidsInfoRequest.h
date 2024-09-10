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
 * OAIGetBidsInfoRequest.h
 *
 * description.
 */

#ifndef OAIGetBidsInfoRequest_H
#define OAIGetBidsInfoRequest_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetBidsInfoRequest : public OAIObject {
public:
    OAIGetBidsInfoRequest();
    OAIGetBidsInfoRequest(QString json);
    ~OAIGetBidsInfoRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<QString> getSkus() const;
    void setSkus(const QList<QString> &skus);
    bool is_skus_Set() const;
    bool is_skus_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<QString> skus;
    bool m_skus_isSet;
    bool m_skus_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetBidsInfoRequest)

#endif // OAIGetBidsInfoRequest_H
