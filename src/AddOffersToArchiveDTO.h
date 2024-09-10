/*
 * AddOffersToArchiveDTO.h
 *
 * Товары, которые не удалось поместить в архив.
 */

#ifndef _AddOffersToArchiveDTO_H_
#define _AddOffersToArchiveDTO_H_


#include <string>
#include "AddOffersToArchiveErrorDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Товары, которые не удалось поместить в архив.
 *
 *  \ingroup Models
 *
 */

class AddOffersToArchiveDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	AddOffersToArchiveDTO();
	AddOffersToArchiveDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AddOffersToArchiveDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров, которые не удалось поместить в архив.
	 */
	std::list<AddOffersToArchiveErrorDTO> getNotArchivedOffers();

	/*! \brief Set Список товаров, которые не удалось поместить в архив.
	 */
	void setNotArchivedOffers(std::list <AddOffersToArchiveErrorDTO> notArchivedOffers);

private:
	std::list <AddOffersToArchiveErrorDTO>notArchivedOffers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AddOffersToArchiveDTO_H_ */
