
/*
 * GetSuggestedOfferMappingEntriesResponse.h
 *
 * Ответ со списком рекомендованных карточек товара.
 */

#ifndef TINY_CPP_CLIENT_GetSuggestedOfferMappingEntriesResponse_H_
#define TINY_CPP_CLIENT_GetSuggestedOfferMappingEntriesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "OfferMappingSuggestionsListDTO.h"

namespace Tiny {


/*! \brief Ответ со списком рекомендованных карточек товара.
 *
 *  \ingroup Models
 *
 */

class GetSuggestedOfferMappingEntriesResponse{
public:

    /*! \brief Constructor.
	 */
    GetSuggestedOfferMappingEntriesResponse();
    GetSuggestedOfferMappingEntriesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetSuggestedOfferMappingEntriesResponse();


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
	OfferMappingSuggestionsListDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferMappingSuggestionsListDTO  result);


    private:
    ApiResponseStatusType status;
    OfferMappingSuggestionsListDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetSuggestedOfferMappingEntriesResponse_H_ */
