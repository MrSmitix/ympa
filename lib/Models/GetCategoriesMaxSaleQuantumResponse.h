
/*
 * GetCategoriesMaxSaleQuantumResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetCategoriesMaxSaleQuantumResponse_H_
#define TINY_CPP_CLIENT_GetCategoriesMaxSaleQuantumResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "CategoryErrorDTO.h"
#include "MaxSaleQuantumDTO.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetCategoriesMaxSaleQuantumResponse{
public:

    /*! \brief Constructor.
	 */
    GetCategoriesMaxSaleQuantumResponse();
    GetCategoriesMaxSaleQuantumResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCategoriesMaxSaleQuantumResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ApiResponseStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ApiResponseStatusType  status);
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
    ApiResponseStatusType status;
    std::list<MaxSaleQuantumDTO> results;
    std::list<CategoryErrorDTO> errors;
};
}

#endif /* TINY_CPP_CLIENT_GetCategoriesMaxSaleQuantumResponse_H_ */
