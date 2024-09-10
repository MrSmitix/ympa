
/*
 * SortOrderType.h
 *
 * Направление сортировки.  Возможные значения: - &#x60;ASC&#x60; — сортировка по возрастанию. - &#x60;DESC&#x60; — сортировка по убыванию. 
 */

#ifndef TINY_CPP_CLIENT_SortOrderType_H_
#define TINY_CPP_CLIENT_SortOrderType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Направление сортировки.  Возможные значения: - `ASC` — сортировка по возрастанию. - `DESC` — сортировка по убыванию. 
 *
 *  \ingroup Models
 *
 */

class SortOrderType{
public:

    /*! \brief Constructor.
	 */
    SortOrderType();
    SortOrderType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SortOrderType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_SortOrderType_H_ */
