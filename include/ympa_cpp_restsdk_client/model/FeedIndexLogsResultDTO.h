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

/*
 * FeedIndexLogsResultDTO.h
 *
 * Результат выполнения запроса отчета по индексации прайс-листа.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_FeedIndexLogsResultDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_FeedIndexLogsResultDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/FeedIndexLogsRecordDTO.h"
#include "ympa_cpp_restsdk_client/model/FeedIndexLogsFeedDTO.h"
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class FeedIndexLogsFeedDTO;
class FeedIndexLogsRecordDTO;


/// <summary>
/// Результат выполнения запроса отчета по индексации прайс-листа.
/// </summary>
class  FeedIndexLogsResultDTO
    : public ModelBase
{
public:
    FeedIndexLogsResultDTO();
    virtual ~FeedIndexLogsResultDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// FeedIndexLogsResultDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FeedIndexLogsFeedDTO> getFeed() const;
    bool feedIsSet() const;
    void unsetFeed();

    void setFeed(const std::shared_ptr<FeedIndexLogsFeedDTO>& value);

    /// <summary>
    /// Список отчетов по индексации прайс-листа.
    /// </summary>
    std::vector<std::shared_ptr<FeedIndexLogsRecordDTO>>& getIndexLogRecords();
    bool indexLogRecordsIsSet() const;
    void unsetIndexLogRecords();

    void setIndexLogRecords(const std::vector<std::shared_ptr<FeedIndexLogsRecordDTO>>& value);

    /// <summary>
    /// Количество отчетов на всех страницах выходных данных.
    /// </summary>
    int64_t getTotal() const;
    bool totalIsSet() const;
    void unsetTotal();

    void setTotal(int64_t value);


protected:
    std::shared_ptr<FeedIndexLogsFeedDTO> m_Feed;
    bool m_FeedIsSet;
    std::vector<std::shared_ptr<FeedIndexLogsRecordDTO>> m_IndexLogRecords;
    bool m_IndexLogRecordsIsSet;
    int64_t m_Total;
    bool m_TotalIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_FeedIndexLogsResultDTO_H_ */
