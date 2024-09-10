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



#include "ympa_cpp_restsdk_client/model/GetChatsInfoDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GetChatsInfoDTO::GetChatsInfoDTO()
{
    m_ChatsIsSet = false;
    m_PagingIsSet = false;
}

GetChatsInfoDTO::~GetChatsInfoDTO()
{
}

void GetChatsInfoDTO::validate()
{
    // TODO: implement validation
}

web::json::value GetChatsInfoDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ChatsIsSet)
    {
        val[utility::conversions::to_string_t(U("chats"))] = ModelBase::toJson(m_Chats);
    }
    if(m_PagingIsSet)
    {
        val[utility::conversions::to_string_t(U("paging"))] = ModelBase::toJson(m_Paging);
    }

    return val;
}

bool GetChatsInfoDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("chats"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("chats")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<GetChatInfoDTO>> refVal_setChats;
            ok &= ModelBase::fromJson(fieldValue, refVal_setChats);
            setChats(refVal_setChats);
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

void GetChatsInfoDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_ChatsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("chats")), m_Chats));
    }
    if(m_PagingIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("paging")), m_Paging));
    }
}

bool GetChatsInfoDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("chats"))))
    {
        std::vector<std::shared_ptr<GetChatInfoDTO>> refVal_setChats;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("chats"))), refVal_setChats );
        setChats(refVal_setChats);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("paging"))))
    {
        std::shared_ptr<ForwardScrollingPagerDTO> refVal_setPaging;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("paging"))), refVal_setPaging );
        setPaging(refVal_setPaging);
    }
    return ok;
}

std::vector<std::shared_ptr<GetChatInfoDTO>>& GetChatsInfoDTO::getChats()
{
    return m_Chats;
}

void GetChatsInfoDTO::setChats(const std::vector<std::shared_ptr<GetChatInfoDTO>>& value)
{
    m_Chats = value;
    m_ChatsIsSet = true;
}

bool GetChatsInfoDTO::chatsIsSet() const
{
    return m_ChatsIsSet;
}

void GetChatsInfoDTO::unsetChats()
{
    m_ChatsIsSet = false;
}
std::shared_ptr<ForwardScrollingPagerDTO> GetChatsInfoDTO::getPaging() const
{
    return m_Paging;
}

void GetChatsInfoDTO::setPaging(const std::shared_ptr<ForwardScrollingPagerDTO>& value)
{
    m_Paging = value;
    m_PagingIsSet = true;
}

bool GetChatsInfoDTO::pagingIsSet() const
{
    return m_PagingIsSet;
}

void GetChatsInfoDTO::unsetPaging()
{
    m_PagingIsSet = false;
}
}
}
}
}


