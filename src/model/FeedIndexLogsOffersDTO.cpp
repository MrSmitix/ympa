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



#include "ympa_cpp_restsdk_client/model/FeedIndexLogsOffersDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



FeedIndexLogsOffersDTO::FeedIndexLogsOffersDTO()
{
    m_RejectedCount = 0L;
    m_RejectedCountIsSet = false;
    m_TotalCount = 0L;
    m_TotalCountIsSet = false;
}

FeedIndexLogsOffersDTO::~FeedIndexLogsOffersDTO()
{
}

void FeedIndexLogsOffersDTO::validate()
{
    // TODO: implement validation
}

web::json::value FeedIndexLogsOffersDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_RejectedCountIsSet)
    {
        val[utility::conversions::to_string_t(U("rejectedCount"))] = ModelBase::toJson(m_RejectedCount);
    }
    if(m_TotalCountIsSet)
    {
        val[utility::conversions::to_string_t(U("totalCount"))] = ModelBase::toJson(m_TotalCount);
    }

    return val;
}

bool FeedIndexLogsOffersDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("rejectedCount"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("rejectedCount")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setRejectedCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRejectedCount);
            setRejectedCount(refVal_setRejectedCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("totalCount"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("totalCount")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setTotalCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotalCount);
            setTotalCount(refVal_setTotalCount);
        }
    }
    return ok;
}

void FeedIndexLogsOffersDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_RejectedCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("rejectedCount")), m_RejectedCount));
    }
    if(m_TotalCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("totalCount")), m_TotalCount));
    }
}

bool FeedIndexLogsOffersDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("rejectedCount"))))
    {
        int64_t refVal_setRejectedCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("rejectedCount"))), refVal_setRejectedCount );
        setRejectedCount(refVal_setRejectedCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("totalCount"))))
    {
        int64_t refVal_setTotalCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("totalCount"))), refVal_setTotalCount );
        setTotalCount(refVal_setTotalCount);
    }
    return ok;
}

int64_t FeedIndexLogsOffersDTO::getRejectedCount() const
{
    return m_RejectedCount;
}

void FeedIndexLogsOffersDTO::setRejectedCount(int64_t value)
{
    m_RejectedCount = value;
    m_RejectedCountIsSet = true;
}

bool FeedIndexLogsOffersDTO::rejectedCountIsSet() const
{
    return m_RejectedCountIsSet;
}

void FeedIndexLogsOffersDTO::unsetRejectedCount()
{
    m_RejectedCountIsSet = false;
}
int64_t FeedIndexLogsOffersDTO::getTotalCount() const
{
    return m_TotalCount;
}

void FeedIndexLogsOffersDTO::setTotalCount(int64_t value)
{
    m_TotalCount = value;
    m_TotalCountIsSet = true;
}

bool FeedIndexLogsOffersDTO::totalCountIsSet() const
{
    return m_TotalCountIsSet;
}

void FeedIndexLogsOffersDTO::unsetTotalCount()
{
    m_TotalCountIsSet = false;
}
}
}
}
}


