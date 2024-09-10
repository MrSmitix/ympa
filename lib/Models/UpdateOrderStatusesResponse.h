
/*
 * UpdateOrderStatusesResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UpdateOrderStatusesResponse_H_
#define TINY_CPP_CLIENT_UpdateOrderStatusesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "UpdateOrderStatusesDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStatusesResponse{
public:

    /*! \brief Constructor.
	 */
    UpdateOrderStatusesResponse();
    UpdateOrderStatusesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOrderStatusesResponse();


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
	UpdateOrderStatusesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(UpdateOrderStatusesDTO  result);


    private:
    ApiResponseStatusType status;
    UpdateOrderStatusesDTO result;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOrderStatusesResponse_H_ */
