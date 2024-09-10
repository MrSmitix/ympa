
/*
 * GetCategoriesResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetCategoriesResponse_H_
#define TINY_CPP_CLIENT_GetCategoriesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "CategoryDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetCategoriesResponse{
public:

    /*! \brief Constructor.
	 */
    GetCategoriesResponse();
    GetCategoriesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCategoriesResponse();


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
	CategoryDTO getResult();

	/*! \brief Set 
	 */
	void setResult(CategoryDTO  result);


    private:
    ApiResponseStatusType status;
    CategoryDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetCategoriesResponse_H_ */
