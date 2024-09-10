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



#include "ympa_cpp_restsdk_client/model/ParcelDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ParcelDTO::ParcelDTO()
{
    m_BoxesIsSet = false;
}

ParcelDTO::~ParcelDTO()
{
}

void ParcelDTO::validate()
{
    // TODO: implement validation
}

web::json::value ParcelDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_BoxesIsSet)
    {
        val[utility::conversions::to_string_t(U("boxes"))] = ModelBase::toJson(m_Boxes);
    }

    return val;
}

bool ParcelDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("boxes"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("boxes")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<ParcelBoxDTO>> refVal_setBoxes;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBoxes);
            setBoxes(refVal_setBoxes);
        }
    }
    return ok;
}

void ParcelDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
}

bool ParcelDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("boxes"))))
    {
        std::vector<std::shared_ptr<ParcelBoxDTO>> refVal_setBoxes;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("boxes"))), refVal_setBoxes );
        setBoxes(refVal_setBoxes);
    }
    return ok;
}

std::vector<std::shared_ptr<ParcelBoxDTO>>& ParcelDTO::getBoxes()
{
    return m_Boxes;
}

void ParcelDTO::setBoxes(const std::vector<std::shared_ptr<ParcelBoxDTO>>& value)
{
    m_Boxes = value;
    m_BoxesIsSet = true;
}

bool ParcelDTO::boxesIsSet() const
{
    return m_BoxesIsSet;
}

void ParcelDTO::unsetBoxes()
{
    m_BoxesIsSet = false;
}
}
}
}
}


