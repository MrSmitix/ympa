
/*
 * PagedReturnsDTO.h
 *
 * Возвраты.
 */

#ifndef TINY_CPP_CLIENT_PagedReturnsDTO_H_
#define TINY_CPP_CLIENT_PagedReturnsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ForwardScrollingPagerDTO.h"
#include "ReturnDTO.h"
#include <list>

namespace Tiny {


/*! \brief Возвраты.
 *
 *  \ingroup Models
 *
 */

class PagedReturnsDTO{
public:

    /*! \brief Constructor.
	 */
    PagedReturnsDTO();
    PagedReturnsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PagedReturnsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<ReturnDTO> returns;
};
}

#endif /* TINY_CPP_CLIENT_PagedReturnsDTO_H_ */
