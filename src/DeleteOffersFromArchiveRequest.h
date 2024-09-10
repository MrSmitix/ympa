/*
 * DeleteOffersFromArchiveRequest.h
 *
 * Товары, которые нужно восстановить из архива. 
 */

#ifndef _DeleteOffersFromArchiveRequest_H_
#define _DeleteOffersFromArchiveRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Товары, которые нужно восстановить из архива. 
 *
 *  \ingroup Models
 *
 */

class DeleteOffersFromArchiveRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteOffersFromArchiveRequest();
	DeleteOffersFromArchiveRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteOffersFromArchiveRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров, которые нужно восстановить из архива.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Список товаров, которые нужно восстановить из архива.
	 */
	void setOfferIds(std::list <std::string> offerIds);

private:
	std::list <std::string>offerIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteOffersFromArchiveRequest_H_ */
