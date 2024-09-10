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



#include "ympa_cpp_restsdk_client/model/FulfillmentWarehousesDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



FulfillmentWarehousesDTO::FulfillmentWarehousesDTO()
{
    m_WarehousesIsSet = false;
}

FulfillmentWarehousesDTO::~FulfillmentWarehousesDTO()
{
}

void FulfillmentWarehousesDTO::validate()
{
    // TODO: implement validation
}

web::json::value FulfillmentWarehousesDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_WarehousesIsSet)
    {
        val[utility::conversions::to_string_t(U("warehouses"))] = ModelBase::toJson(m_Warehouses);
    }

    return val;
}

bool FulfillmentWarehousesDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("warehouses"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("warehouses")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<FulfillmentWarehouseDTO>> refVal_setWarehouses;
            ok &= ModelBase::fromJson(fieldValue, refVal_setWarehouses);
            setWarehouses(refVal_setWarehouses);
        }
    }
    return ok;
}

void FulfillmentWarehousesDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_WarehousesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("warehouses")), m_Warehouses));
    }
}

bool FulfillmentWarehousesDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("warehouses"))))
    {
        std::vector<std::shared_ptr<FulfillmentWarehouseDTO>> refVal_setWarehouses;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("warehouses"))), refVal_setWarehouses );
        setWarehouses(refVal_setWarehouses);
    }
    return ok;
}

std::vector<std::shared_ptr<FulfillmentWarehouseDTO>>& FulfillmentWarehousesDTO::getWarehouses()
{
    return m_Warehouses;
}

void FulfillmentWarehousesDTO::setWarehouses(const std::vector<std::shared_ptr<FulfillmentWarehouseDTO>>& value)
{
    m_Warehouses = value;
    m_WarehousesIsSet = true;
}

bool FulfillmentWarehousesDTO::warehousesIsSet() const
{
    return m_WarehousesIsSet;
}

void FulfillmentWarehousesDTO::unsetWarehouses()
{
    m_WarehousesIsSet = false;
}
}
}
}
}


