
/*
 * GetRegionWithChildrenResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetRegionWithChildrenResponse_H_
#define TINY_CPP_CLIENT_GetRegionWithChildrenResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FlippingPagerDTO.h"
#include "RegionDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetRegionWithChildrenResponse{
public:

    /*! \brief Constructor.
	 */
    GetRegionWithChildrenResponse();
    GetRegionWithChildrenResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetRegionWithChildrenResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
};
}

#endif /* TINY_CPP_CLIENT_GetRegionWithChildrenResponse_H_ */
