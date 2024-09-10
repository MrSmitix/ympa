
/*
 * GetShipmentOrdersInfoResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetShipmentOrdersInfoResponse_H_
#define TINY_CPP_CLIENT_GetShipmentOrdersInfoResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OrdersShipmentInfoDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetShipmentOrdersInfoResponse{
public:

    /*! \brief Constructor.
	 */
    GetShipmentOrdersInfoResponse();
    GetShipmentOrdersInfoResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetShipmentOrdersInfoResponse();


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
	OrdersShipmentInfoDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrdersShipmentInfoDTO  result);


    private:
    ApiResponseStatusType status;
    OrdersShipmentInfoDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetShipmentOrdersInfoResponse_H_ */
