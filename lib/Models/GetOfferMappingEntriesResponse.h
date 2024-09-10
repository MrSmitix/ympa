
/*
 * GetOfferMappingEntriesResponse.h
 *
 * Ответ на запрос списка товаров в каталоге.
 */

#ifndef TINY_CPP_CLIENT_GetOfferMappingEntriesResponse_H_
#define TINY_CPP_CLIENT_GetOfferMappingEntriesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OfferMappingEntriesDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос списка товаров в каталоге.
 *
 *  \ingroup Models
 *
 */

class GetOfferMappingEntriesResponse{
public:

    /*! \brief Constructor.
	 */
    GetOfferMappingEntriesResponse();
    GetOfferMappingEntriesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOfferMappingEntriesResponse();


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
	OfferMappingEntriesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferMappingEntriesDTO  result);


    private:
    ApiResponseStatusType status;
    OfferMappingEntriesDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetOfferMappingEntriesResponse_H_ */
