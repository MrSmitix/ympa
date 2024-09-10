/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * FeedbackDTO.h
 *
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/FeedbackAuthorDTO.h"
#include "ympa_cpp_restsdk_client/model/FeedbackShopDTO.h"
#include "ympa_cpp_restsdk_client/model/FeedbackOrderDTO.h"
#include "ympa_cpp_restsdk_client/model/FeedbackGradesDTO.h"
#include "ympa_cpp_restsdk_client/model/FeedbackStateType.h"
#include "ympa_cpp_restsdk_client/model/FeedbackCommentDTO.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class FeedbackAuthorDTO;
class FeedbackCommentDTO;
class FeedbackShopDTO;
class FeedbackGradesDTO;
class FeedbackOrderDTO;


/// <summary>
/// Отзыв пользователя Яндекс Маркета об указанном магазине.
/// </summary>
class  FeedbackDTO
    : public ModelBase
{
public:
    FeedbackDTO();
    virtual ~FeedbackDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// FeedbackDTO members

    /// <summary>
    /// Идентификатор отзыва.
    /// </summary>
    int64_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(int64_t value);

    /// <summary>
    /// Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
    /// </summary>
    utility::datetime getCreatedAt() const;
    bool createdAtIsSet() const;
    void unsetCreatedAt();

    void setCreatedAt(const utility::datetime& value);

    /// <summary>
    /// Комментарий автора отзыва.
    /// </summary>
    utility::string_t getText() const;
    bool textIsSet() const;
    void unsetText();

    void setText(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FeedbackStateType> getState() const;
    bool stateIsSet() const;
    void unsetState();

    void setState(const std::shared_ptr<FeedbackStateType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FeedbackAuthorDTO> getAuthor() const;
    bool authorIsSet() const;
    void unsetAuthor();

    void setAuthor(const std::shared_ptr<FeedbackAuthorDTO>& value);

    /// <summary>
    /// Достоинства магазина, описанные в отзыве.
    /// </summary>
    utility::string_t getPro() const;
    bool proIsSet() const;
    void unsetPro();

    void setPro(const utility::string_t& value);

    /// <summary>
    /// Недостатки магазина, описанные в отзыве.
    /// </summary>
    utility::string_t getContra() const;
    bool contraIsSet() const;
    void unsetContra();

    void setContra(const utility::string_t& value);

    /// <summary>
    /// Переписка автора отзыва с магазином.
    /// </summary>
    std::vector<std::shared_ptr<FeedbackCommentDTO>>& getComments();
    bool commentsIsSet() const;
    void unsetComments();

    void setComments(const std::vector<std::shared_ptr<FeedbackCommentDTO>>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FeedbackShopDTO> getShop() const;
    bool shopIsSet() const;
    void unsetShop();

    void setShop(const std::shared_ptr<FeedbackShopDTO>& value);

    /// <summary>
    /// Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
    /// </summary>
    bool isResolved() const;
    bool resolvedIsSet() const;
    void unsetResolved();

    void setResolved(bool value);

    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
    /// </summary>
    bool isVerified() const;
    bool verifiedIsSet() const;
    void unsetVerified();

    void setVerified(bool value);

    /// <summary>
    /// Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
    /// </summary>
    bool isRecommend() const;
    bool recommendIsSet() const;
    void unsetRecommend();

    void setRecommend(bool value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FeedbackGradesDTO> getGrades() const;
    bool gradesIsSet() const;
    void unsetGrades();

    void setGrades(const std::shared_ptr<FeedbackGradesDTO>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FeedbackOrderDTO> getOrder() const;
    bool orderIsSet() const;
    void unsetOrder();

    void setOrder(const std::shared_ptr<FeedbackOrderDTO>& value);


protected:
    int64_t m_Id;
    bool m_IdIsSet;
    utility::datetime m_CreatedAt;
    bool m_CreatedAtIsSet;
    utility::string_t m_Text;
    bool m_TextIsSet;
    std::shared_ptr<FeedbackStateType> m_State;
    bool m_StateIsSet;
    std::shared_ptr<FeedbackAuthorDTO> m_Author;
    bool m_AuthorIsSet;
    utility::string_t m_Pro;
    bool m_ProIsSet;
    utility::string_t m_Contra;
    bool m_ContraIsSet;
    std::vector<std::shared_ptr<FeedbackCommentDTO>> m_Comments;
    bool m_CommentsIsSet;
    std::shared_ptr<FeedbackShopDTO> m_Shop;
    bool m_ShopIsSet;
    bool m_Resolved;
    bool m_ResolvedIsSet;
    bool m_Verified;
    bool m_VerifiedIsSet;
    bool m_Recommend;
    bool m_RecommendIsSet;
    std::shared_ptr<FeedbackGradesDTO> m_Grades;
    bool m_GradesIsSet;
    std::shared_ptr<FeedbackOrderDTO> m_Order;
    bool m_OrderIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackDTO_H_ */
