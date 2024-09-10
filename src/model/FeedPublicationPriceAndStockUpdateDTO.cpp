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



#include "ympa_cpp_restsdk_client/model/FeedPublicationPriceAndStockUpdateDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



FeedPublicationPriceAndStockUpdateDTO::FeedPublicationPriceAndStockUpdateDTO()
{
    m_FileTime = utility::datetime();
    m_FileTimeIsSet = false;
    m_PublishedTime = utility::datetime();
    m_PublishedTimeIsSet = false;
}

FeedPublicationPriceAndStockUpdateDTO::~FeedPublicationPriceAndStockUpdateDTO()
{
}

void FeedPublicationPriceAndStockUpdateDTO::validate()
{
    // TODO: implement validation
}

web::json::value FeedPublicationPriceAndStockUpdateDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_FileTimeIsSet)
    {
        val[utility::conversions::to_string_t(U("fileTime"))] = ModelBase::toJson(m_FileTime);
    }
    if(m_PublishedTimeIsSet)
    {
        val[utility::conversions::to_string_t(U("publishedTime"))] = ModelBase::toJson(m_PublishedTime);
    }

    return val;
}

bool FeedPublicationPriceAndStockUpdateDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("fileTime"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("fileTime")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setFileTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFileTime);
            setFileTime(refVal_setFileTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("publishedTime"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("publishedTime")));
        if(!fieldValue.is_null())
        {
            utility::datetime refVal_setPublishedTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPublishedTime);
            setPublishedTime(refVal_setPublishedTime);
        }
    }
    return ok;
}

void FeedPublicationPriceAndStockUpdateDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_FileTimeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("fileTime")), m_FileTime));
    }
    if(m_PublishedTimeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("publishedTime")), m_PublishedTime));
    }
}

bool FeedPublicationPriceAndStockUpdateDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("fileTime"))))
    {
        utility::datetime refVal_setFileTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("fileTime"))), refVal_setFileTime );
        setFileTime(refVal_setFileTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("publishedTime"))))
    {
        utility::datetime refVal_setPublishedTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("publishedTime"))), refVal_setPublishedTime );
        setPublishedTime(refVal_setPublishedTime);
    }
    return ok;
}

utility::datetime FeedPublicationPriceAndStockUpdateDTO::getFileTime() const
{
    return m_FileTime;
}

void FeedPublicationPriceAndStockUpdateDTO::setFileTime(const utility::datetime& value)
{
    m_FileTime = value;
    m_FileTimeIsSet = true;
}

bool FeedPublicationPriceAndStockUpdateDTO::fileTimeIsSet() const
{
    return m_FileTimeIsSet;
}

void FeedPublicationPriceAndStockUpdateDTO::unsetFileTime()
{
    m_FileTimeIsSet = false;
}
utility::datetime FeedPublicationPriceAndStockUpdateDTO::getPublishedTime() const
{
    return m_PublishedTime;
}

void FeedPublicationPriceAndStockUpdateDTO::setPublishedTime(const utility::datetime& value)
{
    m_PublishedTime = value;
    m_PublishedTimeIsSet = true;
}

bool FeedPublicationPriceAndStockUpdateDTO::publishedTimeIsSet() const
{
    return m_PublishedTimeIsSet;
}

void FeedPublicationPriceAndStockUpdateDTO::unsetPublishedTime()
{
    m_PublishedTimeIsSet = false;
}
}
}
}
}


