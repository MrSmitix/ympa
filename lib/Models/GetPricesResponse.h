
/*
 * GetPricesResponse.h
 *
 * Ответ на запрос списка цен.
 */

#ifndef TINY_CPP_CLIENT_GetPricesResponse_H_
#define TINY_CPP_CLIENT_GetPricesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OfferPriceListResponseDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос списка цен.
 *
 *  \ingroup Models
 *
 */

class GetPricesResponse{
public:

    /*! \brief Constructor.
	 */
    GetPricesResponse();
    GetPricesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPricesResponse();


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
	OfferPriceListResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferPriceListResponseDTO  result);


    private:
    ApiResponseStatusType status;
    OfferPriceListResponseDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetPricesResponse_H_ */
