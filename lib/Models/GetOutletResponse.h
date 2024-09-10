
/*
 * GetOutletResponse.h
 *
 * Ответ на запрос информации о точке продаж.
 */

#ifndef TINY_CPP_CLIENT_GetOutletResponse_H_
#define TINY_CPP_CLIENT_GetOutletResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FullOutletDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос информации о точке продаж.
 *
 *  \ingroup Models
 *
 */

class GetOutletResponse{
public:

    /*! \brief Constructor.
	 */
    GetOutletResponse();
    GetOutletResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOutletResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	FullOutletDTO getOutlet();

	/*! \brief Set 
	 */
	void setOutlet(FullOutletDTO  outlet);


    private:
    FullOutletDTO outlet;
};
}

#endif /* TINY_CPP_CLIENT_GetOutletResponse_H_ */
