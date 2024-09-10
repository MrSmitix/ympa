
/*
 * GetFulfillmentWarehousesResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetFulfillmentWarehousesResponse_H_
#define TINY_CPP_CLIENT_GetFulfillmentWarehousesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "FulfillmentWarehousesDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetFulfillmentWarehousesResponse{
public:

    /*! \brief Constructor.
	 */
    GetFulfillmentWarehousesResponse();
    GetFulfillmentWarehousesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetFulfillmentWarehousesResponse();


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
	FulfillmentWarehousesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(FulfillmentWarehousesDTO  result);


    private:
    ApiResponseStatusType status;
    FulfillmentWarehousesDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetFulfillmentWarehousesResponse_H_ */
