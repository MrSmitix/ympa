
/*
 * GetHiddenOffersResponse.h
 *
 * Ответ на запрос списка скрытий.
 */

#ifndef TINY_CPP_CLIENT_GetHiddenOffersResponse_H_
#define TINY_CPP_CLIENT_GetHiddenOffersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetHiddenOffersResultDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос списка скрытий.
 *
 *  \ingroup Models
 *
 */

class GetHiddenOffersResponse{
public:

    /*! \brief Constructor.
	 */
    GetHiddenOffersResponse();
    GetHiddenOffersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetHiddenOffersResponse();


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
	GetHiddenOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetHiddenOffersResultDTO  result);


    private:
    ApiResponseStatusType status;
    GetHiddenOffersResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetHiddenOffersResponse_H_ */
