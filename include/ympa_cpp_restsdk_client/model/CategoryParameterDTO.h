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
 * CategoryParameterDTO.h
 *
 * Характеристика товара.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CategoryParameterDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CategoryParameterDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include "ympa_cpp_restsdk_client/model/ParameterType.h"
#include "ympa_cpp_restsdk_client/model/ParameterValueOptionDTO.h"
#include "ympa_cpp_restsdk_client/model/CategoryParameterUnitDTO.h"
#include <cpprest/details/basic_types.h>
#include "ympa_cpp_restsdk_client/model/ValueRestrictionDTO.h"
#include <vector>
#include "ympa_cpp_restsdk_client/model/OfferCardRecommendationType.h"
#include "ympa_cpp_restsdk_client/model/ParameterValueConstraintsDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

class CategoryParameterUnitDTO;
class ParameterValueOptionDTO;
class ParameterValueConstraintsDTO;
class ValueRestrictionDTO;


/// <summary>
/// Характеристика товара.
/// </summary>
class  CategoryParameterDTO
    : public ModelBase
{
public:
    CategoryParameterDTO();
    virtual ~CategoryParameterDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CategoryParameterDTO members

    /// <summary>
    /// Идентификатор характеристики.
    /// </summary>
    int64_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(int64_t value);

    /// <summary>
    /// Название характеристики.
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ParameterType> getType() const;
    bool typeIsSet() const;
    void unsetType();

    void setType(const std::shared_ptr<ParameterType>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CategoryParameterUnitDTO> getUnit() const;
    bool unitIsSet() const;
    void unsetUnit();

    void setUnit(const std::shared_ptr<CategoryParameterUnitDTO>& value);

    /// <summary>
    /// Описание характеристики.
    /// </summary>
    utility::string_t getDescription() const;
    bool descriptionIsSet() const;
    void unsetDescription();

    void setDescription(const utility::string_t& value);

    /// <summary>
    /// Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
    /// </summary>
    std::vector<std::shared_ptr<OfferCardRecommendationType>>& getRecommendationTypes();
    bool recommendationTypesIsSet() const;
    void unsetRecommendationTypes();

    void setRecommendationTypes(const std::vector<std::shared_ptr<OfferCardRecommendationType>>& value);

    /// <summary>
    /// Обязательность характеристики.
    /// </summary>
    bool isRequired() const;
    bool requiredIsSet() const;
    void unsetRequired();

    void setRequired(bool value);

    /// <summary>
    /// Используется ли характеристика в фильтре.
    /// </summary>
    bool isFiltering() const;
    bool filteringIsSet() const;
    void unsetFiltering();

    void setFiltering(bool value);

    /// <summary>
    /// Является ли характеристика особенностью варианта.
    /// </summary>
    bool isDistinctive() const;
    bool distinctiveIsSet() const;
    void unsetDistinctive();

    void setDistinctive(bool value);

    /// <summary>
    /// Можно ли передать сразу несколько значений.
    /// </summary>
    bool isMultivalue() const;
    bool multivalueIsSet() const;
    void unsetMultivalue();

    void setMultivalue(bool value);

    /// <summary>
    /// Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;.
    /// </summary>
    bool isAllowCustomValues() const;
    bool allowCustomValuesIsSet() const;
    void unsetAllowCustomValues();

    void setAllowCustomValues(bool value);

    /// <summary>
    /// Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;.
    /// </summary>
    std::vector<std::shared_ptr<ParameterValueOptionDTO>>& getValues();
    bool valuesIsSet() const;
    void unsetValues();

    void setValues(const std::vector<std::shared_ptr<ParameterValueOptionDTO>>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ParameterValueConstraintsDTO> getConstraints() const;
    bool constraintsIsSet() const;
    void unsetConstraints();

    void setConstraints(const std::shared_ptr<ParameterValueConstraintsDTO>& value);

    /// <summary>
    /// Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;.
    /// </summary>
    std::vector<std::shared_ptr<ValueRestrictionDTO>>& getValueRestrictions();
    bool valueRestrictionsIsSet() const;
    void unsetValueRestrictions();

    void setValueRestrictions(const std::vector<std::shared_ptr<ValueRestrictionDTO>>& value);


protected:
    int64_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
    std::shared_ptr<ParameterType> m_Type;
    bool m_TypeIsSet;
    std::shared_ptr<CategoryParameterUnitDTO> m_Unit;
    bool m_UnitIsSet;
    utility::string_t m_Description;
    bool m_DescriptionIsSet;
    std::vector<std::shared_ptr<OfferCardRecommendationType>> m_RecommendationTypes;
    bool m_RecommendationTypesIsSet;
    bool m_Required;
    bool m_RequiredIsSet;
    bool m_Filtering;
    bool m_FilteringIsSet;
    bool m_Distinctive;
    bool m_DistinctiveIsSet;
    bool m_Multivalue;
    bool m_MultivalueIsSet;
    bool m_AllowCustomValues;
    bool m_AllowCustomValuesIsSet;
    std::vector<std::shared_ptr<ParameterValueOptionDTO>> m_Values;
    bool m_ValuesIsSet;
    std::shared_ptr<ParameterValueConstraintsDTO> m_Constraints;
    bool m_ConstraintsIsSet;
    std::vector<std::shared_ptr<ValueRestrictionDTO>> m_ValueRestrictions;
    bool m_ValueRestrictionsIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CategoryParameterDTO_H_ */
