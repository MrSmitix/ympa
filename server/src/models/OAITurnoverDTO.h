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
 * OAITurnoverDTO.h
 *
 * Информация об оборачиваемости товара.
 */

#ifndef OAITurnoverDTO_H
#define OAITurnoverDTO_H

#include <QJsonObject>

#include "OAITurnoverType.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAITurnoverDTO : public OAIObject {
public:
    OAITurnoverDTO();
    OAITurnoverDTO(QString json);
    ~OAITurnoverDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAITurnoverType getTurnover() const;
    void setTurnover(const OAITurnoverType &turnover);
    bool is_turnover_Set() const;
    bool is_turnover_Valid() const;

    double getTurnoverDays() const;
    void setTurnoverDays(const double &turnover_days);
    bool is_turnover_days_Set() const;
    bool is_turnover_days_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAITurnoverType turnover;
    bool m_turnover_isSet;
    bool m_turnover_isValid;

    double turnover_days;
    bool m_turnover_days_isSet;
    bool m_turnover_days_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAITurnoverDTO)

#endif // OAITurnoverDTO_H
