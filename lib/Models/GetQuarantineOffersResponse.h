
/*
 * GetQuarantineOffersResponse.h
 *
 * Ответ на запрос списка товаров в карантине.
 */

#ifndef TINY_CPP_CLIENT_GetQuarantineOffersResponse_H_
#define TINY_CPP_CLIENT_GetQuarantineOffersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetQuarantineOffersResultDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос списка товаров в карантине.
 *
 *  \ingroup Models
 *
 */

class GetQuarantineOffersResponse{
public:

    /*! \brief Constructor.
	 */
    GetQuarantineOffersResponse();
    GetQuarantineOffersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetQuarantineOffersResponse();


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
	GetQuarantineOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetQuarantineOffersResultDTO  result);


    private:
    ApiResponseStatusType status;
    GetQuarantineOffersResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetQuarantineOffersResponse_H_ */
