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
 * OAIFeedbackListDTO.h
 *
 * Отзывы пользователей Яндекс Маркета об указанном магазине.
 */

#ifndef OAIFeedbackListDTO_H
#define OAIFeedbackListDTO_H

#include <QJsonObject>

#include "OAIFeedbackDTO.h"
#include "OAIScrollingPagerDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIScrollingPagerDTO;
class OAIFeedbackDTO;

class OAIFeedbackListDTO : public OAIObject {
public:
    OAIFeedbackListDTO();
    OAIFeedbackListDTO(QString json);
    ~OAIFeedbackListDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIScrollingPagerDTO getPaging() const;
    void setPaging(const OAIScrollingPagerDTO &paging);
    bool is_paging_Set() const;
    bool is_paging_Valid() const;

    QList<OAIFeedbackDTO> getFeedbackList() const;
    void setFeedbackList(const QList<OAIFeedbackDTO> &feedback_list);
    bool is_feedback_list_Set() const;
    bool is_feedback_list_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIScrollingPagerDTO m_paging;
    bool m_paging_isSet;
    bool m_paging_isValid;

    QList<OAIFeedbackDTO> m_feedback_list;
    bool m_feedback_list_isSet;
    bool m_feedback_list_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIFeedbackListDTO)

#endif // OAIFeedbackListDTO_H
