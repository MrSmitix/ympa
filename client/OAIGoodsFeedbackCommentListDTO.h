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
 * OAIGoodsFeedbackCommentListDTO.h
 *
 * Комментарии к отзыву.
 */

#ifndef OAIGoodsFeedbackCommentListDTO_H
#define OAIGoodsFeedbackCommentListDTO_H

#include <QJsonObject>

#include "OAIForwardScrollingPagerDTO.h"
#include "OAIGoodsFeedbackCommentDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIGoodsFeedbackCommentDTO;
class OAIForwardScrollingPagerDTO;

class OAIGoodsFeedbackCommentListDTO : public OAIObject {
public:
    OAIGoodsFeedbackCommentListDTO();
    OAIGoodsFeedbackCommentListDTO(QString json);
    ~OAIGoodsFeedbackCommentListDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIGoodsFeedbackCommentDTO> getComments() const;
    void setComments(const QList<OAIGoodsFeedbackCommentDTO> &comments);
    bool is_comments_Set() const;
    bool is_comments_Valid() const;

    OAIForwardScrollingPagerDTO getPaging() const;
    void setPaging(const OAIForwardScrollingPagerDTO &paging);
    bool is_paging_Set() const;
    bool is_paging_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIGoodsFeedbackCommentDTO> m_comments;
    bool m_comments_isSet;
    bool m_comments_isValid;

    OAIForwardScrollingPagerDTO m_paging;
    bool m_paging_isSet;
    bool m_paging_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGoodsFeedbackCommentListDTO)

#endif // OAIGoodsFeedbackCommentListDTO_H
