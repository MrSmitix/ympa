/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * UpdateGoodsFeedbackCommentResponse.h
 *
 * 
 */

#ifndef UpdateGoodsFeedbackCommentResponse_H_
#define UpdateGoodsFeedbackCommentResponse_H_



#include "GoodsFeedbackCommentDTO.h"
#include "ApiResponseStatusType.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  UpdateGoodsFeedbackCommentResponse : public ApiResponse
{
public:
    UpdateGoodsFeedbackCommentResponse() = default;
    explicit UpdateGoodsFeedbackCommentResponse(boost::property_tree::ptree const& pt);
    virtual ~UpdateGoodsFeedbackCommentResponse() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// UpdateGoodsFeedbackCommentResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ApiResponseStatusType> getStatus() const;
    void setStatus(std::shared_ptr<ApiResponseStatusType> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<GoodsFeedbackCommentDTO> getResult() const;
    void setResult(std::shared_ptr<GoodsFeedbackCommentDTO> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<ApiResponseStatusType> m_Status = std::make_shared<ApiResponseStatusType>();
    std::shared_ptr<GoodsFeedbackCommentDTO> m_Result;
};

std::vector<UpdateGoodsFeedbackCommentResponse> createUpdateGoodsFeedbackCommentResponseVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* UpdateGoodsFeedbackCommentResponse_H_ */
