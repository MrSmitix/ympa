
/*
 * GetPricesByOfferIdsResponse.h
 *
 * Ответ на запрос списка цен.
 */

#ifndef TINY_CPP_CLIENT_GetPricesByOfferIdsResponse_H_
#define TINY_CPP_CLIENT_GetPricesByOfferIdsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OfferPriceByOfferIdsListResponseDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос списка цен.
 *
 *  \ingroup Models
 *
 */

class GetPricesByOfferIdsResponse{
public:

    /*! \brief Constructor.
	 */
    GetPricesByOfferIdsResponse();
    GetPricesByOfferIdsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPricesByOfferIdsResponse();


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
	OfferPriceByOfferIdsListResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferPriceByOfferIdsListResponseDTO  result);


    private:
    ApiResponseStatusType status;
    OfferPriceByOfferIdsListResponseDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetPricesByOfferIdsResponse_H_ */
