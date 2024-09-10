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



#include "ympa_cpp_restsdk_client/model/DeleteOffersDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



DeleteOffersDTO::DeleteOffersDTO()
{
    m_NotDeletedOfferIdsIsSet = false;
}

DeleteOffersDTO::~DeleteOffersDTO()
{
}

void DeleteOffersDTO::validate()
{
    // TODO: implement validation
}

web::json::value DeleteOffersDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_NotDeletedOfferIdsIsSet)
    {
        val[utility::conversions::to_string_t(U("notDeletedOfferIds"))] = ModelBase::toJson(m_NotDeletedOfferIds);
    }

    return val;
}

bool DeleteOffersDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("notDeletedOfferIds"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("notDeletedOfferIds")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<utility::string_t>> refVal_setNotDeletedOfferIds;
            ok &= ModelBase::fromJson(fieldValue, refVal_setNotDeletedOfferIds);
            setNotDeletedOfferIds(refVal_setNotDeletedOfferIds);
        }
    }
    return ok;
}

void DeleteOffersDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_NotDeletedOfferIdsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("notDeletedOfferIds")), m_NotDeletedOfferIds));
    }
}

bool DeleteOffersDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("notDeletedOfferIds"))))
    {
        std::vector<std::shared_ptr<utility::string_t>> refVal_setNotDeletedOfferIds;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("notDeletedOfferIds"))), refVal_setNotDeletedOfferIds );
        setNotDeletedOfferIds(refVal_setNotDeletedOfferIds);
    }
    return ok;
}

std::vector<std::shared_ptr<utility::string_t>>& DeleteOffersDTO::getNotDeletedOfferIds()
{
    return m_NotDeletedOfferIds;
}

void DeleteOffersDTO::setNotDeletedOfferIds(const std::vector<std::shared_ptr<utility::string_t>>& value)
{
    m_NotDeletedOfferIds = value;
    m_NotDeletedOfferIdsIsSet = true;
}

bool DeleteOffersDTO::notDeletedOfferIdsIsSet() const
{
    return m_NotDeletedOfferIdsIsSet;
}

void DeleteOffersDTO::unsetNotDeletedOfferIds()
{
    m_NotDeletedOfferIdsIsSet = false;
}
}
}
}
}


