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
 * GenerateShipmentListDocumentReportRequest.h
 *
 * Данные, необходимые для генерации документа. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GenerateShipmentListDocumentReportRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GenerateShipmentListDocumentReportRequest_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Данные, необходимые для генерации документа. 
/// </summary>
class  GenerateShipmentListDocumentReportRequest
    : public ModelBase
{
public:
    GenerateShipmentListDocumentReportRequest();
    virtual ~GenerateShipmentListDocumentReportRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GenerateShipmentListDocumentReportRequest members

    /// <summary>
    /// Идентификатор кампании.
    /// </summary>
    int64_t getCampaignId() const;
    bool campaignIdIsSet() const;
    void unsetCampaignId();

    void setCampaignId(int64_t value);

    /// <summary>
    /// Идентификатор отгрузки.
    /// </summary>
    int64_t getShipmentId() const;
    bool shipmentIdIsSet() const;
    void unsetShipmentId();

    void setShipmentId(int64_t value);

    /// <summary>
    /// Фильтр по идентификаторам заказа в отгрузке.
    /// </summary>
    std::vector<int64_t>& getOrderIds();
    bool orderIdsIsSet() const;
    void unsetOrderIds();

    void setOrderIds(std::vector<int64_t> value);


protected:
    int64_t m_CampaignId;
    bool m_CampaignIdIsSet;
    int64_t m_ShipmentId;
    bool m_ShipmentIdIsSet;
    std::vector<int64_t> m_OrderIds;
    bool m_OrderIdsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GenerateShipmentListDocumentReportRequest_H_ */
