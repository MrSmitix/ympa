
/*
 * CategoryParameterDTO.h
 *
 * Характеристика товара.
 */

#ifndef TINY_CPP_CLIENT_CategoryParameterDTO_H_
#define TINY_CPP_CLIENT_CategoryParameterDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CategoryParameterUnitDTO.h"
#include "OfferCardRecommendationType.h"
#include "ParameterType.h"
#include "ParameterValueConstraintsDTO.h"
#include "ParameterValueOptionDTO.h"
#include "ValueRestrictionDTO.h"
#include <list>

namespace Tiny {


/*! \brief Характеристика товара.
 *
 *  \ingroup Models
 *
 */

class CategoryParameterDTO{
public:

    /*! \brief Constructor.
	 */
    CategoryParameterDTO();
    CategoryParameterDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CategoryParameterDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор характеристики.
	 */
	long getId();

	/*! \brief Set Идентификатор характеристики.
	 */
	void setId(long  id);
	/*! \brief Get Название характеристики.
	 */
	std::string getName();

	/*! \brief Set Название характеристики.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	ParameterType getType();

	/*! \brief Set 
	 */
	void setType(ParameterType  type);
	/*! \brief Get 
	 */
	CategoryParameterUnitDTO getUnit();

	/*! \brief Set 
	 */
	void setUnit(CategoryParameterUnitDTO  unit);
	/*! \brief Get Описание характеристики.
	 */
	std::string getDescription();

	/*! \brief Set Описание характеристики.
	 */
	void setDescription(std::string  description);
	/*! \brief Get Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
	 */
	std::list<OfferCardRecommendationType> getRecommendationTypes();

	/*! \brief Set Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика.
	 */
	void setRecommendationTypes(std::list <OfferCardRecommendationType> recommendationTypes);
	/*! \brief Get Обязательность характеристики.
	 */
	bool isRequired();

	/*! \brief Set Обязательность характеристики.
	 */
	void setRequired(bool  required);
	/*! \brief Get Используется ли характеристика в фильтре.
	 */
	bool isFiltering();

	/*! \brief Set Используется ли характеристика в фильтре.
	 */
	void setFiltering(bool  filtering);
	/*! \brief Get Является ли характеристика особенностью варианта.
	 */
	bool isDistinctive();

	/*! \brief Set Является ли характеристика особенностью варианта.
	 */
	void setDistinctive(bool  distinctive);
	/*! \brief Get Можно ли передать сразу несколько значений.
	 */
	bool isMultivalue();

	/*! \brief Set Можно ли передать сразу несколько значений.
	 */
	void setMultivalue(bool  multivalue);
	/*! \brief Get Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
	 */
	bool isAllowCustomValues();

	/*! \brief Set Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
	 */
	void setAllowCustomValues(bool  allowCustomValues);
	/*! \brief Get Список допустимых значений параметра. Только для характеристик типа `ENUM`.
	 */
	std::list<ParameterValueOptionDTO> getValues();

	/*! \brief Set Список допустимых значений параметра. Только для характеристик типа `ENUM`.
	 */
	void setValues(std::list <ParameterValueOptionDTO> values);
	/*! \brief Get 
	 */
	ParameterValueConstraintsDTO getConstraints();

	/*! \brief Set 
	 */
	void setConstraints(ParameterValueConstraintsDTO  constraints);
	/*! \brief Get Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
	 */
	std::list<ValueRestrictionDTO> getValueRestrictions();

	/*! \brief Set Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа `ENUM`.
	 */
	void setValueRestrictions(std::list <ValueRestrictionDTO> valueRestrictions);


    private:
    long id{};
    std::string name{};
    ParameterType type;
    CategoryParameterUnitDTO unit;
    std::string description{};
    std::list<OfferCardRecommendationType> recommendationTypes;
    bool required{};
    bool filtering{};
    bool distinctive{};
    bool multivalue{};
    bool allowCustomValues{};
    std::list<ParameterValueOptionDTO> values;
    ParameterValueConstraintsDTO constraints;
    std::list<ValueRestrictionDTO> valueRestrictions;
};
}

#endif /* TINY_CPP_CLIENT_CategoryParameterDTO_H_ */
