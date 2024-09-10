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



#include "ympa_cpp_restsdk_client/model/GetPriceWithDiscountDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GetPriceWithDiscountDTO::GetPriceWithDiscountDTO()
{
    m_Value = 0.0;
    m_ValueIsSet = false;
    m_CurrencyIdIsSet = false;
    m_DiscountBase = 0.0;
    m_DiscountBaseIsSet = false;
    m_UpdatedAt = utility::datetime();
    m_UpdatedAtIsSet = false;
}

GetPriceWithDiscountDTO::~GetPriceWithDiscountDTO()
{
}

void GetPriceWithDiscountDTO::validate()
{
    // TODO: implement validation
}

web::json::value GetPriceWithDiscountDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ValueIsSet)
    {
        val[utility::conversions::to_string_t(U("value"))] = ModelBase::toJson(m_Value);
    }
    if(m_CurrencyIdIsSet)
    {
        val[utility::conversions::to_string_t(U("currencyId"))] = ModelBase::toJson(m_CurrencyId);
    }
    if(m_DiscountBaseIsSet)
    {
        val[utility::conversions::to_string_t(U("discountBase"))] = ModelBase::toJson(m_DiscountBase);
    }
    if(m_UpdatedAtIsSet)
    {
        val[utility::conversions::to_string_t(U("updatedAt"))] = ModelBase::toJson(m_UpdatedAt);
    }

    return val;
}

bool GetPriceWithDiscountDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("value"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("value")));
        if(!fieldValue.is_null())
        {
            double refVal_setValue;
            ok &= ModelBase::fromJson(fieldValue, refVal_setValue);
            setValue(refVal_setValue);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("currencyId"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("currencyId")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<CurrencyType> refVal_setCurrencyId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCurrencyId);
            setCurrencyId(refVal_setCurrencyId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("discountBase"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("discountBase")));
        if(!fieldValue.is_null())
        {
            double refVal_setDiscountBase;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDiscountBase);
            setDiscountBase(refVal_setDiscountBase);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("updatedAt"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("updatedAt")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setUpdatedAt;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUpdatedAt);
            setUpdatedAt(refVal_setUpdatedAt);
        }
    }
    return ok;
}

void GetPriceWithDiscountDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_ValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("value")), m_Value));
    }
    if(m_CurrencyIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("currencyId")), m_CurrencyId));
    }
    if(m_DiscountBaseIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("discountBase")), m_DiscountBase));
    }
    if(m_UpdatedAtIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("updatedAt")), m_UpdatedAt));
    }
}

bool GetPriceWithDiscountDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("value"))))
    {
        double refVal_setValue;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("value"))), refVal_setValue );
        setValue(refVal_setValue);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("currencyId"))))
    {
        std::shared_ptr<CurrencyType> refVal_setCurrencyId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("currencyId"))), refVal_setCurrencyId );
        setCurrencyId(refVal_setCurrencyId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("discountBase"))))
    {
        double refVal_setDiscountBase;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("discountBase"))), refVal_setDiscountBase );
        setDiscountBase(refVal_setDiscountBase);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("updatedAt"))))
    {
        utility::datetime refVal_setUpdatedAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("updatedAt"))), refVal_setUpdatedAt );
        setUpdatedAt(refVal_setUpdatedAt);
    }
    return ok;
}

double GetPriceWithDiscountDTO::getValue() const
{
    return m_Value;
}

void GetPriceWithDiscountDTO::setValue(double value)
{
    m_Value = value;
    m_ValueIsSet = true;
}

bool GetPriceWithDiscountDTO::valueIsSet() const
{
    return m_ValueIsSet;
}

void GetPriceWithDiscountDTO::unsetValue()
{
    m_ValueIsSet = false;
}
std::shared_ptr<CurrencyType> GetPriceWithDiscountDTO::getCurrencyId() const
{
    return m_CurrencyId;
}

void GetPriceWithDiscountDTO::setCurrencyId(const std::shared_ptr<CurrencyType>& value)
{
    m_CurrencyId = value;
    m_CurrencyIdIsSet = true;
}

bool GetPriceWithDiscountDTO::currencyIdIsSet() const
{
    return m_CurrencyIdIsSet;
}

void GetPriceWithDiscountDTO::unsetCurrencyId()
{
    m_CurrencyIdIsSet = false;
}
double GetPriceWithDiscountDTO::getDiscountBase() const
{
    return m_DiscountBase;
}

void GetPriceWithDiscountDTO::setDiscountBase(double value)
{
    m_DiscountBase = value;
    m_DiscountBaseIsSet = true;
}

bool GetPriceWithDiscountDTO::discountBaseIsSet() const
{
    return m_DiscountBaseIsSet;
}

void GetPriceWithDiscountDTO::unsetDiscountBase()
{
    m_DiscountBaseIsSet = false;
}
utility::datetime GetPriceWithDiscountDTO::getUpdatedAt() const
{
    return m_UpdatedAt;
}

void GetPriceWithDiscountDTO::setUpdatedAt(const utility::datetime& value)
{
    m_UpdatedAt = value;
    m_UpdatedAtIsSet = true;
}

bool GetPriceWithDiscountDTO::updatedAtIsSet() const
{
    return m_UpdatedAtIsSet;
}

void GetPriceWithDiscountDTO::unsetUpdatedAt()
{
    m_UpdatedAtIsSet = false;
}
}
}
}
}


