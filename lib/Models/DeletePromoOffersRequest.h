
/*
 * DeletePromoOffersRequest.h
 *
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_DeletePromoOffersRequest_H_
#define TINY_CPP_CLIENT_DeletePromoOffersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
 *
 *  \ingroup Models
 *
 */

class DeletePromoOffersRequest{
public:

    /*! \brief Constructor.
	 */
    DeletePromoOffersRequest();
    DeletePromoOffersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeletePromoOffersRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор акции.
	 */
	std::string getPromoId();

	/*! \brief Set Идентификатор акции.
	 */
	void setPromoId(std::string  promoId);
	/*! \brief Get Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
	 */
	bool isDeleteAllOffers();

	/*! \brief Set Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
	 */
	void setDeleteAllOffers(bool  deleteAllOffers);
	/*! \brief Get Товары, которые нужно убрать из акции.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Товары, которые нужно убрать из акции.
	 */
	void setOfferIds(std::list <std::string> offerIds);


    private:
    std::string promoId{};
    bool deleteAllOffers{};
    std::list<std::string> offerIds;
};
}

#endif /* TINY_CPP_CLIENT_DeletePromoOffersRequest_H_ */
