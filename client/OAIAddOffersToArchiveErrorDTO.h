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
 * OAIAddOffersToArchiveErrorDTO.h
 *
 * Товар, который не удалось поместить в архив.
 */

#ifndef OAIAddOffersToArchiveErrorDTO_H
#define OAIAddOffersToArchiveErrorDTO_H

#include <QJsonObject>

#include "OAIAddOffersToArchiveErrorType.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAddOffersToArchiveErrorDTO : public OAIObject {
public:
    OAIAddOffersToArchiveErrorDTO();
    OAIAddOffersToArchiveErrorDTO(QString json);
    ~OAIAddOffersToArchiveErrorDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getOfferId() const;
    void setOfferId(const QString &offer_id);
    bool is_offer_id_Set() const;
    bool is_offer_id_Valid() const;

    OAIAddOffersToArchiveErrorType getError() const;
    void setError(const OAIAddOffersToArchiveErrorType &error);
    bool is_error_Set() const;
    bool is_error_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_offer_id;
    bool m_offer_id_isSet;
    bool m_offer_id_isValid;

    OAIAddOffersToArchiveErrorType m_error;
    bool m_error_isSet;
    bool m_error_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAddOffersToArchiveErrorDTO)

#endif // OAIAddOffersToArchiveErrorDTO_H
