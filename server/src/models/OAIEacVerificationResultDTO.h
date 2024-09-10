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
 * OAIEacVerificationResultDTO.h
 *
 * Результат выполнения запроса.
 */

#ifndef OAIEacVerificationResultDTO_H
#define OAIEacVerificationResultDTO_H

#include <QJsonObject>

#include "OAIEacVerificationStatusType.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIEacVerificationResultDTO : public OAIObject {
public:
    OAIEacVerificationResultDTO();
    OAIEacVerificationResultDTO(QString json);
    ~OAIEacVerificationResultDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIEacVerificationStatusType getVerificationResult() const;
    void setVerificationResult(const OAIEacVerificationStatusType &verification_result);
    bool is_verification_result_Set() const;
    bool is_verification_result_Valid() const;

    qint32 getAttemptsLeft() const;
    void setAttemptsLeft(const qint32 &attempts_left);
    bool is_attempts_left_Set() const;
    bool is_attempts_left_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIEacVerificationStatusType verification_result;
    bool m_verification_result_isSet;
    bool m_verification_result_isValid;

    qint32 attempts_left;
    bool m_attempts_left_isSet;
    bool m_attempts_left_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIEacVerificationResultDTO)

#endif // OAIEacVerificationResultDTO_H
