
/*
 * GetSuggestedOfferMappingEntriesRequest.h
 *
 * Запрос рекомендованных карточек товара.
 */

#ifndef TINY_CPP_CLIENT_GetSuggestedOfferMappingEntriesRequest_H_
#define TINY_CPP_CLIENT_GetSuggestedOfferMappingEntriesRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MappingsOfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос рекомендованных карточек товара.
 *
 *  \ingroup Models
 *
 */

class GetSuggestedOfferMappingEntriesRequest{
public:

    /*! \brief Constructor.
	 */
    GetSuggestedOfferMappingEntriesRequest();
    GetSuggestedOfferMappingEntriesRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetSuggestedOfferMappingEntriesRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров.
	 */
	std::list<MappingsOfferDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <MappingsOfferDTO> offers);


    private:
    std::list<MappingsOfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_GetSuggestedOfferMappingEntriesRequest_H_ */
