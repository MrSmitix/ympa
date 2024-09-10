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
 * OAIParcelBoxDTO.h
 *
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 */

#ifndef OAIParcelBoxDTO_H
#define OAIParcelBoxDTO_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIParcelBoxDTO : public OAIObject {
public:
    OAIParcelBoxDTO();
    OAIParcelBoxDTO(QString json);
    ~OAIParcelBoxDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getId() const;
    void setId(const qint64 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getFulfilmentId() const;
    void setFulfilmentId(const QString &fulfilment_id);
    bool is_fulfilment_id_Set() const;
    bool is_fulfilment_id_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString fulfilment_id;
    bool m_fulfilment_id_isSet;
    bool m_fulfilment_id_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIParcelBoxDTO)

#endif // OAIParcelBoxDTO_H
