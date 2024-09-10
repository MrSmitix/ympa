/*
 * DeleteOffersRequest.h
 *
 * Фильтрации удаляемых товаров по offerIds. 
 */

#ifndef _DeleteOffersRequest_H_
#define _DeleteOffersRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Фильтрации удаляемых товаров по offerIds. 
 *
 *  \ingroup Models
 *
 */

class DeleteOffersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteOffersRequest();
	DeleteOffersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteOffersRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список SKU товаров, которые нужно удалить.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Список SKU товаров, которые нужно удалить.
	 */
	void setOfferIds(std::list <std::string> offerIds);

private:
	std::list <std::string>offerIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteOffersRequest_H_ */
