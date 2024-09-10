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
 * OAISkipGoodsFeedbackReactionRequest.h
 *
 * Идентификаторы отзывов.
 */

#ifndef OAISkipGoodsFeedbackReactionRequest_H
#define OAISkipGoodsFeedbackReactionRequest_H

#include <QJsonObject>

#include <QSet>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAISkipGoodsFeedbackReactionRequest : public OAIObject {
public:
    OAISkipGoodsFeedbackReactionRequest();
    OAISkipGoodsFeedbackReactionRequest(QString json);
    ~OAISkipGoodsFeedbackReactionRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QSet<qint64> getFeedbackIds() const;
    void setFeedbackIds(const QSet<qint64> &feedback_ids);
    bool is_feedback_ids_Set() const;
    bool is_feedback_ids_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QSet<qint64> feedback_ids;
    bool m_feedback_ids_isSet;
    bool m_feedback_ids_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAISkipGoodsFeedbackReactionRequest)

#endif // OAISkipGoodsFeedbackReactionRequest_H
