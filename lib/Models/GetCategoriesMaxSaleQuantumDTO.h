
/*
 * GetCategoriesMaxSaleQuantumDTO.h
 *
 * Категории и лимит на установку кванта и минимального количества товаров.
 */

#ifndef TINY_CPP_CLIENT_GetCategoriesMaxSaleQuantumDTO_H_
#define TINY_CPP_CLIENT_GetCategoriesMaxSaleQuantumDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CategoryErrorDTO.h"
#include "MaxSaleQuantumDTO.h"
#include <list>

namespace Tiny {


/*! \brief Категории и лимит на установку кванта и минимального количества товаров.
 *
 *  \ingroup Models
 *
 */

class GetCategoriesMaxSaleQuantumDTO{
public:

    /*! \brief Constructor.
	 */
    GetCategoriesMaxSaleQuantumDTO();
    GetCategoriesMaxSaleQuantumDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCategoriesMaxSaleQuantumDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<MaxSaleQuantumDTO> results;
    std::list<CategoryErrorDTO> errors;
};
}

#endif /* TINY_CPP_CLIENT_GetCategoriesMaxSaleQuantumDTO_H_ */
