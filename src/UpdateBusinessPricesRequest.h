/*
 * UpdateBusinessPricesRequest.h
 *
 * Запрос на установку базовых цен на товары.
 */

#ifndef _UpdateBusinessPricesRequest_H_
#define _UpdateBusinessPricesRequest_H_


#include <string>
#include "UpdateBusinessOfferPriceDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на установку базовых цен на товары.
 *
 *  \ingroup Models
 *
 */

class UpdateBusinessPricesRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateBusinessPricesRequest();
	UpdateBusinessPricesRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateBusinessPricesRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров с ценами.
	 */
	std::list<UpdateBusinessOfferPriceDTO> getOffers();

	/*! \brief Set Список товаров с ценами.
	 */
	void setOffers(std::list <UpdateBusinessOfferPriceDTO> offers);

private:
	std::list <UpdateBusinessOfferPriceDTO>offers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateBusinessPricesRequest_H_ */
