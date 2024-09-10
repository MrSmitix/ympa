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



#include "ympa_cpp_restsdk_client/model/FeedIndexLogsResultDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



FeedIndexLogsResultDTO::FeedIndexLogsResultDTO()
{
    m_FeedIsSet = false;
    m_IndexLogRecordsIsSet = false;
    m_Total = 0L;
    m_TotalIsSet = false;
}

FeedIndexLogsResultDTO::~FeedIndexLogsResultDTO()
{
}

void FeedIndexLogsResultDTO::validate()
{
    // TODO: implement validation
}

web::json::value FeedIndexLogsResultDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_FeedIsSet)
    {
        val[utility::conversions::to_string_t(U("feed"))] = ModelBase::toJson(m_Feed);
    }
    if(m_IndexLogRecordsIsSet)
    {
        val[utility::conversions::to_string_t(U("indexLogRecords"))] = ModelBase::toJson(m_IndexLogRecords);
    }
    if(m_TotalIsSet)
    {
        val[utility::conversions::to_string_t(U("total"))] = ModelBase::toJson(m_Total);
    }

    return val;
}

bool FeedIndexLogsResultDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("feed"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("feed")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<FeedIndexLogsFeedDTO> refVal_setFeed;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFeed);
            setFeed(refVal_setFeed);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("indexLogRecords"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("indexLogRecords")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<FeedIndexLogsRecordDTO>> refVal_setIndexLogRecords;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIndexLogRecords);
            setIndexLogRecords(refVal_setIndexLogRecords);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("total"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("total")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setTotal;
            ok &= ModelBase::fromJson(fieldValue, refVal_setTotal);
            setTotal(refVal_setTotal);
        }
    }
    return ok;
}

void FeedIndexLogsResultDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_FeedIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("feed")), m_Feed));
    }
    if(m_IndexLogRecordsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("indexLogRecords")), m_IndexLogRecords));
    }
    if(m_TotalIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("total")), m_Total));
    }
}

bool FeedIndexLogsResultDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("feed"))))
    {
        std::shared_ptr<FeedIndexLogsFeedDTO> refVal_setFeed;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("feed"))), refVal_setFeed );
        setFeed(refVal_setFeed);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("indexLogRecords"))))
    {
        std::vector<std::shared_ptr<FeedIndexLogsRecordDTO>> refVal_setIndexLogRecords;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("indexLogRecords"))), refVal_setIndexLogRecords );
        setIndexLogRecords(refVal_setIndexLogRecords);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("total"))))
    {
        int64_t refVal_setTotal;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("total"))), refVal_setTotal );
        setTotal(refVal_setTotal);
    }
    return ok;
}

std::shared_ptr<FeedIndexLogsFeedDTO> FeedIndexLogsResultDTO::getFeed() const
{
    return m_Feed;
}

void FeedIndexLogsResultDTO::setFeed(const std::shared_ptr<FeedIndexLogsFeedDTO>& value)
{
    m_Feed = value;
    m_FeedIsSet = true;
}

bool FeedIndexLogsResultDTO::feedIsSet() const
{
    return m_FeedIsSet;
}

void FeedIndexLogsResultDTO::unsetFeed()
{
    m_FeedIsSet = false;
}
std::vector<std::shared_ptr<FeedIndexLogsRecordDTO>>& FeedIndexLogsResultDTO::getIndexLogRecords()
{
    return m_IndexLogRecords;
}

void FeedIndexLogsResultDTO::setIndexLogRecords(const std::vector<std::shared_ptr<FeedIndexLogsRecordDTO>>& value)
{
    m_IndexLogRecords = value;
    m_IndexLogRecordsIsSet = true;
}

bool FeedIndexLogsResultDTO::indexLogRecordsIsSet() const
{
    return m_IndexLogRecordsIsSet;
}

void FeedIndexLogsResultDTO::unsetIndexLogRecords()
{
    m_IndexLogRecordsIsSet = false;
}
int64_t FeedIndexLogsResultDTO::getTotal() const
{
    return m_Total;
}

void FeedIndexLogsResultDTO::setTotal(int64_t value)
{
    m_Total = value;
    m_TotalIsSet = true;
}

bool FeedIndexLogsResultDTO::totalIsSet() const
{
    return m_TotalIsSet;
}

void FeedIndexLogsResultDTO::unsetTotal()
{
    m_TotalIsSet = false;
}
}
}
}
}


