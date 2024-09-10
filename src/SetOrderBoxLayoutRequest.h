/*
 * SetOrderBoxLayoutRequest.h
 *
 * 
 */

#ifndef _SetOrderBoxLayoutRequest_H_
#define _SetOrderBoxLayoutRequest_H_


#include <string>
#include "OrderBoxLayoutDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SetOrderBoxLayoutRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	SetOrderBoxLayoutRequest();
	SetOrderBoxLayoutRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SetOrderBoxLayoutRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список коробок.
	 */
	std::list<OrderBoxLayoutDTO> getBoxes();

	/*! \brief Set Список коробок.
	 */
	void setBoxes(std::list <OrderBoxLayoutDTO> boxes);
	/*! \brief Get Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
	 */
	bool getAllowRemove();

	/*! \brief Set Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
	 */
	void setAllowRemove(bool  allowRemove);

private:
	std::list <OrderBoxLayoutDTO>boxes;
	bool allowRemove;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SetOrderBoxLayoutRequest_H_ */
