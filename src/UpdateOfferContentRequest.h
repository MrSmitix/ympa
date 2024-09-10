/*
 * UpdateOfferContentRequest.h
 *
 * Запрос на установку новых значений для параметров.
 */

#ifndef _UpdateOfferContentRequest_H_
#define _UpdateOfferContentRequest_H_


#include <string>
#include "OfferContentDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос на установку новых значений для параметров.
 *
 *  \ingroup Models
 *
 */

class UpdateOfferContentRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateOfferContentRequest();
	UpdateOfferContentRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateOfferContentRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров с указанными характеристиками.
	 */
	std::list<OfferContentDTO> getOffersContent();

	/*! \brief Set Список товаров с указанными характеристиками.
	 */
	void setOffersContent(std::list <OfferContentDTO> offersContent);

private:
	std::list <OfferContentDTO>offersContent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateOfferContentRequest_H_ */
