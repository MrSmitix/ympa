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
 * OAIGetPriceDTO.h
 *
 * Цена с указанием времени последнего обновления.
 */

#ifndef OAIGetPriceDTO_H
#define OAIGetPriceDTO_H

#include <QJsonObject>

#include "OAICurrencyType.h"
#include <QDateTime>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetPriceDTO : public OAIObject {
public:
    OAIGetPriceDTO();
    OAIGetPriceDTO(QString json);
    ~OAIGetPriceDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    double getValue() const;
    void setValue(const double &value);
    bool is_value_Set() const;
    bool is_value_Valid() const;

    OAICurrencyType getCurrencyId() const;
    void setCurrencyId(const OAICurrencyType &currency_id);
    bool is_currency_id_Set() const;
    bool is_currency_id_Valid() const;

    QDateTime getUpdatedAt() const;
    void setUpdatedAt(const QDateTime &updated_at);
    bool is_updated_at_Set() const;
    bool is_updated_at_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    double value;
    bool m_value_isSet;
    bool m_value_isValid;

    OAICurrencyType currency_id;
    bool m_currency_id_isSet;
    bool m_currency_id_isValid;

    QDateTime updated_at;
    bool m_updated_at_isSet;
    bool m_updated_at_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetPriceDTO)

#endif // OAIGetPriceDTO_H
