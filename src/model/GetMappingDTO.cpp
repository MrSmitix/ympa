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



#include "ympa_cpp_restsdk_client/model/GetMappingDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GetMappingDTO::GetMappingDTO()
{
    m_MarketSku = 0L;
    m_MarketSkuIsSet = false;
    m_MarketSkuName = utility::conversions::to_string_t("");
    m_MarketSkuNameIsSet = false;
    m_MarketModelId = 0L;
    m_MarketModelIdIsSet = false;
    m_MarketModelName = utility::conversions::to_string_t("");
    m_MarketModelNameIsSet = false;
    m_MarketCategoryId = 0L;
    m_MarketCategoryIdIsSet = false;
    m_MarketCategoryName = utility::conversions::to_string_t("");
    m_MarketCategoryNameIsSet = false;
}

GetMappingDTO::~GetMappingDTO()
{
}

void GetMappingDTO::validate()
{
    // TODO: implement validation
}

web::json::value GetMappingDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_MarketSkuIsSet)
    {
        val[utility::conversions::to_string_t(U("marketSku"))] = ModelBase::toJson(m_MarketSku);
    }
    if(m_MarketSkuNameIsSet)
    {
        val[utility::conversions::to_string_t(U("marketSkuName"))] = ModelBase::toJson(m_MarketSkuName);
    }
    if(m_MarketModelIdIsSet)
    {
        val[utility::conversions::to_string_t(U("marketModelId"))] = ModelBase::toJson(m_MarketModelId);
    }
    if(m_MarketModelNameIsSet)
    {
        val[utility::conversions::to_string_t(U("marketModelName"))] = ModelBase::toJson(m_MarketModelName);
    }
    if(m_MarketCategoryIdIsSet)
    {
        val[utility::conversions::to_string_t(U("marketCategoryId"))] = ModelBase::toJson(m_MarketCategoryId);
    }
    if(m_MarketCategoryNameIsSet)
    {
        val[utility::conversions::to_string_t(U("marketCategoryName"))] = ModelBase::toJson(m_MarketCategoryName);
    }

    return val;
}

bool GetMappingDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("marketSku"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("marketSku")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setMarketSku;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMarketSku);
            setMarketSku(refVal_setMarketSku);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("marketSkuName"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("marketSkuName")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMarketSkuName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMarketSkuName);
            setMarketSkuName(refVal_setMarketSkuName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("marketModelId"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("marketModelId")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setMarketModelId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMarketModelId);
            setMarketModelId(refVal_setMarketModelId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("marketModelName"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("marketModelName")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMarketModelName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMarketModelName);
            setMarketModelName(refVal_setMarketModelName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("marketCategoryId"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("marketCategoryId")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setMarketCategoryId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMarketCategoryId);
            setMarketCategoryId(refVal_setMarketCategoryId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("marketCategoryName"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("marketCategoryName")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setMarketCategoryName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMarketCategoryName);
            setMarketCategoryName(refVal_setMarketCategoryName);
        }
    }
    return ok;
}

void GetMappingDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_MarketSkuIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("marketSku")), m_MarketSku));
    }
    if(m_MarketSkuNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("marketSkuName")), m_MarketSkuName));
    }
    if(m_MarketModelIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("marketModelId")), m_MarketModelId));
    }
    if(m_MarketModelNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("marketModelName")), m_MarketModelName));
    }
    if(m_MarketCategoryIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("marketCategoryId")), m_MarketCategoryId));
    }
    if(m_MarketCategoryNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("marketCategoryName")), m_MarketCategoryName));
    }
}

bool GetMappingDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("marketSku"))))
    {
        int64_t refVal_setMarketSku;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("marketSku"))), refVal_setMarketSku );
        setMarketSku(refVal_setMarketSku);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("marketSkuName"))))
    {
        utility::string_t refVal_setMarketSkuName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("marketSkuName"))), refVal_setMarketSkuName );
        setMarketSkuName(refVal_setMarketSkuName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("marketModelId"))))
    {
        int64_t refVal_setMarketModelId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("marketModelId"))), refVal_setMarketModelId );
        setMarketModelId(refVal_setMarketModelId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("marketModelName"))))
    {
        utility::string_t refVal_setMarketModelName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("marketModelName"))), refVal_setMarketModelName );
        setMarketModelName(refVal_setMarketModelName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("marketCategoryId"))))
    {
        int64_t refVal_setMarketCategoryId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("marketCategoryId"))), refVal_setMarketCategoryId );
        setMarketCategoryId(refVal_setMarketCategoryId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("marketCategoryName"))))
    {
        utility::string_t refVal_setMarketCategoryName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("marketCategoryName"))), refVal_setMarketCategoryName );
        setMarketCategoryName(refVal_setMarketCategoryName);
    }
    return ok;
}

int64_t GetMappingDTO::getMarketSku() const
{
    return m_MarketSku;
}

void GetMappingDTO::setMarketSku(int64_t value)
{
    m_MarketSku = value;
    m_MarketSkuIsSet = true;
}

bool GetMappingDTO::marketSkuIsSet() const
{
    return m_MarketSkuIsSet;
}

void GetMappingDTO::unsetMarketSku()
{
    m_MarketSkuIsSet = false;
}
utility::string_t GetMappingDTO::getMarketSkuName() const
{
    return m_MarketSkuName;
}

void GetMappingDTO::setMarketSkuName(const utility::string_t& value)
{
    m_MarketSkuName = value;
    m_MarketSkuNameIsSet = true;
}

bool GetMappingDTO::marketSkuNameIsSet() const
{
    return m_MarketSkuNameIsSet;
}

void GetMappingDTO::unsetMarketSkuName()
{
    m_MarketSkuNameIsSet = false;
}
int64_t GetMappingDTO::getMarketModelId() const
{
    return m_MarketModelId;
}

void GetMappingDTO::setMarketModelId(int64_t value)
{
    m_MarketModelId = value;
    m_MarketModelIdIsSet = true;
}

bool GetMappingDTO::marketModelIdIsSet() const
{
    return m_MarketModelIdIsSet;
}

void GetMappingDTO::unsetMarketModelId()
{
    m_MarketModelIdIsSet = false;
}
utility::string_t GetMappingDTO::getMarketModelName() const
{
    return m_MarketModelName;
}

void GetMappingDTO::setMarketModelName(const utility::string_t& value)
{
    m_MarketModelName = value;
    m_MarketModelNameIsSet = true;
}

bool GetMappingDTO::marketModelNameIsSet() const
{
    return m_MarketModelNameIsSet;
}

void GetMappingDTO::unsetMarketModelName()
{
    m_MarketModelNameIsSet = false;
}
int64_t GetMappingDTO::getMarketCategoryId() const
{
    return m_MarketCategoryId;
}

void GetMappingDTO::setMarketCategoryId(int64_t value)
{
    m_MarketCategoryId = value;
    m_MarketCategoryIdIsSet = true;
}

bool GetMappingDTO::marketCategoryIdIsSet() const
{
    return m_MarketCategoryIdIsSet;
}

void GetMappingDTO::unsetMarketCategoryId()
{
    m_MarketCategoryIdIsSet = false;
}
utility::string_t GetMappingDTO::getMarketCategoryName() const
{
    return m_MarketCategoryName;
}

void GetMappingDTO::setMarketCategoryName(const utility::string_t& value)
{
    m_MarketCategoryName = value;
    m_MarketCategoryNameIsSet = true;
}

bool GetMappingDTO::marketCategoryNameIsSet() const
{
    return m_MarketCategoryNameIsSet;
}

void GetMappingDTO::unsetMarketCategoryName()
{
    m_MarketCategoryNameIsSet = false;
}
}
}
}
}


