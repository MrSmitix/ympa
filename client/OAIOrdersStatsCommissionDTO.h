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
 * OAIOrdersStatsCommissionDTO.h
 *
 * Информация о стоимости услуг.
 */

#ifndef OAIOrdersStatsCommissionDTO_H
#define OAIOrdersStatsCommissionDTO_H

#include <QJsonObject>

#include "OAIOrdersStatsCommissionType.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOrdersStatsCommissionDTO : public OAIObject {
public:
    OAIOrdersStatsCommissionDTO();
    OAIOrdersStatsCommissionDTO(QString json);
    ~OAIOrdersStatsCommissionDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIOrdersStatsCommissionType getType() const;
    void setType(const OAIOrdersStatsCommissionType &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    double getActual() const;
    void setActual(const double &actual);
    bool is_actual_Set() const;
    bool is_actual_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIOrdersStatsCommissionType m_type;
    bool m_type_isSet;
    bool m_type_isValid;

    double m_actual;
    bool m_actual_isSet;
    bool m_actual_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOrdersStatsCommissionDTO)

#endif // OAIOrdersStatsCommissionDTO_H
