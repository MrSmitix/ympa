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
 * OAIOrderItemInstanceModificationDTO.h
 *
 * Позиция в корзине, требующая маркировки.
 */

#ifndef OAIOrderItemInstanceModificationDTO_H
#define OAIOrderItemInstanceModificationDTO_H

#include <QJsonObject>

#include "OAIBriefOrderItemInstanceDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOrderItemInstanceModificationDTO : public OAIObject {
public:
    OAIOrderItemInstanceModificationDTO();
    OAIOrderItemInstanceModificationDTO(QString json);
    ~OAIOrderItemInstanceModificationDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getId() const;
    void setId(const qint64 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QList<OAIBriefOrderItemInstanceDTO> getInstances() const;
    void setInstances(const QList<OAIBriefOrderItemInstanceDTO> &instances);
    bool is_instances_Set() const;
    bool is_instances_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 id;
    bool m_id_isSet;
    bool m_id_isValid;

    QList<OAIBriefOrderItemInstanceDTO> instances;
    bool m_instances_isSet;
    bool m_instances_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOrderItemInstanceModificationDTO)

#endif // OAIOrderItemInstanceModificationDTO_H
