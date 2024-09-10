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



#include "ympa_cpp_restsdk_client/model/ModelPriceDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



ModelPriceDTO::ModelPriceDTO()
{
    m_Avg = 0.0;
    m_AvgIsSet = false;
    m_Max = 0.0;
    m_MaxIsSet = false;
    m_Min = 0.0;
    m_MinIsSet = false;
}

ModelPriceDTO::~ModelPriceDTO()
{
}

void ModelPriceDTO::validate()
{
    // TODO: implement validation
}

web::json::value ModelPriceDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_AvgIsSet)
    {
        val[utility::conversions::to_string_t(U("avg"))] = ModelBase::toJson(m_Avg);
    }
    if(m_MaxIsSet)
    {
        val[utility::conversions::to_string_t(U("max"))] = ModelBase::toJson(m_Max);
    }
    if(m_MinIsSet)
    {
        val[utility::conversions::to_string_t(U("min"))] = ModelBase::toJson(m_Min);
    }

    return val;
}

bool ModelPriceDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("avg"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("avg")));
        if(!fieldValue.is_null())
        {
            double refVal_setAvg;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAvg);
            setAvg(refVal_setAvg);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("max"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("max")));
        if(!fieldValue.is_null())
        {
            double refVal_setMax;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMax);
            setMax(refVal_setMax);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("min"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("min")));
        if(!fieldValue.is_null())
        {
            double refVal_setMin;
            ok &= ModelBase::fromJson(fieldValue, refVal_setMin);
            setMin(refVal_setMin);
        }
    }
    return ok;
}

void ModelPriceDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_AvgIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("avg")), m_Avg));
    }
    if(m_MaxIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("max")), m_Max));
    }
    if(m_MinIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("min")), m_Min));
    }
}

bool ModelPriceDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("avg"))))
    {
        double refVal_setAvg;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("avg"))), refVal_setAvg );
        setAvg(refVal_setAvg);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("max"))))
    {
        double refVal_setMax;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("max"))), refVal_setMax );
        setMax(refVal_setMax);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("min"))))
    {
        double refVal_setMin;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("min"))), refVal_setMin );
        setMin(refVal_setMin);
    }
    return ok;
}

double ModelPriceDTO::getAvg() const
{
    return m_Avg;
}

void ModelPriceDTO::setAvg(double value)
{
    m_Avg = value;
    m_AvgIsSet = true;
}

bool ModelPriceDTO::avgIsSet() const
{
    return m_AvgIsSet;
}

void ModelPriceDTO::unsetAvg()
{
    m_AvgIsSet = false;
}
double ModelPriceDTO::getMax() const
{
    return m_Max;
}

void ModelPriceDTO::setMax(double value)
{
    m_Max = value;
    m_MaxIsSet = true;
}

bool ModelPriceDTO::maxIsSet() const
{
    return m_MaxIsSet;
}

void ModelPriceDTO::unsetMax()
{
    m_MaxIsSet = false;
}
double ModelPriceDTO::getMin() const
{
    return m_Min;
}

void ModelPriceDTO::setMin(double value)
{
    m_Min = value;
    m_MinIsSet = true;
}

bool ModelPriceDTO::minIsSet() const
{
    return m_MinIsSet;
}

void ModelPriceDTO::unsetMin()
{
    m_MinIsSet = false;
}
}
}
}
}


