
/*
 * GetOutletsResponse.h
 *
 * Ответ на запрос информации о точках продаж.
 */

#ifndef TINY_CPP_CLIENT_GetOutletsResponse_H_
#define TINY_CPP_CLIENT_GetOutletsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FlippingPagerDTO.h"
#include "FullOutletDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Ответ на запрос информации о точках продаж.
 *
 *  \ingroup Models
 *
 */

class GetOutletsResponse{
public:

    /*! \brief Constructor.
	 */
    GetOutletsResponse();
    GetOutletsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOutletsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<FullOutletDTO> outlets;
    ScrollingPagerDTO paging;
    FlippingPagerDTO pager;
};
}

#endif /* TINY_CPP_CLIENT_GetOutletsResponse_H_ */
