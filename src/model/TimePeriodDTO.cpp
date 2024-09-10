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



#include "ympa_cpp_restsdk_client/model/TimePeriodDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



TimePeriodDTO::TimePeriodDTO()
{
    m_TimePeriod = 0;
    m_TimePeriodIsSet = false;
    m_TimeUnitIsSet = false;
    m_Comment = utility::conversions::to_string_t("");
    m_CommentIsSet = false;
}

TimePeriodDTO::~TimePeriodDTO()
{
}

void TimePeriodDTO::validate()
{
    // TODO: implement validation
}

web::json::value TimePeriodDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TimePeriodIsSet)
    {
        val[utility::conversions::to_string_t(U("timePeriod"))] = ModelBase::toJson(m_TimePeriod);
    }
    if(m_TimeUnitIsSet)
    {
        val[utility::conversions::to_string_t(U("timeUnit"))] = ModelBase::toJson(m_TimeUnit);
    }
    if(m_CommentIsSet)
    {
        val[utility::conversions::to_string_t(U("comment"))] = ModelBase::toJson(m_Comment);
    }

    return val;
}

bool TimePeriodDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("timePeriod"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("timePeriod")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setTimePeriod;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTimePeriod);
            setTimePeriod(refVal_setTimePeriod);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("timeUnit"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("timeUnit")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<TimeUnitType> refVal_setTimeUnit;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTimeUnit);
            setTimeUnit(refVal_setTimeUnit);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("comment"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("comment")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setComment;
            ok &= ModelBase::fromJson(fieldValue, refVal_setComment);
            setComment(refVal_setComment);
        }
    }
    return ok;
}

void TimePeriodDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TimePeriodIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("timePeriod")), m_TimePeriod));
    }
    if(m_TimeUnitIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("timeUnit")), m_TimeUnit));
    }
    if(m_CommentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("comment")), m_Comment));
    }
}

bool TimePeriodDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("timePeriod"))))
    {
        int32_t refVal_setTimePeriod;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("timePeriod"))), refVal_setTimePeriod );
        setTimePeriod(refVal_setTimePeriod);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("timeUnit"))))
    {
        std::shared_ptr<TimeUnitType> refVal_setTimeUnit;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("timeUnit"))), refVal_setTimeUnit );
        setTimeUnit(refVal_setTimeUnit);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("comment"))))
    {
        utility::string_t refVal_setComment;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("comment"))), refVal_setComment );
        setComment(refVal_setComment);
    }
    return ok;
}

int32_t TimePeriodDTO::getTimePeriod() const
{
    return m_TimePeriod;
}

void TimePeriodDTO::setTimePeriod(int32_t value)
{
    m_TimePeriod = value;
    m_TimePeriodIsSet = true;
}

bool TimePeriodDTO::timePeriodIsSet() const
{
    return m_TimePeriodIsSet;
}

void TimePeriodDTO::unsetTimePeriod()
{
    m_TimePeriodIsSet = false;
}
std::shared_ptr<TimeUnitType> TimePeriodDTO::getTimeUnit() const
{
    return m_TimeUnit;
}

void TimePeriodDTO::setTimeUnit(const std::shared_ptr<TimeUnitType>& value)
{
    m_TimeUnit = value;
    m_TimeUnitIsSet = true;
}

bool TimePeriodDTO::timeUnitIsSet() const
{
    return m_TimeUnitIsSet;
}

void TimePeriodDTO::unsetTimeUnit()
{
    m_TimeUnitIsSet = false;
}
utility::string_t TimePeriodDTO::getComment() const
{
    return m_Comment;
}

void TimePeriodDTO::setComment(const utility::string_t& value)
{
    m_Comment = value;
    m_CommentIsSet = true;
}

bool TimePeriodDTO::commentIsSet() const
{
    return m_CommentIsSet;
}

void TimePeriodDTO::unsetComment()
{
    m_CommentIsSet = false;
}
}
}
}
}


