/*
 * GetRegionWithChildrenResponse.h
 *
 * 
 */

#ifndef _GetRegionWithChildrenResponse_H_
#define _GetRegionWithChildrenResponse_H_


#include <string>
#include "FlippingPagerDTO.h"
#include "RegionDTO.h"
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

class GetRegionWithChildrenResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetRegionWithChildrenResponse();
	GetRegionWithChildrenResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetRegionWithChildrenResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FlippingPagerDTO getPager();

	/*! \brief Set 
	 */
	void setPager(FlippingPagerDTO  pager);
	/*! \brief Get 
	 */
	RegionDTO getRegions();

	/*! \brief Set 
	 */
	void setRegions(RegionDTO  regions);

private:
	FlippingPagerDTO pager;
	RegionDTO regions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetRegionWithChildrenResponse_H_ */
