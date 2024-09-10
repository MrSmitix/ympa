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
 * EacVerificationResultDTO.h
 *
 * Результат выполнения запроса.
 */

#ifndef EacVerificationResultDTO_H_
#define EacVerificationResultDTO_H_



#include <vector>
#include "EacVerificationStatusType.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Результат выполнения запроса.
/// </summary>
class  EacVerificationResultDTO 
{
public:
    EacVerificationResultDTO() = default;
    explicit EacVerificationResultDTO(boost::property_tree::ptree const& pt);
    virtual ~EacVerificationResultDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// EacVerificationResultDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<EacVerificationStatusType> getVerificationResult() const;
    void setVerificationResult(std::shared_ptr<EacVerificationStatusType> value);

    /// <summary>
    /// Количество оставшихся попыток проверки кода.  Возвращается, если магазин отправил некорректный код.  Когда все попытки будут исчерпаны, код обновится. 
    /// </summary>
    int32_t getAttemptsLeft() const;
    void setAttemptsLeft(int32_t value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<EacVerificationStatusType> m_VerificationResult = std::make_shared<EacVerificationStatusType>();
    int32_t m_AttemptsLeft = 0;
};

std::vector<EacVerificationResultDTO> createEacVerificationResultDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* EacVerificationResultDTO_H_ */
