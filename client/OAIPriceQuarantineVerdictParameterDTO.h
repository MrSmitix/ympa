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
 * OAIPriceQuarantineVerdictParameterDTO.h
 *
 * Параметр карантина.
 */

#ifndef OAIPriceQuarantineVerdictParameterDTO_H
#define OAIPriceQuarantineVerdictParameterDTO_H

#include <QJsonObject>

#include "OAIPriceQuarantineVerdictParamNameType.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIPriceQuarantineVerdictParameterDTO : public OAIObject {
public:
    OAIPriceQuarantineVerdictParameterDTO();
    OAIPriceQuarantineVerdictParameterDTO(QString json);
    ~OAIPriceQuarantineVerdictParameterDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIPriceQuarantineVerdictParamNameType getName() const;
    void setName(const OAIPriceQuarantineVerdictParamNameType &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    QString getValue() const;
    void setValue(const QString &value);
    bool is_value_Set() const;
    bool is_value_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIPriceQuarantineVerdictParamNameType m_name;
    bool m_name_isSet;
    bool m_name_isValid;

    QString m_value;
    bool m_value_isSet;
    bool m_value_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIPriceQuarantineVerdictParameterDTO)

#endif // OAIPriceQuarantineVerdictParameterDTO_H
