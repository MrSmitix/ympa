
/*
 * GetPromoOffersResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetPromoOffersResponse_H_
#define TINY_CPP_CLIENT_GetPromoOffersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetPromoOffersResultDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetPromoOffersResponse{
public:

    /*! \brief Constructor.
	 */
    GetPromoOffersResponse();
    GetPromoOffersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromoOffersResponse();


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
	GetPromoOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetPromoOffersResultDTO  result);


    private:
    ApiResponseStatusType status;
    GetPromoOffersResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetPromoOffersResponse_H_ */
