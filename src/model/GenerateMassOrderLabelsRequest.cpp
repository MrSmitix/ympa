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



#include "ympa_cpp_restsdk_client/model/GenerateMassOrderLabelsRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GenerateMassOrderLabelsRequest::GenerateMassOrderLabelsRequest()
{
    m_BusinessId = 0L;
    m_BusinessIdIsSet = false;
    m_OrderIdsIsSet = false;
}

GenerateMassOrderLabelsRequest::~GenerateMassOrderLabelsRequest()
{
}

void GenerateMassOrderLabelsRequest::validate()
{
    // TODO: implement validation
}

web::json::value GenerateMassOrderLabelsRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_BusinessIdIsSet)
    {
        val[utility::conversions::to_string_t(U("businessId"))] = ModelBase::toJson(m_BusinessId);
    }
    if(m_OrderIdsIsSet)
    {
        val[utility::conversions::to_string_t(U("orderIds"))] = ModelBase::toJson(m_OrderIds);
    }

    return val;
}

bool GenerateMassOrderLabelsRequest::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("orderIds"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("orderIds")));
        if(!fieldValue.is_null())
        {
            std::set<int64_t> refVal_setOrderIds;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOrderIds);
            setOrderIds(refVal_setOrderIds);
        }
    }
    return ok;
}

void GenerateMassOrderLabelsRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_OrderIdsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("orderIds")), m_OrderIds));
    }
}

bool GenerateMassOrderLabelsRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("orderIds"))))
    {
        std::set<int64_t> refVal_setOrderIds;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("orderIds"))), refVal_setOrderIds );
        setOrderIds(refVal_setOrderIds);
    }
    return ok;
}

int64_t GenerateMassOrderLabelsRequest::getBusinessId() const
{
    return m_BusinessId;
}

void GenerateMassOrderLabelsRequest::setBusinessId(int64_t value)
{
    m_BusinessId = value;
    m_BusinessIdIsSet = true;
}

bool GenerateMassOrderLabelsRequest::businessIdIsSet() const
{
    return m_BusinessIdIsSet;
}

void GenerateMassOrderLabelsRequest::unsetBusinessId()
{
    m_BusinessIdIsSet = false;
}
std::set<int64_t>& GenerateMassOrderLabelsRequest::getOrderIds()
{
    return m_OrderIds;
}

void GenerateMassOrderLabelsRequest::setOrderIds(std::set<int64_t> value)
{
    m_OrderIds = value;
    m_OrderIdsIsSet = true;
}

bool GenerateMassOrderLabelsRequest::orderIdsIsSet() const
{
    return m_OrderIdsIsSet;
}

void GenerateMassOrderLabelsRequest::unsetOrderIds()
{
    m_OrderIdsIsSet = false;
}
}
}
}
}


