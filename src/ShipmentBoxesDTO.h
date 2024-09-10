/*
 * ShipmentBoxesDTO.h
 *
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 */

#ifndef _ShipmentBoxesDTO_H_
#define _ShipmentBoxesDTO_H_


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


/*! \brief В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 *
 *  \ingroup Models
 *
 */

class ShipmentBoxesDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	ShipmentBoxesDTO();
	ShipmentBoxesDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ShipmentBoxesDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список грузовых мест. Маркет определил количество мест по длине этого списка. 
	 */
	std::list<ParcelBoxDTO> getBoxes();

	/*! \brief Set Список грузовых мест. Маркет определил количество мест по длине этого списка. 
	 */
	void setBoxes(std::list <ParcelBoxDTO> boxes);

private:
	std::list <ParcelBoxDTO>boxes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ShipmentBoxesDTO_H_ */
