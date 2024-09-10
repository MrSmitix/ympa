
/*
 * GetSuggestedOfferMappingsRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetSuggestedOfferMappingsRequest_H_
#define TINY_CPP_CLIENT_GetSuggestedOfferMappingsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SuggestedOfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetSuggestedOfferMappingsRequest{
public:

    /*! \brief Constructor.
	 */
    GetSuggestedOfferMappingsRequest();
    GetSuggestedOfferMappingsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetSuggestedOfferMappingsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров.
	 */
	std::list<SuggestedOfferDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <SuggestedOfferDTO> offers);


    private:
    std::list<SuggestedOfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_GetSuggestedOfferMappingsRequest_H_ */
