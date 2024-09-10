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



#include "ympa_cpp_restsdk_client/model/SetOrderBoxLayoutRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



SetOrderBoxLayoutRequest::SetOrderBoxLayoutRequest()
{
    m_BoxesIsSet = false;
    m_AllowRemove = false;
    m_AllowRemoveIsSet = false;
}

SetOrderBoxLayoutRequest::~SetOrderBoxLayoutRequest()
{
}

void SetOrderBoxLayoutRequest::validate()
{
    // TODO: implement validation
}

web::json::value SetOrderBoxLayoutRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_BoxesIsSet)
    {
        val[utility::conversions::to_string_t(U("boxes"))] = ModelBase::toJson(m_Boxes);
    }
    if(m_AllowRemoveIsSet)
    {
        val[utility::conversions::to_string_t(U("allowRemove"))] = ModelBase::toJson(m_AllowRemove);
    }

    return val;
}

bool SetOrderBoxLayoutRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("boxes"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("boxes")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<OrderBoxLayoutDTO>> refVal_setBoxes;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBoxes);
            setBoxes(refVal_setBoxes);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("allowRemove"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("allowRemove")));
        if(!fieldValue.is_null())
        {
            bool refVal_setAllowRemove;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAllowRemove);
            setAllowRemove(refVal_setAllowRemove);
        }
    }
    return ok;
}

void SetOrderBoxLayoutRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_BoxesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("boxes")), m_Boxes));
    }
    if(m_AllowRemoveIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("allowRemove")), m_AllowRemove));
    }
}

bool SetOrderBoxLayoutRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("boxes"))))
    {
        std::vector<std::shared_ptr<OrderBoxLayoutDTO>> refVal_setBoxes;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("boxes"))), refVal_setBoxes );
        setBoxes(refVal_setBoxes);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("allowRemove"))))
    {
        bool refVal_setAllowRemove;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("allowRemove"))), refVal_setAllowRemove );
        setAllowRemove(refVal_setAllowRemove);
    }
    return ok;
}

std::vector<std::shared_ptr<OrderBoxLayoutDTO>>& SetOrderBoxLayoutRequest::getBoxes()
{
    return m_Boxes;
}

void SetOrderBoxLayoutRequest::setBoxes(const std::vector<std::shared_ptr<OrderBoxLayoutDTO>>& value)
{
    m_Boxes = value;
    m_BoxesIsSet = true;
}

bool SetOrderBoxLayoutRequest::boxesIsSet() const
{
    return m_BoxesIsSet;
}

void SetOrderBoxLayoutRequest::unsetBoxes()
{
    m_BoxesIsSet = false;
}
bool SetOrderBoxLayoutRequest::isAllowRemove() const
{
    return m_AllowRemove;
}

void SetOrderBoxLayoutRequest::setAllowRemove(bool value)
{
    m_AllowRemove = value;
    m_AllowRemoveIsSet = true;
}

bool SetOrderBoxLayoutRequest::allowRemoveIsSet() const
{
    return m_AllowRemoveIsSet;
}

void SetOrderBoxLayoutRequest::unsetAllowRemove()
{
    m_AllowRemoveIsSet = false;
}
}
}
}
}


