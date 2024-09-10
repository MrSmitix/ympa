
/*
 * GetWarehousesResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetWarehousesResponse_H_
#define TINY_CPP_CLIENT_GetWarehousesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "WarehousesDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetWarehousesResponse{
public:

    /*! \brief Constructor.
	 */
    GetWarehousesResponse();
    GetWarehousesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetWarehousesResponse();


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
	WarehousesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(WarehousesDTO  result);


    private:
    ApiResponseStatusType status;
    WarehousesDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetWarehousesResponse_H_ */
