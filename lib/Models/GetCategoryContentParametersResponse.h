
/*
 * GetCategoryContentParametersResponse.h
 *
 * Ответ со списком характеристик для категории и их допустимыми значениями.
 */

#ifndef TINY_CPP_CLIENT_GetCategoryContentParametersResponse_H_
#define TINY_CPP_CLIENT_GetCategoryContentParametersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "CategoryContentParametersDTO.h"

namespace Tiny {


/*! \brief Ответ со списком характеристик для категории и их допустимыми значениями.
 *
 *  \ingroup Models
 *
 */

class GetCategoryContentParametersResponse{
public:

    /*! \brief Constructor.
	 */
    GetCategoryContentParametersResponse();
    GetCategoryContentParametersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCategoryContentParametersResponse();


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
	/*! \brief Get 
	 */
	CategoryContentParametersDTO getResult();

	/*! \brief Set 
	 */
	void setResult(CategoryContentParametersDTO  result);


    private:
    ApiResponseStatusType status;
    CategoryContentParametersDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetCategoryContentParametersResponse_H_ */
