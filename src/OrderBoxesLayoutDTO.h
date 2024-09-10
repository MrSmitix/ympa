/*
 * OrderBoxesLayoutDTO.h
 *
 * Распределение товаров по коробкам.
 */

#ifndef _OrderBoxesLayoutDTO_H_
#define _OrderBoxesLayoutDTO_H_


#include <string>
#include "EnrichedOrderBoxLayoutDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Распределение товаров по коробкам.
 *
 *  \ingroup Models
 *
 */

class OrderBoxesLayoutDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderBoxesLayoutDTO();
	OrderBoxesLayoutDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderBoxesLayoutDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список коробок.
	 */
	std::list<EnrichedOrderBoxLayoutDTO> getBoxes();

	/*! \brief Set Список коробок.
	 */
	void setBoxes(std::list <EnrichedOrderBoxLayoutDTO> boxes);

private:
	std::list <EnrichedOrderBoxLayoutDTO>boxes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderBoxesLayoutDTO_H_ */
