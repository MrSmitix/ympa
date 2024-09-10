/*
 * UpdatePromoOffersRequest.h
 *
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре &#x60;offers&#x60;. 
 */

#ifndef _UpdatePromoOffersRequest_H_
#define _UpdatePromoOffersRequest_H_


#include <string>
#include "UpdatePromoOfferDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
 *
 *  \ingroup Models
 *
 */

class UpdatePromoOffersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatePromoOffersRequest();
	UpdatePromoOffersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatePromoOffersRequest();

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
	/*! \brief Get Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
	 */
	std::list<UpdatePromoOfferDTO> getOffers();

	/*! \brief Set Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
	 */
	void setOffers(std::list <UpdatePromoOfferDTO> offers);

private:
	std::string promoId;
	std::list <UpdatePromoOfferDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdatePromoOffersRequest_H_ */
