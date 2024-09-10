
/*
 * OrderBoxesLayoutDTO.h
 *
 * Распределение товаров по коробкам.
 */

#ifndef TINY_CPP_CLIENT_OrderBoxesLayoutDTO_H_
#define TINY_CPP_CLIENT_OrderBoxesLayoutDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "EnrichedOrderBoxLayoutDTO.h"
#include <list>

namespace Tiny {


/*! \brief Распределение товаров по коробкам.
 *
 *  \ingroup Models
 *
 */

class OrderBoxesLayoutDTO{
public:

    /*! \brief Constructor.
	 */
    OrderBoxesLayoutDTO();
    OrderBoxesLayoutDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderBoxesLayoutDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список коробок.
	 */
	std::list<EnrichedOrderBoxLayoutDTO> getBoxes();

	/*! \brief Set Список коробок.
	 */
	void setBoxes(std::list <EnrichedOrderBoxLayoutDTO> boxes);


    private:
    std::list<EnrichedOrderBoxLayoutDTO> boxes;
};
}

#endif /* TINY_CPP_CLIENT_OrderBoxesLayoutDTO_H_ */
