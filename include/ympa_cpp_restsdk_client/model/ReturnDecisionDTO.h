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
 * ReturnDecisionDTO.h
 *
 * Решения по возвратам.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ReturnDecisionDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ReturnDecisionDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/ReturnDecisionType.h"
#include "ympa_cpp_restsdk_client/model/ReturnDecisionReasonType.h"
#include <cpprest/details/basic_types.h>
#include <vector>
#include "ympa_cpp_restsdk_client/model/ReturnDecisionSubreasonType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Решения по возвратам.
/// </summary>
class  ReturnDecisionDTO
    : public ModelBase
{
public:
    ReturnDecisionDTO();
    virtual ~ReturnDecisionDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ReturnDecisionDTO members

    /// <summary>
    /// Идентификатор товара в возврате.
    /// </summary>
    int64_t getReturnItemId() const;
    bool returnItemIdIsSet() const;
    void unsetReturnItemId();

    void setReturnItemId(int64_t value);

    /// <summary>
    /// Количество единиц товара.
    /// </summary>
    int32_t getCount() const;
    bool countIsSet() const;
    void unsetCount();

    void setCount(int32_t value);

    /// <summary>
    /// Комментарий.
    /// </summary>
    utility::string_t getComment() const;
    bool commentIsSet() const;
    void unsetComment();

    void setComment(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ReturnDecisionReasonType> getReasonType() const;
    bool reasonTypeIsSet() const;
    void unsetReasonType();

    void setReasonType(const std::shared_ptr<ReturnDecisionReasonType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ReturnDecisionSubreasonType> getSubreasonType() const;
    bool subreasonTypeIsSet() const;
    void unsetSubreasonType();

    void setSubreasonType(const std::shared_ptr<ReturnDecisionSubreasonType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ReturnDecisionType> getDecisionType() const;
    bool decisionTypeIsSet() const;
    void unsetDecisionType();

    void setDecisionType(const std::shared_ptr<ReturnDecisionType>& value);

    /// <summary>
    /// Сумма возврата.
    /// </summary>
    int64_t getRefundAmount() const;
    bool refundAmountIsSet() const;
    void unsetRefundAmount();

    void setRefundAmount(int64_t value);

    /// <summary>
    /// Компенсация за обратную доставку.
    /// </summary>
    int64_t getPartnerCompensation() const;
    bool partnerCompensationIsSet() const;
    void unsetPartnerCompensation();

    void setPartnerCompensation(int64_t value);

    /// <summary>
    /// Список хеш-кодов фотографий товара от покупателя.
    /// </summary>
    std::vector<utility::string_t>& getImages();
    bool imagesIsSet() const;
    void unsetImages();

    void setImages(const std::vector<utility::string_t>& value);


protected:
    int64_t m_ReturnItemId;
    bool m_ReturnItemIdIsSet;
    int32_t m_Count;
    bool m_CountIsSet;
    utility::string_t m_Comment;
    bool m_CommentIsSet;
    std::shared_ptr<ReturnDecisionReasonType> m_ReasonType;
    bool m_ReasonTypeIsSet;
    std::shared_ptr<ReturnDecisionSubreasonType> m_SubreasonType;
    bool m_SubreasonTypeIsSet;
    std::shared_ptr<ReturnDecisionType> m_DecisionType;
    bool m_DecisionTypeIsSet;
    int64_t m_RefundAmount;
    bool m_RefundAmountIsSet;
    int64_t m_PartnerCompensation;
    bool m_PartnerCompensationIsSet;
    std::vector<utility::string_t> m_Images;
    bool m_ImagesIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ReturnDecisionDTO_H_ */
