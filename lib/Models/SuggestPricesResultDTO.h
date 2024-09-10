
/*
 * SuggestPricesResultDTO.h
 *
 * Результат запроса цен для продвижения.
 */

#ifndef TINY_CPP_CLIENT_SuggestPricesResultDTO_H_
#define TINY_CPP_CLIENT_SuggestPricesResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PriceSuggestOfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Результат запроса цен для продвижения.
 *
 *  \ingroup Models
 *
 */

class SuggestPricesResultDTO{
public:

    /*! \brief Constructor.
	 */
    SuggestPricesResultDTO();
    SuggestPricesResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SuggestPricesResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров с ценами для продвижения.
	 */
	std::list<PriceSuggestOfferDTO> getOffers();

	/*! \brief Set Список товаров с ценами для продвижения.
	 */
	void setOffers(std::list <PriceSuggestOfferDTO> offers);


    private:
    std::list<PriceSuggestOfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_SuggestPricesResultDTO_H_ */
