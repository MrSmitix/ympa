/*
 * GetCategoriesMaxSaleQuantumDTO.h
 *
 * Категории и лимит на установку кванта и минимального количества товаров.
 */

#ifndef _GetCategoriesMaxSaleQuantumDTO_H_
#define _GetCategoriesMaxSaleQuantumDTO_H_


#include <string>
#include "CategoryErrorDTO.h"
#include "MaxSaleQuantumDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Категории и лимит на установку кванта и минимального количества товаров.
 *
 *  \ingroup Models
 *
 */

class GetCategoriesMaxSaleQuantumDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCategoriesMaxSaleQuantumDTO();
	GetCategoriesMaxSaleQuantumDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCategoriesMaxSaleQuantumDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Категории и лимит на установку кванта и минимального количества товаров.
	 */
	std::list<MaxSaleQuantumDTO> getResults();

	/*! \brief Set Категории и лимит на установку кванта и минимального количества товаров.
	 */
	void setResults(std::list <MaxSaleQuantumDTO> results);
	/*! \brief Get Ошибки, которые появились из-за переданных категорий.
	 */
	std::list<CategoryErrorDTO> getErrors();

	/*! \brief Set Ошибки, которые появились из-за переданных категорий.
	 */
	void setErrors(std::list <CategoryErrorDTO> errors);

private:
	std::list <MaxSaleQuantumDTO>results;
	std::list <CategoryErrorDTO>errors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCategoriesMaxSaleQuantumDTO_H_ */
