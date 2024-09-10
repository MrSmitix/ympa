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
 * OAIUpdateGoodsFeedbackCommentDTO.h
 *
 * Комментарий к отзыву или другому комментарию.
 */

#ifndef OAIUpdateGoodsFeedbackCommentDTO_H
#define OAIUpdateGoodsFeedbackCommentDTO_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIUpdateGoodsFeedbackCommentDTO : public OAIObject {
public:
    OAIUpdateGoodsFeedbackCommentDTO();
    OAIUpdateGoodsFeedbackCommentDTO(QString json);
    ~OAIUpdateGoodsFeedbackCommentDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getId() const;
    void setId(const qint64 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    qint64 getParentId() const;
    void setParentId(const qint64 &parent_id);
    bool is_parent_id_Set() const;
    bool is_parent_id_Valid() const;

    QString getText() const;
    void setText(const QString &text);
    bool is_text_Set() const;
    bool is_text_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    qint64 m_parent_id;
    bool m_parent_id_isSet;
    bool m_parent_id_isValid;

    QString m_text;
    bool m_text_isSet;
    bool m_text_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIUpdateGoodsFeedbackCommentDTO)

#endif // OAIUpdateGoodsFeedbackCommentDTO_H
