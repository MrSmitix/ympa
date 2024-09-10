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
 * OAIGoodsFeedbackCommentDTO.h
 *
 * Комментарий к отзыву.
 */

#ifndef OAIGoodsFeedbackCommentDTO_H
#define OAIGoodsFeedbackCommentDTO_H

#include <QJsonObject>

#include "OAIGoodsFeedbackCommentAuthorDTO.h"
#include "OAIGoodsFeedbackCommentStatusType.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGoodsFeedbackCommentDTO : public OAIObject {
public:
    OAIGoodsFeedbackCommentDTO();
    OAIGoodsFeedbackCommentDTO(QString json);
    ~OAIGoodsFeedbackCommentDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getId() const;
    void setId(const qint64 &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getText() const;
    void setText(const QString &text);
    bool is_text_Set() const;
    bool is_text_Valid() const;

    bool isCanModify() const;
    void setCanModify(const bool &can_modify);
    bool is_can_modify_Set() const;
    bool is_can_modify_Valid() const;

    qint64 getParentId() const;
    void setParentId(const qint64 &parent_id);
    bool is_parent_id_Set() const;
    bool is_parent_id_Valid() const;

    OAIGoodsFeedbackCommentAuthorDTO getAuthor() const;
    void setAuthor(const OAIGoodsFeedbackCommentAuthorDTO &author);
    bool is_author_Set() const;
    bool is_author_Valid() const;

    OAIGoodsFeedbackCommentStatusType getStatus() const;
    void setStatus(const OAIGoodsFeedbackCommentStatusType &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString text;
    bool m_text_isSet;
    bool m_text_isValid;

    bool can_modify;
    bool m_can_modify_isSet;
    bool m_can_modify_isValid;

    qint64 parent_id;
    bool m_parent_id_isSet;
    bool m_parent_id_isValid;

    OAIGoodsFeedbackCommentAuthorDTO author;
    bool m_author_isSet;
    bool m_author_isValid;

    OAIGoodsFeedbackCommentStatusType status;
    bool m_status_isSet;
    bool m_status_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGoodsFeedbackCommentDTO)

#endif // OAIGoodsFeedbackCommentDTO_H
