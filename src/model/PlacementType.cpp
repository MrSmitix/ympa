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



#include "ympa_cpp_restsdk_client/model/PlacementType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

PlacementType::ePlacementType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("FBS")))
        return PlacementType::ePlacementType::PlacementType_FBS;
    if (val == utility::conversions::to_string_t(U("FBY")))
        return PlacementType::ePlacementType::PlacementType_FBY;
    if (val == utility::conversions::to_string_t(U("DBS")))
        return PlacementType::ePlacementType::PlacementType_DBS;
    return {};
}

EnumUnderlyingType fromEnum(PlacementType::ePlacementType e)
{
    switch (e)
    {
    case PlacementType::ePlacementType::PlacementType_FBS:
        return U("FBS");
    case PlacementType::ePlacementType::PlacementType_FBY:
        return U("FBY");
    case PlacementType::ePlacementType::PlacementType_DBS:
        return U("DBS");
    default:
        break;
    }
    return {};
}
}

PlacementType::PlacementType()
{
}

PlacementType::~PlacementType()
{
}

void PlacementType::validate()
{
    // TODO: implement validation
}

web::json::value PlacementType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool PlacementType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void PlacementType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool PlacementType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }
    {
        EnumUnderlyingType e;
        ok = ModelBase::fromHttpContent(multipart->getContent(namePrefix), e);
        if (ok)
        {
            auto v = toEnum(e);
            setValue(v);
        }
    }
    return ok;
}

PlacementType::ePlacementType PlacementType::getValue() const
{
   return m_value;
}

void PlacementType::setValue(PlacementType::ePlacementType const value)
{
   m_value = value;
}


}
}
}
}


