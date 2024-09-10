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
 * OAISetFeedParamsRequest.h
 *
 * Запрос на обновление изменение параметров прайс-листа.
 */

#ifndef OAISetFeedParamsRequest_H
#define OAISetFeedParamsRequest_H

#include <QJsonObject>

#include "OAIFeedParameterDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAISetFeedParamsRequest : public OAIObject {
public:
    OAISetFeedParamsRequest();
    OAISetFeedParamsRequest(QString json);
    ~OAISetFeedParamsRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIFeedParameterDTO> getParameters() const;
    void setParameters(const QList<OAIFeedParameterDTO> &parameters);
    bool is_parameters_Set() const;
    bool is_parameters_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIFeedParameterDTO> parameters;
    bool m_parameters_isSet;
    bool m_parameters_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAISetFeedParamsRequest)

#endif // OAISetFeedParamsRequest_H
