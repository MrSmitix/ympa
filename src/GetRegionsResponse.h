/*
 * GetRegionsResponse.h
 *
 * 
 */

#ifndef _GetRegionsResponse_H_
#define _GetRegionsResponse_H_


#include <string>
#include "ForwardScrollingPagerDTO.h"
#include "RegionDTO.h"
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

class GetRegionsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetRegionsResponse();
	GetRegionsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetRegionsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Регион доставки.
	 */
	std::list<RegionDTO> getRegions();

	/*! \brief Set Регион доставки.
	 */
	void setRegions(std::list <RegionDTO> regions);
	/*! \brief Get 
	 */
	ForwardScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ForwardScrollingPagerDTO  paging);

private:
	std::list <RegionDTO>regions;
	ForwardScrollingPagerDTO paging;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetRegionsResponse_H_ */
