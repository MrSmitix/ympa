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
 * OAIQualityRatingAffectedOrderDTO.h
 *
 * Информация о заказе, который повлиял на индекс качества.
 */

#ifndef OAIQualityRatingAffectedOrderDTO_H
#define OAIQualityRatingAffectedOrderDTO_H

#include <QJsonObject>

#include "OAIAffectedOrderQualityRatingComponentType.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIQualityRatingAffectedOrderDTO : public OAIObject {
public:
    OAIQualityRatingAffectedOrderDTO();
    OAIQualityRatingAffectedOrderDTO(QString json);
    ~OAIQualityRatingAffectedOrderDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getOrderId() const;
    void setOrderId(const qint64 &order_id);
    bool is_order_id_Set() const;
    bool is_order_id_Valid() const;

    QString getDescription() const;
    void setDescription(const QString &description);
    bool is_description_Set() const;
    bool is_description_Valid() const;

    OAIAffectedOrderQualityRatingComponentType getComponentType() const;
    void setComponentType(const OAIAffectedOrderQualityRatingComponentType &component_type);
    bool is_component_type_Set() const;
    bool is_component_type_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 order_id;
    bool m_order_id_isSet;
    bool m_order_id_isValid;

    QString description;
    bool m_description_isSet;
    bool m_description_isValid;

    OAIAffectedOrderQualityRatingComponentType component_type;
    bool m_component_type_isSet;
    bool m_component_type_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIQualityRatingAffectedOrderDTO)

#endif // OAIQualityRatingAffectedOrderDTO_H
