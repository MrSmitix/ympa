/*
 * DeleteHiddenOffersRequest.h
 *
 * Запрос на возобновление показа оферов.
 */

#ifndef _DeleteHiddenOffersRequest_H_
#define _DeleteHiddenOffersRequest_H_


#include <string>
#include "HiddenOfferDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на возобновление показа оферов.
 *
 *  \ingroup Models
 *
 */

class DeleteHiddenOffersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteHiddenOffersRequest();
	DeleteHiddenOffersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteHiddenOffersRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список скрытых товаров. 
	 */
	std::list<HiddenOfferDTO> getHiddenOffers();

	/*! \brief Set Список скрытых товаров. 
	 */
	void setHiddenOffers(std::list <HiddenOfferDTO> hiddenOffers);

private:
	std::list <HiddenOfferDTO>hiddenOffers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteHiddenOffersRequest_H_ */
