
/*
 * ReportStatusType.h
 *
 * Статус генерации отчета:  * &#x60;PENDING&#x60; — отчет ожидает генерации. * &#x60;PROCESSING&#x60; — отчет генерируется. * &#x60;FAILED&#x60; — во время генерации произошла ошибка. * &#x60;DONE&#x60; — отчет готов. 
 */

#ifndef TINY_CPP_CLIENT_ReportStatusType_H_
#define TINY_CPP_CLIENT_ReportStatusType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Статус генерации отчета:  * `PENDING` — отчет ожидает генерации. * `PROCESSING` — отчет генерируется. * `FAILED` — во время генерации произошла ошибка. * `DONE` — отчет готов. 
 *
 *  \ingroup Models
 *
 */

class ReportStatusType{
public:

    /*! \brief Constructor.
	 */
    ReportStatusType();
    ReportStatusType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ReportStatusType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_ReportStatusType_H_ */
