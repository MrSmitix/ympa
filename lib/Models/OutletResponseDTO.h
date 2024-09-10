
/*
 * OutletResponseDTO.h
 *
 * Результат выполнения запроса. Выводится, если &#x60;status&#x3D;\&quot;OK\&quot;&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_OutletResponseDTO_H_
#define TINY_CPP_CLIENT_OutletResponseDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Результат выполнения запроса. Выводится, если `status=\"OK\"`. 
 *
 *  \ingroup Models
 *
 */

class OutletResponseDTO{
public:

    /*! \brief Constructor.
	 */
    OutletResponseDTO();
    OutletResponseDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OutletResponseDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор точки продаж, присвоенный Маркетом.
	 */
	long getId();

	/*! \brief Set Идентификатор точки продаж, присвоенный Маркетом.
	 */
	void setId(long  id);


    private:
    long id{};
};
}

#endif /* TINY_CPP_CLIENT_OutletResponseDTO_H_ */
