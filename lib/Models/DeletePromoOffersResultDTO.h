
/*
 * DeletePromoOffersResultDTO.h
 *
 * Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр &#x60;offerIds&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_DeletePromoOffersResultDTO_H_
#define TINY_CPP_CLIENT_DeletePromoOffersResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "RejectedPromoOfferDeleteDTO.h"
#include <list>

namespace Tiny {


/*! \brief Результат удаления товаров из акции.  Возвращается, только если в запросе был передан параметр `offerIds`. 
 *
 *  \ingroup Models
 *
 */

class DeletePromoOffersResultDTO{
public:

    /*! \brief Constructor.
	 */
    DeletePromoOffersResultDTO();
    DeletePromoOffersResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeletePromoOffersResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
	 */
	std::list<RejectedPromoOfferDeleteDTO> getRejectedOffers();

	/*! \brief Set Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары. 
	 */
	void setRejectedOffers(std::list <RejectedPromoOfferDeleteDTO> rejectedOffers);


    private:
    std::list<RejectedPromoOfferDeleteDTO> rejectedOffers;
};
}

#endif /* TINY_CPP_CLIENT_DeletePromoOffersResultDTO_H_ */
