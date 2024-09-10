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



#include "ympa_cpp_restsdk_client/model/OrderBoxLayoutItemDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



OrderBoxLayoutItemDTO::OrderBoxLayoutItemDTO()
{
    m_Id = 0L;
    m_IdIsSet = false;
    m_FullCount = 0;
    m_FullCountIsSet = false;
    m_PartialCountIsSet = false;
    m_InstancesIsSet = false;
}

OrderBoxLayoutItemDTO::~OrderBoxLayoutItemDTO()
{
}

void OrderBoxLayoutItemDTO::validate()
{
    // TODO: implement validation
}

web::json::value OrderBoxLayoutItemDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_FullCountIsSet)
    {
        val[utility::conversions::to_string_t(U("fullCount"))] = ModelBase::toJson(m_FullCount);
    }
    if(m_PartialCountIsSet)
    {
        val[utility::conversions::to_string_t(U("partialCount"))] = ModelBase::toJson(m_PartialCount);
    }
    if(m_InstancesIsSet)
    {
        val[utility::conversions::to_string_t(U("instances"))] = ModelBase::toJson(m_Instances);
    }

    return val;
}

bool OrderBoxLayoutItemDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("fullCount"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("fullCount")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setFullCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFullCount);
            setFullCount(refVal_setFullCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("partialCount"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("partialCount")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrderBoxLayoutPartialCountDTO> refVal_setPartialCount;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPartialCount);
            setPartialCount(refVal_setPartialCount);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("instances"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("instances")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<BriefOrderItemInstanceDTO>> refVal_setInstances;
            ok &= ModelBase::fromJson(fieldValue, refVal_setInstances);
            setInstances(refVal_setInstances);
        }
    }
    return ok;
}

void OrderBoxLayoutItemDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_FullCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("fullCount")), m_FullCount));
    }
    if(m_PartialCountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("partialCount")), m_PartialCount));
    }
    if(m_InstancesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("instances")), m_Instances));
    }
}

bool OrderBoxLayoutItemDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("fullCount"))))
    {
        int32_t refVal_setFullCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("fullCount"))), refVal_setFullCount );
        setFullCount(refVal_setFullCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("partialCount"))))
    {
        std::shared_ptr<OrderBoxLayoutPartialCountDTO> refVal_setPartialCount;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("partialCount"))), refVal_setPartialCount );
        setPartialCount(refVal_setPartialCount);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("instances"))))
    {
        std::vector<std::shared_ptr<BriefOrderItemInstanceDTO>> refVal_setInstances;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("instances"))), refVal_setInstances );
        setInstances(refVal_setInstances);
    }
    return ok;
}

int64_t OrderBoxLayoutItemDTO::getId() const
{
    return m_Id;
}

void OrderBoxLayoutItemDTO::setId(int64_t value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool OrderBoxLayoutItemDTO::idIsSet() const
{
    return m_IdIsSet;
}

void OrderBoxLayoutItemDTO::unsetId()
{
    m_IdIsSet = false;
}
int32_t OrderBoxLayoutItemDTO::getFullCount() const
{
    return m_FullCount;
}

void OrderBoxLayoutItemDTO::setFullCount(int32_t value)
{
    m_FullCount = value;
    m_FullCountIsSet = true;
}

bool OrderBoxLayoutItemDTO::fullCountIsSet() const
{
    return m_FullCountIsSet;
}

void OrderBoxLayoutItemDTO::unsetFullCount()
{
    m_FullCountIsSet = false;
}
std::shared_ptr<OrderBoxLayoutPartialCountDTO> OrderBoxLayoutItemDTO::getPartialCount() const
{
    return m_PartialCount;
}

void OrderBoxLayoutItemDTO::setPartialCount(const std::shared_ptr<OrderBoxLayoutPartialCountDTO>& value)
{
    m_PartialCount = value;
    m_PartialCountIsSet = true;
}

bool OrderBoxLayoutItemDTO::partialCountIsSet() const
{
    return m_PartialCountIsSet;
}

void OrderBoxLayoutItemDTO::unsetPartialCount()
{
    m_PartialCountIsSet = false;
}
std::vector<std::shared_ptr<BriefOrderItemInstanceDTO>>& OrderBoxLayoutItemDTO::getInstances()
{
    return m_Instances;
}

void OrderBoxLayoutItemDTO::setInstances(const std::vector<std::shared_ptr<BriefOrderItemInstanceDTO>>& value)
{
    m_Instances = value;
    m_InstancesIsSet = true;
}

bool OrderBoxLayoutItemDTO::instancesIsSet() const
{
    return m_InstancesIsSet;
}

void OrderBoxLayoutItemDTO::unsetInstances()
{
    m_InstancesIsSet = false;
}
}
}
}
}


