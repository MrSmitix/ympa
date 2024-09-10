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
 * OAIGetCategoriesResponse.h
 *
 * 
 */

#ifndef OAIGetCategoriesResponse_H
#define OAIGetCategoriesResponse_H

#include <QJsonObject>

#include "OAIApiResponseStatusType.h"
#include "OAICategoryDTO.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetCategoriesResponse : public OAIObject {
public:
    OAIGetCategoriesResponse();
    OAIGetCategoriesResponse(QString json);
    ~OAIGetCategoriesResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIApiResponseStatusType getStatus() const;
    void setStatus(const OAIApiResponseStatusType &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    OAICategoryDTO getResult() const;
    void setResult(const OAICategoryDTO &result);
    bool is_result_Set() const;
    bool is_result_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIApiResponseStatusType status;
    bool m_status_isSet;
    bool m_status_isValid;

    OAICategoryDTO result;
    bool m_result_isSet;
    bool m_result_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetCategoriesResponse)

#endif // OAIGetCategoriesResponse_H
