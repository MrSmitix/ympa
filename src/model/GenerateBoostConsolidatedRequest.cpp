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



#include "ympa_cpp_restsdk_client/model/GenerateBoostConsolidatedRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GenerateBoostConsolidatedRequest::GenerateBoostConsolidatedRequest()
{
    m_BusinessId = 0L;
    m_BusinessIdIsSet = false;
    m_DateFromIsSet = false;
    m_DateToIsSet = false;
}

GenerateBoostConsolidatedRequest::~GenerateBoostConsolidatedRequest()
{
}

void GenerateBoostConsolidatedRequest::validate()
{
    // TODO: implement validation
}

web::json::value GenerateBoostConsolidatedRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_BusinessIdIsSet)
    {
        val[utility::conversions::to_string_t(U("businessId"))] = ModelBase::toJson(m_BusinessId);
    }
    if(m_DateFromIsSet)
    {
        val[utility::conversions::to_string_t(U("dateFrom"))] = ModelBase::toJson(m_DateFrom);
    }
    if(m_DateToIsSet)
    {
        val[utility::conversions::to_string_t(U("dateTo"))] = ModelBase::toJson(m_DateTo);
    }

    return val;
}

bool GenerateBoostConsolidatedRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("businessId"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("businessId")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setBusinessId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBusinessId);
            setBusinessId(refVal_setBusinessId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("dateFrom"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("dateFrom")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setDateFrom;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDateFrom);
            setDateFrom(refVal_setDateFrom);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("dateTo"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("dateTo")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setDateTo;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDateTo);
            setDateTo(refVal_setDateTo);
        }
    }
    return ok;
}

void GenerateBoostConsolidatedRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_BusinessIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("businessId")), m_BusinessId));
    }
    if(m_DateFromIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("dateFrom")), m_DateFrom));
    }
    if(m_DateToIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("dateTo")), m_DateTo));
    }
}

bool GenerateBoostConsolidatedRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("businessId"))))
    {
        int64_t refVal_setBusinessId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("businessId"))), refVal_setBusinessId );
        setBusinessId(refVal_setBusinessId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("dateFrom"))))
    {
        utility::datetime refVal_setDateFrom;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("dateFrom"))), refVal_setDateFrom );
        setDateFrom(refVal_setDateFrom);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("dateTo"))))
    {
        utility::datetime refVal_setDateTo;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("dateTo"))), refVal_setDateTo );
        setDateTo(refVal_setDateTo);
    }
    return ok;
}

int64_t GenerateBoostConsolidatedRequest::getBusinessId() const
{
    return m_BusinessId;
}

void GenerateBoostConsolidatedRequest::setBusinessId(int64_t value)
{
    m_BusinessId = value;
    m_BusinessIdIsSet = true;
}

bool GenerateBoostConsolidatedRequest::businessIdIsSet() const
{
    return m_BusinessIdIsSet;
}

void GenerateBoostConsolidatedRequest::unsetBusinessId()
{
    m_BusinessIdIsSet = false;
}
utility::datetime GenerateBoostConsolidatedRequest::getDateFrom() const
{
    return m_DateFrom;
}

void GenerateBoostConsolidatedRequest::setDateFrom(const utility::datetime& value)
{
    m_DateFrom = value;
    m_DateFromIsSet = true;
}

bool GenerateBoostConsolidatedRequest::dateFromIsSet() const
{
    return m_DateFromIsSet;
}

void GenerateBoostConsolidatedRequest::unsetDateFrom()
{
    m_DateFromIsSet = false;
}
utility::datetime GenerateBoostConsolidatedRequest::getDateTo() const
{
    return m_DateTo;
}

void GenerateBoostConsolidatedRequest::setDateTo(const utility::datetime& value)
{
    m_DateTo = value;
    m_DateToIsSet = true;
}

bool GenerateBoostConsolidatedRequest::dateToIsSet() const
{
    return m_DateToIsSet;
}

void GenerateBoostConsolidatedRequest::unsetDateTo()
{
    m_DateToIsSet = false;
}
}
}
}
}


