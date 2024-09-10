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



#include "ympa_cpp_restsdk_client/model/EnrichedModelsDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



EnrichedModelsDTO::EnrichedModelsDTO()
{
    m_ModelsIsSet = false;
}

EnrichedModelsDTO::~EnrichedModelsDTO()
{
}

void EnrichedModelsDTO::validate()
{
    // TODO: implement validation
}

web::json::value EnrichedModelsDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ModelsIsSet)
    {
        val[utility::conversions::to_string_t(U("models"))] = ModelBase::toJson(m_Models);
    }

    return val;
}

bool EnrichedModelsDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("models"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("models")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<EnrichedModelDTO>> refVal_setModels;
            ok &= ModelBase::fromJson(fieldValue, refVal_setModels);
            setModels(refVal_setModels);
        }
    }
    return ok;
}

void EnrichedModelsDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_ModelsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("models")), m_Models));
    }
}

bool EnrichedModelsDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("models"))))
    {
        std::vector<std::shared_ptr<EnrichedModelDTO>> refVal_setModels;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("models"))), refVal_setModels );
        setModels(refVal_setModels);
    }
    return ok;
}

std::vector<std::shared_ptr<EnrichedModelDTO>>& EnrichedModelsDTO::getModels()
{
    return m_Models;
}

void EnrichedModelsDTO::setModels(const std::vector<std::shared_ptr<EnrichedModelDTO>>& value)
{
    m_Models = value;
    m_ModelsIsSet = true;
}

bool EnrichedModelsDTO::modelsIsSet() const
{
    return m_ModelsIsSet;
}

void EnrichedModelsDTO::unsetModels()
{
    m_ModelsIsSet = false;
}
}
}
}
}


