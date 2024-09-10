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
 * OAIApiLimitErrorResponse.h
 *
 * Превышено ограничение на доступ к ресурсу.
 */

#ifndef OAIApiLimitErrorResponse_H
#define OAIApiLimitErrorResponse_H

#include <QJsonObject>

#include "OAIApiErrorDTO.h"
#include "OAIApiResponseStatusType.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIApiLimitErrorResponse : public OAIObject {
public:
    OAIApiLimitErrorResponse();
    OAIApiLimitErrorResponse(QString json);
    ~OAIApiLimitErrorResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIApiResponseStatusType getStatus() const;
    void setStatus(const OAIApiResponseStatusType &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    QList<OAIApiErrorDTO> getErrors() const;
    void setErrors(const QList<OAIApiErrorDTO> &errors);
    bool is_errors_Set() const;
    bool is_errors_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIApiResponseStatusType status;
    bool m_status_isSet;
    bool m_status_isValid;

    QList<OAIApiErrorDTO> errors;
    bool m_errors_isSet;
    bool m_errors_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIApiLimitErrorResponse)

#endif // OAIApiLimitErrorResponse_H
