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
 * OAIUpdateOfferContentRequest.h
 *
 * Запрос на установку новых значений для параметров.
 */

#ifndef OAIUpdateOfferContentRequest_H
#define OAIUpdateOfferContentRequest_H

#include <QJsonObject>

#include "OAIOfferContentDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIUpdateOfferContentRequest : public OAIObject {
public:
    OAIUpdateOfferContentRequest();
    OAIUpdateOfferContentRequest(QString json);
    ~OAIUpdateOfferContentRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIOfferContentDTO> getOffersContent() const;
    void setOffersContent(const QList<OAIOfferContentDTO> &offers_content);
    bool is_offers_content_Set() const;
    bool is_offers_content_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIOfferContentDTO> offers_content;
    bool m_offers_content_isSet;
    bool m_offers_content_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIUpdateOfferContentRequest)

#endif // OAIUpdateOfferContentRequest_H
