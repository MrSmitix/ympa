
/*
 * GetReturnsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetReturnsResponse_H_
#define TINY_CPP_CLIENT_GetReturnsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "PagedReturnsDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetReturnsResponse{
public:

    /*! \brief Constructor.
	 */
    GetReturnsResponse();
    GetReturnsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetReturnsResponse();


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
	PagedReturnsDTO getResult();

	/*! \brief Set 
	 */
	void setResult(PagedReturnsDTO  result);


    private:
    ApiResponseStatusType status;
    PagedReturnsDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetReturnsResponse_H_ */
