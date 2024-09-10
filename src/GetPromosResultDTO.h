/*
 * GetPromosResultDTO.h
 *
 * Информация об акциях Маркета.
 */

#ifndef _GetPromosResultDTO_H_
#define _GetPromosResultDTO_H_


#include <string>
#include "GetPromoDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об акциях Маркета.
 *
 *  \ingroup Models
 *
 */

class GetPromosResultDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPromosResultDTO();
	GetPromosResultDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPromosResultDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Акции Маркета.
	 */
	std::list<GetPromoDTO> getPromos();

	/*! \brief Set Акции Маркета.
	 */
	void setPromos(std::list <GetPromoDTO> promos);

private:
	std::list <GetPromoDTO>promos;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPromosResultDTO_H_ */
