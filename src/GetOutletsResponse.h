/*
 * GetOutletsResponse.h
 *
 * Ответ на запрос информации о точках продаж.
 */

#ifndef _GetOutletsResponse_H_
#define _GetOutletsResponse_H_


#include <string>
#include "FlippingPagerDTO.h"
#include "FullOutletDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос информации о точках продаж.
 *
 *  \ingroup Models
 *
 */

class GetOutletsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOutletsResponse();
	GetOutletsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOutletsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Информация о точках продаж.
	 */
	std::list<FullOutletDTO> getOutlets();

	/*! \brief Set Информация о точках продаж.
	 */
	void setOutlets(std::list <FullOutletDTO> outlets);
	/*! \brief Get 
	 */
	ScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ScrollingPagerDTO  paging);
	/*! \brief Get 
	 */
	FlippingPagerDTO getPager();

	/*! \brief Set 
	 */
	void setPager(FlippingPagerDTO  pager);

private:
	std::list <FullOutletDTO>outlets;
	ScrollingPagerDTO paging;
	FlippingPagerDTO pager;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOutletsResponse_H_ */
