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
 * OAIOfferContentErrorDTO.h
 *
 * Текст ошибки.
 */

#ifndef OAIOfferContentErrorDTO_H
#define OAIOfferContentErrorDTO_H

#include <QJsonObject>

#include "OAIOfferContentErrorType.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOfferContentErrorDTO : public OAIObject {
public:
    OAIOfferContentErrorDTO();
    OAIOfferContentErrorDTO(QString json);
    ~OAIOfferContentErrorDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIOfferContentErrorType getType() const;
    void setType(const OAIOfferContentErrorType &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    qint64 getParameterId() const;
    void setParameterId(const qint64 &parameter_id);
    bool is_parameter_id_Set() const;
    bool is_parameter_id_Valid() const;

    QString getMessage() const;
    void setMessage(const QString &message);
    bool is_message_Set() const;
    bool is_message_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIOfferContentErrorType type;
    bool m_type_isSet;
    bool m_type_isValid;

    qint64 parameter_id;
    bool m_parameter_id_isSet;
    bool m_parameter_id_isValid;

    QString message;
    bool m_message_isSet;
    bool m_message_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOfferContentErrorDTO)

#endif // OAIOfferContentErrorDTO_H
