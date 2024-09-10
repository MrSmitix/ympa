
/*
 * GetRegionsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetRegionsResponse_H_
#define TINY_CPP_CLIENT_GetRegionsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ForwardScrollingPagerDTO.h"
#include "RegionDTO.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetRegionsResponse{
public:

    /*! \brief Constructor.
	 */
    GetRegionsResponse();
    GetRegionsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetRegionsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<RegionDTO> regions;
    ForwardScrollingPagerDTO paging;
};
}

#endif /* TINY_CPP_CLIENT_GetRegionsResponse_H_ */
