
/*
 * GetBusinessDocumentsInfoResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetBusinessDocumentsInfoResponse_H_
#define TINY_CPP_CLIENT_GetBusinessDocumentsInfoResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OrderBusinessDocumentsDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetBusinessDocumentsInfoResponse{
public:

    /*! \brief Constructor.
	 */
    GetBusinessDocumentsInfoResponse();
    GetBusinessDocumentsInfoResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBusinessDocumentsInfoResponse();


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
	OrderBusinessDocumentsDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderBusinessDocumentsDTO  result);


    private:
    ApiResponseStatusType status;
    OrderBusinessDocumentsDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetBusinessDocumentsInfoResponse_H_ */
