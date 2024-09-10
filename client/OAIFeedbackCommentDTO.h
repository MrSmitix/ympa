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
 * OAIFeedbackCommentDTO.h
 *
 * Комментарий к отзыву на магазин.
 */

#ifndef OAIFeedbackCommentDTO_H
#define OAIFeedbackCommentDTO_H

#include <QJsonObject>

#include "OAIFeedbackCommentAuthorDTO.h"
#include <QDateTime>
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIFeedbackCommentAuthorDTO;

class OAIFeedbackCommentDTO : public OAIObject {
public:
    OAIFeedbackCommentDTO();
    OAIFeedbackCommentDTO(QString json);
    ~OAIFeedbackCommentDTO() override;

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

    QString getBody() const;
    void setBody(const QString &body);
    bool is_body_Set() const;
    bool is_body_Valid() const;

    QDateTime getCreatedAt() const;
    void setCreatedAt(const QDateTime &created_at);
    bool is_created_at_Set() const;
    bool is_created_at_Valid() const;

    QDateTime getUpdatedAt() const;
    void setUpdatedAt(const QDateTime &updated_at);
    bool is_updated_at_Set() const;
    bool is_updated_at_Valid() const;

    OAIFeedbackCommentAuthorDTO getAuthor() const;
    void setAuthor(const OAIFeedbackCommentAuthorDTO &author);
    bool is_author_Set() const;
    bool is_author_Valid() const;

    QList<OAIFeedbackCommentDTO> getChildren() const;
    void setChildren(const QList<OAIFeedbackCommentDTO> &children);
    bool is_children_Set() const;
    bool is_children_Valid() const;

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

    QString m_body;
    bool m_body_isSet;
    bool m_body_isValid;

    QDateTime m_created_at;
    bool m_created_at_isSet;
    bool m_created_at_isValid;

    QDateTime m_updated_at;
    bool m_updated_at_isSet;
    bool m_updated_at_isValid;

    OAIFeedbackCommentAuthorDTO m_author;
    bool m_author_isSet;
    bool m_author_isValid;

    QList<OAIFeedbackCommentDTO> m_children;
    bool m_children_isSet;
    bool m_children_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIFeedbackCommentDTO)

#endif // OAIFeedbackCommentDTO_H
