
/*
 * GetOrderBuyerInfoResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetOrderBuyerInfoResponse_H_
#define TINY_CPP_CLIENT_GetOrderBuyerInfoResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OrderBuyerInfoDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetOrderBuyerInfoResponse{
public:

    /*! \brief Constructor.
	 */
    GetOrderBuyerInfoResponse();
    GetOrderBuyerInfoResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOrderBuyerInfoResponse();


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
	OrderBuyerInfoDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderBuyerInfoDTO  result);


    private:
    ApiResponseStatusType status;
    OrderBuyerInfoDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetOrderBuyerInfoResponse_H_ */
