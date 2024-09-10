
/*
 * GetBusinessBuyerInfoResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetBusinessBuyerInfoResponse_H_
#define TINY_CPP_CLIENT_GetBusinessBuyerInfoResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OrderBusinessBuyerDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetBusinessBuyerInfoResponse{
public:

    /*! \brief Constructor.
	 */
    GetBusinessBuyerInfoResponse();
    GetBusinessBuyerInfoResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBusinessBuyerInfoResponse();


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
	OrderBusinessBuyerDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderBusinessBuyerDTO  result);


    private:
    ApiResponseStatusType status;
    OrderBusinessBuyerDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetBusinessBuyerInfoResponse_H_ */
