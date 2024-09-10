
/*
 * OffersDTO.h
 *
 * Найденные предложения магазина.
 */

#ifndef TINY_CPP_CLIENT_OffersDTO_H_
#define TINY_CPP_CLIENT_OffersDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Найденные предложения магазина.
 *
 *  \ingroup Models
 *
 */

class OffersDTO{
public:

    /*! \brief Constructor.
	 */
    OffersDTO();
    OffersDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OffersDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список предложений магазина.
	 */
	std::list<OfferDTO> getOffers();

	/*! \brief Set Список предложений магазина.
	 */
	void setOffers(std::list <OfferDTO> offers);


    private:
    std::list<OfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_OffersDTO_H_ */
