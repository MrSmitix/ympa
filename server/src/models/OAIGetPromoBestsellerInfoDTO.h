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
 * OAIGetPromoBestsellerInfoDTO.h
 *
 * Информация об акции «Бестселлеры Маркета».
 */

#ifndef OAIGetPromoBestsellerInfoDTO_H
#define OAIGetPromoBestsellerInfoDTO_H

#include <QJsonObject>

#include <QDateTime>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetPromoBestsellerInfoDTO : public OAIObject {
public:
    OAIGetPromoBestsellerInfoDTO();
    OAIGetPromoBestsellerInfoDTO(QString json);
    ~OAIGetPromoBestsellerInfoDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    bool isBestseller() const;
    void setBestseller(const bool &bestseller);
    bool is_bestseller_Set() const;
    bool is_bestseller_Valid() const;

    QDateTime getEntryDeadline() const;
    void setEntryDeadline(const QDateTime &entry_deadline);
    bool is_entry_deadline_Set() const;
    bool is_entry_deadline_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    bool bestseller;
    bool m_bestseller_isSet;
    bool m_bestseller_isValid;

    QDateTime entry_deadline;
    bool m_entry_deadline_isSet;
    bool m_entry_deadline_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetPromoBestsellerInfoDTO)

#endif // OAIGetPromoBestsellerInfoDTO_H
