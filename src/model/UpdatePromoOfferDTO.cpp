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



#include "ympa_cpp_restsdk_client/model/UpdatePromoOfferDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UpdatePromoOfferDTO::UpdatePromoOfferDTO()
{
    m_OfferId = utility::conversions::to_string_t("");
    m_OfferIdIsSet = false;
    m_ParamsIsSet = false;
}

UpdatePromoOfferDTO::~UpdatePromoOfferDTO()
{
}

void UpdatePromoOfferDTO::validate()
{
    // TODO: implement validation
}

web::json::value UpdatePromoOfferDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_OfferIdIsSet)
    {
        val[utility::conversions::to_string_t(U("offerId"))] = ModelBase::toJson(m_OfferId);
    }
    if(m_ParamsIsSet)
    {
        val[utility::conversions::to_string_t(U("params"))] = ModelBase::toJson(m_Params);
    }

    return val;
}

bool UpdatePromoOfferDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("offerId"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("offerId")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOfferId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOfferId);
            setOfferId(refVal_setOfferId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("params"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("params")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<UpdatePromoOfferParamsDTO> refVal_setParams;
            ok &= ModelBase::fromJson(fieldValue, refVal_setParams);
            setParams(refVal_setParams);
        }
    }
    return ok;
}

void UpdatePromoOfferDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_OfferIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("offerId")), m_OfferId));
    }
    if(m_ParamsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("params")), m_Params));
    }
}

bool UpdatePromoOfferDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("offerId"))))
    {
        utility::string_t refVal_setOfferId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("offerId"))), refVal_setOfferId );
        setOfferId(refVal_setOfferId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("params"))))
    {
        std::shared_ptr<UpdatePromoOfferParamsDTO> refVal_setParams;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("params"))), refVal_setParams );
        setParams(refVal_setParams);
    }
    return ok;
}

utility::string_t UpdatePromoOfferDTO::getOfferId() const
{
    return m_OfferId;
}

void UpdatePromoOfferDTO::setOfferId(const utility::string_t& value)
{
    m_OfferId = value;
    m_OfferIdIsSet = true;
}

bool UpdatePromoOfferDTO::offerIdIsSet() const
{
    return m_OfferIdIsSet;
}

void UpdatePromoOfferDTO::unsetOfferId()
{
    m_OfferIdIsSet = false;
}
std::shared_ptr<UpdatePromoOfferParamsDTO> UpdatePromoOfferDTO::getParams() const
{
    return m_Params;
}

void UpdatePromoOfferDTO::setParams(const std::shared_ptr<UpdatePromoOfferParamsDTO>& value)
{
    m_Params = value;
    m_ParamsIsSet = true;
}

bool UpdatePromoOfferDTO::paramsIsSet() const
{
    return m_ParamsIsSet;
}

void UpdatePromoOfferDTO::unsetParams()
{
    m_ParamsIsSet = false;
}
}
}
}
}


