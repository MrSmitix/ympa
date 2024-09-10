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
 * FeedbackCommentAuthorType.h
 *
 * Тип автора:  * &#x60;USER&#x60; — пользователь. * &#x60;SHOP&#x60; — магазин. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackCommentAuthorType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackCommentAuthorType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  FeedbackCommentAuthorType
    : public ModelBase
{
public:
    FeedbackCommentAuthorType();
    virtual ~FeedbackCommentAuthorType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eFeedbackCommentAuthorType
    {
        FeedbackCommentAuthorType_USER,
        FeedbackCommentAuthorType_SHOP,
    };

    eFeedbackCommentAuthorType getValue() const;
    void setValue(eFeedbackCommentAuthorType const value);

    protected:
        eFeedbackCommentAuthorType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_FeedbackCommentAuthorType_H_ */
