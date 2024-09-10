
/*
 * OfferMappingSuggestionsListDTO.h
 *
 * Список рекомендованных карточек товара.
 */

#ifndef TINY_CPP_CLIENT_OfferMappingSuggestionsListDTO_H_
#define TINY_CPP_CLIENT_OfferMappingSuggestionsListDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EnrichedMappingsOfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список рекомендованных карточек товара.
 *
 *  \ingroup Models
 *
 */

class OfferMappingSuggestionsListDTO{
public:

    /*! \brief Constructor.
	 */
    OfferMappingSuggestionsListDTO();
    OfferMappingSuggestionsListDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferMappingSuggestionsListDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров.
	 */
	std::list<EnrichedMappingsOfferDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <EnrichedMappingsOfferDTO> offers);


    private:
    std::list<EnrichedMappingsOfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_OfferMappingSuggestionsListDTO_H_ */
