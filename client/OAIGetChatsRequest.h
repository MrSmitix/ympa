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
 * OAIGetChatsRequest.h
 *
 * Фильтры по чатам, которые нужно вернуть. 
 */

#ifndef OAIGetChatsRequest_H
#define OAIGetChatsRequest_H

#include <QJsonObject>

#include "OAIChatStatusType.h"
#include "OAIChatType.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetChatsRequest : public OAIObject {
public:
    OAIGetChatsRequest();
    OAIGetChatsRequest(QString json);
    ~OAIGetChatsRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<qint64> getOrderIds() const;
    void setOrderIds(const QList<qint64> &order_ids);
    bool is_order_ids_Set() const;
    bool is_order_ids_Valid() const;

    QList<OAIChatType> getTypes() const;
    void setTypes(const QList<OAIChatType> &types);
    bool is_types_Set() const;
    bool is_types_Valid() const;

    QList<OAIChatStatusType> getStatuses() const;
    void setStatuses(const QList<OAIChatStatusType> &statuses);
    bool is_statuses_Set() const;
    bool is_statuses_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<qint64> m_order_ids;
    bool m_order_ids_isSet;
    bool m_order_ids_isValid;

    QList<OAIChatType> m_types;
    bool m_types_isSet;
    bool m_types_isValid;

    QList<OAIChatStatusType> m_statuses;
    bool m_statuses_isSet;
    bool m_statuses_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetChatsRequest)

#endif // OAIGetChatsRequest_H
