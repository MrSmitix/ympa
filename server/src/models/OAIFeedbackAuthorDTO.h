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
 * OAIFeedbackAuthorDTO.h
 *
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 */

#ifndef OAIFeedbackAuthorDTO_H
#define OAIFeedbackAuthorDTO_H

#include <QJsonObject>

#include "OAIRegionDTO.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIFeedbackAuthorDTO : public OAIObject {
public:
    OAIFeedbackAuthorDTO();
    OAIFeedbackAuthorDTO(QString json);
    ~OAIFeedbackAuthorDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    OAIRegionDTO getRegion() const;
    void setRegion(const OAIRegionDTO &region);
    bool is_region_Set() const;
    bool is_region_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;

    OAIRegionDTO region;
    bool m_region_isSet;
    bool m_region_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIFeedbackAuthorDTO)

#endif // OAIFeedbackAuthorDTO_H
