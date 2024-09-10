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
 * OAIOrderDigitalItemDTO.h
 *
 * Ключ цифрового товара.
 */

#ifndef OAIOrderDigitalItemDTO_H
#define OAIOrderDigitalItemDTO_H

#include <QJsonObject>

#include <QDate>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOrderDigitalItemDTO : public OAIObject {
public:
    OAIOrderDigitalItemDTO();
    OAIOrderDigitalItemDTO(QString json);
    ~OAIOrderDigitalItemDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getId() const;
    void setId(const qint64 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getCode() const;
    void setCode(const QString &code);
    bool is_code_Set() const;
    bool is_code_Valid() const;

    QString getSlip() const;
    void setSlip(const QString &slip);
    bool is_slip_Set() const;
    bool is_slip_Valid() const;

    QDate getActivateTill() const;
    void setActivateTill(const QDate &activate_till);
    bool is_activate_till_Set() const;
    bool is_activate_till_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString code;
    bool m_code_isSet;
    bool m_code_isValid;

    QString slip;
    bool m_slip_isSet;
    bool m_slip_isValid;

    QDate activate_till;
    bool m_activate_till_isSet;
    bool m_activate_till_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOrderDigitalItemDTO)

#endif // OAIOrderDigitalItemDTO_H
