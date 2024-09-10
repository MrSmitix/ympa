
/*
 * SuggestPricesRequest.h
 *
 * Запрос на получение списка цен для продвижения.
 */

#ifndef TINY_CPP_CLIENT_SuggestPricesRequest_H_
#define TINY_CPP_CLIENT_SuggestPricesRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SuggestOfferPriceDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на получение списка цен для продвижения.
 *
 *  \ingroup Models
 *
 */

class SuggestPricesRequest{
public:

    /*! \brief Constructor.
	 */
    SuggestPricesRequest();
    SuggestPricesRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SuggestPricesRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров.
	 */
	std::list<SuggestOfferPriceDTO> getOffers();

	/*! \brief Set Список товаров.
	 */
	void setOffers(std::list <SuggestOfferPriceDTO> offers);


    private:
    std::list<SuggestOfferPriceDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_SuggestPricesRequest_H_ */
