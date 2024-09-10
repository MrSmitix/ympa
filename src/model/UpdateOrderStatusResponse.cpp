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



#include "ympa_cpp_restsdk_client/model/UpdateOrderStatusResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UpdateOrderStatusResponse::UpdateOrderStatusResponse()
{
    m_OrderIsSet = false;
}

UpdateOrderStatusResponse::~UpdateOrderStatusResponse()
{
}

void UpdateOrderStatusResponse::validate()
{
    // TODO: implement validation
}

web::json::value UpdateOrderStatusResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_OrderIsSet)
    {
        val[utility::conversions::to_string_t(U("order"))] = ModelBase::toJson(m_Order);
    }

    return val;
}

bool UpdateOrderStatusResponse::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("order"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("order")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OrderDTO> refVal_setOrder;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOrder);
            setOrder(refVal_setOrder);
        }
    }
    return ok;
}

void UpdateOrderStatusResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_OrderIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("order")), m_Order));
    }
}

bool UpdateOrderStatusResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("order"))))
    {
        std::shared_ptr<OrderDTO> refVal_setOrder;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("order"))), refVal_setOrder );
        setOrder(refVal_setOrder);
    }
    return ok;
}

std::shared_ptr<OrderDTO> UpdateOrderStatusResponse::getOrder() const
{
    return m_Order;
}

void UpdateOrderStatusResponse::setOrder(const std::shared_ptr<OrderDTO>& value)
{
    m_Order = value;
    m_OrderIsSet = true;
}

bool UpdateOrderStatusResponse::orderIsSet() const
{
    return m_OrderIsSet;
}

void UpdateOrderStatusResponse::unsetOrder()
{
    m_OrderIsSet = false;
}
}
}
}
}


