/*
 * DeleteOffersFromArchiveDTO.h
 *
 * Товары, которые не удалось восстановить из архива.
 */

#ifndef _DeleteOffersFromArchiveDTO_H_
#define _DeleteOffersFromArchiveDTO_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Товары, которые не удалось восстановить из архива.
 *
 *  \ingroup Models
 *
 */

class DeleteOffersFromArchiveDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteOffersFromArchiveDTO();
	DeleteOffersFromArchiveDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteOffersFromArchiveDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров, которые не удалось восстановить из архива.
	 */
	std::list<std::string> getNotUnarchivedOfferIds();

	/*! \brief Set Список товаров, которые не удалось восстановить из архива.
	 */
	void setNotUnarchivedOfferIds(std::list <std::string> notUnarchivedOfferIds);

private:
	std::list <std::string>notUnarchivedOfferIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteOffersFromArchiveDTO_H_ */
