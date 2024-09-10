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



#include "ympa_cpp_restsdk_client/model/GetBidsInfoResponseDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GetBidsInfoResponseDTO::GetBidsInfoResponseDTO()
{
    m_BidsIsSet = false;
    m_PagingIsSet = false;
}

GetBidsInfoResponseDTO::~GetBidsInfoResponseDTO()
{
}

void GetBidsInfoResponseDTO::validate()
{
    // TODO: implement validation
}

web::json::value GetBidsInfoResponseDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_BidsIsSet)
    {
        val[utility::conversions::to_string_t(U("bids"))] = ModelBase::toJson(m_Bids);
    }
    if(m_PagingIsSet)
    {
        val[utility::conversions::to_string_t(U("paging"))] = ModelBase::toJson(m_Paging);
    }

    return val;
}

bool GetBidsInfoResponseDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("bids"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("bids")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<SkuBidItemDTO>> refVal_setBids;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBids);
            setBids(refVal_setBids);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("paging"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("paging")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ForwardScrollingPagerDTO> refVal_setPaging;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPaging);
            setPaging(refVal_setPaging);
        }
    }
    return ok;
}

void GetBidsInfoResponseDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_BidsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("bids")), m_Bids));
    }
    if(m_PagingIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("paging")), m_Paging));
    }
}

bool GetBidsInfoResponseDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("bids"))))
    {
        std::vector<std::shared_ptr<SkuBidItemDTO>> refVal_setBids;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("bids"))), refVal_setBids );
        setBids(refVal_setBids);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("paging"))))
    {
        std::shared_ptr<ForwardScrollingPagerDTO> refVal_setPaging;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("paging"))), refVal_setPaging );
        setPaging(refVal_setPaging);
    }
    return ok;
}

std::vector<std::shared_ptr<SkuBidItemDTO>>& GetBidsInfoResponseDTO::getBids()
{
    return m_Bids;
}

void GetBidsInfoResponseDTO::setBids(const std::vector<std::shared_ptr<SkuBidItemDTO>>& value)
{
    m_Bids = value;
    m_BidsIsSet = true;
}

bool GetBidsInfoResponseDTO::bidsIsSet() const
{
    return m_BidsIsSet;
}

void GetBidsInfoResponseDTO::unsetBids()
{
    m_BidsIsSet = false;
}
std::shared_ptr<ForwardScrollingPagerDTO> GetBidsInfoResponseDTO::getPaging() const
{
    return m_Paging;
}

void GetBidsInfoResponseDTO::setPaging(const std::shared_ptr<ForwardScrollingPagerDTO>& value)
{
    m_Paging = value;
    m_PagingIsSet = true;
}

bool GetBidsInfoResponseDTO::pagingIsSet() const
{
    return m_PagingIsSet;
}

void GetBidsInfoResponseDTO::unsetPaging()
{
    m_PagingIsSet = false;
}
}
}
}
}


