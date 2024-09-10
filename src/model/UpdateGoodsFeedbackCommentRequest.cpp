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



#include "ympa_cpp_restsdk_client/model/UpdateGoodsFeedbackCommentRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UpdateGoodsFeedbackCommentRequest::UpdateGoodsFeedbackCommentRequest()
{
    m_FeedbackId = 0L;
    m_FeedbackIdIsSet = false;
    m_CommentIsSet = false;
}

UpdateGoodsFeedbackCommentRequest::~UpdateGoodsFeedbackCommentRequest()
{
}

void UpdateGoodsFeedbackCommentRequest::validate()
{
    // TODO: implement validation
}

web::json::value UpdateGoodsFeedbackCommentRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_FeedbackIdIsSet)
    {
        val[utility::conversions::to_string_t(U("feedbackId"))] = ModelBase::toJson(m_FeedbackId);
    }
    if(m_CommentIsSet)
    {
        val[utility::conversions::to_string_t(U("comment"))] = ModelBase::toJson(m_Comment);
    }

    return val;
}

bool UpdateGoodsFeedbackCommentRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("feedbackId"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("feedbackId")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setFeedbackId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFeedbackId);
            setFeedbackId(refVal_setFeedbackId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("comment"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("comment")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<UpdateGoodsFeedbackCommentDTO> refVal_setComment;
            ok &= ModelBase::fromJson(fieldValue, refVal_setComment);
            setComment(refVal_setComment);
        }
    }
    return ok;
}

void UpdateGoodsFeedbackCommentRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_FeedbackIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("feedbackId")), m_FeedbackId));
    }
    if(m_CommentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("comment")), m_Comment));
    }
}

bool UpdateGoodsFeedbackCommentRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("feedbackId"))))
    {
        int64_t refVal_setFeedbackId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("feedbackId"))), refVal_setFeedbackId );
        setFeedbackId(refVal_setFeedbackId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("comment"))))
    {
        std::shared_ptr<UpdateGoodsFeedbackCommentDTO> refVal_setComment;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("comment"))), refVal_setComment );
        setComment(refVal_setComment);
    }
    return ok;
}

int64_t UpdateGoodsFeedbackCommentRequest::getFeedbackId() const
{
    return m_FeedbackId;
}

void UpdateGoodsFeedbackCommentRequest::setFeedbackId(int64_t value)
{
    m_FeedbackId = value;
    m_FeedbackIdIsSet = true;
}

bool UpdateGoodsFeedbackCommentRequest::feedbackIdIsSet() const
{
    return m_FeedbackIdIsSet;
}

void UpdateGoodsFeedbackCommentRequest::unsetFeedbackId()
{
    m_FeedbackIdIsSet = false;
}
std::shared_ptr<UpdateGoodsFeedbackCommentDTO> UpdateGoodsFeedbackCommentRequest::getComment() const
{
    return m_Comment;
}

void UpdateGoodsFeedbackCommentRequest::setComment(const std::shared_ptr<UpdateGoodsFeedbackCommentDTO>& value)
{
    m_Comment = value;
    m_CommentIsSet = true;
}

bool UpdateGoodsFeedbackCommentRequest::commentIsSet() const
{
    return m_CommentIsSet;
}

void UpdateGoodsFeedbackCommentRequest::unsetComment()
{
    m_CommentIsSet = false;
}
}
}
}
}


