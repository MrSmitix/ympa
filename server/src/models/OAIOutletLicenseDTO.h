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
 * OAIOutletLicenseDTO.h
 *
 * Информация о лицензии.
 */

#ifndef OAIOutletLicenseDTO_H
#define OAIOutletLicenseDTO_H

#include <QJsonObject>

#include "OAILicenseType.h"
#include <QDateTime>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOutletLicenseDTO : public OAIObject {
public:
    OAIOutletLicenseDTO();
    OAIOutletLicenseDTO(QString json);
    ~OAIOutletLicenseDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getId() const;
    void setId(const qint64 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    qint64 getOutletId() const;
    void setOutletId(const qint64 &outlet_id);
    bool is_outlet_id_Set() const;
    bool is_outlet_id_Valid() const;

    OAILicenseType getLicenseType() const;
    void setLicenseType(const OAILicenseType &license_type);
    bool is_license_type_Set() const;
    bool is_license_type_Valid() const;

    QString getNumber() const;
    void setNumber(const QString &number);
    bool is_number_Set() const;
    bool is_number_Valid() const;

    QDateTime getDateOfIssue() const;
    void setDateOfIssue(const QDateTime &date_of_issue);
    bool is_date_of_issue_Set() const;
    bool is_date_of_issue_Valid() const;

    QDateTime getDateOfExpiry() const;
    void setDateOfExpiry(const QDateTime &date_of_expiry);
    bool is_date_of_expiry_Set() const;
    bool is_date_of_expiry_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 id;
    bool m_id_isSet;
    bool m_id_isValid;

    qint64 outlet_id;
    bool m_outlet_id_isSet;
    bool m_outlet_id_isValid;

    OAILicenseType license_type;
    bool m_license_type_isSet;
    bool m_license_type_isValid;

    QString number;
    bool m_number_isSet;
    bool m_number_isValid;

    QDateTime date_of_issue;
    bool m_date_of_issue_isSet;
    bool m_date_of_issue_isValid;

    QDateTime date_of_expiry;
    bool m_date_of_expiry_isSet;
    bool m_date_of_expiry_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOutletLicenseDTO)

#endif // OAIOutletLicenseDTO_H
