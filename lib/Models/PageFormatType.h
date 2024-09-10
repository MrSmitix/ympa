
/*
 * PageFormatType.h
 *
 * Размещение ярлыков на странице: * &#x60;A7&#x60; — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей). * &#x60;A4&#x60; — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей. 
 */

#ifndef TINY_CPP_CLIENT_PageFormatType_H_
#define TINY_CPP_CLIENT_PageFormatType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Размещение ярлыков на странице: * `A7` — в PDF-файле будут страницы формата близкому к A7. На каждой странице размещается ярлык размером 75 × 120 мм (80,4 × 125,6 мм с учетом полей). * `A4` — в PDF-файле будут страницы формата A4. На каждой странице размещаются восемь ярлыков размером 70,6 × 99,1 мм без полей. 
 *
 *  \ingroup Models
 *
 */

class PageFormatType{
public:

    /*! \brief Constructor.
	 */
    PageFormatType();
    PageFormatType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PageFormatType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_PageFormatType_H_ */
