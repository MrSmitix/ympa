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



#include "ympa_cpp_restsdk_client/model/GetPriceWithVatDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GetPriceWithVatDTO::GetPriceWithVatDTO()
{
    m_Value = 0.0;
    m_ValueIsSet = false;
    m_DiscountBase = 0.0;
    m_DiscountBaseIsSet = false;
    m_CurrencyIdIsSet = false;
    m_Vat = 0;
    m_VatIsSet = false;
    m_UpdatedAt = utility::datetime();
    m_UpdatedAtIsSet = false;
}

GetPriceWithVatDTO::~GetPriceWithVatDTO()
{
}

void GetPriceWithVatDTO::validate()
{
    // TODO: implement validation
}

web::json::value GetPriceWithVatDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ValueIsSet)
    {
        val[utility::conversions::to_string_t(U("value"))] = ModelBase::toJson(m_Value);
    }
    if(m_DiscountBaseIsSet)
    {
        val[utility::conversions::to_string_t(U("discountBase"))] = ModelBase::toJson(m_DiscountBase);
    }
    if(m_CurrencyIdIsSet)
    {
        val[utility::conversions::to_string_t(U("currencyId"))] = ModelBase::toJson(m_CurrencyId);
    }
    if(m_VatIsSet)
    {
        val[utility::conversions::to_string_t(U("vat"))] = ModelBase::toJson(m_Vat);
    }
    if(m_UpdatedAtIsSet)
    {
        val[utility::conversions::to_string_t(U("updatedAt"))] = ModelBase::toJson(m_UpdatedAt);
    }

    return val;
}

bool GetPriceWithVatDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("vat"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("vat")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setVat;
            ok &= ModelBase::fromJson(fieldValue, refVal_setVat);
            setVat(refVal_setVat);
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

void GetPriceWithVatDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_DiscountBaseIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("discountBase")), m_DiscountBase));
    }
    if(m_CurrencyIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("currencyId")), m_CurrencyId));
    }
    if(m_VatIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("vat")), m_Vat));
    }
    if(m_UpdatedAtIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("updatedAt")), m_UpdatedAt));
    }
}

bool GetPriceWithVatDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("discountBase"))))
    {
        double refVal_setDiscountBase;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("discountBase"))), refVal_setDiscountBase );
        setDiscountBase(refVal_setDiscountBase);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("currencyId"))))
    {
        std::shared_ptr<CurrencyType> refVal_setCurrencyId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("currencyId"))), refVal_setCurrencyId );
        setCurrencyId(refVal_setCurrencyId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("vat"))))
    {
        int32_t refVal_setVat;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("vat"))), refVal_setVat );
        setVat(refVal_setVat);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("updatedAt"))))
    {
        utility::datetime refVal_setUpdatedAt;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("updatedAt"))), refVal_setUpdatedAt );
        setUpdatedAt(refVal_setUpdatedAt);
    }
    return ok;
}

double GetPriceWithVatDTO::getValue() const
{
    return m_Value;
}

void GetPriceWithVatDTO::setValue(double value)
{
    m_Value = value;
    m_ValueIsSet = true;
}

bool GetPriceWithVatDTO::valueIsSet() const
{
    return m_ValueIsSet;
}

void GetPriceWithVatDTO::unsetValue()
{
    m_ValueIsSet = false;
}
double GetPriceWithVatDTO::getDiscountBase() const
{
    return m_DiscountBase;
}

void GetPriceWithVatDTO::setDiscountBase(double value)
{
    m_DiscountBase = value;
    m_DiscountBaseIsSet = true;
}

bool GetPriceWithVatDTO::discountBaseIsSet() const
{
    return m_DiscountBaseIsSet;
}

void GetPriceWithVatDTO::unsetDiscountBase()
{
    m_DiscountBaseIsSet = false;
}
std::shared_ptr<CurrencyType> GetPriceWithVatDTO::getCurrencyId() const
{
    return m_CurrencyId;
}

void GetPriceWithVatDTO::setCurrencyId(const std::shared_ptr<CurrencyType>& value)
{
    m_CurrencyId = value;
    m_CurrencyIdIsSet = true;
}

bool GetPriceWithVatDTO::currencyIdIsSet() const
{
    return m_CurrencyIdIsSet;
}

void GetPriceWithVatDTO::unsetCurrencyId()
{
    m_CurrencyIdIsSet = false;
}
int32_t GetPriceWithVatDTO::getVat() const
{
    return m_Vat;
}

void GetPriceWithVatDTO::setVat(int32_t value)
{
    m_Vat = value;
    m_VatIsSet = true;
}

bool GetPriceWithVatDTO::vatIsSet() const
{
    return m_VatIsSet;
}

void GetPriceWithVatDTO::unsetVat()
{
    m_VatIsSet = false;
}
utility::datetime GetPriceWithVatDTO::getUpdatedAt() const
{
    return m_UpdatedAt;
}

void GetPriceWithVatDTO::setUpdatedAt(const utility::datetime& value)
{
    m_UpdatedAt = value;
    m_UpdatedAtIsSet = true;
}

bool GetPriceWithVatDTO::updatedAtIsSet() const
{
    return m_UpdatedAtIsSet;
}

void GetPriceWithVatDTO::unsetUpdatedAt()
{
    m_UpdatedAtIsSet = false;
}
}
}
}
}


