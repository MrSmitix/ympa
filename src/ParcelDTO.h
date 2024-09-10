/*
 * ParcelDTO.h
 *
 * Информация о грузовых местах в заказе.
 */

#ifndef _ParcelDTO_H_
#define _ParcelDTO_H_


#include <string>
#include "ParcelBoxDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о грузовых местах в заказе.
 *
 *  \ingroup Models
 *
 */

class ParcelDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ParcelDTO();
	ParcelDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ParcelDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список грузовых мест. Маркет определяет количество мест по длине этого списка.
	 */
	std::list<ParcelBoxDTO> getBoxes();

	/*! \brief Set Список грузовых мест. Маркет определяет количество мест по длине этого списка.
	 */
	void setBoxes(std::list <ParcelBoxDTO> boxes);

private:
	std::list <ParcelBoxDTO>boxes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ParcelDTO_H_ */
