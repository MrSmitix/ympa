/*
 * PagedReturnsDTO.h
 *
 * Возвраты.
 */

#ifndef _PagedReturnsDTO_H_
#define _PagedReturnsDTO_H_


#include <string>
#include "ForwardScrollingPagerDTO.h"
#include "ReturnDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Возвраты.
 *
 *  \ingroup Models
 *
 */

class PagedReturnsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	PagedReturnsDTO();
	PagedReturnsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PagedReturnsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);
	/*! \brief Get Список возвратов.
	 */
	std::list<ReturnDTO> getReturns();

	/*! \brief Set Список возвратов.
	 */
	void setReturns(std::list <ReturnDTO> returns);

private:
	ForwardScrollingPagerDTO paging;
	std::list <ReturnDTO>returns;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PagedReturnsDTO_H_ */
