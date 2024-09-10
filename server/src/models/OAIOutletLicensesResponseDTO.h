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
 * OAIOutletLicensesResponseDTO.h
 *
 * Ответ на запрос информации о лицензиях для точек продаж.
 */

#ifndef OAIOutletLicensesResponseDTO_H
#define OAIOutletLicensesResponseDTO_H

#include <QJsonObject>

#include "OAIFullOutletLicenseDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOutletLicensesResponseDTO : public OAIObject {
public:
    OAIOutletLicensesResponseDTO();
    OAIOutletLicensesResponseDTO(QString json);
    ~OAIOutletLicensesResponseDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIFullOutletLicenseDTO> getLicenses() const;
    void setLicenses(const QList<OAIFullOutletLicenseDTO> &licenses);
    bool is_licenses_Set() const;
    bool is_licenses_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIFullOutletLicenseDTO> licenses;
    bool m_licenses_isSet;
    bool m_licenses_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOutletLicensesResponseDTO)

#endif // OAIOutletLicensesResponseDTO_H
