/*
 * CategoryParameterDTO.h
 *
 * Характеристика товара.
 */

#ifndef _CategoryParameterDTO_H_
#define _CategoryParameterDTO_H_


#include <string>
#include "CategoryParameterUnitDTO.h"
#include "OfferCardRecommendationType.h"
#include "ParameterType.h"
#include "ParameterValueConstraintsDTO.h"
#include "ParameterValueOptionDTO.h"
#include "ValueRestrictionDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Характеристика товара.
 *
 *  \ingroup Models
 *
 */

class CategoryParameterDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CategoryParameterDTO();
	CategoryParameterDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CategoryParameterDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор характеристики.
	 */
	long long getId();

	/*! \brief Set Идентификатор характеристики.
	 */
	void setId(long long  id);
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
	bool getRequired();

	/*! \brief Set Обязательность характеристики.
	 */
	void setRequired(bool  required);
	/*! \brief Get Используется ли характеристика в фильтре.
	 */
	bool getFiltering();

	/*! \brief Set Используется ли характеристика в фильтре.
	 */
	void setFiltering(bool  filtering);
	/*! \brief Get Является ли характеристика особенностью варианта.
	 */
	bool getDistinctive();

	/*! \brief Set Является ли характеристика особенностью варианта.
	 */
	void setDistinctive(bool  distinctive);
	/*! \brief Get Можно ли передать сразу несколько значений.
	 */
	bool getMultivalue();

	/*! \brief Set Можно ли передать сразу несколько значений.
	 */
	void setMultivalue(bool  multivalue);
	/*! \brief Get Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа `ENUM`.
	 */
	bool getAllowCustomValues();

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
	long long id;
	std::string name;
	ParameterType type;
	CategoryParameterUnitDTO unit;
	std::string description;
	std::list <OfferCardRecommendationType>recommendationTypes;
	bool required;
	bool filtering;
	bool distinctive;
	bool multivalue;
	bool allowCustomValues;
	std::list <ParameterValueOptionDTO>values;
	ParameterValueConstraintsDTO constraints;
	std::list <ValueRestrictionDTO>valueRestrictions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CategoryParameterDTO_H_ */
