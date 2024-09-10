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



#include "ympa_cpp_restsdk_client/model/GetOfferMappingEntriesResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GetOfferMappingEntriesResponse::GetOfferMappingEntriesResponse()
{
    m_StatusIsSet = false;
    m_ResultIsSet = false;
}

GetOfferMappingEntriesResponse::~GetOfferMappingEntriesResponse()
{
}

void GetOfferMappingEntriesResponse::validate()
{
    // TODO: implement validation
}

web::json::value GetOfferMappingEntriesResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t(U("status"))] = ModelBase::toJson(m_Status);
    }
    if(m_ResultIsSet)
    {
        val[utility::conversions::to_string_t(U("result"))] = ModelBase::toJson(m_Result);
    }

    return val;
}

bool GetOfferMappingEntriesResponse::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ApiResponseStatusType> refVal_setStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatus);
            setStatus(refVal_setStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("result"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("result")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OfferMappingEntriesDTO> refVal_setResult;
            ok &= ModelBase::fromJson(fieldValue, refVal_setResult);
            setResult(refVal_setResult);
        }
    }
    return ok;
}

void GetOfferMappingEntriesResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status")), m_Status));
    }
    if(m_ResultIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("result")), m_Result));
    }
}

bool GetOfferMappingEntriesResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("status"))))
    {
        std::shared_ptr<ApiResponseStatusType> refVal_setStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status"))), refVal_setStatus );
        setStatus(refVal_setStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("result"))))
    {
        std::shared_ptr<OfferMappingEntriesDTO> refVal_setResult;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("result"))), refVal_setResult );
        setResult(refVal_setResult);
    }
    return ok;
}

std::shared_ptr<ApiResponseStatusType> GetOfferMappingEntriesResponse::getStatus() const
{
    return m_Status;
}

void GetOfferMappingEntriesResponse::setStatus(const std::shared_ptr<ApiResponseStatusType>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool GetOfferMappingEntriesResponse::statusIsSet() const
{
    return m_StatusIsSet;
}

void GetOfferMappingEntriesResponse::unsetStatus()
{
    m_StatusIsSet = false;
}
std::shared_ptr<OfferMappingEntriesDTO> GetOfferMappingEntriesResponse::getResult() const
{
    return m_Result;
}

void GetOfferMappingEntriesResponse::setResult(const std::shared_ptr<OfferMappingEntriesDTO>& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}

bool GetOfferMappingEntriesResponse::resultIsSet() const
{
    return m_ResultIsSet;
}

void GetOfferMappingEntriesResponse::unsetResult()
{
    m_ResultIsSet = false;
}
}
}
}
}


