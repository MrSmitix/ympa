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
 * GenerateGoodsRealizationReportRequest.h
 *
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GenerateGoodsRealizationReportRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GenerateGoodsRealizationReportRequest_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
/// </summary>
class  GenerateGoodsRealizationReportRequest
    : public ModelBase
{
public:
    GenerateGoodsRealizationReportRequest();
    virtual ~GenerateGoodsRealizationReportRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GenerateGoodsRealizationReportRequest members

    /// <summary>
    /// Идентификатор кампании.
    /// </summary>
    int64_t getCampaignId() const;
    bool campaignIdIsSet() const;
    void unsetCampaignId();

    void setCampaignId(int64_t value);

    /// <summary>
    /// Год.
    /// </summary>
    int32_t getYear() const;
    bool yearIsSet() const;
    void unsetYear();

    void setYear(int32_t value);

    /// <summary>
    /// Номер месяца.
    /// </summary>
    int32_t getMonth() const;
    bool monthIsSet() const;
    void unsetMonth();

    void setMonth(int32_t value);


protected:
    int64_t m_CampaignId;
    bool m_CampaignIdIsSet;
    int32_t m_Year;
    bool m_YearIsSet;
    int32_t m_Month;
    bool m_MonthIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GenerateGoodsRealizationReportRequest_H_ */
