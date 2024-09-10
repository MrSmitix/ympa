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



#include "ympa_cpp_restsdk_client/model/OrderBuyerInfoDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



OrderBuyerInfoDTO::OrderBuyerInfoDTO()
{
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_LastName = utility::conversions::to_string_t("");
    m_LastNameIsSet = false;
    m_FirstName = utility::conversions::to_string_t("");
    m_FirstNameIsSet = false;
    m_MiddleName = utility::conversions::to_string_t("");
    m_MiddleNameIsSet = false;
    m_TypeIsSet = false;
    m_Phone = utility::conversions::to_string_t("");
    m_PhoneIsSet = false;
}

OrderBuyerInfoDTO::~OrderBuyerInfoDTO()
{
}

void OrderBuyerInfoDTO::validate()
{
    // TODO: implement validation
}

web::json::value OrderBuyerInfoDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_LastNameIsSet)
    {
        val[utility::conversions::to_string_t(U("lastName"))] = ModelBase::toJson(m_LastName);
    }
    if(m_FirstNameIsSet)
    {
        val[utility::conversions::to_string_t(U("firstName"))] = ModelBase::toJson(m_FirstName);
    }
    if(m_MiddleNameIsSet)
    {
        val[utility::conversions::to_string_t(U("middleName"))] = ModelBase::toJson(m_MiddleName);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_PhoneIsSet)
    {
        val[utility::conversions::to_string_t(U("phone"))] = ModelBase::toJson(m_Phone);
    }

    return val;
}

bool OrderBuyerInfoDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("lastName"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("lastName")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setLastName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setLastName);
            setLastName(refVal_setLastName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("firstName"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("firstName")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFirstName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFirstName);
            setFirstName(refVal_setFirstName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("middleName"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("middleName")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMiddleName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMiddleName);
            setMiddleName(refVal_setMiddleName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrderBuyerType> refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("phone"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("phone")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPhone;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPhone);
            setPhone(refVal_setPhone);
        }
    }
    return ok;
}

void OrderBuyerInfoDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_LastNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("lastName")), m_LastName));
    }
    if(m_FirstNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("firstName")), m_FirstName));
    }
    if(m_MiddleNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("middleName")), m_MiddleName));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_PhoneIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("phone")), m_Phone));
    }
}

bool OrderBuyerInfoDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("lastName"))))
    {
        utility::string_t refVal_setLastName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("lastName"))), refVal_setLastName );
        setLastName(refVal_setLastName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("firstName"))))
    {
        utility::string_t refVal_setFirstName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("firstName"))), refVal_setFirstName );
        setFirstName(refVal_setFirstName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("middleName"))))
    {
        utility::string_t refVal_setMiddleName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("middleName"))), refVal_setMiddleName );
        setMiddleName(refVal_setMiddleName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        std::shared_ptr<OrderBuyerType> refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("phone"))))
    {
        utility::string_t refVal_setPhone;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("phone"))), refVal_setPhone );
        setPhone(refVal_setPhone);
    }
    return ok;
}

utility::string_t OrderBuyerInfoDTO::getId() const
{
    return m_Id;
}

void OrderBuyerInfoDTO::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool OrderBuyerInfoDTO::idIsSet() const
{
    return m_IdIsSet;
}

void OrderBuyerInfoDTO::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t OrderBuyerInfoDTO::getLastName() const
{
    return m_LastName;
}

void OrderBuyerInfoDTO::setLastName(const utility::string_t& value)
{
    m_LastName = value;
    m_LastNameIsSet = true;
}

bool OrderBuyerInfoDTO::lastNameIsSet() const
{
    return m_LastNameIsSet;
}

void OrderBuyerInfoDTO::unsetLastName()
{
    m_LastNameIsSet = false;
}
utility::string_t OrderBuyerInfoDTO::getFirstName() const
{
    return m_FirstName;
}

void OrderBuyerInfoDTO::setFirstName(const utility::string_t& value)
{
    m_FirstName = value;
    m_FirstNameIsSet = true;
}

bool OrderBuyerInfoDTO::firstNameIsSet() const
{
    return m_FirstNameIsSet;
}

void OrderBuyerInfoDTO::unsetFirstName()
{
    m_FirstNameIsSet = false;
}
utility::string_t OrderBuyerInfoDTO::getMiddleName() const
{
    return m_MiddleName;
}

void OrderBuyerInfoDTO::setMiddleName(const utility::string_t& value)
{
    m_MiddleName = value;
    m_MiddleNameIsSet = true;
}

bool OrderBuyerInfoDTO::middleNameIsSet() const
{
    return m_MiddleNameIsSet;
}

void OrderBuyerInfoDTO::unsetMiddleName()
{
    m_MiddleNameIsSet = false;
}
std::shared_ptr<OrderBuyerType> OrderBuyerInfoDTO::getType() const
{
    return m_Type;
}

void OrderBuyerInfoDTO::setType(const std::shared_ptr<OrderBuyerType>& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool OrderBuyerInfoDTO::typeIsSet() const
{
    return m_TypeIsSet;
}

void OrderBuyerInfoDTO::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t OrderBuyerInfoDTO::getPhone() const
{
    return m_Phone;
}

void OrderBuyerInfoDTO::setPhone(const utility::string_t& value)
{
    m_Phone = value;
    m_PhoneIsSet = true;
}

bool OrderBuyerInfoDTO::phoneIsSet() const
{
    return m_PhoneIsSet;
}

void OrderBuyerInfoDTO::unsetPhone()
{
    m_PhoneIsSet = false;
}
}
}
}
}


