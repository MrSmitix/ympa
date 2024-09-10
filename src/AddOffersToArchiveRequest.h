/*
 * AddOffersToArchiveRequest.h
 *
 * Товары, которые нужно поместить в архив. 
 */

#ifndef _AddOffersToArchiveRequest_H_
#define _AddOffersToArchiveRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Товары, которые нужно поместить в архив. 
 *
 *  \ingroup Models
 *
 */

class AddOffersToArchiveRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AddOffersToArchiveRequest();
	AddOffersToArchiveRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AddOffersToArchiveRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров, которые нужно поместить в архив.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Список товаров, которые нужно поместить в архив.
	 */
	void setOfferIds(std::list <std::string> offerIds);

private:
	std::list <std::string>offerIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AddOffersToArchiveRequest_H_ */
