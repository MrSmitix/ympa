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
 * OAIGoodsFeedbackDescriptionDTO.h
 *
 * Текстовая часть отзыва.
 */

#ifndef OAIGoodsFeedbackDescriptionDTO_H
#define OAIGoodsFeedbackDescriptionDTO_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGoodsFeedbackDescriptionDTO : public OAIObject {
public:
    OAIGoodsFeedbackDescriptionDTO();
    OAIGoodsFeedbackDescriptionDTO(QString json);
    ~OAIGoodsFeedbackDescriptionDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getAdvantages() const;
    void setAdvantages(const QString &advantages);
    bool is_advantages_Set() const;
    bool is_advantages_Valid() const;

    QString getDisadvantages() const;
    void setDisadvantages(const QString &disadvantages);
    bool is_disadvantages_Set() const;
    bool is_disadvantages_Valid() const;

    QString getComment() const;
    void setComment(const QString &comment);
    bool is_comment_Set() const;
    bool is_comment_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString advantages;
    bool m_advantages_isSet;
    bool m_advantages_isValid;

    QString disadvantages;
    bool m_disadvantages_isSet;
    bool m_disadvantages_isValid;

    QString comment;
    bool m_comment_isSet;
    bool m_comment_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGoodsFeedbackDescriptionDTO)

#endif // OAIGoodsFeedbackDescriptionDTO_H
