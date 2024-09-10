
/*
 * GpsDTO.h
 *
 * GPS-координаты широты и долготы. 
 */

#ifndef TINY_CPP_CLIENT_GpsDTO_H_
#define TINY_CPP_CLIENT_GpsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief GPS-координаты широты и долготы. 
 *
 *  \ingroup Models
 *
 */

class GpsDTO{
public:

    /*! \brief Constructor.
	 */
    GpsDTO();
    GpsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GpsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Широта.
	 */
	long getLatitude();

	/*! \brief Set Широта.
	 */
	void setLatitude(long  latitude);
	/*! \brief Get Долгота.
	 */
	long getLongitude();

	/*! \brief Set Долгота.
	 */
	void setLongitude(long  longitude);


    private:
    long latitude{};
    long longitude{};
};
}

#endif /* TINY_CPP_CLIENT_GpsDTO_H_ */
