/*
 * AddHiddenOffersRequest.h
 *
 * Запрос на скрытие оферов.
 */

#ifndef _AddHiddenOffersRequest_H_
#define _AddHiddenOffersRequest_H_


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


/*! \brief Запрос на скрытие оферов.
 *
 *  \ingroup Models
 *
 */

class AddHiddenOffersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AddHiddenOffersRequest();
	AddHiddenOffersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AddHiddenOffersRequest();

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

#endif /* _AddHiddenOffersRequest_H_ */
