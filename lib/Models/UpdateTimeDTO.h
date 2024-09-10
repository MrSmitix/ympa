
/*
 * UpdateTimeDTO.h
 *
 * Время последнего обновления.
 */

#ifndef TINY_CPP_CLIENT_UpdateTimeDTO_H_
#define TINY_CPP_CLIENT_UpdateTimeDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Время последнего обновления.
 *
 *  \ingroup Models
 *
 */

class UpdateTimeDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateTimeDTO();
    UpdateTimeDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateTimeDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Время последнего обновления.
	 */
	std::string getUpdatedAt();

	/*! \brief Set Время последнего обновления.
	 */
	void setUpdatedAt(std::string  updatedAt);


    private:
    std::string updatedAt{};
};
}

#endif /* TINY_CPP_CLIENT_UpdateTimeDTO_H_ */
