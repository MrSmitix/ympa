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



#include "ympa_cpp_restsdk_client/model/ApiErrorDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ApiErrorDTO::ApiErrorDTO()
{
    m_Code = utility::conversions::to_string_t("");
    m_CodeIsSet = false;
    m_Message = utility::conversions::to_string_t("");
    m_MessageIsSet = false;
}

ApiErrorDTO::~ApiErrorDTO()
{
}

void ApiErrorDTO::validate()
{
    // TODO: implement validation
}

web::json::value ApiErrorDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_CodeIsSet)
    {
        val[utility::conversions::to_string_t(U("code"))] = ModelBase::toJson(m_Code);
    }
    if(m_MessageIsSet)
    {
        val[utility::conversions::to_string_t(U("message"))] = ModelBase::toJson(m_Message);
    }

    return val;
}

bool ApiErrorDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("code"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("code")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCode;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCode);
            setCode(refVal_setCode);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("message"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("message")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMessage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMessage);
            setMessage(refVal_setMessage);
        }
    }
    return ok;
}

void ApiErrorDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_CodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("code")), m_Code));
    }
    if(m_MessageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("message")), m_Message));
    }
}

bool ApiErrorDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("code"))))
    {
        utility::string_t refVal_setCode;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("code"))), refVal_setCode );
        setCode(refVal_setCode);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("message"))))
    {
        utility::string_t refVal_setMessage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("message"))), refVal_setMessage );
        setMessage(refVal_setMessage);
    }
    return ok;
}

utility::string_t ApiErrorDTO::getCode() const
{
    return m_Code;
}

void ApiErrorDTO::setCode(const utility::string_t& value)
{
    m_Code = value;
    m_CodeIsSet = true;
}

bool ApiErrorDTO::codeIsSet() const
{
    return m_CodeIsSet;
}

void ApiErrorDTO::unsetCode()
{
    m_CodeIsSet = false;
}
utility::string_t ApiErrorDTO::getMessage() const
{
    return m_Message;
}

void ApiErrorDTO::setMessage(const utility::string_t& value)
{
    m_Message = value;
    m_MessageIsSet = true;
}

bool ApiErrorDTO::messageIsSet() const
{
    return m_MessageIsSet;
}

void ApiErrorDTO::unsetMessage()
{
    m_MessageIsSet = false;
}
}
}
}
}


