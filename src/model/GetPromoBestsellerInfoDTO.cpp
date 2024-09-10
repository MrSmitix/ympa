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



#include "ympa_cpp_restsdk_client/model/GetPromoBestsellerInfoDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GetPromoBestsellerInfoDTO::GetPromoBestsellerInfoDTO()
{
    m_Bestseller = false;
    m_BestsellerIsSet = false;
    m_EntryDeadline = utility::datetime();
    m_EntryDeadlineIsSet = false;
}

GetPromoBestsellerInfoDTO::~GetPromoBestsellerInfoDTO()
{
}

void GetPromoBestsellerInfoDTO::validate()
{
    // TODO: implement validation
}

web::json::value GetPromoBestsellerInfoDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_BestsellerIsSet)
    {
        val[utility::conversions::to_string_t(U("bestseller"))] = ModelBase::toJson(m_Bestseller);
    }
    if(m_EntryDeadlineIsSet)
    {
        val[utility::conversions::to_string_t(U("entryDeadline"))] = ModelBase::toJson(m_EntryDeadline);
    }

    return val;
}

bool GetPromoBestsellerInfoDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("bestseller"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("bestseller")));
        if(!fieldValue.is_null())
        {
            bool refVal_setBestseller;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBestseller);
            setBestseller(refVal_setBestseller);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("entryDeadline"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("entryDeadline")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setEntryDeadline;
            ok &= ModelBase::fromJson(fieldValue, refVal_setEntryDeadline);
            setEntryDeadline(refVal_setEntryDeadline);
        }
    }
    return ok;
}

void GetPromoBestsellerInfoDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_BestsellerIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("bestseller")), m_Bestseller));
    }
    if(m_EntryDeadlineIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("entryDeadline")), m_EntryDeadline));
    }
}

bool GetPromoBestsellerInfoDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("bestseller"))))
    {
        bool refVal_setBestseller;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("bestseller"))), refVal_setBestseller );
        setBestseller(refVal_setBestseller);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("entryDeadline"))))
    {
        utility::datetime refVal_setEntryDeadline;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("entryDeadline"))), refVal_setEntryDeadline );
        setEntryDeadline(refVal_setEntryDeadline);
    }
    return ok;
}

bool GetPromoBestsellerInfoDTO::isBestseller() const
{
    return m_Bestseller;
}

void GetPromoBestsellerInfoDTO::setBestseller(bool value)
{
    m_Bestseller = value;
    m_BestsellerIsSet = true;
}

bool GetPromoBestsellerInfoDTO::bestsellerIsSet() const
{
    return m_BestsellerIsSet;
}

void GetPromoBestsellerInfoDTO::unsetBestseller()
{
    m_BestsellerIsSet = false;
}
utility::datetime GetPromoBestsellerInfoDTO::getEntryDeadline() const
{
    return m_EntryDeadline;
}

void GetPromoBestsellerInfoDTO::setEntryDeadline(const utility::datetime& value)
{
    m_EntryDeadline = value;
    m_EntryDeadlineIsSet = true;
}

bool GetPromoBestsellerInfoDTO::entryDeadlineIsSet() const
{
    return m_EntryDeadlineIsSet;
}

void GetPromoBestsellerInfoDTO::unsetEntryDeadline()
{
    m_EntryDeadlineIsSet = false;
}
}
}
}
}


