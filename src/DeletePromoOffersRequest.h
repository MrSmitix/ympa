/*
 * DeletePromoOffersRequest.h
 *
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; в параметре &#x60;deleteAllOffers&#x60;;  * часть товаров, передайте их идентификаторы в параметре &#x60;offersIds&#x60;. 
 */

#ifndef _DeletePromoOffersRequest_H_
#define _DeletePromoOffersRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
 *
 *  \ingroup Models
 *
 */

class DeletePromoOffersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	DeletePromoOffersRequest();
	DeletePromoOffersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeletePromoOffersRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор акции.
	 */
	std::string getPromoId();

	/*! \brief Set Идентификатор акции.
	 */
	void setPromoId(std::string  promoId);
	/*! \brief Get Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
	 */
	bool getDeleteAllOffers();

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
	std::string promoId;
	bool deleteAllOffers;
	std::list <std::string>offerIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeletePromoOffersRequest_H_ */
