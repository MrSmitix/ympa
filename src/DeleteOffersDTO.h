/*
 * DeleteOffersDTO.h
 *
 * Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
 */

#ifndef _DeleteOffersDTO_H_
#define _DeleteOffersDTO_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.
 *
 *  \ingroup Models
 *
 */

class DeleteOffersDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteOffersDTO();
	DeleteOffersDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteOffersDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список SKU товаров, которые не удалось удалить.
	 */
	std::list<std::string> getNotDeletedOfferIds();

	/*! \brief Set Список SKU товаров, которые не удалось удалить.
	 */
	void setNotDeletedOfferIds(std::list <std::string> notDeletedOfferIds);

private:
	std::list <std::string>notDeletedOfferIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteOffersDTO_H_ */
