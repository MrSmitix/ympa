
/*
 * GetPromosRequest.h
 *
 * Фильтры для получения списка акций.
 */

#ifndef TINY_CPP_CLIENT_GetPromosRequest_H_
#define TINY_CPP_CLIENT_GetPromosRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MechanicsType.h"
#include "PromoParticipationType.h"

namespace Tiny {


/*! \brief Фильтры для получения списка акций.
 *
 *  \ingroup Models
 *
 */

class GetPromosRequest{
public:

    /*! \brief Constructor.
	 */
    GetPromosRequest();
    GetPromosRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromosRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	PromoParticipationType getParticipation();

	/*! \brief Set 
	 */
	void setParticipation(PromoParticipationType  participation);
	/*! \brief Get 
	 */
	MechanicsType getMechanics();

	/*! \brief Set 
	 */
	void setMechanics(MechanicsType  mechanics);


    private:
    PromoParticipationType participation;
    MechanicsType mechanics;
};
}

#endif /* TINY_CPP_CLIENT_GetPromosRequest_H_ */
