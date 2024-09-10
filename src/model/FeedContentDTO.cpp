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



#include "ympa_cpp_restsdk_client/model/FeedContentDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



FeedContentDTO::FeedContentDTO()
{
    m_RejectedOffersCount = 0L;
    m_RejectedOffersCountIsSet = false;
    m_StatusIsSet = false;
    m_TotalOffersCount = 0L;
    m_TotalOffersCountIsSet = false;
    m_ErrorIsSet = false;
}

FeedContentDTO::~FeedContentDTO()
{
}

void FeedContentDTO::validate()
{
    // TODO: implement validation
}

web::json::value FeedContentDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_RejectedOffersCountIsSet)
    {
        val[utility::conversions::to_string_t(U("rejectedOffersCount"))] = ModelBase::toJson(m_RejectedOffersCount);
    }
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t(U("status"))] = ModelBase::toJson(m_Status);
    }
    if(m_TotalOffersCountIsSet)
    {
        val[utility::conversions::to_string_t(U("totalOffersCount"))] = ModelBase::toJson(m_TotalOffersCount);
    }
    if(m_ErrorIsSet)
    {
        val[utility::conversions::to_string_t(U("error"))] = ModelBase::toJson(m_Error);
    }

    return val;
}

bool FeedContentDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("rejectedOffersCount"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("rejectedOffersCount")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setRejectedOffersCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRejectedOffersCount);
            setRejectedOffersCount(refVal_setRejectedOffersCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<FeedStatusType> refVal_setStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatus);
            setStatus(refVal_setStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("totalOffersCount"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("totalOffersCount")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setTotalOffersCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalOffersCount);
            setTotalOffersCount(refVal_setTotalOffersCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("error"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("error")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<FeedContentErrorDTO> refVal_setError;
            ok &= ModelBase::fromJson(fieldValue, refVal_setError);
            setError(refVal_setError);
        }
    }
    return ok;
}

void FeedContentDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_RejectedOffersCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("rejectedOffersCount")), m_RejectedOffersCount));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status")), m_Status));
    }
    if(m_TotalOffersCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("totalOffersCount")), m_TotalOffersCount));
    }
    if(m_ErrorIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("error")), m_Error));
    }
}

bool FeedContentDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("rejectedOffersCount"))))
    {
        int64_t refVal_setRejectedOffersCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("rejectedOffersCount"))), refVal_setRejectedOffersCount );
        setRejectedOffersCount(refVal_setRejectedOffersCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("status"))))
    {
        std::shared_ptr<FeedStatusType> refVal_setStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status"))), refVal_setStatus );
        setStatus(refVal_setStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("totalOffersCount"))))
    {
        int64_t refVal_setTotalOffersCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("totalOffersCount"))), refVal_setTotalOffersCount );
        setTotalOffersCount(refVal_setTotalOffersCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("error"))))
    {
        std::shared_ptr<FeedContentErrorDTO> refVal_setError;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("error"))), refVal_setError );
        setError(refVal_setError);
    }
    return ok;
}

int64_t FeedContentDTO::getRejectedOffersCount() const
{
    return m_RejectedOffersCount;
}

void FeedContentDTO::setRejectedOffersCount(int64_t value)
{
    m_RejectedOffersCount = value;
    m_RejectedOffersCountIsSet = true;
}

bool FeedContentDTO::rejectedOffersCountIsSet() const
{
    return m_RejectedOffersCountIsSet;
}

void FeedContentDTO::unsetRejectedOffersCount()
{
    m_RejectedOffersCountIsSet = false;
}
std::shared_ptr<FeedStatusType> FeedContentDTO::getStatus() const
{
    return m_Status;
}

void FeedContentDTO::setStatus(const std::shared_ptr<FeedStatusType>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool FeedContentDTO::statusIsSet() const
{
    return m_StatusIsSet;
}

void FeedContentDTO::unsetStatus()
{
    m_StatusIsSet = false;
}
int64_t FeedContentDTO::getTotalOffersCount() const
{
    return m_TotalOffersCount;
}

void FeedContentDTO::setTotalOffersCount(int64_t value)
{
    m_TotalOffersCount = value;
    m_TotalOffersCountIsSet = true;
}

bool FeedContentDTO::totalOffersCountIsSet() const
{
    return m_TotalOffersCountIsSet;
}

void FeedContentDTO::unsetTotalOffersCount()
{
    m_TotalOffersCountIsSet = false;
}
std::shared_ptr<FeedContentErrorDTO> FeedContentDTO::getError() const
{
    return m_Error;
}

void FeedContentDTO::setError(const std::shared_ptr<FeedContentErrorDTO>& value)
{
    m_Error = value;
    m_ErrorIsSet = true;
}

bool FeedContentDTO::errorIsSet() const
{
    return m_ErrorIsSet;
}

void FeedContentDTO::unsetError()
{
    m_ErrorIsSet = false;
}
}
}
}
}


