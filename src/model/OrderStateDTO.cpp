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



#include "ympa_cpp_restsdk_client/model/OrderStateDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



OrderStateDTO::OrderStateDTO()
{
    m_Id = 0L;
    m_IdIsSet = false;
    m_StatusIsSet = false;
    m_SubstatusIsSet = false;
}

OrderStateDTO::~OrderStateDTO()
{
}

void OrderStateDTO::validate()
{
    // TODO: implement validation
}

web::json::value OrderStateDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t(U("status"))] = ModelBase::toJson(m_Status);
    }
    if(m_SubstatusIsSet)
    {
        val[utility::conversions::to_string_t(U("substatus"))] = ModelBase::toJson(m_Substatus);
    }

    return val;
}

bool OrderStateDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrderStatusType> refVal_setStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatus);
            setStatus(refVal_setStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("substatus"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("substatus")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrderSubstatusType> refVal_setSubstatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSubstatus);
            setSubstatus(refVal_setSubstatus);
        }
    }
    return ok;
}

void OrderStateDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status")), m_Status));
    }
    if(m_SubstatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("substatus")), m_Substatus));
    }
}

bool OrderStateDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        int64_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("status"))))
    {
        std::shared_ptr<OrderStatusType> refVal_setStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status"))), refVal_setStatus );
        setStatus(refVal_setStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("substatus"))))
    {
        std::shared_ptr<OrderSubstatusType> refVal_setSubstatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("substatus"))), refVal_setSubstatus );
        setSubstatus(refVal_setSubstatus);
    }
    return ok;
}

int64_t OrderStateDTO::getId() const
{
    return m_Id;
}

void OrderStateDTO::setId(int64_t value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool OrderStateDTO::idIsSet() const
{
    return m_IdIsSet;
}

void OrderStateDTO::unsetId()
{
    m_IdIsSet = false;
}
std::shared_ptr<OrderStatusType> OrderStateDTO::getStatus() const
{
    return m_Status;
}

void OrderStateDTO::setStatus(const std::shared_ptr<OrderStatusType>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool OrderStateDTO::statusIsSet() const
{
    return m_StatusIsSet;
}

void OrderStateDTO::unsetStatus()
{
    m_StatusIsSet = false;
}
std::shared_ptr<OrderSubstatusType> OrderStateDTO::getSubstatus() const
{
    return m_Substatus;
}

void OrderStateDTO::setSubstatus(const std::shared_ptr<OrderSubstatusType>& value)
{
    m_Substatus = value;
    m_SubstatusIsSet = true;
}

bool OrderStateDTO::substatusIsSet() const
{
    return m_SubstatusIsSet;
}

void OrderStateDTO::unsetSubstatus()
{
    m_SubstatusIsSet = false;
}
}
}
}
}


