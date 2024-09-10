
/*
 * GetSuggestedOfferMappingsResultDTO.h
 *
 * Подобранные карточки на Маркете.
 */

#ifndef TINY_CPP_CLIENT_GetSuggestedOfferMappingsResultDTO_H_
#define TINY_CPP_CLIENT_GetSuggestedOfferMappingsResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SuggestedOfferMappingDTO.h"
#include <list>

namespace Tiny {


/*! \brief Подобранные карточки на Маркете.
 *
 *  \ingroup Models
 *
 */

class GetSuggestedOfferMappingsResultDTO{
public:

    /*! \brief Constructor.
	 */
    GetSuggestedOfferMappingsResultDTO();
    GetSuggestedOfferMappingsResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetSuggestedOfferMappingsResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров.
	 */
	std::list<SuggestedOfferMappingDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <SuggestedOfferMappingDTO> offers);


    private:
    std::list<SuggestedOfferMappingDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_GetSuggestedOfferMappingsResultDTO_H_ */
