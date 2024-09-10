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
 * GoodsFeedbackCommentStatusType.h
 *
 * Статус комментария:  * &#x60;PUBLISHED&#x60; — опубликован. * &#x60;UNMODERATED&#x60; — не проверен. * &#x60;BANNED&#x60; — заблокирован. * &#x60;DELETED&#x60; — удален. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GoodsFeedbackCommentStatusType_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GoodsFeedbackCommentStatusType_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {


class  GoodsFeedbackCommentStatusType
    : public ModelBase
{
public:
    GoodsFeedbackCommentStatusType();
    virtual ~GoodsFeedbackCommentStatusType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    enum class eGoodsFeedbackCommentStatusType
    {
        GoodsFeedbackCommentStatusType_PUBLISHED,
        GoodsFeedbackCommentStatusType_UNMODERATED,
        GoodsFeedbackCommentStatusType_BANNED,
        GoodsFeedbackCommentStatusType_DELETED,
    };

    eGoodsFeedbackCommentStatusType getValue() const;
    void setValue(eGoodsFeedbackCommentStatusType const value);

    protected:
        eGoodsFeedbackCommentStatusType m_value;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GoodsFeedbackCommentStatusType_H_ */
