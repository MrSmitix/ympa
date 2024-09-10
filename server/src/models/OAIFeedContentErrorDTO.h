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
 * OAIFeedContentErrorDTO.h
 *
 * Информация об ошибке в содержимом прайс-листа. Выводится, если параметр &#x60;content status&#x3D;ERROR&#x60;. 
 */

#ifndef OAIFeedContentErrorDTO_H
#define OAIFeedContentErrorDTO_H

#include <QJsonObject>

#include "OAIFeedContentErrorType.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIFeedContentErrorDTO : public OAIObject {
public:
    OAIFeedContentErrorDTO();
    OAIFeedContentErrorDTO(QString json);
    ~OAIFeedContentErrorDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIFeedContentErrorType getType() const;
    void setType(const OAIFeedContentErrorType &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIFeedContentErrorType type;
    bool m_type_isSet;
    bool m_type_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIFeedContentErrorDTO)

#endif // OAIFeedContentErrorDTO_H
